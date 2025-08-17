#!/bin/bash

# Function 1: Concatenate Two Strings
concatenate() {
    str1=$1
    str2=$2
    result="$str1$str2"
    echo "Concatenated String: $result"
}

# Function 2: Find Length of a String
length() {
    str=$1
    len=${#str}
    echo "Length of '$str' is: $len"
}

# Function 3: Compare Two Strings
compare() {
    str1=$1
    str2=$2

    if [ "$str1" == "$str2" ]; then
        echo "Both strings are equal."
    else
        echo "Strings are not equal."
    fi
}

# Function 4: Check if String is Palindrome
palindrome() {
    str=$1
    reverse=""
    
    # Reverse the string
    for (( i=${#str}-1; i>=0; i-- )); do
        reverse="$reverse${str:$i:1}"
    done

    # Check if string and reverse are same
    if [ "$str" == "$reverse" ]; then
        echo "'$str' is a Palindrome."
    else
        echo "'$str' is NOT a Palindrome."
    fi
}

# Function 5: Reverse a String
reverse() {
    str=$1
    reverse=""
    
    for (( i=${#str}-1; i>=0; i-- )); do
        reverse="$reverse${str:$i:1}"
    done
    
    echo "Reverse of '$str' is: $reverse"
}

# Display Menu for the User
while true; do
    echo "===================================="
    echo " String Library - Select an Option"
    echo "===================================="
    echo "1. Concatenate Two Strings"
    echo "2. Find Length of a String"
    echo "3. Compare Two Strings"
    echo "4. Check if String is Palindrome"
    echo "5. Reverse a String"
    echo "6. Exit"
    echo "===================================="
    read -p "Enter your choice: " choice

    case $choice in
        1)
            read -p "Enter First String: " str1
            read -p "Enter Second String: " str2
            concatenate "$str1" "$str2"
            ;;
        2)
            read -p "Enter a String: " str
            length "$str"
            ;;
        3)
            read -p "Enter First String: " str1
            read -p "Enter Second String: " str2
            compare "$str1" "$str2"
            ;;
        4)
            read -p "Enter a String: " str
            palindrome "$str"
            ;;
        5)
            read -p "Enter a String: " str
            reverse "$str"
            ;;
        6)
            echo "Exiting... Thank you!"
            exit 0
            ;;
        *)
            echo "Invalid choice! Please try again."
            ;;
    esac
done



<<output
====================================
 String Library - Select an Option
====================================
1. Concatenate Two Strings
2. Find Length of a String
3. Compare Two Strings
4. Check if String is Palindrome
5. Reverse a String
6. Exit
====================================
Enter your choice: 1
Enter First String: anjum
Enter Second String: shaik
Concatenated String: anjumshaik
====================================
 String Library - Select an Option
====================================
1. Concatenate Two Strings
2. Find Length of a String
3. Compare Two Strings
4. Check if String is Palindrome
5. Reverse a String
6. Exit
====================================
Enter your choice: 2
Enter a String: nishadanjum
Length of 'nishadanjum' is: 11
====================================
 String Library - Select an Option
====================================
1. Concatenate Two Strings
2. Find Length of a String
3. Compare Two Strings
4. Check if String is Palindrome
5. Reverse a String
6. Exit
====================================
Enter your choice: anjum
Invalid choice! Please try again.
====================================
 String Library - Select an Option
====================================
1. Concatenate Two Strings
2. Find Length of a String
3. Compare Two Strings
4. Check if String is Palindrome
5. Reverse a String
6. Exit
====================================
Enter your choice: 3
Enter First String: anjum
Enter Second String: anjum
Both strings are equal.
====================================
 String Library - Select an Option
====================================
1. Concatenate Two Strings
2. Find Length of a String
3. Compare Two Strings
4. Check if String is Palindrome
5. Reverse a String
6. Exit
====================================
Enter your choice: 4
Enter a String: nitin
'nitin' is a Palindrome.
====================================
 String Library - Select an Option
====================================
1. Concatenate Two Strings
2. Find Length of a String
3. Compare Two Strings
4. Check if String is Palindrome
5. Reverse a String
6. Exit
====================================
Enter your choice: 5
Enter a String: suhail
Reverse of 'suhail' is: liahus
====================================
 String Library - Select an Option
====================================
1. Concatenate Two Strings
2. Find Length of a String
3. Compare Two Strings
4. Check if String is Palindrome
5. Reverse a String
6. Exit
====================================
Enter your choice: 6
Exiting... Thank you!
output

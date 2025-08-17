#!/bin/bash

#Take a file as input and print the total no of words in that file contain

# Taking file as input
 read -p "Enter the filename: " filename

# checking whether the given file is exists or not
 if [ ! -f "$filename" ]
 then
	 echo "File not found"
	 exit 1
 fi

# checking the no of words in that file
 wordcount=$(wc -w <"$filename") 

#diplay the wordcount 
 echo "The number of words in $filename is: " $wordcount



 <<output
 bash 6_count_words.sh
Enter the filename: apple.txt
File not found

bash 6_count_words.sh
Enter the filename: fruits.txt
The number of words in fruits.txt is:  45
output

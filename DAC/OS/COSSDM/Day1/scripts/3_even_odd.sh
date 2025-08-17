#!/bin/bash

# To check whether given number is Even or Odd

read -p "Enter the number to be checked: " num

if [ $((num%2)) -eq 0 ]
then
	echo "$num is Even number"
else
	echo "$num is Odd number"
fi


<<output
Enter the number to be checked: 26
26 is Even number

Enter the number to be checked: 15
15 is Odd number
output

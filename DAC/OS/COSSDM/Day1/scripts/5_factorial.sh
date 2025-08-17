#!/bin/bash

# calaculating Factorial of a given number

factorial(){
	if [ $1 -eq 0 ] 
	then
		echo 1
	else
		# recursive call
		echo $(( $1*$(factorial $(( $1 - 1 ))) ))
	fi
}

read -p "Enter the Number: " num

#printing fact of number
echo "Fatorial of the $num is:"

# calling function
factorial $num


<<output
Enter the Number: 9
Fatorial of the 9 is:
362880
output

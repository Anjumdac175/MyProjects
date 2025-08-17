#!/bin/bash

# program to print Left star pattern using loop

read -p "Enter no.of Lines to be printed: " n

for ((i=0;i<n;i++))  # rows to be printed
do
	for ((j=0;j<=i;j++)) # columns to be printed
	do
		echo -n "*"
	done
	echo
done



<<output
Enter no.of Lines to be printed: 5
*
**
***
****
*****
output

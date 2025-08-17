#!/bin/bash

#Calcualting sum of N numbers from 1 to N


#Reading input for N
read -p "Enter the number: " num

sum=0
for ((i=1;i<=num;i++))
do
	sum=$((sum+i))  #adding 1 to N numbers
done
echo "Sum of numbers from 1 to N is: $sum"

<<output
Enter the number: 20
Sum of numbers from 1 to N is: 210
output

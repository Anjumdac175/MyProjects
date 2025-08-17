#!/bin/bash

#printing a simple calculator using switch case

# Displaying menu for basic calculation
echo "------------------MENU-------------------------"
echo "1.Addition"
echo "2.Substraction"
echo "3.Multiplication"
echo "4.Division"
echo "-------------------------------------------------"

# Reading the choice
read -p "Enter your choice: " choice

#Reading numbers
echo "Enter two number"
read num1
read num2
case $choice in
	1) echo "Sum=$(( num1+num2 ))" ;;
	2) echo "Sub=$(( num1-num2 ))" ;;
	3) echo "mul=$(( num1*num2 ))" ;;
	4) echo "Div=$(( num1/num2 ))" ;;
	*) echo "Enter valid input" ;;
esac




<<output
------------------MENU-------------------------
1.Addition
2.Substraction
3.Multiplication
4.Division
-------------------------------------------------
Enter your choice: 1
Enter two number
10
20
Sum=30
------------------MENU-------------------------
1.Addition
2.Substraction
3.Multiplication
4.Division
-------------------------------------------------
Enter your choice: 2
Enter two number
30
10
Sub=20
------------------MENU-------------------------
1.Addition
2.Substraction
3.Multiplication
4.Division
-------------------------------------------------
Enter your choice: 3
Enter two number
40
20
mul=800
------------------MENU-------------------------
1.Addition
2.Substraction
3.Multiplication
4.Division
-------------------------------------------------
Enter your choice: 4
Enter two number
20
5
Div=4
output


#!/bin/bash

# Check if more than one argument is passed

# Check if no argument is provided
if [ $# -eq 0 ]; then
    echo "Error: No argument provided."
    echo "Usage: ./file_type.sh <filename>"
    exit 1
fi

# Store the argument in a variable
file=$1

# Check if the file exists
if [ ! -e "$file" ]; then
    echo "Error: File does not exist."
    exit 1
fi

# Check the file type
if [ -f "$file" ]; then
    echo "'$file' is a regular file."
elif [ -d "$file" ]; then
    echo "'$file' is a directory."
elif [ -L "$file" ]; then
    echo "'$file' is a symbolic link."
fi



<<output
anjum_shaik@LAPTOP-ULHD2438:/mnt/c/Users/Shaik Mohd Suhail/desktop/OS/Day1/scripts$ bash 9_error_message.sh sample
'sample' is a directory.
anjum_shaik@LAPTOP-ULHD2438:/mnt/c/Users/Shaik Mohd Suhail/desktop/OS/Day1/scripts$ vi 9_error_message.sh
anjum_shaik@LAPTOP-ULHD2438:/mnt/c/Users/Shaik Mohd Suhail/desktop/OS/Day1/scripts$ bash 9_error_message.sh shell.html
'shell.html' is a regular file.

output

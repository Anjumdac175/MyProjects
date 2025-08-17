#!/bin/bash


if [ -z "$1" ]; then
    echo "Please Enter a directory name."
    exit 1
fi

# Store the directory name in a variable
directory=$1

# Check if the provided directory exists
if [ ! -d "$directory" ]; then
    echo "Directory '$directory' does not exist."
    exit 1
fi

# Count the number of files in the directory
file_count=$(find "$directory" -type f | wc -l)

# Display the result
echo "The number of files in the directory '$directory' is: $file_count"

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

# Calculate the total size of all files in the directory (including subdirectories) in megabytes
total_size=$(du -sm "$directory" | cut -f1)

# Display the result
echo "The total size of all files in the directory '$directory' is: $total_size MB"

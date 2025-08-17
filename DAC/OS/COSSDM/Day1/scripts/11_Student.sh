#!/bin/bash

logfile="log1"

# Function to check if roll number already exists
check_roll_number_exists() {
    roll_number=$1
    if grep -q "$roll_number" student_records.txt; then
        echo "$roll_number already exists" >> "$logfile"
        echo "Roll number exists, check the log for details."
        return 1  
    fi
    return 0  
}

# Function to check if marks are within valid range
check_marks_range() {
    marks=$1
    if [[ $marks -lt 1 || $marks -gt 99 ]]; then
        echo "Marks $marks out of range" >> "$logfile"
        echo "Marks out of range, check the log for details."
        return 1  
    fi
    return 0  
}

# Function to calculate total, percentage, and grade
calculate_and_display_results() {
    marks1=$1
    marks2=$2
    marks3=$3
    total=$((marks1 + marks2 + marks3))
    percentage=$((total / 3))
    
    # Determine grade based on percentage
    if (( percentage >= 90 )); then
        grade="A"
    elif (( percentage >= 75 )); then
        grade="B"
    elif (( percentage >= 60 )); then
        grade="C"
    elif (( percentage >= 50 )); then
        grade="D"
    else
        grade="F"
    fi

    # Display results
    echo "Total: $total"
    echo "Percentage: $percentage%"
    echo "Grade: $grade"
}



echo "Enter the roll number:"
read roll_number

# Check if roll number already exists
if ! check_roll_number_exists "$roll_number"; then
    exit 1
fi

echo "Enter marks for subject 1:"
read marks1

# Check if marks are valid
if ! check_marks_range "$marks1"; then
    exit 1
fi

echo "Enter marks for subj

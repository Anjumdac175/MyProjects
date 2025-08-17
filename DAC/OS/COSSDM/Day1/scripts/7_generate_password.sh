#!/bin/bash


echo "Password Length

read length

password=$ ( < / dev/urandom tr -dc 'A -Za-Z0-9' | head -c $length)

echo "password length is:" $password




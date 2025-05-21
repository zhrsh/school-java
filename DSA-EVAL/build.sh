#!/usr/bin/env bash

packages=(employeemanagement sll bst hashtable) # array of packages to compile
main_class="Main" # main class name

length=${#packages[@]}
index=1

if [[ $(pwd) != *DSA-EVAL ]]; then
    echo "you don't seem to be in the correct directory. run anyway? (y/n)"
    
    # read user input
    read -r answer
    
    if [[ $answer == "y" || $answer == "Y" ]]; then
        echo "running the script..."
    elif [[ $answer == "n" || $answer == "N" ]]; then
        echo "exiting the script..."
        exit 0
    else
        echo "invalid input. please enter 'y' or 'n'."
        exit 0
    fi
fi

cd src

for package in "${packages[@]}"; do
    echo ""
    echo "("$index"/"$length")" "COMPILING AND RUNNING 'io.github.zhrsh."$package"' PACKAGE..."
    javac io/github/zhrsh/"$package"/"$main_class".java
    java io.github.zhrsh."$package"."$main_class"
    ((index++))
done
#!/usr/bin/env bash

packages=(employeemanagement sll bst hashtable) # array of packages to compile
main_class="Main" # main class name

length=${#packages[@]}
index=1

cd src

for package in "${packages[@]}"; do
    echo "("$index"/"$length")" "COMPILING AND RUNNING 'io.github.zhrsh."$package"' PACKAGE..."
    javac io/github/zhrsh/"$package"/"$main_class".java
    java io.github.zhrsh."$package"."$main_class" "$@"
    ((index++))
done
#!/usr/bin/env bash

packages=(employeemanagement) # array of packages to compile
main_class="Main" # main class name

cd src

for package in "${packages[@]}"; do
    echo "COMPILING AND RUNNING '"$package"' PACKAGE..."
    javac io/github/zhrsh/"$package"/"$main_class".java
    java io.github.zhrsh."$package"."$main_class" "$@"
done
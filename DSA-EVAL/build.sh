#!/usr/bin/env bash

packages=(bst) # array of packages to compile
main_class="Main" # main class name

cd src

for package in "${packages[@]}"; do
    echo "COMPILING AND RUNNING 'io.github.zhrsh."$package"' PACKAGE..."
    javac io/github/zhrsh/"$package"/"$main_class".java
    java io.github.zhrsh."$package"."$main_class" "$@"
done
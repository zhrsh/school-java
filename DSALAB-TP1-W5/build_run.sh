#!/usr/bin/env bash

packages=(arraycomp) # array of packages to compile
main_class="Comparison" # main class name

cd src

for package in "${packages[@]}"; do
    echo "COMPILING AND RUNNING '"$package"' PACKAGE..."
    javac com/zhrsh/"$package"/"$main_class".java
    java com.zhrsh."$package"."$main_class" "$@" # accept command line args
done
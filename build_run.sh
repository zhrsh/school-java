#!/usr/bin/env bash
packages=(sll database)

for package in "${packages[@]}"; do
    echo "COMPILING AND RUNNING "$package" PACKAGE..."
    javac "$package"/Main.java
    java "$package".Main
done
#!/usr/bin/env bash
packages=(sll database)
cd src

for package in "${packages[@]}"; do
    echo "COMPILING AND RUNNING '"$package"' PACKAGE..."
    javac com/zhrsh/"$package"/Main.java
    java com.zhrsh."$package".Main
done
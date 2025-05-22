# Information

All packages are placed in a reverse domain structure of my github URL (zhrsh.github.io) to follow Java conventions.

This github repository was only made public after the due date. Author: Zahra A. S.

## Packages

- [Employee management database](src/io/github/zhrsh/employeemanagement) (no. 1) `io.github.zhrsh.employeemanagement`
- [Singly linked list](src/io/github/zhrsh/sll) (no. 2) `io.github.zhrsh.sll`
- [Queue](src/io/github/zhrsh/queue) (no. 3) `io.github.zhrsh.queue`
- [Binary search tree](src/io/github/zhrsh/bst) (no. 4) `io.github.zhrsh.bst`
- [Hash table](src/io/github/zhrsh/hashtable) (no. 5) `io.github.zhrsh.hashtable`

## Compile and Run 

First, download and extract the [tar.gz](https://github.com/zhrsh/school-java/releases/download/v1.0.0/dsa-eval-zahra-a-s.tar.gz) or [zip](https://github.com/zhrsh/school-java/releases/download/v1.0.0/dsa-eval-zahra-a-s.zip) file of the source code.

To compile and run all the packages consecutively, `cd` into the DSA-EVAL directory and run the build shell script I made:

```bash
chmod +x build.sh   # not required if tar.gz 
./build.sh
```

Important: This script is designed for Unix-like (Linux, MacOS, etc.) environments. It *may* work on Windows using WSL, git bash, or cygwin but compatibility is not guaranteed.

## File Structure

```bash
DSA-EVAL/
├── README.md
├── build.sh
└── src/
    └── io/
        └── github/
            └── zhrsh/
                ├── sll/                # no 2
                │   ├── Node.java
                │   ├── SinglyLinkedList.java
                │   └── Main.java
                ├── queue/              # no 3
                │   ├── ArrayQueue.java
                │   ├── LinkedListQueue.java
                │   └── Main.java
                ├── hashtable/          # no 5
                │   ├── Main.java
                │   └── HashTable.java
                ├── employeemanagement/ # no 1
                │   ├── PartTimeEmployee.java
                │   ├── Main.java
                │   ├── FullTimeEmployee.java
                │   └── Employee.java
                └── bst/                # no 4
                    ├── Node.java
                    ├── BinarySearchTree.java
                    └── Main.java
```
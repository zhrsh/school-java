# Information

All packages are placed in a reverse domain structure of my github URL (zhrsh.github.io) to follow Java conventions.

## Packages

- [Employee management database](src/io/github/zhrsh/employeemanagement) (no. 1) `io.github.zhrsh.employeemanagement`
- [Singly linked list](src/io/github/zhrsh/sll) (no. 2) `io.github.zhrsh.sll`
- [Queue](src/io/github/zhrsh/queue) (no. 3) `io.github.zhrsh.queue`
- [Binary search tree](src/io/github/zhrsh/bst) (no. 4) `io.github.zhrsh.bst`
- [Hash table](src/io/github/zhrsh/hashtable) (no. 5) `io.github.zhrsh.hashtable`

## Compile and Run 

To compile and run all the packages consecutively, `cd` into the DSA-EVAL directory and run the build shell script I made:

```bash
chmod +x build.sh 
./build.sh
```

Important: This script is designed for Unix-like (Linux, MacOS, etc.) environments. While it may work on Windows using WSL, Git Bash, or Cygwin compatibility is not guaranteed.

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

Note: This github repository was only made public after the due date.
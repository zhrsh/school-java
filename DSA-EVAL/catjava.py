"""
concatenate selection of java files into one file
"""

def main():
    # list of Java files to concatenate
    java_files = [
        # ls *.java | sed 's/.*/"&"/' | tr '\n' ', ' | sed 's/, $//'
        #"Employee.java","FullTimeEmployee.java","PartTimeEmployee.java","Main.java"
        "Node.java","SinglyLinkedList.java","Main.java"
    ]

    concatenate_java_files(
        java_files,
        "CombinedSSL.md",
        "src/io/github/zhrsh/sll/"
    )

def concatenate_java_files(input_files, output_file, directory):
    imports = set()
    content = []

    for file in input_files:
        with open(f"{directory}{file}", 'r', encoding="utf-8") as f:
            for line in f:
                # remove package declarations
                if line.startswith("package "):
                    continue
                if line.startswith(" * @author "):
                    continue
                # collect import statements
                if line.startswith("import "):
                    imports.add(line.strip())
                    continue
                # add other lines to content
                content.append(line)

    # write imports at the top of the output file
    with open(output_file, 'w', encoding="utf-8") as out:
        for imp in sorted(imports):
            out.write(imp + '\n')
        out.write('\n')  # newline after imports
        out.writelines(content)

if __name__ == "__main__":
    main()

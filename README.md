# File Existence Checker and File Reader

This Java program checks the existence of a file named "Secret.txt" in the current directory. If the file exists, it prints a message indicating its presence; otherwise, it informs that the file does not exist.

## Getting Started

To run this program, you need to have Java installed on your system.

1. Clone or download the repository to your local machine.
2. Navigate to the directory containing the Java file (`Main.java`).
3. Compile the Java file using the following command:
    ```
    javac Main.java
    ```
4. Run the compiled program using the following command:
    ```
    java Main
    ```

## Functionality

- The program begins by checking if the file "Secret.txt" exists in the current directory.
- If the file exists, it prints "This File Exits!"; otherwise, it prints "File Does not Exist!".
- Additionally, the program reads the content of the "Secret.txt" file using a `FileReader`, and prints the content to the console.

## File Manipulation (Optional)

The code includes commented-out sections demonstrating how to write to the "Secret.txt" file using a `FileWriter`. If you want to experiment with writing to the file, uncomment the relevant code block, and run the program again.

## Note

- Ensure that you have appropriate permissions to read and write files in the directory where the program is executed.
- Make sure that the file "Secret.txt" is present in the same directory as the Java file (`Main.java`) or modify the file path accordingly.

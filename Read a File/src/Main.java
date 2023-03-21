import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
public class Main {
    /**Read a File
     In the previous chapter, you learned how to create and write to a file.

     In the following example,
     we use the Scanner class to read the contents of the text file we created in the previous chapter:*/

    /**Get File Information
     To get more information about a file, use any of the File methods:*/
    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        File myObj1 = new File("filename.txt");
        if (myObj1.exists()) {
            System.out.println("File name: " + myObj1.getName());
            System.out.println("Absolute path: " + myObj1.getAbsolutePath());
            System.out.println("Writeable: " + myObj1.canWrite());
            System.out.println("Readable " + myObj1.canRead());
            System.out.println("File size in bytes " + myObj1.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}

/**Note: There are many available classes in the Java API that can be used to read and write files in Java:
 * FileReader, BufferedReader, Files, Scanner, FileInputStream, FileWriter, BufferedWriter, FileOutputStream, etc.
 * Which one to use depends on the Java version you're working with and whether you need to read bytes or
 * characters, and the size of the file/lines etc.*/
import java.io.File;  // Import the File class
public class Main {
    /**File handling is an important part of any application.

     Java has several methods for creating, reading, updating, and deleting files.

     Java File Handling
     The File class from the java.io package, allows us to work with files.

     To use the File class, create an object of the class, and specify the filename or directory name:*/
    public static void main(String[] args) {

        File myObj = new File("filename.txt"); // Specify the filename
        //The File class has many useful methods for creating and getting information about files. For example:
        //canRead()	Boolean	Tests whether the file is readable or not
        //canWrite()	Boolean	Tests whether the file is writable or not
        //createNewFile()	Boolean	Creates an empty file
        //delete()	Boolean	Deletes a file
        //exists()	Boolean	Tests whether the file exists
        //getName()	String	Returns the name of the file
        //getAbsolutePath()	String	Returns the absolute pathname of the file
        //length()	Long	Returns the size of the file in bytes
        //list()	String[]	Returns an array of the files in the directory
        //mkdir()	Boolean	Creates a directory
    }
}
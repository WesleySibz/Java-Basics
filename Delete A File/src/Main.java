import java.io.File;  // Import the File class
public class Main {
    /**Delete a File
     To delete a file in Java, use the delete() method:*/

    /**Delete a Folder
     You can also delete a folder. However, it must be empty:*/
    public static void main(String[] args) {
        File myObj = new File("filename.txt");
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }

        File myObj1 = new File("C:\\Users\\MyName\\Test");
        if (myObj.delete()) {
            System.out.println("Deleted the folder: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the folder.");
        }
    }
}
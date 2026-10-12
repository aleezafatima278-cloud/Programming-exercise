import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Read {
    static Scanner sc = new Scanner(System.in);
    public static String getString() {
        String s = "";
        System.out.println("Enter text");
        try {
            s = sc.nextLine();
            return s;
        } catch (NullPointerException e) {
            System.out.println("String is empty");
            return null;
        }
       
    }
    public static String getFile(String filePath) {
        String s = "";
        try(Scanner fileScanner = new Scanner(new File(filePath))) {
            while(fileScanner.hasNextLine()) {
                s = s + fileScanner.nextLine() + " ";
            }
            return s;
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
            return null;
        }
    }
        
    
}




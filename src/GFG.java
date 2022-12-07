
// Java Program to illustrate
// reading from Text File
// using Scanner Class
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class GFG


    {
        public String delta() throws FileNotFoundException {
        // pass the path to the file as a parameter
        File file = new File("C:\\Users\\100031656\\IdeaProjects\\polish\\src\\passwords.txt");
        Scanner sc = new Scanner(file);
        System.out.println("dzfvcgnj");
        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
        return "whatever";}
    }

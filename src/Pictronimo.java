import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.*;


/*git clone https://github.com/danielmiessler/SecLists.git*/
public class Pictronimo {

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {

        File GEVA = new File ("passwords.txt");
        String bneva = "";

        //takes in users input
        Scanner sc1 = new Scanner(System.in);

        // type takes in the second args the user passes through
        // stores the type of hash being used
        String type = args[1];

        // blah takes in first arg user passes, stores decryption choice
        int blah = Integer.parseInt(args[0]);

        // bneva stores the hash itself
        bneva = args[2];

        //method call lets dictionary class know which hash is being used
        GFG3.method2(type);

        //executes brute force decryption
        if (blah == 0){
            //increases size of password until it's found/ limit of 999 characters is met
            for (int i =1; i < 1000; i++){
                if (Brute.bruteForce(i, bneva, type).equals("lol")) {
                    i += 1000;
                    break;
                }
            }
        }

        //executes dictionary decryption
        if (blah == 1){
            System.out.println(GFG3.method(bneva));
        }
    }
}





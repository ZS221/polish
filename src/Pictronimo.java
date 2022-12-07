import org.mindrot.BCrypt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.*;

/*git clone https://github.com/danielmiessler/SecLists.git*/
public class Pictronimo {



    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
            // write your code here
            File GEVA = new File ("passwords.txt");
            String bneva = "";
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter password type \n M = MD5 \n S = Sha \n B = Bcrypt ::");
            String type = sc1.nextLine();
            System.out.println("enter hashed password ::");

            String userName = sc1.nextLine();
            bneva=userName;
            System.out.println(MD5.getMd5(bneva));
            try {
                System.out.println(GFG2.toHexString(GFG2.getSHA("steve")));
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();

            }
        System.out.println(BCrypt.hashpw(bneva, BCrypt.gensalt()));
                GFG3.method2(type);


                //  System.out.println(GFG3.method(bneva));
            for (int i =1; i < 100; i++){
           if (Brute.bruteForce(i, bneva, type).equals("lol")) {
               i += 100000000;
           }
        } }



}

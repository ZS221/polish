import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.*;


/*git clone https://github.com/danielmiessler/SecLists.git*/
public class Pictronimo {



    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        /*System.out.println("Number of Command Line Argument = "+args.length);

        for(int i = 0; i< args.length; i++) {
            System.out.println(String.format("Command Line Argument %d is %s", i, args[i]));
        }*/

        // convert into integer type

            // write your code here
            File GEVA = new File ("passwords.txt");
            String bneva = "";
        Scanner sc1 = new Scanner(System.in);
        //System.out.println("enter password type \n M = MD5 \n S = Sha \n B = Bcrypt ::");
            String type = args[1];
        //System.out.println("enter decyrption type \n B = Brute Force \n D = Dictionary ::");
        //String arcoose = sc1.nextLine();
           // System.out.println("enter hashed password ::");

       // System.out.println("Enter 0 for Brute Force or 1 for Dictionary:");
            int blah = Integer.parseInt(args[0]);


            bneva = args[2];
           /* System.out.println(MD5.getMd5(bneva));
            try {
                System.out.println(GFG2.toHexString(GFG2.getSHA("steve")));
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();

            }
        System.out.println(BCrypt.hashpw(bneva, BCrypt.gensalt()));*/
                GFG3.method2(type);


        if (blah == 0){
            for (int i =1; i < 1000; i++){
                if (Brute.bruteForce(i, bneva, type).equals("lol")) {
                    // System.out.println("hi");
                    i += 1000;
                    break;
                }}}
        if (blah == 1){
            System.out.println(GFG3.method(bneva));}

        //if (arcoose.equals("B")){
        //    for (int i =1; i < 1000; i++){
        //        if (Brute.bruteForce(i, bneva, type).equals("lol")) {
        //            // System.out.println("hi");
        //             i += 1000;
        //             break;
        //   }}}
        //        if (arcoose.equals("D")){
        //          System.out.println(GFG3.method(bneva));}



        }
    }






// Java Program to illustrate Reading from FileReader
// using BufferedReader Class

// Importing input output classes
import at.favre.lib.crypto.bcrypt.*;
import java.io.*;
import java.security.NoSuchAlgorithmException;

// Main class
public class GFG3
{
    public static String frog = "M";
    public static void main(String[] args) throws Exception {}
    public static void method2 (String type){
        frog = type;

    }
    public static String method (String hash) throws IOException, NoSuchAlgorithmException {
    // main driver method



            // File path is passed as parameter
            File file = new File("C:\\Users\\100031656\\IdeaProjects\\polish\\src\\passwords");

            // Creating an object of BufferedReader class
            BufferedReader br = new BufferedReader(new FileReader(file));

            // Declaring a string variable
            String st = "";
            String ts = "invalid type";
            int i = 0;
            int j = 0;

            //put line from password file in String
            while ((st = br.readLine()) != null) {
                if (frog.equals("M")){
                    ts=(MD5.getMd5(st));
                } else if(frog.equals("S")){
                    try {
                        ts=(GFG2.toHexString(GFG2.getSHA(st)));
                    } catch (NoSuchAlgorithmException e) {
                        e.printStackTrace();

                    }
                } else if(frog.equals("B")){
                    BCrypt.Result res = BCrypt.verifyer().verify(st.toCharArray(), hash);
                    if (res.verified==true) {
                        return st;
                    }
                    //else System.out.println("It does not match");

                    //ts = BCrypt.hashpw(st, BCrypt.gensalt());
                }
                //if (i == j){
                                                            //System.out.println(i);
                //j+=1000;}
                //ts + "            " +
                        // Print the string
                i++;

                if (ts.equals(hash)) {
                    return(st);
                }
            }

            return("not found");

        }

    }



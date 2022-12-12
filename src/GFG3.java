
// Java Program to illustrate Reading from FileReader
// using BufferedReader Class

// Importing input output classes
import at.favre.lib.crypto.bcrypt.*;
import java.io.*;
import java.security.NoSuchAlgorithmException;

// Main class
// dictionary decryption
public class GFG3
{
    public static String frog = "M";
    public static void main(String[] args) throws Exception {}
    //assigns frog the type of hash being used
    public static void method2 (String type){
        frog = type;

    }

    public static String method (String hash) throws IOException, NoSuchAlgorithmException {

        // File path is passed as parameter
        // stores password list
        File file = new File("C:\\Users\\100031656\\IdeaProjects\\polish\\src\\passwords");

        // Creating an object of BufferedReader class
        // helps to go through the password list
        BufferedReader br = new BufferedReader(new FileReader(file));

        //stores password from list
        String st = "";
        // stores hash
        String ts = "invalid type";
        int i = 0;
        int j = 0;

        //put line from password file in String
        // stores a password from list into st and loops through list until password is found
        while ((st = br.readLine()) != null) {

            // if hash type is MD5, put the password from the list into MD5 hasher and store into ts
            if (frog.equals("M")){
                ts=(MD5.getMd5(st));
            }

            // if hash type is MD5, put the password from the list into SHA hasher and store into ts
            else if(frog.equals("S")){
                try {
                    ts=(GFG2.toHexString(GFG2.getSHA(st)));
                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                }
            }

            // if hash type is BCrypt
            else if(frog.equals("B")){
                //puts password into BCrypt hasher and verfies if hash matches with the input hash
                BCrypt.Result res = BCrypt.verifyer().verify(st.toCharArray(), hash);
                // if hash matches, returns the found password
                if (res.verified==true) {
                    return st;
                }
            }

            i++;

            //if MD5 or SHA hash matches with input hash, returns found password
            if (ts.equals(hash)) {
                return(st);
            }
        }

        //if password not found
        return("not found");

        }
    }



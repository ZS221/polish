

import at.favre.lib.crypto.bcrypt.*;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class Brute {
        public static void main(String[] args) {
        }

        //takes in size of password, hash, and type of hash
        public static String bruteForce(int size, String hashermasher, String type) throws NoSuchAlgorithmException {
                int[] password = new int[size];
                String[] finalPassword = new String[size];
                for (int i = 0; i < size; i++) {
                        password[i] = 0;
                        finalPassword[i] = "";
                }
                //stores hash
                String pass = hashermasher;
                return computePermutations(size, password, 0, pass, type);
        }

        private static String computePermutations(int size, int[] password, int position, String pass, String frog) throws NoSuchAlgorithmException {
                String testString = "";
                String assemble = "";

                for (int i = 0; i < 69; i++) {
                        password[position] = i;

                        if (position != size - 1) {
                                //iterates until position is equal to indexes in password array and stores lol if password found
                                testString = computePermutations(size, password, position + 1, pass, frog);
                                if (testString != "") {
                                        return testString;
                                }
                        }
                        else if (position == size - 1) {
                                //tries every combination possible for the size given and stores it in assemble
                                for (int j = 0; j < size; j++) {

                                        switch (password[j] + 1) {
                                                case 1:
                                                        assemble = assemble + "A";
                                                        break;
                                                case 2:
                                                        assemble = assemble + "B";
                                                        break;
                                                case 3:
                                                        assemble = assemble + "C";
                                                        break;
                                                case 4:
                                                        assemble = assemble + "D";
                                                        break;
                                                case 5:
                                                        assemble = assemble + "E";
                                                        break;
                                                case 6:
                                                        assemble = assemble + "F";
                                                        break;
                                                case 7:
                                                        assemble = assemble + "G";
                                                        break;
                                                case 8:
                                                        assemble = assemble + "H";
                                                        break;
                                                case 9:
                                                        assemble = assemble + "I";
                                                        break;
                                                case 10:
                                                        assemble = assemble + "J";
                                                        break;
                                                case 11:
                                                        assemble = assemble + "K";
                                                        break;
                                                case 12:
                                                        assemble = assemble + "L";
                                                        break;
                                                case 13:
                                                        assemble = assemble + "M";
                                                        break;
                                                case 14:
                                                        assemble = assemble + "N";
                                                        break;
                                                case 15:
                                                        assemble = assemble + "O";
                                                        break;
                                                case 16:
                                                        assemble = assemble + "P";
                                                        break;
                                                case 17:
                                                        assemble = assemble + "Q";
                                                        break;
                                                case 18:
                                                        assemble = assemble + "R";
                                                        break;
                                                case 19:
                                                        assemble = assemble + "S";
                                                        break;
                                                case 20:
                                                        assemble = assemble + "T";
                                                        break;
                                                case 21:
                                                        assemble = assemble + "U";
                                                        break;
                                                case 22:
                                                        assemble = assemble + "V";
                                                        break;
                                                case 23:
                                                        assemble = assemble + "W";
                                                        break;
                                                case 24:
                                                        assemble = assemble + "X";
                                                        break;
                                                case 25:
                                                        assemble = assemble + "Y";
                                                        break;
                                                case 26:
                                                        assemble = assemble + "Z";
                                                        break;
                                                case 27:
                                                        assemble = assemble + "0";
                                                        break;
                                                case 28:
                                                        assemble = assemble + "1";
                                                        break;
                                                case 29:
                                                        assemble = assemble + "2";
                                                        break;
                                                case 30:
                                                        assemble = assemble + "3";
                                                        break;
                                                case 31:
                                                        assemble = assemble + "4";
                                                        break;
                                                case 32:
                                                        assemble = assemble + "5";
                                                        break;
                                                case 33:
                                                        assemble = assemble + "6";
                                                        break;
                                                case 34:
                                                        assemble = assemble + "7";
                                                        break;
                                                case 35:
                                                        assemble = assemble + "8";
                                                        break;
                                                case 36:
                                                        assemble = assemble + "9";
                                                        break;

                                                case 37:
                                                        assemble = assemble + " ";
                                                        break;
                                                case 38:
                                                        assemble = assemble + "a";
                                                        break;
                                                case 39:
                                                        assemble = assemble + "b";
                                                        break;
                                                case 40:
                                                        assemble = assemble + "c";
                                                        break;
                                                case 41:
                                                        assemble = assemble + "d";
                                                        break;
                                                case 42:
                                                        assemble = assemble + "e";
                                                        break;
                                                case 43:
                                                        assemble = assemble + "f";
                                                        break;
                                                case 44:
                                                        assemble = assemble + "g";
                                                        break;
                                                case 45:
                                                        assemble = assemble + "h";
                                                        break;
                                                case 46:
                                                        assemble = assemble + "i";
                                                        break;
                                                case 47:
                                                        assemble = assemble + "j";
                                                        break;
                                                case 48:
                                                        assemble = assemble + "k";
                                                        break;
                                                case 49:
                                                        assemble = assemble + "l";
                                                        break;
                                                case 50:
                                                        assemble = assemble + "m";
                                                        break;
                                                case 51:
                                                        assemble = assemble + "n";
                                                        break;
                                                case 52:
                                                        assemble = assemble + "o";
                                                        break;
                                                case 53:
                                                        assemble = assemble + "p";
                                                        break;
                                                case 54:
                                                        assemble = assemble + "q";
                                                        break;
                                                case 55:
                                                        assemble = assemble + "r";
                                                        break;
                                                case 56:
                                                        assemble = assemble + "s";
                                                        break;
                                                case 57:
                                                        assemble = assemble + "t";
                                                        break;
                                                case 58:
                                                        assemble = assemble + "u";
                                                        break;
                                                case 59:
                                                        assemble = assemble + "v";
                                                        break;
                                                case 60:
                                                        assemble = assemble + "w";
                                                        break;
                                                case 61:
                                                        assemble = assemble + "x";
                                                        break;
                                                case 62:
                                                        assemble = assemble + "y";
                                                        break;
                                                case 63:
                                                        assemble = assemble + "z";
                                                        break;
                                                case 64:
                                                        assemble = assemble + "!";
                                                        break;
                                                case 65:
                                                        assemble = assemble + "@";
                                                        break;
                                                case 66:
                                                        assemble = assemble + "#";
                                                        break;
                                                case 67:
                                                        assemble = assemble + "?";
                                                        break;
                                                case 68:
                                                        assemble = assemble + "+";
                                                        break;
                                                case 69:
                                                        assemble = assemble + "_";
                                                        break;

                                        }

                                }

                                //based on type, hashes assemble and checks if equal to input hash
                                //prints password and returns lol if it's a match to stop loop in Pictronimo and end brute force
                                //makes assemble blank if not a match
                                if (frog.equals("M")){
                                        if (MD5.getMd5(assemble).equals(pass)) {
                                               System.out.println("Password is: " + assemble);
                                                return "lol"; //replace this with: return assemble;
                                        } else {
                                                assemble = "";
                                        }
                                }else if(frog.equals("S")){
                                        if (GFG2.toHexString(GFG2.getSHA(assemble)).equals(pass)) {
                                                System.out.println("Password is: " + assemble);
                                                return "lol"; //replace this with: return assemble;
                                        } else {
                                                assemble = "";
                                        }
                                } else if(frog.equals("B")){
                                        BCrypt.Result res = BCrypt.verifyer().verify(pass.toCharArray(), assemble);
                                        if (res.verified) {
                                               System.out.println("Password is: " + assemble);
                                                return "lol"; //replace this with: return assemble;
                                        } else {
                                                assemble = "";
                                        }
                                }

                                if (assemble.equalsIgnoreCase(pass)) {
                                        System.out.println("Password is: " + assemble);
                                        return "lol"; //replace this with: return assemble;
                                }
                                else {
                                        assemble = "";
                                }
                        }
                }
                return "";
        }
}
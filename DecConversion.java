import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DecConversion {
    /** @author quattroformaggi, 2021
     *  Conversion from 10's number system to any other.
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number you want to convert: "); //number input                      
        String userNumber = br.readLine();
        int i = Integer.parseInt(userNumber); 	//parsing to avoid potential errors
        System.out.print("Enter the system number to convert to: ");//system input
        String chosenSystem = br.readLine();
        int q = Integer.parseInt(chosenSystem);	//..
        System.out.println(i + " in the " + chosenSystem + "th numerical system will be equal to " + Integer.toString(i, q));
    }
}
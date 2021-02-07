import java.math.BigInteger;
import java.util.Scanner;

public class all {
    /** @author quattroformaggi, 2021
     *  Conversion from ANY number system to ANY other.
     */
    public static void main(String[] args){
		Scanner nin = new Scanner(System.in);
        System.out.println("Enter the number you want to convert: ");						//1st input -- Choosing a number
        String user = nin.nextLine();
        nin.reset();
        System.out.print("Enter the numerical system of that number: ");					//2nd input -- Chosen number's previous system
        int prevSystem = nin.nextInt();
        nin.reset();
        System.out.print("Enter the preferred numerical system for the converted number: ");//3rd input -- Chosen number's new system to convert to
        int newSystem = nin.nextInt();
        nin.close();
        BigInteger b =new BigInteger(new BigInteger(user, prevSystem).toString(newSystem));	//counting using the BigInteger(String,int).toString(int) method
        System.out.println(user + " in the " + prevSystem + " numerical system got converted into " + b + " in the " + newSystem + " numerical system!");
    }
}
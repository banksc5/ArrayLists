 import SafeInput.SafeInput;
import java.util.Scanner;
import java.util.ArrayList;
public class Array{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<String> myArrList = new ArrayList<>();
        String input = "";
        System.out.println("enter your freinds first names ");
        System.out.println("if you are done, type QUIT to stop \n");
        while (!input.equalsIgnoreCase("Quit")){
            input = SafeInput.getNonZeroLenString(in, "Enter your freinds name");
            System.out.println("if you are done, type QUIT to stop \n");
            if (!input.equalsIgnoreCase("Quit")){
                myArrList.add(input);
            }
        }
        System.out.println("\n Your Friends are ");
        for (String name : myArrList){
            System.out.println(name);
        }
        System.out.println("\nYou entered " + myArrList.size() + " friends.");
    }
}

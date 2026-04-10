package SafeInput;

import java.util.Scanner;

public class SafeInput {

    /**
     * Prompts the user for a non-empty string and returns it.
     *
     * @param pipe   Scanner object to read user input
     * @param prompt The message shown to prompt the user
     * @return A non-zero length String
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);
        return retString;
    }

    public static int getInt(Scanner pipe, String prompt) {
        int Ans = 0;
        boolean valid = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                Ans = pipe.nextInt();
                pipe.nextLine();
                valid = true;
            } else {
                String trash = pipe.nextLine();
                System.out.println("invalid value *" + trash + "* enter a integer");
            }
        }
        while (valid == false);
        return Ans;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double Ans = 0.0;
        boolean valid = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                Ans = pipe.nextDouble();
                pipe.nextLine();
                valid = true;
            }
            else {
                String trash = pipe.nextLine();
                System.out.println("Invalid value *" + trash + "* Please enter a double");
            }
        }
        while (valid == false);
        return Ans;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int Ans = 0;
        boolean valid = false;
        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                Ans = pipe.nextInt();
                if (Ans >= low && Ans <= high) {
                    valid = true;
                } else {
                    System.out.println("Enter a number between " + low + " and " + high);
                }
            } else {
                String trash = pipe.nextLine();
                System.out.println("Invalid " + trash + "enter an integer");
            }
            pipe.nextLine();
        }
        while (valid == false);
        return Ans;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double Ans = 0.0;
        boolean valid = false;
        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                Ans = pipe.nextDouble();
                if (Ans >= low && Ans <= high) {
                    valid = true;
                } else {
                    System.out.println("Enter a value between " + low + " and " + high);
                }
            } else {
                String trash = pipe.nextLine();
                System.out.println("incorrect input " + trash + " enter a double");
            }
            pipe.nextLine();
        }
        while (valid==false);
        return Ans;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String Ans = "";
        do {
            System.out.print("\n" + prompt + " [Y/N]: ");
            Ans = pipe.nextLine();
            if (Ans.equalsIgnoreCase("y")) {
                return true;
            } else if (Ans.equalsIgnoreCase("n")) {
                return false;
            } else {
                System.out.println("enter Y or N");
            }
        }
        while (true);
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String Ans = "";
        do {
            System.out.print("\n" + prompt + ": ");
            Ans = pipe.nextLine();
            if (Ans.matches(regEx)) {
                return Ans;
            } else {
                System.out.println("input does not match format");
            }
        }
        while (true);
    }
}

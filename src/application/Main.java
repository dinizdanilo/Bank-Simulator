package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String[] args ) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");

        System.out.print("Enter account holder: ");

        System.out.print("Is there an initial deposite (s/n)? ");
    }
}

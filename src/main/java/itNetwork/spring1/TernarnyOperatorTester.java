package itNetwork.spring1;

import java.util.Scanner;

public class TernarnyOperatorTester {
    public static void main(String[] args) {

        Scanner vstup = new Scanner(System.in);
        System.out.print("Zadaj vek osoby: ");
        int vek = vstup.nextInt();

        String text = vek >= 18 ? "Osoba starsia ako 18 rokov" : "Mladistva osoba";

        /*
        if (vek >= 18)
        {
            text = "Osoba starsia ako 18 rokov";
        }
        else
        {
            text = "Mladistva osoba";
        }

         */
        System.out.println(text);
    }
}

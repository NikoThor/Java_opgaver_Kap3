package Java_opgave_3_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("indtast din højde");
        double hojde = input.nextDouble();
        System.out.println("indtast din vægt");
        double vaegt = input.nextDouble();

        Bmi.bmiBeregning(hojde,vaegt);
    }
}

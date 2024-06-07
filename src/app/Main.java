package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Converter from miles to km and from km to miles");

        int z = 10;
        while (z > 1) {
            System.out.println("Select what do you want to do\n" +
                    "\t1. Convert miles to km\n" +
                    "\t2. Convert km to miles\n" +
                    "\t0. Exit");
            int q = scanner.nextInt();
            switch (q){
                case 0: z = 0; break;
                case 1:
                    System.out.print("Miles: ");
                    double m = scanner.nextDouble();
                    System.out.println("Km: " + milesToKm(m));
                    break;
                case 2:
                    System.out.print("Km: ");
                    double k = scanner.nextDouble();
                    System.out.println("Miles: " + kmToMiles(k));
                    break;
                default:
                    System.out.println("You did entered wrong value");
                    break;
            }
        }
    }
    public static double milesToKm (double miles) {
        double km = miles * 1.60934;
        return km;
    }

    public static double kmToMiles (double km) {
        double miles = km / 1.60934;
        return miles;
    }
}

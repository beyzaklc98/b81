package day09_ternary;

import java.util.Scanner;

public class C02_Odev_Ternary {

    public static void main(String[] args) {

        // Soru2 : Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scan.nextInt();

        System.out.println(sayi % 2 == 0 ? "cift sayi" : "tek sayi");
    }
}

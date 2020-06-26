package com.company;
import java.util.Scanner;

public class Main extends Methods {

    public static void main(String[] args) {
        /*Scanner scannerObj = new Scanner(System.in);
        Float turnoverBronze = scannerObj.nextFloat();
        Float purchaseValueBronze = scannerObj.nextFloat();
        Float turnoverSilver = scannerObj.nextFloat();
        Float purchaseValueSilver = scannerObj.nextFloat();
        Float turnoverGold = scannerObj.nextFloat();
        Float pruchaseValueGold = scannerObj.nextFloat();

         */
        Methods methodsObj = new Methods();
        methodsObj.BroznzeForDiscount(150,0);
        System.out.println(" ");
        methodsObj.SilverForDiscount(850,600);
        System.out.println(" ");
        methodsObj.GoldForDiscount(1300,1500);

    }
}

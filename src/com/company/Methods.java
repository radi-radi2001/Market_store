package com.company;
import java.lang.Math;

public class Methods{

    /*Bronze*/
    public void BroznzeForDiscount (float purchaseOfValue,float turnover){
        float total = 0;
        float discount = 0;
        float discountRate = 0;

        if(turnover <= 100){
            discountRate = 0;
        }else if(turnover >= 100 && turnover <= 300){
            discountRate = 1;
        }else{
            discountRate = (float) 2.5;
        }
        System.out.println("Purchase value: $" + purchaseOfValue);

        System.out.println("Discount rate: " + discountRate + "%");

        discount = discountRate/100*purchaseOfValue;
        System.out.println("Discount: $" + discount);

        total = purchaseOfValue-discount;
        System.out.println("Total: $" + total);

    }

    /*Silver*/
    public void SilverForDiscount (float purchaseOfValue,float turnover){
        float total = 0;
        float discount = 0;
        float discountRate = 2;

        if(turnover >= 300 ){
            discountRate = (float) 3.5;
        }
        System.out.println("Purchase value: $" + purchaseOfValue);

        System.out.println("Discount rate: " + discountRate + "%");

        discount = discountRate/100*purchaseOfValue;
        System.out.println("Discount: $" + discount);

        total = purchaseOfValue-discount;
        System.out.println("Total: $" + total);

    }

    /*Gold*/
    public void GoldForDiscount (float purchaseOfValue,float turnover){
        float damn = 0;
        float total = 0;
        float discount = 0;
        float discountRate = 2;

        damn = turnover/100;
        discountRate = discountRate+damn;
        if(discountRate > 10){
            discountRate =10;
        }
        System.out.println("Purchase value: $" + purchaseOfValue);

        System.out.println("Discount rate: " + discountRate + "%");

        discount = discountRate/100*purchaseOfValue;
        System.out.println("Discount: $" + discount);

        total = purchaseOfValue-discount;
        System.out.println("Total: $" + total);

    }
}

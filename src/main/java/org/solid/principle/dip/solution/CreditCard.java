package org.solid.principle.dip.solution;

public class CreditCard implements CardService{

    public void doShoping(long amt){
        System.out.println("making payment using credit card..........");
    }
}

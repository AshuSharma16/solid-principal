package org.solid.principle.dip.solution;

import org.solid.principle.srp.problem.BankService;

public class DebitCard implements CardService {
    public void doShoping(long amt){
        System.out.println("making payment using debit card");
    }
}

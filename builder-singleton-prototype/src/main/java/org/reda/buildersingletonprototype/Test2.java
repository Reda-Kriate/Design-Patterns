package org.reda.buildersingletonprototype;

import org.reda.buildersingletonprototype.entity.BankAccount;
import org.reda.buildersingletonprototype.entity.Customer;
import org.reda.buildersingletonprototype.enums.AccountStatus;
import org.reda.buildersingletonprototype.enums.AccountType;

public class Test2 {
    public static void main(String[] args) throws CloneNotSupportedException {

        BankAccount acc1 = BankAccount.builder()
                .id(1L)
                .balance(8000)
                .currency("USD")
                .type(AccountType.SAVINGS)
                .status(AccountStatus.SUSPENDED)
                .customer(new Customer(1L , "Reda"))
                .build();

        BankAccount acc2 = acc1.clone();

        acc1.customer.setName("Abdo");

        System.out.println(acc1);
        System.out.println(acc2);




    }
}

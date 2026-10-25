package org.reda;

public class Monitor implements VGA{
    @Override
    public void print(String msg) {
        System.out.println("*********** MONITOR ************");
        System.out.println(msg);
        System.out.println("********************************");
    }
}

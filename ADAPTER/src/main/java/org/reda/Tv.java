package org.reda;

public class Tv implements HDMI{
    @Override
    public void plot(byte[] data) {
        System.out.println(":::::::::: TV ::::::::::::");
        System.out.println(new String(data));
        System.out.println("::::::::::::::::::::::::::");
    }
}

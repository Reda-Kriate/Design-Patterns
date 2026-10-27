package org.reda;

public class Computer{
    private VGA vga;
    public void view(String msg) {
        System.out.println("--------- Computer ------------");
        vga.print(msg);
        System.out.println("-------------------------------");
    }
    public void setVga(VGA vga) {
        this.vga = vga;
    }
}

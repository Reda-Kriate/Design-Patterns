package org.reda;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setVga(new Monitor());
        computer.view("Hello");
        computer.setVga(new VideoProjector());
        computer.view("Hello");
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");

        VgaHdmiAdapter adapter = new VgaHdmiAdapter();
        adapter.setHdmi(new Tv());
        computer.setVga(adapter);
        computer.view("hello adapter");
    }
}
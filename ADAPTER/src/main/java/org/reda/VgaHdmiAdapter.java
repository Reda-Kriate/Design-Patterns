package org.reda;


//public class VgaHdmiAdapter extends Tv implements VGA{  //méthode d'Heritage (Couplage fort)

public class VgaHdmiAdapter implements VGA{ //méthode de composition (Couplage faible)

    private HDMI hdmi; //méthode de composition (Couplage faible)

    @Override
    public void print(String msg) {
        System.out.println("---------- ADAPTER ------------");
        hdmi.plot(msg.getBytes()); //méthode de composition (Couplage faible)
        //plot(msg.getBytes()); //méthode d'Heritage (Couplage fort)
        System.out.println("------------------------------");
    }

    public void setHdmi(HDMI hdmi) {
        this.hdmi = hdmi;
    }
}

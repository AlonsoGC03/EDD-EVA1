package com.mycompany.eva1_6_automovil;

public class EVA1_6_AUTOMOVIL {

    public static void main(String[] args) {
        carro car1 = new carro();
        car1.setdueno("miguel");
        car1.setmarca("ford");
        car1.setmodelo("chevy");
        car1.setano(2023);
        car1.setplacas("ads-44564");
        car1.imprimirdatos();
        car1.Adeudo();
    }
}

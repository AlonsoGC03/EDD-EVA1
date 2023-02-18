package com.mycompany.eva1_5_circulo;

public class AyP {
    private double radio;
    private double perimetro;
    private double area;
    
    public AyP(){
    }
    
    public double getradio(){
        return radio;
    }
    public void setradio(double valor){//SET
        radio = valor;
        formular();
    }
    public void imprimirdatos(){
        System.out.println("perimetro =    "  +  perimetro);
        System.out.println("area=     " + area);
    }
    
    private void formular(){
        perimetro = 2 * 3.1416 * radio;
        area=(3.1416)*((radio)*(radio));       
    }
}
        


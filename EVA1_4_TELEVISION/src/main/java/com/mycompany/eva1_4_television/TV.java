package com.mycompany.eva1_4_television;

/**
 *
 * @author Alonso
 */
public class TV {
    //atrivutos: estado
    private boolean power;
    private int volumen;
    private int canal;
    //metodos: comportamiento
    //constructor:
    public TV(){//constructor default
        power = false; //apagado
        volumen = 0;
        canal = 2;
    }
    public void cambaiarpower(){
         if (power == false){//apagado
             power = true;//encendidio
             System.out.println("television encendida");
    }else{
             power = false;
             System.out.println("televicion apagada");
    }
    }
    public void subirvolumen(){
        if(power == true){
            if(volumen < 100){
        volumen = volumen + 5;
        System.out.println("volumen:  " + volumen);
        }
        }     
    }
    public void bajarvolumen(){
        if(power == true){
            if(volumen>0){
                volumen = volumen - 5;
                System.out.println("volumen:  " + volumen);
            }
        }    
    }
    public void subircanal(){
        if(power == true){
            if(canal < 100)
                canal = canal + 1;
                
            else
                canal=1;
             System.out.println("canal:  " + canal);
            
        
        }
    }
    public void bajarcanal(){
        if(power == true){
            if(canal > 1)
                canal = canal-1;
            else
                canal=100;
            System.out.println("canal:  " + canal);
        }
    }
}

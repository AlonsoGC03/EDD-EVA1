package com.mycompany.eva1_9_mensaje;

/**
 *
 * @author Alonso
 */
public class EVA1_9_MENSAJE {

    public static void main(String[] args) {
        nPrintLn( "gol" , 4 );//llamada a funcion
    }
    public static void nPrintLn(String message, int num){
        for (int i = 0; i < num; i++) {
            System.out.println(message);
        }
    }
}

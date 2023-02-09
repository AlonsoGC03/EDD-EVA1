package com.mycompany.eva1_2_clase_java;

public class EVA1_2_CLASE_JAVA {
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona perso1 = new Persona();
        /*perso1.apellidos = "Piñon";
        perso1.nombre = "Saul";
        System.out.println(perso1.nombre+" "+perso1.apellidos);*/
        perso1.setNombre("Alonso");
        perso1.setapellidos( "Grajiola castro");
        perso1.setedad(20);
        perso1.setgenero('H');//'' caracter
        perso1.imprimirdatos();
    }
   
}
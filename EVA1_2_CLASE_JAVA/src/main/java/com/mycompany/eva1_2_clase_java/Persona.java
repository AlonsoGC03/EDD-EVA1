package com.mycompany.eva1_2_clase_java;

import static java.time.Clock.system;
import static java.time.InstantSource.system;

/**
 *
 * @author Alonso
 */
public class Persona {
//DATOS --> ATRIBUTOS DE LA CLASE
    private String nombre;
    private String apellidos;
    private int edad;
    private char genero;
    // METODOS --> COMPORTAMIENTO DE LA CLASE
    // LEER Y ESCRIBIR LOS ATRIBUTOS DE LA CLASE
    //LEER --> GET
    //ESCRIBIR --> SET
    // MODIFICADOR DE ACCESO, VALOR DE RETORNO, NOMBRE DEL METODO (ARGUMENTOS) (IMPLEMENTACION)
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String valor){//SET
        nombre = valor;
    }
    public int getedad(){
        return edad;
    }
    public void setedad(int valor){
        edad = valor;
    }
    public String getapellidos(){
        return apellidos;
    }
    public void setapellidos(String valor){
        apellidos = valor;
    }
    public char getgenero(){
        return genero;
    }
    public void setgenero (char valor){
        genero = valor;
    }
    public void imprimirdatos(){
        System.out.println("nombre: "+ nombre + " " + apellidos );
        System.out.println("edad: " + edad);
        System.out.println("genero: " + genero);
    }
}

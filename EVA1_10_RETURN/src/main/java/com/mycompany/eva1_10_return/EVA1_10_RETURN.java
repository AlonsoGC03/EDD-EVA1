/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_10_return;

/**
 *
 * @author Alonso
 */
public class EVA1_10_RETURN {

    public static void main(String[] args) {
        square(10);
        int resu;
        resu = square(3);
        System.out.println(resu);
        System.out.println(square(5));

    }
    public static int square(int num){
        return num * num;
    }
}

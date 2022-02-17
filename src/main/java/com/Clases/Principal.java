package com.Clases;

import com.Frame.Login;
import com.Frame.ventanaCarga;


public class Principal {
    public static void main(String[] args) {
        carga();
    }
    
    public static void carga (){
        ventanaCarga ventana1 = new ventanaCarga();
        ventana1.setVisible(true);
        Login ventana2 = new Login();
        for (int i = 0; i < 500000; i++) {
            System.out.println("cargar :" + i);
        }
        ventana1.dispose();
        ventana2.setVisible(true);
    }
}
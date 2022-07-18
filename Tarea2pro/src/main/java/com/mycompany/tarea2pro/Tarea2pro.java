/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea2pro;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author Funez
 */
public class Tarea2pro {
public static void main(String[] args) {
    System.out.println("No olvides usar espacios");
        String[] op = leer().split(" ");
        switch (op[1].charAt(0)) {
            case '+':
                System.out.println(Double.valueOf(op[0])+Double.valueOf(op[2]));
                break;
            case '-':
                System.out.println(Double.valueOf(op[0])-Double.valueOf(op[2]));
                break;
            case '*':
                System.out.println(Double.valueOf(op[0])*Double.valueOf(op[2]));
                break;
            case '/':
                System.out.println(Double.valueOf(op[0])/Double.valueOf(op[2]));
                break;
            default: System.out.println("Operacion incorrecta");
        }
    }
    public static String leer() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linea = "";
        try {
            linea = br.readLine();
        } catch (IOException e) {}
        return linea;
    }
}
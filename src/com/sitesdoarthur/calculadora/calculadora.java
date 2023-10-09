package com.sitesdoarthur.calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        System.out.println("------------------------------------");
        System.out.println("-------CALCULADORA INTERATIVA-------");
        System.out.println("------------------------------------");
        int num = 0;
        byte menu = 0;
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Digite [1] para ADIÇÃO");
            System.out.println("Digite [2] para SUBTRAÇÃO");
            System.out.println("Digite [3] para MULTIPLICAÇÃO");
            System.out.println("Digite [4] para DIVISÃO");
            System.out.println("E precione [ENTER] para confirmar");
            menu = teclado.nextByte();
        }
    }
}

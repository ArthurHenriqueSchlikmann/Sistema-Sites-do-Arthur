package com.sitesdoarthur.calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        System.out.println("------------------------------------");
        System.out.println("-------CALCULADORA INTERATIVA-------");
        System.out.println("------------------------------------");
        int num1;
        int soma;
        float s;
        int num2;
        byte menu;
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Digite [1] para ADIÇÃO");
            System.out.println("Digite [2] para SUBTRAÇÃO");
            System.out.println("Digite [3] para MULTIPLICAÇÃO");
            System.out.println("Digite [4] para DIVISÃO");
            System.out.println("E precione [ENTER] para confirmar");
            menu = teclado.nextByte();
            if(menu == 1) {
                System.out.print("Primeiro numero: ");
                num1 = teclado.nextInt();
                System.out.print("Segundo numero: ");
                num2 = teclado.nextInt();
                soma = num1 + num2;
                System.out.println("O resultado é " + soma);
            }
            if(menu == 2) {
                System.out.print("Primeiro numero: ");
                num1 = teclado.nextInt();
                System.out.print("Segundo numero: ");
                num2 = teclado.nextInt();
                soma = num1 - num2;
                System.out.println("O resultado é " + soma);
            }
            if(menu == 3) {
                System.out.print("Primeiro numero: ");
                num1 = teclado.nextInt();
                System.out.print("Segundo numero: ");
                num2 = teclado.nextInt();
                soma = num1 * num2;
                System.out.println("O resultado é " + soma);
            }
            if(menu == 4) {
                System.out.print("Primeiro numero: ");
                num1 = teclado.nextInt();
                System.out.print("Segundo numero: ");
                num2 = teclado.nextInt();
                s = num1 / num2;
                System.out.println("O resultado é " + s);
            }
        }
    }
}

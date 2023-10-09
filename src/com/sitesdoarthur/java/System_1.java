package com.sitesdoarthur.java;

import java.util.Scanner;

public class System_1 {
    /**
     * @author ArthurHenriqueSchlikmann
     * @version 1b
     */
    public static void main(String[] args) {
        String usuario;
        String pasta = "root> ";
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("INICIANDO...");
            System.out.print("Usuário: ");
            usuario = teclado.nextLine();
            if (!(usuario == null)) {
                System.out.print(pasta);
                String commando = teclado.nextLine();
                if("dir".equals(commando)) {
                    System.out.println("DIR.COM");
                    System.out.println("EXIT.COM");
                    System.out.println("HELP.COM");
                    System.out.printf("Programs \n");
                    System.out.println("CD.COM");
                    System.out.println("Em desenvolvimento");
                }
                if("help".equals(commando)) {
                    System.out.print("digite dir e tude o que tiver a extensão .com é um ");
                    System.out.println("comando que podemos usar");
                    System.out.println("um com a extensão .exe é um aplicativo");
                }
            }
        }
    }
}    
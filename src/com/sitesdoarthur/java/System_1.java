package com.sitesdoarthur.java;

import java.util.Scanner;

public class System_1 {
    /**
     * @author ArthurHenriqueSchlikmann
     * @version 1b
     */
    public static void main(String[] args) {
        String usuario;
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("INICIANDO...");
            System.out.print("Usuário: ");
            usuario = teclado.nextLine();
            if (!(usuario == null)) {
                System.out.print("root> ");
                String commando = teclado.nextLine();
                if("dir".equals(commando)) {
                    System.out.println("DIR.COM");
                    System.out.println("EXIT.COM");
                    System.out.println("HELP.COM");
                }
        
            }
        }
    }
}    
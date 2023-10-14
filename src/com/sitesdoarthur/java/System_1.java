package com.sitesdoarthur.java;

import java.util.Scanner;
import com.sitesdoarthur.aditionals.dir;
import com.sitesdoarthur.calculadora.calculadora;

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
                    dir.DIR(pasta);
                }
                if("help".equals(commando)) {
                    System.out.print("digite dir e tude o que tiver a extensão .com é um ");
                    System.out.println("comando que podemos usar");
                    System.out.print("um com a extensão .jar é um aplicativo ");
                    System.out.printf("eles estão na pasta PROGRAMS \n");
                }
                if("calculadora".equals(commando)) {
                    calculadora.main(args);
                }
                if("cd".equals(commando)) {
                    System.out.print("Caminho: ");
                    pasta = teclado.nextLine();
                }
            }
        }
    }
}    
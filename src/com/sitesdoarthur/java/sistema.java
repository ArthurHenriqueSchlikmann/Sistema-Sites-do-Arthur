package com.sitesdoarthur.java;

import java.util.Scanner;
import com.sitesdoarthur.program.interface_interna;

public class sistema {
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
        }
        if (!(usuario == null)) {
            interface_interna.main(args);
        }
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.validadorcpf;

import java.util.Scanner;

public class ValidadorCPF {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu CPF (somente números): ");
        String cpf = scanner.nextLine();

        boolean cpfValido = validarCpf(cpf);

        if (cpfValido) {
            System.out.println("Bem vindo(a)!");
        } else {
            System.out.println("Tente novamente mais tarde.");
        }

        scanner.close();
    }

    public static boolean validarCpf(String cpf) {
        return cpf.length() == 11 && cpf.matches("\\d+");
    }
}

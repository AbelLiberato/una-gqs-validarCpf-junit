/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.validadorcpf;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorCPFTest {

    @Test
    public void testCpfComOnzeDigitos() {
        String cpf = "12345678901";
        assertTrue(ValidadorCPF.validarCpf(cpf));
    }

    @Test
    public void testCpfComMenosDeOnzeDigitos() {
        String cpf = "1234567890";
        assertFalse(ValidadorCPF.validarCpf(cpf));
    }

    @Test
    public void testCpfComMaisDeOnzeDigitos() {
        String cpf = "123456789012";
        assertFalse(ValidadorCPF.validarCpf(cpf));
    }

    @Test
    public void testCpfComCaracteresInvalidos() {
        String cpf = "abc123def45";
        assertFalse(ValidadorCPF.validarCpf(cpf));
    }
}



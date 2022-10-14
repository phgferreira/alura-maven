package br.com.alura.loja;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    public void test() {
        Produto produto = new Produto();
        String resultado = produto.getTest();
        assertEquals("Test", resultado);
    }
}
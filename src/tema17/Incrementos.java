/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema17;

/**
 *
 * @author manolo
 */
public class Incrementos {
    
    public Incrementos() {
        
    }
    
    public int a (int valorA) {
        int valorFuncionB = b(valorA);
        return valorFuncionB;
        
    }
    
    public int b (int valorB) {
        int valorDecrementado = valorB -1;
        int valorFuncionC = c(valorDecrementado);
        return valorFuncionC;
    }
    
    public int c (int valorC) {
        int valorDecrementado = valorC -1;
        return valorDecrementado;
    }    
    
}

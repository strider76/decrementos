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
public class Tema17 {

    /**
     * @param args the command line arguments
     */
    public Tema17() {
        
    }
    
    public int a (int valorA) {
        int valorFuncionB = this.b(valorA);
        return valorFuncionB;
        
    }
    
    private int b (int valorB) {
        int valorDecrementado = valorB -1;
        int valorFuncionC = this.c(valorDecrementado);
        return valorFuncionC;
    }
    
    private int c (int valorC) {
        int valorDecrementado = valorC -1;
        return valorDecrementado;
    }  
    
    public static void main(String[] args) {
        
        System.out.println("Le pasamos a funcion A de 5: ");
        Tema17 valorIncrementos = new Tema17();
        System.out.println("El valor final es "+ valorIncrementos.a(5));
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_examen;

/**
 *
 * @author José Sebastian López Ibarra & Sebastian Emilio Murillo Andrade
 */
class FIBONACCI {
    private int n;
    private int a1;
    private int a2;
    
    public FIBONACCI() {
        n = 6;
        a1 = 1;
        a2 = 2;
    }
    
    public FIBONACCI(int n, int a1, int a2) {
        this.n = n;
        this.a1 = a1;
        this.a2 = a2;
    }
    
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public int getA1() {
        return a1;
    }

    public void setA1(int a1) {
        this.a1 = a1;
    }

    public int getA2() {
        return a2;
    }

    public void setA2(int a2) {
        this.a2 = a2;
    }
}

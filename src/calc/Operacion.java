/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

/**
 *
 * @author tardis
 */
public class Operacion {
    double n1;
    double n2;
    double res;
    char operacion;

    public Operacion(double n1, double n2, char operacion) {
        this.n1 = n1;
        this.n2 = n2;
        this.operacion = operacion;
    }
    
    public void mostrarResultado(){
        System.out.println(this.n1+" "+this.n2+" = "+.this.res);
    }
    
    
}

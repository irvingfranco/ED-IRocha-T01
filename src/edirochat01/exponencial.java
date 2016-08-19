/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edirochat01;

/**
 *
 * @author casa
 * Irving Rocha 513382 
 * 4° semestre
 */
public class exponencial {
    
    public static int numexp(int n, int x){ 
        if (x==0){ // en la base se establece que si el exponente es cero regresara 1 ya que todo numero elevado a 0 es 1
          return 1;
        } else {//  el numero base se repetira dependiendo del numero del exponente ya que se le ira restando 1 hasta que el exponente sea 0 y al final el numero base se multiplicara por el numero de veces del exponente 
       
         return n*numexp(n,x-1);
        }
        
    }
    
}

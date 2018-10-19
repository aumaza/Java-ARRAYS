/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4_arrays;

/**
 *
 * @author capacita_mecon
 */
public class Clase4_Arrays {
    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] miVector;//= {1,2,3,4,5}; //esta variable guarda una dirección de memoria, luego hay que instanciarlo.-
        miVector = new int[5];//5 es la cantidad de elementos del vector
        
        //int i;
        
               
       for(int i=0; i<miVector.length; i++)
        {
            miVector[i] = i+1;
        }
        
        for(int i=0; i<miVector.length;i++)
        {
            System.out.println("Vector es: "+miVector[i]);
        }
        
        int[] miVector2;
        miVector2 = miVector.clone();
        
        for(int i=0; i<miVector2.length; i++)
        {
            miVector2[i] = i+1;
        }
        
        for(int i=0; i<miVector2.length; i++)
        {
            System.out.println("El clone: "+miVector2[i]);
        }
        
        for(int i : miVector)//"for each" i asume una copia del valor del array miVector.-
        {
            System.out.println(i);
        }
        
        }
}
        
        
        
        
        
    

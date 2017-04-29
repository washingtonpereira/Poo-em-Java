/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Washington
 */
public class appteste{
    public static void main (String [] args){
        Conta cont,cont2;    
        cont = new Conta(); 
        cont2 = new Conta(22222, "Bernadete", 127.34f);
       
              
        
        
        cont.setNome_Cliente("Bernardo");
        cont.setNumero(12345);
        cont.setSaldo(22.12f);    
        
        
        
        System.out.println("Cliente :" + cont2.getNome_Cliente());
        System.out.println("Conta de numero: "+ cont2.getNumero());
        System.out.println("Saldo = " + cont2.getSaldo());
        
        System.out.println("Cliente : "+ cont.getNome_Cliente());
        System.out.println("Conta de numero: " + cont.getNumero());
        System.out.println("Saldo = " + cont.getSaldo());
        
                 
    }
    
}

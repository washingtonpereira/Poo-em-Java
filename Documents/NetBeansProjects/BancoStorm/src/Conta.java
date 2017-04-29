/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Washington
 */
public class Conta {
    private int numero;
    private String nome_Cliente;
    private float saldo;

    public Conta(){
    }
    public Conta(int numero,String nome_Cliente,float saldo){
        this.numero = numero;
        this.nome_Cliente = nome_Cliente;
        this.saldo = saldo;
                
    }
                
    
  
    
    public int getNumero(){
        return numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
        
    
    
    }

    public String getNome_Cliente() {
        return nome_Cliente;
    }

    public void setNome_Cliente(String nome_Cliente){
        this.nome_Cliente = nome_Cliente;
               
    }
    public float getSaldo(){
        return saldo;
    }
    
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    
    }


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Washington
 */
public class Conta { //classe 
    private int numero;
    private String nome_Cliente; //atributos da classe
    private float saldo;

    public Conta(){ //construtor default
        
    }
    public Conta(int numero,String nome_Cliente,float saldo){ //sobrecarga de construtor
        this.numero = numero;
        this.nome_Cliente = nome_Cliente;
        this.saldo = saldo;
                
    }
                
    
  
    
    public int getNumero(){ // métodos acessor
        return numero;
    }
    
    public void setNumero(int numero){ // método assessor
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


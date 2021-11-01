package com.example.ficha3;

public class Calculadora {
    private int n1;
    private int n2;

    public Calculadora(int n1,int n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    public int somar(){
        return n1+n2;
    }
    public int subtrair(){
        return n1-n2;
    }
    public int multiplicar(){
        return n1*n2;
    }
    public  int dividir(){
        return  n1/n2;
    }
}

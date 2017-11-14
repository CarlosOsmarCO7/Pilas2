package com.company;

public class Nodo
{
    private int valor;
    private Nodo prox;
    Nodo sig;
    
    public Nodo(){
        this.valor = 0;
        this.prox = null;
        this.sig=null;
    }
    public Nodo(int v){
        this.valor = v;
        this.prox = null;
    }
    public void enlazarSig(Nodo n){
        sig= n;
    }
    public void setValor(int v){
        valor = v;
    }
    public void setProx(Nodo p){
        prox = p;
    }
    public int getValor(){
        return valor;
    }
    public Nodo getProx(){
        return prox;
    }
}

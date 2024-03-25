package javarecordscontrol;

import javarecordscontrol.Recorde;

public class Pilha<T> {
    private int topo;
    private T[] elementos;
    public Pilha(int maxTam) {
        this.elementos = (T[]) new Object[maxTam];
        this.topo = -1;
    }
    public boolean isFull(){
        return topo == elementos.length - 1;
    }
    public boolean isEmpty(){
        return topo == -1;
    }
    public int size(){
        return topo+1;
    }
    public boolean push(T novoDado){
        if(!this.isFull()){
            //crie um método para verificar se o novo dado é maior que o topo
            if(novoDado instanceof Recorde){
                if(!this.isEmpty()){
                    Recorde recorde = (Recorde) novoDado;
                    Recorde antigoRecorde = (Recorde) elementos[this.topo];
                    if(recorde.getTempo() < antigoRecorde.getTempo()){
                        elementos[++this.topo] = novoDado;
                        return true;
                    }else{
                        System.out.println("O recorde informado não é maior que o atual.");
                        return false;
                    }
                }else{
                    elementos[++topo] = novoDado;
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    public T pop(){
        return elementos[topo--];
    }
    public T peek(){
        return elementos[topo];
    }
    @Override
    public String toString(){
        StringBuilder retorno = new StringBuilder();
        for(int i=topo;i>=0; i--)
            retorno.append(elementos[i] + "\n");
        retorno.append("-----------");
        return retorno.toString();
    }
    
    public void clear(){
        this.topo = -1;
    }


}

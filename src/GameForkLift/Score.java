/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameForkLift;

/**
 *
 * @author Bayu Sujatmoko
 */
public class Score {
    private int langkah;
    private int stackBenar;
    private int stackSalah;
    
    public void setScore(int l, int b, int s){
        langkah = l;
        stackBenar = b;
        stackSalah = s;
    }
    
    public int getLangkah(){
        return langkah;
    }
    
    public int getStackBenar(){
        return stackBenar;
    }
    
    public int getStackSalah(){
        return stackSalah;
    }
    
    public void print(){
        System.out.println("LANGKAH     : "+langkah);
        System.out.println("STACK BENAR : "+stackBenar);
        System.out.println("STACK SALAH : "+stackSalah);
    }
}

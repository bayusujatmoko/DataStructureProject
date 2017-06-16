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
public class areaB {

    private int ukuran;
    private int[] tumpukan;
    private int top;

    public areaB(int s) {
        ukuran = s;
        tumpukan = new int[ukuran];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == ukuran - 1;
    }

    public void push(int nama) {
        if (!isFull()) {
            top++;
            tumpukan[top] = nama;
        } else {
            System.out.println("Stack sudah penuh");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Area B KOSONGG !!");
            return 0;
        } else {
            int temp = tumpukan[top];
            top--;
            return temp;
        }
    }

    public int peek() {
        if (isEmpty()) {
            return 0;
        } else {
            int temp = tumpukan[top];
            return temp;
        }
    }

    public void emptyStack() {
        top = -1;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Area B Kosong");
        } else {
            int i = top;
            System.out.println("================ A R E A  ( B ) =============");
            System.out.println("Tumpukan di Area B");
            while (i >= 0) {
                System.out.println("[" + tumpukan[i] + "]");
                i--;
            }
            System.out.println("===============================");
            System.out.println("");
        }
    }
}

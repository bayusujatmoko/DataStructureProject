/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameForkLift;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Bayu Sujatmoko
 */
public class randomAreaA {

    private ArrayList<Integer> cek = new ArrayList<>();

    private int size;

    public randomAreaA(int size) {
        this.size = size;
    }

    public void rdAreaA() {
        int nilai;
        int i = size;
        int z = 1;
        Random randomnya = new Random();
        //perulangan dimana kondisi jumlahdata di forkLift lebih kecil dari i
        while (cek.size() < i) {
            boolean sama = false;
            nilai = randomnya.nextInt(i);
            //percabangan apakah data di forkLift sudah ada apa masih kosong
            if (cek.size() > 0) {
                // perulangan untuk mengecek datanya ada yang sama atau tidak
                for (int j = 0; j < cek.size(); j++) {
                    if (nilai == cek.get(j)) {
                        sama = true;
                        break;
                    }
                }
                // jika data ada yang tidak sama baru dimasukin ke stack forkLift
                if (sama == false) {
                    cek.add(nilai);
                }
            } //jika data masih kosong maka di push terlebih dahulu
            else {
                cek.add(nilai);
            }
        }

    }

    public void print() {
        System.out.println("************************* TANTANGAN *********************************");
        System.out.println("Pindahkan Barang dari ForkLift ke A R E A (A) dengan susunan berikut");
        for (int k = (size - 1); k >= 0; k--) {
            System.out.println("[" + cek.get(k) + "]");
        }
        System.out.println("********************************************************************");
    }

    public int cekData(int s) {
        return cek.get(s);
    }

}

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
public class randomForkLift {

    public forkLift fork;
    private int s;

    public randomForkLift(int s) {
        this.s = s;
    }

    public void randomFork() {
        fork = new forkLift(s);
        int nilai;
        int i = s;
        Random randomnya = new Random();
        //perulangan dimana kondisi jumlahdata di forkLift lebih kecil dari i
        while ((fork.count() + 1) < i) {
            boolean sama = false;
            nilai = randomnya.nextInt(i);
            //percabangan apakah data di forkLift sudah ada apa masih kosong
            if ((fork.count() + 1) > 0) {
                // perulangan untuk mengecek datanya ada yang sama atau tidak
                for (int j = 0; j < (fork.count() + 1); j++) {
                    if (nilai == fork.cekData(j)) {
                        sama = true;
                        break;
                    }
                }
                // jika data ada yang tidak sama baru dimasukin ke stack forkLift
                if (sama == false) {
                    fork.push(nilai);
                }
            }    //jika data masih kosong maka di push terlebih dahulu
            else {
                fork.push(nilai);
            }
        }
    }

    public void printRandomFork() {
        fork.print();
    }
}

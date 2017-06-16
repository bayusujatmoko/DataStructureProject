/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameForkLift;

import java.util.Scanner;

/**
 *
 * @author Bayu Sujatmoko
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pil = 0;
        int langkah = 0;

        Score score[] = new Score[100];
        int indeks = 0;
        char main;

        do {
            areaA areaA = new areaA(4);
            areaB areaB = new areaB(4);

            randomAreaA rdAreaA = new randomAreaA(4);

            randomForkLift rdFork = new randomForkLift(4);
            rdFork.randomFork();
            forkLift fork = rdFork.fork;
            System.out.println("======== ATURAN MAIN ======== ");

            rdFork.printRandomFork();
            rdAreaA.rdAreaA();
            System.out.println(" ================= GAME " + (indeks + 1) + "======================");
            rdAreaA.print();
            boolean cek = true;
            langkah = 0;
            do {
                if (!areaA.isFull()) {
                    System.out.println("====================================================");
                    System.out.println(" ===================== GAME PLAY =====================");
                    System.out.println("1. Masukkan barang dari forkLift ke Area A");
                    System.out.println("2. Keluarkan barang dari Area A ke forkLift");
                    System.out.println("3. Masukkan barang dari forkLift ke Area B ");
                    System.out.println("4. Keluarkan barang dari Area B ke forkLift");
                    System.out.println("5. Lihat Area A");
                    System.out.println("6. Lihat Area B");
                    System.out.println("7. Lihat Soal");
                    System.out.print("Masukkan pilihan : ");
                    pil = sc.nextInt();
                    sc.nextLine();
                    if (pil == 1) {
                        areaA.push(fork.pop());
                        areaA.print();
                        fork.print();
                        langkah++;
                    } else if (pil == 2) {
                        fork.push(areaA.pop());
                        fork.print();
                        areaA.print();
                        langkah++;
                    } else if (pil == 3) {
                        areaB.push(fork.pop());
                        areaA.print();
                        fork.print();
                        langkah++;
                    } else if (pil == 4) {
                        fork.push(areaB.pop());
                        fork.print();
                        areaA.print();
                        langkah++;
                    } else if (pil == 5) {
                        areaA.print();
                    } else if (pil == 6) {
                        areaB.print();
                    } else if (pil == 7) {
                        rdAreaA.print();
                    } else {
                        System.out.println("Pilihan tidak ada !!!");
                    }
                } else {
                    //menghitung step, stack benar, dan stack salah
                    int langkahBenar = 0,
                            langkahSalah = 0;
                    for (int i = 0; i < 4; i++) {
                        if (rdAreaA.cekData(i) == areaA.cekData(i)) {
                            langkahBenar++;
                        } else {
                            langkahSalah++;
                        }
                    }
                    score[indeks] = new Score();
                    System.out.println("Total Step yang dilakukan : " + langkah);
                    System.out.println("Stack benar : " + langkahBenar);
                    System.out.println("Stack salah : " + langkahSalah);

                    score[indeks].setScore(langkah, langkahBenar, langkahSalah);

                    indeks++;
                    cek = false;
                }

            } while (cek != false);

            System.out.print("Mau main lagi (Y/T) : ");
            main = sc.next().charAt(0);

        } while (main == 'y' || main == 'Y');
        //mencari step atau langkah minimum dari salah satu game
        int min = score[0].getLangkah();
        int s = 0;

        for (int i = 1; i < indeks; i++) {
            if (min > score[i].getLangkah()) {
                min = score[i].getLangkah();
                s = i;
            }
        }

        for (int i = 0; i < indeks; i++) {
            System.out.println("=== GAME " + (i + 1) + " ===");
            score[i].print();
        }
        System.out.println("Total Step yang paling sedikit berada di game " + (s + 1) + " yaitu " + min);

    }

}

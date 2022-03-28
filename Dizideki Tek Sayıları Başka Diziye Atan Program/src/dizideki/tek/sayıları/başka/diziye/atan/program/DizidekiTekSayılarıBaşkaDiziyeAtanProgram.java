/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dizideki.tek.sayıları.başka.diziye.atan.program;

import java.util.Scanner;

/**
 *
 * @author Monster
 */
public class DizidekiTekSayılarıBaşkaDiziyeAtanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayac = 0;
        int [] dizi = new int[10];
        int [] dizi_tek = new int[10];
        
        for(int i = 0; i < 10; i++)
        {
            System.out.print("Dizinin " + (i+1) + ". elemanını giriniz: ");
            dizi[i] = scan.nextInt();
            if(dizi[i] % 2 == 1) {
                dizi_tek[sayac] = dizi[i];
                sayac++;
            }
        }
        System.out.println("Tek sayılar\n");
        for(int i = 0; i < sayac; i++)
        {
            System.out.println("Tek sayilar = " + dizi_tek[i]);
        }
    }
        // TODO code application logic here
    }
    


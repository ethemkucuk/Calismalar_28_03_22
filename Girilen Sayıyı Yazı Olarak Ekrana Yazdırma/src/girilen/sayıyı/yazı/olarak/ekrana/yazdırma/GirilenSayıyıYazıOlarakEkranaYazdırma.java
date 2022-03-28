/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package girilen.sayıyı.yazı.olarak.ekrana.yazdırma;

import java.util.Scanner;

/**
 *
 * @author Monster
 */
public class GirilenSayıyıYazıOlarakEkranaYazdırma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("2 Basamaklı bir sayi giriniz: ");
        int sayi = scan.nextInt();
        /* switch-case yapısını uzatarak
         ıstedigimiz basamaklı sayıyı yazdırabiliriz.*/
        
        int birler = sayi % 10;
        int onlar = sayi / 10;
        
        switch(onlar) {
        case 1:
            System.out.print("On");
            break;
        case 2:
            System.out.print("Yirmi");
            break;
        case 3:
            System.out.print("Otuz");
            break;
        case 4:
            System.out.print("Kırk");
            break;
        case 5:
            System.out.print("Elli");
            break;
        case 6:
            System.out.print("Altmıs");
            break;
        case 7:
            System.out.print("Yetmis");
            break;
        case 8:
            System.out.print("Seksen");
            break;
        case 9:
            System.out.print("Doksan");
            break;
        }
        switch(birler) {
        case 1:
            System.out.print(" bir");
            break;
        case 2:
            System.out.print(" iki");
            break;
        case 3:
            System.out.print(" üç");
            break;
        case 4:
            System.out.print(" dört");
            break;
        case 5:
            System.out.print(" beş");
            break;
        case 6:
            System.out.print(" altı");
            break;
        case 7:
            System.out.print(" yedi");
            break;
        case 8:
            System.out.print(" sekiz");
            break;
        case 9:
            System.out.print(" dokuz");
            break;
        }
    }
        // TODO code application logic here
    }
    


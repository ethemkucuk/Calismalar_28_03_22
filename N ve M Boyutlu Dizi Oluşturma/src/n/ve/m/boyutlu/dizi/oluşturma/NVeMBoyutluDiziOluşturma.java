/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n.ve.m.boyutlu.dizi.oluşturma;

import java.util.Scanner;

/**
 *
 * @author Monster
 */
public class NVeMBoyutluDiziOluşturma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Dizinin satır sayisini giriniz: ");
        int satir = scan.nextInt();
        System.out.print("Dizinin sütun sayisini giriniz: ");
        int sutun = scan.nextInt();
        int [][] dizi = new int[satir][sutun];
        
        for(int i = 0; i < satir; i++)
        {
            for(int j = 0; j < sutun; j++)
            {
                System.out.print("Bir sayi giriniz: ");
                dizi[i][j] = scan.nextInt();
            }
        }
        System.out.println("Girilen dizi \n");
        for(int i = 0; i < satir; i++)
        {
            for(int j = 0; j < sutun; j++)
            {
                System.out.print(dizi[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
        // TODO code application logic here
    }
    

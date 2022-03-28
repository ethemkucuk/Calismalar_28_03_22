/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package girilen.cümle.içinde.harf.bulma;

import static girilen.cümle.içinde.harf.bulma.HarfMetot.harfBul;
import java.util.Scanner;

/**
 *
 * @author Monster
 */
public class GirilenCümleİçindeHarfBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Bir cumle veya kelime giriniz: ");
        String cumle = scan.nextLine();
        System.out.print("Bir harf giriniz: ");
        char harf = scan.next().charAt(0);
        
        harfBul(cumle,harf);
    }
        // TODO code application logic here
    }
    

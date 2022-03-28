/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package girilen.cümle.içinde.harf.bulma;

/**
 *
 * @author Monster
 */
public class HarfMetot {
    static void harfBul(String cumle,char harf) {
        int sayac = 0;
        for(int i = 0; i < cumle.length(); i++)
        {
            if(cumle.charAt(i) == harf) {
                sayac++;
            }
        }
        System.out.println("Girdiginiz cumle veya kelımede " + sayac + " tane '" + harf + "' vardır");
}}

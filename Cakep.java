/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cakep;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 * Nama  : Tassyakur Pasya
 * Kelas : IF-01
 * NIM : 10118009
 * Matkul : PBO-01
 * Diskripsi Program : cakep
 */
public class Cakep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String jawab;
        String merah = "\u001B[31m";
        String hijau = "\u001B[32m";
        String kuning = "\u001B[33m";
        String biru = "\u001B[34m";
        
        
        System.out.println(merah + " Kamu " + hijau + " ngerjain sendiri " + kuning + " latihan 17 sampai " + biru + " 30 ini ?");
        Scanner input = new Scanner(System.in);
        System.out.print(hijau +"Jawab" + merah + " Yoi/Enggak = ");
        jawab = input.next();
        
        if (jawab.equalsIgnoreCase("yoi") || jawab.equalsIgnoreCase("Yoi")){
              System.out.println("Good"+merah+"Job");
        }else{
            System.out.println("sing penting paham konsepnya hehe");
        }
        
                
        
    }
    
}

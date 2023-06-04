 package com.mycompany.nesneliatm;


public class Main {
    
    public static void main (String[] args){
        
   
    ATM atm = new ATM();
    
    Hesap hesap = new Hesap("Caner Giden", "3452" , 2000);
    
    atm.calış(hesap);
    System.out.println("Programdan Çıkılıyor...");
    
}
 }
    
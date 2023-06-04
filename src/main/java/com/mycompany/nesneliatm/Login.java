package com.mycompany.nesneliatm;

import java.util.Scanner;

public class Login {
    
    public boolean Login(Hesap hesap){
        
        Scanner scanner = new Scanner(System.in);
        String kullanıcı_Adı;
        String parola;
        System.out.println("Kullanıcı Adı : ");
        kullanıcı_Adı=scanner.nextLine();
        System.out.println("Parola : ");
        parola=scanner.nextLine();
     
        if(hesap.getKullanıcı_Adı().equals(kullanıcı_Adı) && hesap.getParola().equals(parola)){
            
            return true;
        }
        
        else{
            
            return false;
            
        }
    }
}

package com.mycompany.nesneliatm;

import java.util.Scanner;

public class ATM {
    
    public void calış(Hesap hesap){
        Login login = new Login();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bankamıza Hoşgeldiniz 😊 " );
        System.out.println("****************************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("****************************");
       
        int giris_hakkı = 3;
        
        while(true){
            
            if(login.Login(hesap)){
              System.out.println("Giriş Başarılı...");
              break;
            }
            else{
                System.out.println("Giriş Başarısız...");
                giris_hakkı = giris_hakkı -1;
                System.out.println("Kalan Giriş Hakkınız : " + giris_hakkı);
            }
            if(giris_hakkı==0){
                System.out.println("Giriş hakkınız bitti.Hesabınız Bloke Olmuştur.Bankamıza Başvurunuz... ");
                
                return;
                
            }
        
        
        
        
    }
    
        System.out.println("*************************");
        String işlemler = "1. İşlem : Bakiye Görüntüleme\n"
                        + "2. İşlem : Para Yatırma\n"
                        + "3. İşlem : Para Çekme\n "
                        + "Çıkış İçin q ya Basın ";
        System.out.println(işlemler);
        System.out.println("*************************");
        
        while(true){
            System.out.println("Yapmak İstediğiniz İşlemi Seçiniz : ");
            String işlem= scanner.nextLine();
            
          if(işlem.equals("q")){
              System.out.println("Sistemden Çıkılıyor....");
              break;
          }
          else if(işlem.equals("1")){
              System.out.println("Bakiyeniz : " + hesap.getBakiye());
          }
          else if(işlem.equals("2")){
              System.out.println("Yatırmak İstediğniz Tutar : ");
              int tutar=scanner.nextInt();
              scanner.nextLine();
              hesap.ParaYatır(tutar);
          }
          else if(işlem.equals("3")){
              System.out.println("Çekmek İstediğiniz Tutarı Giriniz : ");
              int tutar=scanner.nextInt();
              scanner.nextLine();
              hesap.ParaÇekme(tutar);
          }
          else{
              System.out.println("Geçersiz İşlem...");
          }
        }
        
                   
                
      
        
        
        
        
        
        
        
        
        
        
        
    }
    
}

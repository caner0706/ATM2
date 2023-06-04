 package com.mycompany.nesneliatm;

public class Hesap {
    
    private String Kullanıcı_Adı;
    private String parola;
    private double bakiye;

    public Hesap (String Kullanıcı_Adı, String Parola, double bakiye) {
        this.Kullanıcı_Adı = Kullanıcı_Adı;
        this.parola = Parola;
        this.bakiye = bakiye;
    }

    /**
     * @return the Kullanıcı_Adı
     */
    public String getKullanıcı_Adı() {
        return Kullanıcı_Adı;
    }

    /**
     * @param Kullanıcı_Adı the Kullanıcı_Adı to set
     */
    public void setKullanıcı_Adı(String Kullanıcı_Adı) {
        this.Kullanıcı_Adı = Kullanıcı_Adı;
    }

    /**
     * @return the parola
     */
    public String getParola() {
        return parola;
    }

    /**
     * @param parola the parola to set
     */
    public void setParola(String parola) {
        this.parola = parola;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
    
    public void ParaYatır(int tutar){
        
        this.bakiye= bakiye + tutar;
        System.out.println("Yeni Bakiyeniz : " + bakiye);
    }
    
    public void ParaÇekme(int tutar){
    
        if((bakiye-tutar)<0){
            System.out.println("Yeterli Bakiyeniz Yok . Bakiyeniz : " + bakiye);
        }
        else{
            this.bakiye= bakiye - tutar;
            System.out.println("Yeni B akiyeniz : " + bakiye );
            
        }
        
    }
    
}

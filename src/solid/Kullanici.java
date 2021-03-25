/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

/**
 *
 * @author AYŞE
 */
public class Kullanici {
  private  String isim;
   private String mail;
    Adres adres;
//kapsülleme
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

  
    public void adresGuncelle(Adres adres){
     this.adres=adres;

}
    public String getAdres(){
        return adres.toString();
    }
    public String toString(){
        
              return getIsim()+ " " + getMail() + " " + getAdres();

    }
    }
   

 
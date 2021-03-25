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
public class Solid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kullanici kullanici=new Kullanici();
        kullanici.setIsim("sefa aras");
        kullanici.setMail("sefaras@ktu.tr");
       
        Adres adres=new Adres();
        adres.setUlke("Turkiye");
        adres.setIl("trabzon");
        adres.setIlce("of");
        
       kullanici.adresGuncelle(adres);
       System.out.println(kullanici.toString());
    
      
      adres.setPostkodu(61000);
      kullanici.adresGuncelle(adres);
           System.out.println(kullanici.toString());

    }
    
}

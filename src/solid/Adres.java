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
public class Adres {
   private String ulke;
    private String il;
    private String ilce;
  private int postkodu;

    public String getUlke() {
        return ulke;
    }

    public void setUlke(String ulke) {
        this.ulke = ulke;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public int getPostkodu() {
        return postkodu;
    }

    public void setPostkodu(int postkodu) {
        this.postkodu = postkodu;
    }
   public String toString(){
       return getUlke()+ " " + getIl() + "" + getIlce()+ "" + getPostkodu();
   }
  
}

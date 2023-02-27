/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

/**
 *
 * @author dervalics.a.laszlo
 */
public class Ember {

    String nev;
    int kor;
    String neme;
    int MunkToltEv = 0;

    
    public Ember(String sorok, String sep) {
        String[] sor = sorok.split(sep);
        if(sor.length == 3){
            setNev(sor[0]);
            setKor(Integer.parseInt(sor[1]));
            setNeme(sor[2]);
        }else{
            setNev(sor[0]);
            setKor(Integer.parseInt(sor[1]));
            setNeme(sor[2]);
            setMunkToltEv(Integer.parseInt(sor[3]));
        };
        
    }


    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setNeme(String neme) {
        this.neme = neme;
    }

    public void setMunkToltEv(int MunkToltEv) {
        this.MunkToltEv = MunkToltEv;
    }

    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }

    public String getNeme() {
        return neme;
    }

    public int getMunkToltEv() {
        return MunkToltEv;
    }
    
   

}

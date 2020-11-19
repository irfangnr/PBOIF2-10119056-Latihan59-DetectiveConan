package pboif2.pkg10119056.latihan59.detectiveconan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class Sifat extends DetectiveConan {
    private String sifat;

    public Sifat(String nama) {
        super(nama);
    }

    public String getSifat() {
        return sifat;
    }

    public void setSifat(String sifat) {
        this.sifat = sifat;
    }
    
        
     public String karakter(){
        if("Ayumi Yoshida".equals(nama)){
            sifat="Periang";
        }else if("Mitsuhiko".equals(nama)){
            sifat="Penyuka teknologi";
        }else if("Genta".equals(nama)){
            sifat="suka makan";
        }else if("Eisuke Hondou".equals(nama)){
            sifat="Ceroboh";
        }else if("Kogoro Mouri".equals(nama)){
            sifat="selalu membuat analisis asal asalan";
        }else if("Eri Kisaki".equals(nama)){
            sifat="selalu membuat kesal Eri(suaminya)";
        }else if("Sonoko Suzuki".equals(nama)){
            sifat="suka menarik perharian laki laki";
        }else if("Heiji Hattori".equals(nama)){
            sifat="Cerdas";
        }else if("Yusako Kudo".equals(nama)){
            sifat="Penakut";
        }else if("Ran Mouri".equals(nama)){
            sifat="lembut dan gampang menangis";
        }
        return sifat;
     }
    
}

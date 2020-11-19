package pboif2.pkg10119056.latihan59.detectiveconan;


import pboif2.pkg10119056.latihan59.detectiveconan.DetectiveConan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class DetectiveKecil extends DetectiveConan{
    private String detective;

    public DetectiveKecil(String nama) {
        super(nama);
    }
    
    public String karakter(){
        if("Ayumi Yoshida".equals(nama)){
            detective="Detective Cilik";
        }else if("Mitsuhiko".equals(nama)){
            detective="Detective Cilik";
        }else if("Genta".equals(nama)){
            detective="Detective Cilik";
        }else if("Eisuke Hondou".equals(nama)){
            detective="Detective Cilik";
        }else if("Kogoro Mouri".equals(nama)){
            detective="Detective Swasta";
        }else if("Sonoko Suzuki".equals(nama)){
            detective="Ratu Detektif";
        }else if("Eri Kisaki".equals(nama)){
            detective="Detective Cilik";
        }else if("Heiji Hattori".equals(nama)){
            detective="Detective Cilik";
        }else if("Yusako Kudo".equals(nama)){
            detective="Mmmiliki kemampuan deduktif";
        }else if("Ran Mouri".equals(nama)){
            detective="ahli beladiri karate";
        }
        return detective;
    }

    }


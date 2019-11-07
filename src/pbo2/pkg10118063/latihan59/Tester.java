/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118063.latihan59;

/**
 *
 * @author 
 * NAMA   : Naufal Asha
 * KELAS  : IF-2
 * NIM    : 10118063
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manusia dewasa = new Dewasa();
        Manusia dewasa1 = new Dewasa();
        
        Manusia remaja = new Remaja();
        Manusia remaja1 = new Remaja();
        
        Manusia anak = new AnakAnak();
        Manusia anak1 = new AnakAnak();
        
        SpecialCase sc = new SpecialCase();
        SpecialCase sc1 = new SpecialCase();
        
        dewasa.setNama("Mouri Kogoro");
        dewasa.setUmur(37);
        dewasa.setJenisKelamin("Laki-laki");
        dewasa.setPekerjaan("Detective \n");
        dewasa.tampilBio();
        
        dewasa1.setNama("Agasa Hiroshi");
        dewasa1.setUmur(53);
        dewasa1.setJenisKelamin("Male");
        dewasa1.setPekerjaan("Inventor\n");
        dewasa1.tampilBio();
        
        remaja.setNama("Mouri Ran");
        remaja.setUmur(17);
        remaja.setJenisKelamin("Female");
        remaja.setPekerjaan("Teitan High School Student\n");
        remaja.tampilBio();
        
        remaja1.setNama("Suzuki Sonoko");
        remaja1.setUmur(17);
        remaja1.setJenisKelamin("Female");
        remaja1.setPekerjaan("Teitan High School Student\n");
        remaja1.tampilBio();
        
        anak.setNama("Tsuburaya Mitsuhiko");
        anak.setUmur(7);
        anak.setJenisKelamin("Male");
        anak.setPekerjaan("Teitan Elementary School Student\n");
        anak.tampilBio();
        
        anak1.setNama("Yoshida Ayumi");
        anak1.setUmur(7);
        anak1.setJenisKelamin("Female");
        anak1.setPekerjaan("Teitan Elementary School Student\n");
        anak1.tampilBio();
        
        System.out.println("======Special Case======");
        sc.setNama("Edogawa Conan");
        sc.setRealName("Shinichi Kudo");
        sc.setUmur(7);
        sc.setRealAge(17);
        sc.setJenisKelamin("Male");
        sc.setPekerjaan("Teitan Elementary School Student");
        sc.setRealOccupation("Teitan High School Student\n");
        sc.tampilBio();
        
        sc1.setNama("Haibara Ai");
        sc1.setRealName("Miyano Shiho");
        sc1.setUmur(7);
        sc1.setRealAge(17);
        sc1.setJenisKelamin("Female");
        sc1.setPekerjaan("Teitan Elementary School Student");
        sc1.setRealOccupation("Scientist\n");
        sc1.tampilBio();
        
        sc.whySpecial();
    }
    
}

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
public class Dewasa extends Manusia {
    

    @Override
    public void tampilBio() {
        System.out.println("Name : " +nama);
        System.out.println("Age : " +umur);
        System.out.println("Gender : "+jenisKelamin);
        System.out.println("Occupation : " +pekerjaan);
    }
    
}

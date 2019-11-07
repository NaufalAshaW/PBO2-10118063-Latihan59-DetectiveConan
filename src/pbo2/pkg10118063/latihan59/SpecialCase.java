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
public class SpecialCase extends Manusia{
    private  String realName, realOccupation;
    private  int realAge;

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRealOccupation() {
        return realOccupation;
    }

    public void setRealOccupation(String realOccupation) {
        this.realOccupation = realOccupation;
    }

    public int getRealAge() {
        return realAge;
    }

    public void setRealAge(int realAge) {
        this.realAge = realAge;
    }
    
    public void whySpecial(){
        System.out.println("APTX 4869 drug has caused them to shrunk to their seven "
                + "year old self.");
    }

    @Override
    public void tampilBio() {
        System.out.println("Current Name : " +nama);
        System.out.println("Real Name : " +realName);
        System.out.println("Current Age : " +umur);
        System.out.println("Real Age : " +realAge);
        System.out.println("Gender : "+jenisKelamin);
        System.out.println("Current Occupation : " +pekerjaan);
        System.out.println("Real Occupation : " +realOccupation);
    }
    
}

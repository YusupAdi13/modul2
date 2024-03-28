/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_2_202357201028;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class bantuBudi {
    public static double luasSegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }
    
    public static double luasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }
    
    public static double luasLingkaran(double jariJari) {
        return Math.PI * Math.pow(jariJari, 2);
    }
    
    public static void main(String[] args) {
        
        double panjangSegiPanjang = Double.parseDouble(JOptionPane.showInputDialog("masukkan panjang persegi panjang : "));
        double lebarSegiPanjang = Double.parseDouble(JOptionPane.showInputDialog("masukkan lebar persegi panjang : "));
        double luasSegiPanjang = luasSegiPanjang(panjangSegiPanjang, lebarSegiPanjang);
        JOptionPane.showMessageDialog(null, "Luas Persegi Panjang : " + luasSegiPanjang);
        System.out.println("Luas Persegi Panjang : " + luasSegiPanjang);
        
        double alasSegitiga = Double.parseDouble(JOptionPane.showInputDialog("masukkan alas segitiga : "));
        double tinggiSegitiga = Double.parseDouble(JOptionPane.showInputDialog("masukkan tinggi segitiga : "));
        double luasSegitiga = luasSegitiga(alasSegitiga, tinggiSegitiga);
        JOptionPane.showMessageDialog(null, "Luas Segitiga : " + luasSegitiga);
        System.out.println("Luas segitiga : " + luasSegitiga);
        
        double jariJariLingkaran = Double.parseDouble(JOptionPane.showInputDialog("masukkan jari-jari Lingkaran : "));
        double luasLingkaran = luasLingkaran(jariJariLingkaran);
        JOptionPane.showMessageDialog(null, "Luas Lingkaran : " + luasLingkaran);
        System.out.println("Luas Lingkaran : " + luasLingkaran);
    }
}


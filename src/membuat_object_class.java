/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class membuat_object_class {
  
    
}
class Menu {
  String nama;
  String deskripsi;
  String jenis;
  double harga;
}
class Main {
  public static void main(String[] args) {
    Menu mkn1 = new Menu();
    mkn1.jenis = "Makanan";
    mkn1.nama = "Extra Cheezy Macaroni";
    mkn1.deskripsi = "Makaroni schotel dengan keju cheddar dan ekstra mozarella";
    mkn1.harga = 35000;

    Menu mkn2 = new Menu();
    mkn2.jenis = "Makanan";
    mkn2.nama = "Carbonara Attack!";
    mkn2.deskripsi = "Spaghetti saus carbonara dengan aneka seafood dan ekstra rempah pedas";
    mkn2.harga = 35000;

    Menu mnm1 = new Menu();
    mnm1.jenis = "Minuman";
    mnm1.nama = "Honey Coco Mint";
    mnm1.deskripsi = "Minuman dingin kelapa muda dengan tambahan madu dan daun mint";
    mnm1.harga = 11500;

    Menu mnm2 = new Menu();
    mnm2.jenis = "Minuman";
    mnm2.nama = "Electric Koffeh";
    mnm2.deskripsi = "Kopi susu panas dengan campuran gula merah dan rempah pilihan";
    mnm2.harga = 17500;

    System.out.println("Menu pilihan hari ini");
    Menu[] menuPilihan = {mnm1,mnm2,mkn1,mkn2};
    for (Menu mn: menuPilihan) { // syntax for each
      String teks = mn.nama+": "+ mn.deskripsi+"\nHarga: Rp "+mn.harga+"\n";
      System.out.println(teks);
    }
  }
}

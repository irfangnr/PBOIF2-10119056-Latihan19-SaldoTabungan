/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan19.saldotabungan;

/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan saldo tabungan
 */
public class PBOIF210119056Latihan19SaldoTabungan {

    public static void main(String[] args) {

    int lama,bunga,saldo,saldoAwal,saldoAkhir;
    
        saldoAwal=2500000;
        bunga=15;
        lama=6;

        for (int i=1; i<=lama; i++){
            saldo=(saldoAwal * bunga/100) ;
            saldoAkhir=saldo+saldoAwal;
            System.out.println("saldo di bulan ke-"+ i + " Rp."+ saldoAkhir);
            saldoAwal+=saldo;
        }
    }
    
}

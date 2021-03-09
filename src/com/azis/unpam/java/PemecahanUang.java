package com.azis.unpam.java;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class PemecahanUang {
    public static void main(String[] args) {

        //variable
        int uang, pecahan1, pecahan2, j_pecahan1, j_pecahan2, sisa1;
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        //simbolrupiah
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        //input
        System.out.println("Penukaran Uang Pecahan");
        System.out.println("=============================================================");
        System.out.print("Jumlah Uang : ");
        uang = input.nextInt();
        System.out.print("Pecahan 1 : ");
        pecahan1 = input1.nextInt();
        System.out.print("Pecahan 2 : ");
        pecahan2 = input2.nextInt();

        j_pecahan1 = uang / pecahan1;
        sisa1 = uang % pecahan1;
        j_pecahan2 = sisa1 / pecahan2;

        //output
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        System.out.println("=============================================================");
        System.out.println("Hasil Penukaran Uang Pecahan = " + kursIndonesia.format(uang) + " Adalah " + j_pecahan1 + " Lembar " + kursIndonesia.format(pecahan1) + " dan " + j_pecahan2 + " Lembar " + kursIndonesia.format(pecahan2));
        System.out.println("=============================================================");
    }
}

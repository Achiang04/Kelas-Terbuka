package com.tutorial;

import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("woii");
        printData(builder);

        // append
        builder.append(" kalian");
        printData(builder);

        builder.append(" binatangggg jelek");
        printData(builder);

        // insert
        builder.insert(29, " matilahh sanaaa");
        printData(builder);

        // delete
        builder.delete(23,29);
        printData(builder);

        // rubah character pada index tertentu
        builder.setCharAt(12, 'B');
        printData(builder);

        // replace
        builder.replace(5,11,"kau");
        printData(builder);

        // casting menjadi string
        String kalimat = builder.toString();
        System.out.println(kalimat);
        int addressKalimat = System.identityHashCode(kalimat);
        System.out.println("address = " + Integer.toHexString(addressKalimat));

    }
    private static void printData(StringBuilder dataBuilder){
        System.out.println("data = " + dataBuilder);
        System.out.println("panjang = " + dataBuilder.length());
        System.out.println("kapasitas = " + dataBuilder.capacity());

        int addressBuilder = System.identityHashCode(dataBuilder);
        System.out.println("address = " + Integer.toHexString(addressBuilder));
    }
}

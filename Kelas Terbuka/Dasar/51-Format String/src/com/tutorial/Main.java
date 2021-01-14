package com.tutorial;

import java.util.Formatter;

public class Main {
    public static void main(String[] args) {

        String nama = "Bambang";
        int umur = 18;

        // output = nama saya adalah bambang, umur saya adalah 18
        System.out.println("nama saya adalah " + nama + ", umur saya adalah " + umur);

        // cara lainnya dengan format string
        System.out.printf("nama saya adalah %s, umur saya adalah %d\n",nama,umur);

        /*
        conversion = f=floating point, d=integer, c=character, s=string, b=boolean
        struktur format = %[argumen_index$][flags][width][.precision]conversion
         */

        // 1. [argumen_index$]
        System.out.println("\n[argumen_index$]");
        // udin, wahai udin, kemana saja kamu udin?
        System.out.printf("%1$s, wahai %1$s, kemana saja kamu %1$s?\n",nama);
        //umur udin berapa ? udin menjawab: 18, wah masih muda ya umurnya 18
        System.out.printf("\numur %1$s berapa? \n%1$s menjawab: %2$d \nwah masih muda ya umuurnya %2$d\n",nama,umur);

        // 2. [flags]
        System.out.println("\n[flags]");
        int int1 = 5;
        int int2 = 8;
        int hasil = int1 - int2;
        System.out.printf("%d - %d = %+d\n",int1,int2,hasil);

        // 3. [width]
        System.out.println("\n[width]");
        int int3 = 1000;
        System.out.println("INTEGER");
        System.out.printf("%d\n",int3);
        System.out.printf("%5d\n",int3);
        System.out.printf("%-5d\n",int3); // flags = "-", artinya rata kiri
        System.out.printf("%+5d\n",int3); // flags akan mengambil slot di dalam format
        System.out.printf("%+-6d\n",int3); // flags bisa digabungkan
        System.out.printf("%10d\n",int3);
        System.out.printf("% 10d\n",int3);
        System.out.printf("%010d\n",int3); // flags = "0", kita tambahkan leading "0" didepan
        System.out.printf("%+010d\n",int3);
        int int4= 1000000000;
        System.out.printf("%,10d\n",int4); // flags = "," menandakan delimeter per seribu

        System.out.println("\nFLOATING POINT");
        float float1 = 1.543f;
        System.out.printf("%f\n", float1);
        System.out.printf("%+9f\n", float1); // floating point akan mengambil width dengan 6 decimal

        // 4.[.precision]
        System.out.println("\n[.precision]");
        float float2 = 15.678f;
        System.out.printf("%f\n",float2);
        System.out.printf("%.1f\n",float2);
        System.out.printf("%.2f\n",float2);
        System.out.printf("%8.2f\n",float2); // gabungkaan dengan width
        System.out.printf("%+08.2f\n",float2); // gabungkaan dengan width dan flags

        // contoh
        String nama2 = "Ucup";
        float IPK = 3.78512413565f;

        // struktur format = %[argumen_index$][flags][width][.precision]conversion
        System.out.printf("\nIPK %1$s berapa? \n%1$s; saya dapat %2$+5.2f\n",nama2,IPK);

        // kesimpulan

        // save format ini ke dalam variabel string
        String info_biasa = "nama: " + nama2 + ", IPK = " + IPK;
        System.out.println("biasa -> " + info_biasa);

        String info_format = String.format("nama: %s, IPK = %2$+5.2f",nama2,IPK);
        System.out.println("string format -> " + info_format);

        // save format ini kedalam string builder
        StringBuilder builder_info = new StringBuilder();
        Formatter formatBuilder = new Formatter(builder_info);
        formatBuilder.format("nama; %s, IPK = %2$+5.2f",nama2,IPK);
        System.out.println("string builder format -> " + builder_info);
    }
}

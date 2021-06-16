package com.LOOPING;


public class Main {
    public static void main(String[] args) {
    System.out.println("===While loop===");
        int a = 0;
        boolean kondisi = true;
        System.out.println("awal program");

        while (kondisi){
            System.out.println("Looping ke- "+a);
            a++;
            if (a==10){
                kondisi = false;
            }
        } System.out.println("Selesai");
    
    System.out.println("===Do While Loop===");
        int b = 0;
        boolean kondisib = true;
        System.out.println("awal program");
        
        do {
            b++;
            System.out.println("Looping ke- "+b);
            if (b==10){
                kondisib = false;
            }
        }while (kondisib);
        System.out.println("Selesai"); 

    System.out.println("===FOR LOOP===");
        int c = 0;
        System.out.println("Awal program");

        for (;c <= 10;){
            System.out.println("Looping ke- "+c);
            c++;
        }
        System.out.println("Selesai");   
    }
}

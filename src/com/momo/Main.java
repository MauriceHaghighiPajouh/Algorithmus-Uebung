package com.momo;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a1 = new int[]{17, 32, 45, 53, 61, 62, 75, 0};
        int wert1 = 50;
        int i ;

        System.out.println("Aufgabe 1 Vorher: " + Arrays.toString(a1));

        for (i = 0; i < a1.length; i++){
            if (a1[i] > wert1){
                int anzahl = a1[i];
                a1[i] = wert1;
                wert1 = anzahl;
            }
        }
        a1[i-1] = wert1;

        System.out.println("Aufgabe 1 Nachher: " + Arrays.toString(a1) + "\n");
        //Aufgabe 2
        int[] a2 = new int[]{10, 7, 61, 4, 75, 34};

        System.out.println("Aufgabe 2 Vorher: " + Arrays.toString(a2));

        int wert2 = 61;
        int f;

        for(int e = 0; e < a2.length; e++){
            if (a2[e] == wert2){
                for(f = e; f < a2.length - 1; f++){
                    a2[f] = a2[f+1];
                }
                a2[f] = 0;
            }
        }

        System.out.println("Aufagbe 2 Nachher: " + Arrays.toString(a2) + "\n");

        //Aufgabe 3
        int[] a3 = new int[]{10, 7, 61, 4, 75, 34, 61, 10, 61, 61};
        int c;
        boolean t = true;

        System.out.println("Aufgabe 3 Vorher: " + Arrays.toString(a3));

        while (t){
            t = false;
            for(int e = 0; e < a3.length; e++){
                if (a3[e] == wert2){
                    t = true;
                    for(c = e; c < a3.length - 1; c++){
                        a3[c] = a3[c+1];
                    }
                    a3[c] = 0;
                }
            }
        }
        System.out.println("Aufgabe 3 Nachher: " + Arrays.toString(a3) + "\n");
    }
}














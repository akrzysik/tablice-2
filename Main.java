import java.io.*;
import java.util.*;

public class Main {

   public static int losuj(int max) {
      Random rand = new Random();
      return rand.nextInt(max);
   }

   public static int suma(int[] tablica, int rozmiar) {
      int s = 0;
      for ( int i = 0; i < rozmiar; i++ )
         s += tablica[i];
      return s;
   }

   public static int minimum(int[] tablica, int rozmiar) {
      int min = tablica[0];
      for ( int i = 1; i < rozmiar; i++ )
         if ( tablica[i] < min )
            min = tablica[i];
      return min;
   }

   public static int srednia(int[] tablica, int rozmiar) {
      return suma(tablica, rozmiar) / rozmiar;
   }
   
   public static void wczytaj_tablice(int[] tablica, int rozmiar) throws IOException {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      for ( int i = 0; i < rozmiar; i++ ) {
         System.out.println("Podaj liczbe: ");
         tablica[i] = Integer.parseInt(in.readLine());
      }
   }
   
   public static void losuj_tablice(int[] tablica, int rozmiar, int max) {
    for (int i = 0; i < rozmiar; i++) {
      tablica[i] = losuj(max);
    }
  }

   public static void wypisz_tablice(int[] tablica, int rozmiar) {
      for ( int i = 0; i < rozmiar; i++ )
         System.out.println("tablica["+i+"] = "+tablica[i]);
   }

   public static void main(String[] args) {
      int rozmiar = 6;
      int[] t = new int[rozmiar];
      losuj_tablice(t, rozmiar, 200);
      wypisz_tablice(t, rozmiar);

      System.out.println("suma: " + suma(t, rozmiar));
      System.out.println("minimum: " + minimum(t, rozmiar));
      System.out.println("srednia: " + srednia(t, rozmiar));
   }
}

/*
 * Cwiczenia:
 * 1. Z pomoca zaproponowanych funkcji napisz programy podajace 
 * odpowiednio sume i minimum podanych przez uzytkownika (lub wygenerowanych) liczb.
 * 2. Napisz funkcje obliczajaca srednia dla podanego (lub 
 * wygenerowanego) ciagu liczb.
 */
 

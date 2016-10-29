package pliki;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner odczytZKlawiatury = new Scanner(System.in);
        System.out.print("podaj nazwe pliku: ");
        String nazwaPliku = odczytZKlawiatury.nextLine();
        FileReader czytacz = new FileReader(nazwaPliku);
        BufferedReader odczyt = new BufferedReader(czytacz);
        Slowa licznik = new Slowa(odczyt);
        Wiersze licznik2 = new Wiersze(odczyt);
        System.out.print("wiersze czy slowa (s/w) ? ");
        char decyzja = odczytZKlawiatury.nextLine().charAt(0);
        if(decyzja == 's')System.out.println("slowa: "+Integer.toString(licznik.licz()));
        else if(decyzja == 'w')System.out.println("wiersze: "+Integer.toString(licznik2.licz()));
    }
    
}

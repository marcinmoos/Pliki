package pliki;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Wiersze extends BufferedReader {

    BufferedReader bufferedReader;
    
    public Wiersze(BufferedReader odczyt) throws FileNotFoundException {
        super(new BufferedReader(odczyt));
        bufferedReader = odczyt;
    }

    int licz() throws IOException{
        int licznik = 0;
        while((bufferedReader.readLine()) != null){
                licznik++;
        }
        return licznik;
    }
}
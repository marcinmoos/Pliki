package pliki;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Slowa extends BufferedReader {

    BufferedReader bufferedReader;
    
    public Slowa(BufferedReader odczyt) throws FileNotFoundException {
        super(new BufferedReader(odczyt));
        bufferedReader = odczyt;
    }

    int licz() throws IOException{
        int licznik = 0;
        String linia;
        char znak;
        while((linia = bufferedReader.readLine()) != null){
                for(int i = linia.length();i>1;i--){
                    znak = linia.charAt(i-1);
                    if((znak == ' ')||(znak == '\t'))licznik++;
            }
                licznik++;
        }
        return licznik;
    }
}
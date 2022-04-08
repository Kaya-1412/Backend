package Matura2021marzec;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

// odczyt (tylko) 1. Stringa w lini w pliku txt
///// -> zapis do obiektu 'kraj', string pool??? porównać obiekty->if equals then private int licznikKraj +1, else new obiekt

// zlicz powtarzające się wartości
// wypisz wartość oraz jej liczebność

public class Zad4_1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner readGalerie = new Scanner(new File("galerie.txt"));

    }
}


//W pliku galerie.txt zapisanych jest 50 wierszy z informacjami dotyczącymi planowanych
//galerii. Każdy wiersz w pliku to informacja o jednej galerii. Dane oddzielone są spacją
//i zawierają odpowiednio:
// kod kraju;
// nazwę miasta (nazwy miast nie powtarzają się);
// 70 par liczb (140 liczb) określających wymiary (długość i szerokość w metrach) lokali
//handlowych, które znajdować się będą w danej galerii. Jeżeli liczba lokali w galerii jest
//mniejsza niż 70, to wiersz uzupełniony jest zerami.



/* Zadanie 4.1. (0−4)
        Dla każdego kraju z pliku galerie.txt wyznacz liczbę miast, w których powstaną galerie.
        Wynik zapisz w pliku wynik4_1.txt. W każdym wierszu pliku powinny znajdować się: kod
        państwa oraz informacja o liczbie miast.
        Dla danych z pliku galerie_przyklad.txt prawidłowa odpowiedź to:
        H 1
        I 2
        F 1
        GB 1
        D 3
        NL 1
        DK 1

 */
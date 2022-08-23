package LAMBDA.Lambda03.StringlerIleIslemler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SonHarfeGoreTersSirala {

    public static void main(String[] args) {
        List<String> yemekListesi = new ArrayList<String>(Arrays.asList("pilav", "corba", "tavuk","kebap", "kunefe", "adana", "mercimek", "salata","pilav", "corba", "tavuk","kebap", "kunefe", "adana") );


        //listedeki kelimeleri son harfine göre tersten  alfabetik sirali  ve tekrarsiz yaziniz

        SonHarfeGoreTersSirala(yemekListesi );

    }

    public static void SonHarfeGoreTersSirala(List <String > list){
        list.stream().sorted(Comparator.comparing(t->t.charAt(t.length() -1)) ).forEach(t-> System.out.print(t+" ")) ;

    }
}

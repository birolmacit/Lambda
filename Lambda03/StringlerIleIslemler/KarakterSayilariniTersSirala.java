package LAMBDA.Lambda03.StringlerIleIslemler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class KarakterSayilariniTersSirala {

    public static void main(String[] args) {
        List<String> yemekListesi = new ArrayList<String>(Arrays.asList("pilav", "corba", "tavuk","kebap", "kunefe", "adana", "mercimek", "salata","pilav", "corba", "tavuk","kebap", "kunefe", "adana") );



        //list elemenalrını karakter sayısını  ters sıralı olarak ve tekrarsız sırala

        KarakterSayisiniTersSirala(yemekListesi );

    }
    public static void KarakterSayisiniTersSirala(List<String > list) {
        list.stream().
                map(t->t.length()).
                sorted(Comparator.reverseOrder() ).
                distinct() .
                forEach(t-> System.out.print(t+" "));
    }
    }


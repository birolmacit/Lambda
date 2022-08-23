package LAMBDA.Lambda03.StringlerIleIslemler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class KarakterSayisinaGoreSirala {

    public static void main(String[] args) {

        List<String> yemekListesi = new ArrayList<String>(Arrays.asList("pilav", "corba", "tavukum","kebapim", "kunefe", "adanam", "mercimek", "salata","pilav", "corba", "tavuk","kebap", "kunefe", "adana") );


        //listedeki kelimeleri karakter sayısı en buyuk olandan en kucuk olana dogru  sirali ve tekrarsiz yaziniz

        harfSirasinaGore(yemekListesi );

    }

  public static void harfSirasinaGore(List<String> liste){
        liste.stream() .sorted(Comparator.comparing(String::length )).distinct() .forEach(t-> System.out.print(t+" "));
  }




}

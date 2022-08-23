package LAMBDA.Lambda03.StringlerIleIslemler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HarfSayisinaGöreSiralama_Comparator_Comparing_findFirst {
    public static void main(String[] args) {
        List<String> yemekListesi = new ArrayList<String>(Arrays.asList("pilav", "corba", "tavuk","kebap", "kunefe", "adana", "mercimek", "salata","pilav", "corba", "tavuk","kebap", "kunefe", "adana") );

        yemekListesi.stream().sorted(Comparator.comparing(t->t.toString() .length() ) ).forEach(t-> System.out.print(t+" ")) ;

        System.out.println("");
       // yemekListesi.stream().sorted(Comparator.comparing(t->t.toString() .length() ).reversed() ).forEach(t-> System.out.print(t+" ")) ;
        System.out.println(yemekListesi.stream().sorted(Comparator.comparing(t -> t.toString().length()).reversed()).findFirst());
    }
}

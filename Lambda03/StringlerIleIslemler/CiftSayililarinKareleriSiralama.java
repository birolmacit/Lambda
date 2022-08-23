package LAMBDA.Lambda03.StringlerIleIslemler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CiftSayililarinKareleriSiralama {
    public static void main(String[] args) {
        List<String> yemekListesi = new ArrayList<String>(Arrays.asList("pilav", "corba", "tavuk","kebap", "kunefe", "adana", "mercimek",
                "sa","p", "corbalarları", "tavu","kebapkebap", "kunefe", "adana") );

        //listin elemanlarının karakterlerinin cift sayililarının karelerini hesaplayın ve karelerini tekrarsız buyukten kucuge yazın

        yemekListesi.
                stream().
                map(t->t.length() ).
                filter(t->t%2==0).map(t->t*t).
                distinct().sorted(Comparator.reverseOrder() ).
                forEach(t-> System.out.print(t+" ")) ;
    }
}

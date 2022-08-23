package LAMBDA.Lambda03.StringlerIleIslemler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlfabetikSira {
    public static void main(String[] args) {
        List<String> yemekListesi = new ArrayList<String>(Arrays.asList("pilav", "corba", "tavuk","kebap", "kunefe", "adana", "mercimek", "salata","pilav", "corba", "tavuk","kebap", "kunefe", "adana") );


        //listedeki harflaeri buyuk harf alfabetik sirali ve tekrarsiz yaziniz

        alfBykTkrsz(yemekListesi );
    }

    public static void alfBykTkrsz(List <String > list){
       list.//akış kaynağı
               stream().//akışa girdi
               //map(t -> t.toUpperCase()).//büyük harfe cevirdi
                       map(String::toUpperCase).         // buradaki string class a gidip de uppercase metodunu kullanabiliriz
               sorted().//alfabetik siraladi
               distinct().//tekrarlari almadi akışa sadece farklı elemanları aldırır
               forEach(t-> System.out.print(t+" "));//yazdirdi

       ///distinct method tekrarlı olan bir diziyi tekrarsiz hale getirir

    }
}

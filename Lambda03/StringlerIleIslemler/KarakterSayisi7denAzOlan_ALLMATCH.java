package LAMBDA.Lambda03.StringlerIleIslemler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KarakterSayisi7denAzOlan_ALLMATCH {
    public static void main(String[] args) {
        //listedeki tum elemanların karakter sayisi 7 veya 7 den daha az mı onu kontrol et
        List<String> yemekListesi = new ArrayList<String>(Arrays.asList("pilav", "corba", "tavuk","kebap", "kunefe", "adana", "mercimek",
                "sa","p", "corbalarları", "tavu","kebapkebap", "kunefe", "adana") );

        System.out.println(yemekListesi.stream().allMatch(t -> t.length() <= 7));//ALL MATCH METDOU ISTENILEN KRITERE UYGUN MU DEGILMI BUNUN
        // SONUCUNU BOOLEAN YANI TURE YADA FALSE DONER
    }
}

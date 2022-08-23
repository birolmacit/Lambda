package LAMBDA.Lambda03;

import LAMBDA.Lambda01.Lambda01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ElemanlarinKareleriniSiralayiniz {

    public static void main(String[] args) {
        List<Integer> sayilarListesi = new ArrayList<Integer>(Arrays.asList(-3,-43,-21,2,13,4,22,121,13,21,6,5,45,32));
       //listedeki elemanların karelerini  küçükten büyüğe siralayiniz

        elemanlarinKareleriniSirala(sayilarListesi );

        System.out.println("");

        //listedeki elemanların karelerini   büyükkten küçüğe siralayiniz

        elemanlarinKareleriniSiralaBuyuktenKucuge(sayilarListesi );


    }

    private static void elemanlarinKareleriniSiralaBuyuktenKucuge(List<Integer> sayilarListesi) {
        sayilarListesi.stream().map(t->t*t).sorted(Comparator.reverseOrder()).forEach(Lambda01 ::yazdir ) ;//buradaki comparator classından ters sıralama yapıldı
    }

    public static void elemanlarinKareleriniSirala(List <Integer > list){
   list.stream().map(t -> t * t).sorted().forEach(Lambda01 ::yazdir );   //SORTED() METODU DOGAL OLARAK KUCUKTEN BUYUGE SIRALAR
    }
}

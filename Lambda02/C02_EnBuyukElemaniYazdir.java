package LAMBDA.Lambda02;

import LAMBDA.Lambda01.CiftSayilariYazdirma;
import LAMBDA.Lambda01.Lambda01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class C02_EnBuyukElemaniYazdir {
    public static void main(String[] args) {
        List<Integer > sayilarListesi=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15) );


        //list in en büyük elemanını yazdırınız.
        maxElemanGetir(sayilarListesi );

//ciftlerin karelerinden en buyugunu bulunuz
        ciftKareMaxYazdir(sayilarListesi);



    }
    public static void maxElemanGetir(List <Integer> sayilarListesi){
       Optional<Integer> max= sayilarListesi.stream().reduce(Math :: max);//BURADAKİ REDUCE METODU AKISA ALDIGIMIZ SAYILARDAN SADECE BİR TANESİNİ İSTIYORSAK KULLANILIR
        //AKISTAKİ TUM ELEMANLARI TOPLAMA YADA YAZDIRMA GIBI ISLEMLERDE REDUCE KULLANILMAZ.reduce kullanılırken de sonunda for each diye yazdıramayız

        System.out.println(max);//yada asagıdaki gibi

        System.out.println(sayilarListesi.stream().reduce(Math :: max));
    }


    public static void ciftKareMaxYazdir(List<Integer> sayilarListesi){
       System.out.println(sayilarListesi.stream().filter(CiftSayilariYazdirma::ciftmi).map(t -> t * t).reduce(Math::max));
    }
}

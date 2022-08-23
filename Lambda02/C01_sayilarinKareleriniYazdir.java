package LAMBDA.Lambda02;

import LAMBDA.Lambda01.CiftSayilariYazdirma;
import LAMBDA.Lambda01.Lambda01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_sayilarinKareleriniYazdir {

    public static void main(String[] args) {
        List<Integer > sayilarListesi=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15) );


        //task Functional programing ile list elemanlarınından cift sayıların karelerini  aynı satırda aralarında bosluk bırakarak print ediniz
        ciftKareYazdir(sayilarListesi);


        System.out.println("");


//task Functional programing ile list elemanlarınından tek sayıların kuplerinin bir fazlasını  aynı satırda aralarında bosluk bırakarak print ediniz
        teksayiKupBirFazlasi(sayilarListesi);

        System.out.println("");

        //task Functional programing ile list elemanlarınından cift sayıların kareköklerini  aynı satırda aralarında bosluk bırakarak print ediniz

        ciftKarekokYazdir(sayilarListesi);

        System.out.println("");
        ciftKarekokYazdir2(sayilarListesi);
    }







    public static void ciftKareYazdir(List<Integer> sayilarListesi){
        sayilarListesi.stream().filter(CiftSayilariYazdirma ::ciftmi).map(t->t*t).forEach(Lambda01 ::yazdir ) ;//  map() -----> stream icindeki elemanları baska tiplere donusturmek veya
        //uzerlerinde islem yapmak update etmek icin kullanılır
    }

    public static void teksayiKupBirFazlasi(List <Integer> sayilarListesi){
        sayilarListesi.stream().filter(t-> t%2!=0).map(t->t*t*t+1).forEach(Lambda01 ::yazdir) ;
    }

    public static void ciftKarekokYazdir(List <Integer> sayilarListesi){
        sayilarListesi.stream().filter(CiftSayilariYazdirma ::ciftmi ).map(Math ::sqrt ).forEach(t-> System.out.print(t+" ")) ;
    }

    public static void ciftKarekokYazdir2(List <Integer> sayilarListesi){
        sayilarListesi.stream().filter(CiftSayilariYazdirma ::ciftmi ).map(t->Math.sqrt(t)).forEach(t-> System.out.print(t+" ")) ;
    }
}

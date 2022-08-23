package LAMBDA.Lambda03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.logging.XMLFormatter;

public class EnKucukEnBuyukElemanlar {
    public static void main(String[] args) {

        List<Integer> sayilarListesi = new ArrayList<Integer>(Arrays.asList(-3,-43,-21,2,13,4,22,121,13,21,6,5,45,32));

        //listedeki en kucuk elemanı yazdırınız

        // 1.yontem method referance ile---Math class
        enKucukElemanMath(sayilarListesi);

        //2.yontem method referance ile---Integer class
        enKucukElemanIntegerClass(sayilarListesi);

        //3.lambda expresion ile min sayıyı bul

        enKucukElemanLambda(sayilarListesi );

        //4.kendi  Seed metodumuzu cagırarak
        minsayiyiSeedMethodIle(sayilarListesi );




    }

    //1.yontem method referance ile---Math class
    public static void enKucukElemanMath(List<Integer> list) {
        //System.out.println(list.stream().reduce(1, (a, b) -> Math.min(a, b)));
        System.out.println(list.stream().reduce(Math::min));
    }


    //2.yontem method referance ile---Integer class

    public static void enKucukElemanIntegerClass(List<Integer> list) {
        System.out.println(list.stream().reduce(Integer::min));

    }
    //3.lambda expresion ile min sayıyı bul
    public static void enKucukElemanLambda(List<Integer> list) {
     Integer a=list.stream().reduce(Integer.MAX_VALUE ,(x,y)-> x<y?x:y);
        System.out.println(a);

    }


    //4.kendi  Seed metodumuzu cagırarak
    public static int minSayiyiGetir(int a , int b ){
       return a<b?a:b;//buradaki mantık cok guzel olmus

    }

    public static void minsayiyiSeedMethodIle(List <Integer > sayi){
  sayi.stream().reduce(EnKucukEnBuyukElemanlar::minSayiyiGetir);

    }
}

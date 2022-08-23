package LAMBDA.Lambda02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ListedekiElemanlarToplami {
    public static void main(String[] args) {
        List<Integer > sayilarListesi=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10) );


        //listedeki tum elemanların toplamını yazdırınız

        elemanlarToplami(sayilarListesi);


        //listedeki tum elemanların carpımını yazdırınız
        elemanlarCarpimi(sayilarListesi);

    }

    private static void elemanlarCarpimi(List<Integer> sayilarListesi) {
      System.out.println(sayilarListesi.stream().reduce(1, (a, b) -> a * b));//yada asagıdaki math classından methodla carpabilrim
        System.out.println(sayilarListesi.stream().reduce(Math::multiplyExact));
    }


    public static void elemanlarToplami(List<Integer> sayilarListesi) {
        System.out.println(sayilarListesi.stream().reduce(0, (a, b) -> a + b));//bu bir lambda expressiondır
        //a ilk degerini herzaman ilk atanan deger olan yukarıdaki gibi sıfırdan alır.identitiy dedigimiz deger neyse a da o degeri alacaktır
        //b degeri ise her zaman stream den yani akıstan deger alır
        //a ilk degerinden sonraki her degeri islem sonrasından alır yani yukarıdaki gibi toplamdan sonra

        //sayilarListesi.stream().reduce(Integer ::sum );//method referance olarak da bu sekılde alabilirdik


    }
}

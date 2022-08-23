package LAMBDA.Lambda01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CiftSayilariYazdirma {

    //task Structured programing ile list elemanlarınından cift sayı olanları aynı satırda aralarında bosluk bırakarak print ediniz
    public static void main(String[] args) {
        List<Integer > sayilarListesi=new ArrayList<Integer>(Arrays.asList(14,200,31,42,15,61,70,78,29,13,15,16,180,20) );


        ciftsayilariYazdirStructured(sayilarListesi);
        System.out.println("\n---------------------------");



        //task Functional programing ile list elemanlarınından cift sayı olanları aynı satırda aralarında bosluk bırakarak print ediniz

        ciftsayilariYazdirFuctional(sayilarListesi );

        System.out.println("\n---------------------------");

        ciftsayilariYazdirFuctionalFiltreleyerek(sayilarListesi );

        System.out.println("\n---------------------------");

        ciftsayilariYazdirLambdaSeed(sayilarListesi );


//task Functional programing ile list elemanlarınından 34 TEN KUCUK VE  cift sayı olanları aynı satırda aralarında bosluk bırakarak print ediniz
        System.out.println("\n---------------------------");
        ciftmi34tenKucukmuLambda(sayilarListesi);

    }
//functional ile yazdirma
    public  static void ciftsayilariYazdirFuctional(List<Integer> sayilarListesi) {
        sayilarListesi.
                stream().
                forEach(t->{if (t%2==0){
            System.out.print(t+" ");
        }});
    }


    //functional ile filtreleyerek yazdirma
    public  static void ciftsayilariYazdirFuctionalFiltreleyerek(List<Integer> sayilarListesi) {
        sayilarListesi.stream().filter(t->t%2==0).forEach(Lambda01 ::yazdir) ;
    }
//Structured ile yazdırma
    public static void ciftsayilariYazdirStructured(List <Integer> sayilarListesi) {
        for (Integer w: sayilarListesi) {
            if (w%2==0){
                System.out.print(w+" ");
            }
        }
    }


    //ASAGIDA YENİDEN BİR SEED METHOD OLUSTURARAK LAMBDA YARDIMI ILE TEK SATIRLIK NETHID OLUSTURUCAZ

    public static boolean ciftmi(int a){//bu seed method dedıgımız methoddur.VERİLEN BİR SAYININ CİFT OLUP OLMADIGINI BİZE DONER
        return (a%2==0);

    }
    public  static void ciftsayilariYazdirLambdaSeed(List<Integer> sayilarListesi) {
        sayilarListesi.
                stream().//LİST ELAMANLARI AKISA ALINDI
                filter(CiftSayilariYazdirma ::ciftmi).//CİFT BUL METHOD REFERE EDİLEREK AKISKDAKI ELEMANLAR FİLTRELENDİ.BURADAKİ FİLTRELEME BOOLEAN İLE YAPILDI
                forEach(Lambda01 ::yazdir) ;// FİLTREDEN GELEN EKEMANLAR YAZDIRILDI
        // daha onceden bosluk bırakarak yazdırma islemi tanımlamıstık buradaki
        // lambda01 classından yazdir diye cagırmıs olduk


    }

    //TASK 34 TEN KUCUK OLAN CİFT SAYILARI YAZDIR


    public static boolean ciftmi34tenKucukmu(int a) {//bu seed method dedıgımız methoddur.VERİLEN BİR SAYININ CİFT OLUP OLMADIGINI
        // ve 34 ten kucuk olup olmadıgını BİZE DONER
        return (a % 2 == 0 && a < 34);

    }
    public static void ciftmi34tenKucukmuLambda(List<Integer> sayi){
        sayi.
                stream().filter(CiftSayilariYazdirma::ciftmi34tenKucukmu) .forEach(Lambda01::yazdir) ;
    }

    /*buna alternatif olarak asagıdaki gibide ıkı filtre ile de yazılabilirdi
    *  sayi.
                stream().filter(lambda01::ciftmi).filter(t->t<34).forEach(Lambda01::yazdir) ;
    *
    *
    *
    * */
}

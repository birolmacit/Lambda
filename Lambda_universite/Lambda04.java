package LAMBDA.Lambda_universite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda04 {

    public static void main(String[] args) {
        Universite bogazici=new Universite("bogazici","matematik",571,93);
        Universite itu=new Universite("itu","matematik",622,81);
        Universite istanbul=new Universite("istanbul","hukuk",1453,71);
        Universite marmara=new Universite("marmara","bilgisayar",1071,77);
        Universite ytu=new Universite("ytu","gemi",333,74);

        List<Universite> universiteList = new ArrayList<Universite>(Arrays.asList(bogazici ,itu ,istanbul ,marmara ,ytu)  );

        System.out.println(universiteList);

        /*
        task-1
        not ort 74 den buyuk olup olmadıgını kontrol eden bir method olusturunuz


         */
        System.out.println(notOrt74BykUnv(universiteList));

    }

    public static boolean notOrt74BykUnv(List<Universite > unv){
    return unv.stream().allMatch(t->t.getNotOrt()>74 );}               ///daha oncede allmatch ile soyledıgımız gibi  74 den buyuk mu sorusuna cevap veriyoruz
}

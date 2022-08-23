package LAMBDA.Lambda03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class BestenBuyukEnKucukTek {
    public static void main(String[] args) {
        List<Integer> sayilarListesi = new ArrayList<Integer>(Arrays.asList(-3,-43,-21,2,13,4,22,121,13,21,6,5,45,32));

        BestenBuyukEnKucukTek(sayilarListesi );

        //listedeki 5 ten buyuk en kucuk tek sayıyı bulunuz
    }
  public static void BestenBuyukEnKucukTek(List<Integer > sayi){
    //Optional<Integer> a= sayi.stream().filter(t->t>5 && t%2!=0).reduce(Math::min);
      Optional<Integer> a= sayi.stream().filter(t->t>5 && t%2!=0).reduce(EnKucukEnBuyukElemanlar::minSayiyiGetir);
      System.out.println(a);
  }
}

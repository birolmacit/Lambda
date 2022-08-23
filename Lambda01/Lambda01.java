package LAMBDA.Lambda01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Lambda01 {
    //lambda collectionslarda (list set queue da kullanılır)}, array lerde kullanılır
//MAP TE KULLANILMAZ

    /*
    1.lambda "functional programing" ===> method (action) kullanma programlama dilidir.
    method create etme yerine mevcut methodları kullanma dmektir gerekırse kendi metodlarını olusturup
    sureklı kullanmaktir


    2.structured programıng de nasıl yaparım sorusu dusunulurken kı bu lambdaya uygun degılıdr functional programınde ne yaparım sorusu sorulur
    iste bu lambda da dıkkat edılmesı gereken seydır
    3.kod kısalıgı kod okunabılırlıgı ve hatasız kod yazma acısından lambda cok faydalıdır


     */


    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<Integer>(Arrays.asList(20, 30, 40, 3, 4, 5, 6, 7, 8, 100, 200, 300));
        //task: structured programing kullanarak list elemanlarını aralarında bosluk olacak sekılde print ediniz
        printyEtStructured(sayi);


        System.out.println("\n------");

        printyEtFuctional(sayi);

        System.out.println("\n------");

        printyEtFuctionalkısaAmaYetersiz(sayi );

        System.out.println("\n------");

        yazdirBirol(sayi ) ;

        System.out.println("\n------");


        toplaFunctional(sayi);


    }

    public static void printyEtStructured(List<Integer> sayi) {
        for (int each : sayi
        ) {
            System.out.print(each + " ");
        }
    }

    //task: FUNCTIONAL  PROGRAMING  kullanarak list elemanlarını aralarında bosluk olacak sekılde print ediniz

    public static void printyEtFuctional(List<Integer> sayi) {
        sayi.stream().forEach(i -> System.out.print(i + " - "));
    }


    public static void printyEtFuctionalkısaAmaYetersiz(List<Integer> sayi) {
        sayi.stream().forEach(System.out::print);//bu hazır metod referansı cagırma ile taskımızın tam ıstedıgını yerıne getıremeyebılırız ancak eger buna benzer hzır bir metod
        //olusturmak ıstersek asagıdakı gıı bır metod olusturup lambda ıle sınıf ve sonrasında method olarak cagırabılırız


        // bu action task daki aynı satıra ve bosluk ıle yazmayı karsılamadıg ıcın
        // Asagıdaki gibi seed(tohum )code olsuturularak refere edilebilir.
    }


    public static void yazdir(int a){
        System.out.print(a + "  ");
    }

    public static void  yazdirBirol(List<Integer> list){
        System.out.println("\n asagidaki kendi yazdigimiz lambda ile geldi...");
        list.stream().forEach(Lambda01::yazdir) ;//daha once yazılmıs olan yazdırma metodu bi nevi cagırılarak seed code olusturulmus oldu
    }
    public static void toplaFunctional(List<Integer> a) {
        AtomicInteger sum = new AtomicInteger();
        a.stream().forEach((i -> sum.addAndGet(i)));
        System.out.println(sum);
    }
}


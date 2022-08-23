package LAMBDA.Lambda03.StringlerIleIslemler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElemanlarWileMİBasliyor__allmatch {

    public static void main(String[] args) {
        List<String> yemekListesi = new ArrayList<String>(Arrays.asList("pilav", "w orba", "tavuk","kebap", "kunefe", "adana", "mercimek",
                "sa","p", "corbalarları", "tavu","kebapkebap", "kunefe", "adana") );


        System.out.println(yemekListesi.stream().noneMatch(t -> t.startsWith("w") ) ? "w ile baslamiyolar" : "w ile baslayan var.");
    }
}

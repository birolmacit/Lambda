package LAMBDA.Lambda03.StringlerIleIslemler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElemanlardanXileBitenVarMi__anymatch {

    public static void main(String[] args) {
        List<String> yemekListesi = new ArrayList<String>(Arrays.asList("pilav", "corba", "tavuk","kebap", "kunefe", "adana", "mercimek",
                "sa","p", "corbalarları", "tavux","kebapkebap", "kunefe", "adana") );


        System.out.println(yemekListesi.stream().anyMatch(t->t.endsWith("x")) ? "x ile biten var." : "x ile biten yok");
    }
}

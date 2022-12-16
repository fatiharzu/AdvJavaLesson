package Genenrics.Bounding;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.ErrorManager;

public class GenericLowerBoundAndWildCard {
    public static void main(String[] args) {
//        *** addElements methodu ***
        List<Object> ol = new ArrayList<>();
        addElements(ol);
        List<Number> nl = new ArrayList<>();
        addElements(nl);
//        List<Double> dl = new ArrayList<>();
//        addElements(dl);  => CTE hatasi aliyoruz  Generic oncesi yapilarda Run Time Error olurdu.....

//        *** printElements methodu ***

//        List<String> st = new ArrayList<>();
//        printElements(st);
        printElements(new ArrayList<String>());

//        *** printObj methodu ***
       List<String> stringList = new ArrayList<>();
//        printObj(stringList);   ==> CTE aliriz

        List<Object> objectList = new ArrayList<>();
        printObj(objectList);


    }
//  --------------------------------------------------------------------------------------------------------------------
//  ------------------------------------------------------METHODS-------------------------------------------------------
//  --------------------------------------------------------------------------------------------------------------------
    public static void addElements(List<? super Integer> list){// en alt classdan ust klaslara ulasarak calisir LowerBound
//        ?   =>  WildCard (tipi bilinmeyen)
        for (int i = 1; i <= 10 ; i++) {
            list.add(i);
        }
    }

//    WildCard sinirlamalari

    public static void printElements(List<?> listOfUnknown){

//         listOfUnknown.add("Java");    --> ? dan  dolayi DataTürü netleömeden  add methodu gibi islemleri yaptirmaz

//        listOfUnknown.add(null); // illa elenecekse null eklenebilir

        for (Object object : listOfUnknown) {
            System.out.println(object);
        }

    }


//    ? --> Object
    public static void printObj(List<Object> listOfObjet){

        listOfObjet.add("Java");
        for (Object object:listOfObjet) {
            System.out.println(object);
        }
    }



}

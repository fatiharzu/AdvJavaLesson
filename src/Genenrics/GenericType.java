package Genenrics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericType<T> {

    /*
     E --> Element, collection gibi yapilarda kullanilir.
     K --> Key
     V --> Value
     N --> Number
     T --> Type
     S,U,V... vb --> 2., 3. ve 4. tipler icin
     */

    private T type;  // field, variable


    //Getter - Setter
    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }


    //main method
    public static void main(String[] args) {
        //generic yapi kullanarak ayni class dan iki farkli data türünde obje olusturalim

        GenericType<String> obj1 = new GenericType<>();
        // !!! Trick: Diamond icine sadece non-primitive type kullanabiliriz
        obj1.setType("Generic Types");


//        GenericType<String> obj2 = new GenericType<>();
//        obj2.setType(12);     --> String girmem gerekirken int data türüne girince CTE verdi

        /**
         * Not: Cast probleminden nasil kurtulurum
          */
        GenericType<Integer> obj3 = new GenericType<>();
        int a = obj3.getType(); // !!! Cast probleminden kurtulduk.

        //Not : ClassCastException dan nasil kurtulabiliriz?

        List<String> list = new ArrayList<>();        //(List) interface den obje olusturulamaz  ondan saginda (ArrayList) concrete class vardir

        list.add("Alper");
        list.add("Mehmet");
//        list.add(22);   --> !!! ClassCastException dan kurtarir

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Generic");
//        map.put("Generic",1);




    }
}

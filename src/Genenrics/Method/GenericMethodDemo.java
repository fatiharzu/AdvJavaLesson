package Genenrics.Method;

/**
 * <h2> Generic Method</h2>
 * <lu>
 *     <li>Generic methodlar hangi durumda bize kolaylik saglar</li>
 * </lu>
 *
 */
public class GenericMethodDemo {
    public static void main(String[] args) {
        GenericMethodDemo obj1 = new GenericMethodDemo();
        Integer[] intArray = {1, 23, 54, 56, 45};
        Double[] doubleArray = {1.2, 2.4, 3.5, 5.3};

        obj1.print(intArray);
//        obj1.print(doubleArray); --> bu sekilde calismaz  -> overload edip parametresini degistirmemiz lazim
        obj1.print(doubleArray);

    }
// kotu ornek olur her data tipine gore method olusturmak Bu yuzden data durunden bagimsiz bir method yazmamiz gerekir
    // yani Generic bir method yazmamiz gerekir
//    public void print(Integer[] arr){
//        // *****
//    }
//    public void print(Double[] arr1){
//    }


    // generic method   --> methodu generic yaptigimizda data tipleri farkli olsada calistirir
    public <T> void print(T[] array){
        for (T t:array) {
            System.out.println(t);
        }
    }

}

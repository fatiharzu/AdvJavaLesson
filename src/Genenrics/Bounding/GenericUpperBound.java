package Genenrics.Bounding;

public class GenericUpperBound<T extends Number> {  // !! üstten sinirliyoruz -> extends Number Number classindan tureyen butun kalsslari kullanabiliriz

    private T[] numberArray;

    // constructor
    public GenericUpperBound(T[] numberArray) {
        this.numberArray = numberArray;
    }

    //arraylerin icindeki degerlerin ortalamasini bulan method

    public double getAvarage(){

        double sum = 0;
        for (T t:numberArray) {
            sum += t.doubleValue(); // gelen butun degerleri double tipine donduruyor

        }
        double avg = sum / numberArray.length;
        return avg;
    }

    //main method
    public static void main(String[] args) {
        Integer[] intArray = {2, 4, 7, 33};
        GenericUpperBound<Integer> obj1 = new GenericUpperBound<>(intArray);
        System.out.println("Avarage = " + obj1.getAvarage());


        Double[] doubleArray = {2.5, 4.6, 7.8};
        GenericUpperBound<Double> obj2 = new GenericUpperBound<>(doubleArray);
        System.out.println("Avarage = " + obj2.getAvarage());

        // !!! ClassCastException olmami önlüyor
//        String[] strArray = {"Java", "cok", "kolay", "hele", "generics", "tadindan", "yenmez"};
//        GenericUpperBound<String> obj3 = new GenericUpperBound<String>(strArray);

    }
}

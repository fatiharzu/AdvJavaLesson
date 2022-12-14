package Genenrics;

public class GenericTypeTwoParam<S,U> {

    private S s;
    private U u;



    // parametreli constructor
    public GenericTypeTwoParam(S java, U i) {
        this.s = s;
        this.u = u;
    }
    //Getter - Setter

    public S getS() {
        return s;
    }

    public void setS(S s) {
        this.s = s;
    }

    public U getU() {
        return u;
    }

    public void setU(U u) {
        this.u = u;
    }

//  main method
    GenericTypeTwoParam<String, Integer> obj1 = new GenericTypeTwoParam<>("Java",1);    // farkli parametreler
    GenericTypeTwoParam<Integer, String> obj2 = new GenericTypeTwoParam<>(1,"SpringBoot");    // yerleri degistirebiliyoruz



}

package Genenrics;

public class NonGenericType {

    private Object o;


    public Object getO() {
        return o;
    }

    public void setO(Object o) {
        this.o = o;
    }

    public static void main(String[] args) {
        NonGenericType obj1 = new NonGenericType();
        NonGenericType obj2 = new NonGenericType();

        obj1.setO("Fatih"); // String ile set edildi.
        obj2.setO(37);      // Int ile set edildi.


        String str1 = (String) obj1.getO(); // !!! Cast problemi bu iste
        System.out.println(str1);

        String str2 = (String)obj2.getO(); // RunTimeException ,, ClassCastException
        System.out.println(str2);
        //String..valueOf(obj2.get0());
        //Integer.parseInt(Sting);

    }
}

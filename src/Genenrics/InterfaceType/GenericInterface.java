package Genenrics.InterfaceType;

/**
 * Generic: Data türünden bağımsız yapılar oluşturmamızı sağlar<br>
 *
 *  Generic yapıda bir Interface kullanarak bir Class oluşturmak istediğimde<br>
 * 1) Ya hem class hem interface generic olmak zorunda<br>
 * 2) Ya da class klasik yapıda kalacak ve Interface generic olmayacak (T, E gibi bir ifade yerine
 * String,Integer gibi daha kesin bir değer alacak ve icleri dolu olacak)
 * @param <T>
 */
public interface GenericInterface<T>{

    void setValue(T t);

    T getValue();

}

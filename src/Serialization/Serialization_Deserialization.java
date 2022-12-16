package Serialization;

import java.io.*;

public class Serialization_Deserialization {
    public static void main(String[] args) {
    //   writeObject();
       readObject();

    }
//----------------------------------------------------------------------------------------------------------------------
//    writeObject()   => Serialization
    private static void writeObject(){
        System.out.println("User objeleri olusturuluyor");
        User user1 = new User(1L,"Yunus", "123456789");
        User user2 = new User(2L,"Yaman", "987654321");
        User user3 = new User(3L,"Fatih", "741258963");

        try(FileOutputStream fos = new FileOutputStream("user.dat")){ // => bu dosya yazmak icin
           try(ObjectOutputStream oos = new ObjectOutputStream(fos)){ // => bu Objeleri yazamak icin
               oos.writeObject(user1);
               oos.writeObject(user2);
               oos.writeObject(user3);
           }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

//    readObject()    => Deserialization
    private static void readObject(){
//     Java da File islemlerinde okuma islemi yaparken FileInputStream class i kullanilir

        try(FileInputStream fis = new FileInputStream("user.dat")){ // okunacak dosyayi belirledik
            try(ObjectInputStream ois = new ObjectInputStream(fis)){      // Obje olarak okunacak
                User user1 =(User) ois.readObject();
                User user2 =(User) ois.readObject();
                User user3 =(User) ois.readObject();
                System.out.println(user1);
                System.out.println(user2);
                System.out.println(user3);

            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
}

}
//----------------------------------------------------------------------------------------------------------------------
// User class ini tranfer edilebilsin diye isaretledik
    class User implements Serializable{

    private Long id;
    private String name;
    private String tcKimlikNo;

//    constructor
    public User(Long id, String name, String tcKimlikNo) {
        this.id = id;
        this.name = name;
        this.tcKimlikNo = tcKimlikNo;
    }

//    Getter-Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

//    toString()

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tcKimlikNo='" + tcKimlikNo + '\'' +
                '}';
    }
}
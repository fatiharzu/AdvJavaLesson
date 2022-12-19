    package Threads;

    /**
     * <h2>Threads</h2>
     * <lu>
     *     <li>threadler ayni kaynaga erismek isterlerse ne olacak ?</li>
     * </lu>
     */
    public class MultiThreading02 {

            public static  int counter = 0; // => static oldugu icin degeri degistiginde
                                            // butun olusturacagimiz objelerin counter e (1000) son haliyle olur

        public static void main(String[] args) {
//            !!! ayri 2 thread olusturup ayni kaynaga erismesini saglayalim
            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    Counter.count();
                    System.out.println("Thread1 worked");
                }
            });
            thread1.start();


//         thread1.join();  => dinakmik bir cozum degil onun yerine methodumuzun icine p... "synchronized" st... v. ekleriz


            Thread thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    Counter.count();
                    System.out.println("Thread2 worked");
                }
            });
            thread2.start();
        }
    }

    class Counter {
        public synchronized static void  count(){   // synchronized ile bu metoda giren threadleri sıraya koymuş olduk
            for (int i = 1; i <= 1000; i++) {       // method içine aynı anda sadece 1 thread girebilecek
                MultiThreading02.counter++;
            }
            System.out.println("Counter : " + MultiThreading02.counter);
        }
    }

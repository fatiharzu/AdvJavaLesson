        package Genenrics.Threads;

        public class ThreadsCreationWays {
            public static void main(String[] args) {

//              ilk calisan thread main thread dir
                System.out.println("Current thread: "+Thread.currentThread().getName());

                MyThread thread1 = new MyThread();
//                thread1.run();
                thread1.start();
                // thread sınıfında run() metodunda yazılanlar işlenmeye başlar
                // run() diyerekte çağırdığımızda method yine çalışıyor , start() ile çağırmamız
                // arasındaki fark : run() ile çağırıldığında thread değişmez sadece methos çalışır
                // start() da ise önce thread ayağa kalkar daha sonra içindeki run() metodu çalışır

                MyRunnable runnable = new MyRunnable();
                Thread thread2 = new Thread(runnable);
                thread2.start();

            }
        }
        //1- yol thread class ini  extend ederek
        class MyThread extends Thread{

            @Override
            public void run() {
                System.out.println("MyThread threadi calisiyor");
            }
        }

        class MyRunnable implements Runnable {
            @Override
            public void run() {
                System.out.println("Runnable Thread calisiyor");
            }
        }
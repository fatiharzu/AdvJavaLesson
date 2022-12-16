package Threads;

public class ThreadCreationWays {

    public static void main(String[] args) {

        System.out.println("Current Thread : "+Thread.currentThread().getName());  //Main Thread calisti

        MyThread thread1 = new MyThread();
        thread1.run();
//        thread1.start(); // thread sinifinda run() methodunda yazilanlar islenmeye baslar create yapiyor.
        // run() diyerekte cagirdigimizda method yine calisiyor, starrt() ile cagirmamiz arasindaki fark
        // run() ile cagrildiginda thread degismez sadece method calisir
        // start () da ise once thread calisir sonra run calsir.


        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.start();


        // !!! isimsiz olarak thread olusturma,  annonymous (Interface)
        Thread thread3 = new Thread(new Runnable() { //otomatik run methodu geldi annonymous oldugu icin.
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Current Thread : "+Thread.currentThread().getName()); //thread in kendisini istemiyoruz ismini aliyoruz
                System.out.println("Bu isimsiz sinif yoluyla olusturulan is parcacigidir..");

            }
        });  // override edince geldi
        thread3.setName("Thread 3"); //yinede bir isim koyduk
        thread3.start();

        //2. yol isimsiz thread yapma

        Thread thread4 = new Thread(()->{

            System.out.println("Lambda ile yazildi thread-4");
        });
        thread4.start();

        System.out.println("Main bitti");
        Thread thread5 = new Thread(()->{

            System.out.println("thread 5 calisti");
        });



    }

    // 1.yol  : Thread classini extends ederek
}
class MyThread extends Thread{
    @Override
    public void run() {  // ---> Thread class indan override
        System.out.println("MyThread threadi calisiyor ..");
    }



}//2.yol Runnable interface i implement ederek yapma
class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable interfaceden turetilen thread calisti..");
    }
}

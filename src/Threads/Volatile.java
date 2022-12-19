package Threads;

import EnumType.TransactionTypeConstant;

public class Volatile {
    volatile public static int flag = 0;

    public static void main(String[] args) {
        // thread1
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

                while (true){
                    if (flag==0){
                        System.out.println("Thred1 calisiyor");
                    }else {
                        break;
                    }
                }

            }
        });
        thread1.start();

        // thread1
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
               flag = 1;

                System.out.println("Flag degeri 1 olarak degistirildi");

            }
        });
        thread2.start();
    }

}

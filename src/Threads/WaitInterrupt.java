package Threads;

public class WaitInterrupt {

    static public int balance = 0;

    public static void main(String[] args) {

        WaitInterrupt obj = new WaitInterrupt();
        //withdraw
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.withdraw(800);
            }
        });
        thread1.setName("Withdraw");
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                obj.deposit(2000);
                thread1.interrupt(); // thread burada kibarca thread 1 i sonlandiriyor
            }
        });
        thread2.setName("Deposit");
        thread2.start();

    }

    public void withdraw(int amount){
        synchronized (this){

            if (balance <= 0 || balance < amount){
                System.out.println("Bekleme");
                try {
                    wait();

                } catch (InterruptedException e){
                    balance = balance - amount;
                    System.out.println("Para cekme basarili");// {
                    //throw new RuntimeException(e);
                }
            }// if sonu

        }
    }


    public void deposit(int amount){
        balance = balance + amount;
        System.out.println("Para yatirma basarili");
    }

}

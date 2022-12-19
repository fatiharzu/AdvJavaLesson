package Threads;

public class MultiThreading01 {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        CounterWithoutMultiThread counter1 = new CounterWithoutMultiThread(1);
        CounterWithoutMultiThread counter2 = new CounterWithoutMultiThread(2);
        counter1.countMe();
        System.out.println("---------------");
        counter2.countMe();
        long endTime = System.currentTimeMillis();
        System.out.println("WithoutMultiThread ile Gecen süre : " + (endTime-startTime));

        System.out.println("******************************************************");

        long startTime2 = System.currentTimeMillis();
        CounterWithMultiThread counter3 = new CounterWithMultiThread(1);
        CounterWithMultiThread counter4 = new CounterWithMultiThread(2);
        counter3.start();
        System.out.println("--------------------------------");
        counter4.start();
        counter3.join();/// counter 3 bitmeden counter 4 gecme
        counter4.join();// counter thread bitesiye kadar bekle
        long endTime2 = System.currentTimeMillis();
        System.out.println("WithMultiThread ile Gecen süre : "+ (endTime2-startTime2));


    }

}
class CounterWithoutMultiThread {

    private int threadNum;

    //cons


    public CounterWithoutMultiThread(int threadNum) throws InterruptedException {
        this.threadNum = threadNum;
    }

    public void countMe() throws InterruptedException {
        for (int i=0; i<=10; i++){
            Thread.sleep(500);   //0.5 sn yavaşlattım ama main methodu cunku suan thread olarak sadece main var
            System.out.println("i"+i+"Thread number: "+threadNum);
        }
    }
    }

    class CounterWithMultiThread extends Thread{
    private int threadNum;

    public CounterWithMultiThread(int threadNum){
        this.threadNum = threadNum;

    }

    @Override
        public void run(){
        try {
            countMe();
        }catch (InterruptedException e){
            throw  new RuntimeException(e);
        }
    }
        public void countMe() throws InterruptedException {
            for (int i=0; i<=10; i++){
                Thread.sleep(500);   //0.5 sn yavaşlattım ama main methodu cunku suan thread olarak sadece main var
                System.out.println("i"+i+"Thread number: "+threadNum);
            }
        }

    }
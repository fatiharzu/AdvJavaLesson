package AdvJavaPractice.MultiThreads.volatileKeyword;

public class Numerator {

    private static int counter = 0;


    public void getOrder(){
        String name = Thread.currentThread().getName();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
            synchronized (this){
                 counter++;
                System.out.println("Sayin "+name+" siraniz "+counter);
            }
        }
    }

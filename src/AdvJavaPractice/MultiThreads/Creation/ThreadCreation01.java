package AdvJavaPractice.MultiThreads.Creation;

import AdvJavaPractice.MultiThreads.Creation.Sayac;

/**
 *
 *
 * 1) Multithreading Programlama nedir?<br>
 *     Aynı processde iki veya daha fazla iş parçacığının(thread) aynı anda çalışma süreci<br>
 * 2) Threadler 2 şekilde oluşturulur:<br>
 *         --Thread sınıfından extend eden alt sınıf oluşturup, onun run metodu override edilir.<br>
 *          --Runnable interfaceini implement eden bir alt sınıf oluşturup run metodu override edilir,<br>
 * 2a) Hangi yontem daha kullanisli?<br>
 *          Genellikle Runnable interface ini  implement ederek olusturmak daha cok tercihedilir cunku Javada sadece<br>
 *          bir class extend edebiliriz bu hakkimizi Thread ile harcamak istemeyiz.
 *          ardından Thread sınıfının constructorına nesne olarak gönderilir.<br>
 * 3) Run metodunu doğrudan Main metodundan çağırabilir miyiz?<br>
 *    Evet, ancak thread oluşturulmaz.<br>
 * 4) Javada herhangi bir thread oluşturmazsak uygulamalar nerde/nasıl çalışır?<br>
 *    Java varsayılan olarak tüm uygulamalarda main threadini  kullanılır.<br>
 * */

public class ThreadCreation01 {
    public static void main(String[] args) {
        //Task1: Thread sınıfını extend eden Sayac isminde sınıf oluşturup
        // bu sınıftan sayıları 1 den 100 e kadar yazdıran iki tane thread oluşturunuz.

        Sayac thread1=new Sayac("Ronaldo");
        Sayac thread2=new Sayac("Messi");
        thread1.start();
        thread2.start();
    }
}

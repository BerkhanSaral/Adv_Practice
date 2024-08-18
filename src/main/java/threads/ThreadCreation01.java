package threads;
/*
1) Multithreading Programlama nedir?
      Aynı anda iki veya daha fazla is parçaciginiz(Thread) calisma sureci


 2) Threadler 2 şekilde oluşturulur:
--Thread sınıfından extend eden alt sınıf oluşturup, onun run metodu override edilir.
--Runnable interfaceini implement eden bir alt sınıf oluşturup run metodu override edilir,
ardından Thread sınıfının constructorina nesne olarak gönderilir.


3) Run metodunu doğrudan Main metodundan çağırabilir miyiz?
    Evet,ancak thread olusturmaz

4) Javada herhangi bir thread oluşturmazsak uygulamalar nerde/nasıl çalışır?
Java varsayılan olarak main threadini kullanır
 */


public class ThreadCreation01 {
    public static void main(String[] args) {
        Sayac sayac1 = new Sayac("Havuc");
        Thread sayac2 = new Thread("Elma");
        sayac1.start();
        sayac2.start();
    }
}

package threads;
//Task4: anonymous class kullanarak thread oluşturunuz.
//Lambda expression kullanarak thread oluşturunuz.

/*2a) Hangi yöntem daha cok tercih edilir
genellikle Runnable interface'i implement ederek olusturmak daha mantıklıdır
Java sadece bir class extend edilebilir ve biz bu hakkımızı thread icin kullanmayiz*/

public class ThreadCreation03 {
    public  static void main(String[] args) {
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("Jerry");
                String name=Thread.currentThread().getName();
                for (int i = 1; i <=100 ; i++) {
                    System.out.println(name+" : Kaçıyorum...");
                }
            }
        });


        Thread thread2=new Thread(()->{
            Thread.currentThread().setName("Tom");
            String name=Thread.currentThread().getName();
            for (int i = 1; i <=100 ; i++) {
                System.out.println(name+" : Yakalıyorum...");
            }
        });
        thread1.start();
        thread2.start();







    }

}
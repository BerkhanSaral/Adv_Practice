package threads;
//Task2: Runnable interfaceni implement eden Counter isminde sınıf oluşturup
// bu sınıftan harfleri a dan z ye kadar yazdıran iki tane thread oluşturunuz.

//Task3 : Threadler başlamadan önce yarış başlasın ve bitince yarış bitti yazdirin

public class ThreadCreation02 {
    public static void main(String[] args) {
        System.out.println("Yarış Başlasın...");
        Counter c1=new Counter("Ali Can");
        Thread thread1=new Thread(c1);

        Counter c2=new Counter("Veli Han");
        Thread thread2=new Thread(c2);

        thread1.start();
        thread2.start();
        //thread1 ve thread2 bitene kadar main threadi uyutmak istedik fakat kesin ve dogru bir cozum olmadigina kadar verdik
        // try {
        //     Thread.sleep(50);//100 girersem bosu bosuna 50 milis main threadi daha fazla uyutmusum
        // } catch (InterruptedException e) {
        //     throw new RuntimeException(e);
        // }
        //thread1 ve thread2 bitene kadar main threadi beklet
        //try {
        //    thread1.join();
        //} catch (InterruptedException e) {
        //    throw new RuntimeException(e);
        //}
        //try {
        //    thread2.join();
        //} catch (InterruptedException e) {
        //    throw new RuntimeException(e);
        //}
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Yarış Bitti...");



    }
}
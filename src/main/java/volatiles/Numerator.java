package volatiles;

public class Numerator {

    private volatile static int counter = 0;
    //voletile keywordu degiskeninin main memory`de saklanmasini garanti eder
    // tum threadler degiskene ayni anda ulasmasindan kaynakli cakismaya cozum vermez
    //bunun icin synchronized keywordu ile kullanilmalidir
    public synchronized void getOrder() {
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        counter++;
        String name = Thread.currentThread().getName();
        System.out.println("Sayin : " + name + " siraniz : " + counter);

    }
}

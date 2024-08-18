package notifyWaits;

/*TASK: Bir marketteki stok miktarını takip eden bir uygulama tasarlayınız.
 Markette yeterli ürün yoksa yeni ürün gelmesi beklensin.
 Yeni ürün eklenince ürün satışı gerçekleşsin.
 */
public class ShopWaitNotify {

    private static int stock = 0;

    public static void main(String[] args) {
        ShopWaitNotify shop = new ShopWaitNotify();
        Thread consumerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                shop.consumeProduct(6);
            }
        });
        consumerThread.setName("Ali Can");

        Thread produceThread = new Thread(new Runnable() {
            @Override
            public void run() {
                shop.produceProduct(5);
            }
        });
        produceThread.setName("Veli Han");
        consumerThread.start();
        produceThread.start();

    }

    public synchronized void consumeProduct(int amount) {
        if (amount > stock) {
            System.out.println(Thread.currentThread().getName() + " urun satin almak istiyor");
            System.out.println("Yeterli urun yok Guncel stogu : " + stock);
            System.out.println("Tuketici urun girisi yapilmasini bekliyor");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if (amount <= stock) {
            System.out.println(Thread.currentThread().getName() + " urun satin almak istiyor");
            System.out.println("Urun satin alindi stock guncelleniyor");
            stock -= amount;
        } else {
            System.out.println("Yeterli urun yok ");
            System.out.println("Lutfen yerin tekrar ugrayiniz");
        }
    }

    public synchronized void produceProduct(int amount) {
        System.out.println(Thread.currentThread().getName() + " urun ekleme islemi yapiyor");
        System.out.println("Yeni urun (urunler) eklendi, Stok guncelleniyor");
        stock += amount;
        System.out.println("guncel stok : " + stock);
        notify();
        System.out.println();

    }
}



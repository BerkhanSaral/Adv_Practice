package threads;

public class Sayac extends Thread{
    private  String  name;

    public Sayac(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <101 ; i++) {
            System.out.println(name+"`den "+i + " tanw satildi");
        }
        System.out.println(name+" bitti");
    }
}

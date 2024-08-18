package synchronizeds;

public class Runner {
    public static void main(String[] args) {

        String[]users={"Sümeyya","Arda","Mirayat","Berkhan","Bayramnazar","Doğukan"};
        AppoinmentCenter appoinmentCenter=new AppoinmentCenter();
        for (String user:users
        ) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    Thread.currentThread().setName(user);
                    String name = Thread.currentThread().getName();
                    System.out.format("Sayın %-10s, Randevu Tarihiniz: %10s %n", name, appoinmentCenter.getAppoinmentDate());
                }
            });
            thread.start();
        }
    }
}

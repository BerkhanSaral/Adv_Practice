package synchronizeds;

import java.time.LocalDate;

//Multithreading programlamada birden fazla Thread aynı anda ortak bir
// kaynağa erişmeye çalışırsa  //istenmeyen sonuçlar oluşacaktır.
// Bu durumda threadlere sırayla erizin vermek gerekecektir.
// Bir thread kaynağı kullanıyorken diğerleri onu beklemelidirler.
// Bu "synchronized" keywordü ile sağlanır.
/*
Task: Bir randevu oluşturma yygulaması tasarlayınız (AppoinmentCenter) Uygulama herbir talep için bir gün sonrasına tarih vermelidir.
 */
public class AppoinmentCenter {

    private LocalDate day=LocalDate.now();

    public  LocalDate getAppoinmentDate(){
        day=day.plusDays(1);
        return day;
    }
}

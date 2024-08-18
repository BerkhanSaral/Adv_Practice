package generics.interfaces;

public class StudentRepo implements Repository<Student> {
    @Override
    public void add(Student student) {
        System.out.println(student.getName() + " isimli ogrenci basarili bir sekilde olusturuldu");
    }

    @Override
    public void get(Student student) {
        System.out.println(" ogrencinin adi " + student.getName());
    }

    @Override
    public void update(Student student) {
        System.out.println(" ogrenci guncellendi " + student.getName());
    }

    @Override
    public void remove(Student student) {
        System.out.println(" ogrenci silindi " + student.getName());
    }
}

package generics.interfaces;

public class TeacherRepo implements Repository<Teacher>{
    @Override
    public void add(Teacher teacher) {
        System.out.println(teacher.getName() + " isimli ogretmen basarili bir sekilde okula geldi");

    }

    @Override
    public void get(Teacher teacher) {
        System.out.println(" ogretmen adi " + teacher.getName());

    }

    @Override
    public void update(Teacher teacher) {
        System.out.println(" ogretmen guncellendi " + teacher.getName());

    }

    @Override
    public void remove(Teacher teacher) {
        System.out.println(" ogretmen silindi " + teacher.getName());

    }
}

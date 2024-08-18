package generics.interfaces;

public class StudentManagment {
    public static void main(String[] args) {
        Student std = new Student("Dogukan");
        StudentRepo stdRepo = new StudentRepo();
        stdRepo.add(std);
        stdRepo.update(std);
        stdRepo.get(std);
        stdRepo.remove(std);
        System.out.println("---------------------------");
        Teacher tch = new Teacher("Melisa");
        TeacherRepo tchRepo = new TeacherRepo();
        tchRepo.add(tch);
        tchRepo.update(tch);
        tchRepo.get(tch);
        tchRepo.remove(tch);

    }

}

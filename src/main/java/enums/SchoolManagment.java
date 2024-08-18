package enums;

import generics.interfaces.Student;

//TASK:okul yönetimi için öğrenci ve teacher silme programı yazınız.
//User için role tanımlayın (ADMIN, TEACHER, STUDENT) ve role göre silme yetkisi veriniz.
//öğrenci silme yetkisi: ADMIN-TEACHER
//teacher silme yetkisi: ADMIN
public class SchoolManagment {
    public static void main(String[] args) {
        Student student =new Student("Ayşe");
        Teacher teacher=new Teacher("Arda");//bunlar sistemimizdeki veriler

        User user1=new User("Ali Can",Role.ROLE_STUDENT);
        User user2=new User("Veli Han",Role.ROLE_TEACHER);
        User user3=new User("Ahmet",Role.ROLE_ADMIN);//bunlar ise sistemi kullanan yetkili kullanıcılar
        //1. method calisti
        delete(student,user3);//Student is DELETED succesfully by admin

        //2. method calisti
        delete(teacher,user3);//Teacher is DELETED succesfully by admin

    }

    public static void delete(Student std,User user){
        if (user.getRole().equals(Role.ROLE_ADMIN)||user.getRole().equals(Role.ROLE_TEACHER)){
            System.out.println("Student is DELETED succesfully by "+user.getRole().getName());
        }else {
            System.out.println(user.getRole().getName()+" is not permitted to delete Student.");
        }
    }
    //overloading
    public static void delete(Teacher teacher,User user){
        if (user.getRole().equals(Role.ROLE_ADMIN)){
            System.out.println("Teacher is DELETED succesfully by "+user.getRole().getName());
        }else {
            System.out.println(user.getRole().getName()+" is not permitted to delete Teacher.");
        }
    }

}
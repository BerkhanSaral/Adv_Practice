package generics.classes;

public class StudentList {
    public static void main(String[] args) {
        listGrade();
        System.out.println("----------------------------------");
        listMemberLibrary();
    }

    public static void listMemberLibrary() {
        Student<String,Integer,String> std1 = new Student<>("Nimet ", 5678, "cilginnimetdoc");
        Student<String,Integer,String> std2 = new Student<>("Arda ", 123, "ardaturan");
        Student<String,Integer,String> std3 = new Student<>("Summeye", 5334, "cevizagacigulhaneparki");

        System.out.printf("%-10s   ||  %5s   ||   %20s \n",std1.getS(),std1.getU(),std1.getV());
        System.out.printf("%-10s   ||  %5s   ||   %20s \n",std2.getS(),std2.getU(),std2.getV());
        System.out.printf("%-10s   ||  %5s   ||   %20s \n",std3.getS(),std3.getU(),std3.getV());

    }

    public static void listGrade() {
        Student<String,Double,Double> std1 = new Student<>("Ali Can", 65.7, 80.1);
        Student<String,Double,Double> std2 = new Student<>("Mehmet Erbil", 46.3, 70.8);
        Student<String,Double,Double> std3 = new Student<>("Tuba Cangoz", 25.3, 84.3);

        System.out.printf("%-10s    ||  %5s   ||   %4s \n",std1.getS(),std1.getU(),std1.getV());
        System.out.printf("%-10s  ||  %5s   ||   %4s \n",std2.getS(),std2.getU(),std2.getV());
        System.out.printf("%-10s   ||  %5s   ||   %4s \n",std3.getS(),std3.getU(),std3.getV());
    }



}

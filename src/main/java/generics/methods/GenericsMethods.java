package generics.methods;

import java.util.Arrays;

public class GenericsMethods {
    public static void main(String[] args) {
        String[] stdList = {"Rafael", "Donatello", "Leonardo"};
        Double[] pointList = {0.3, 99.3, 10.0, 2.3};
        Character[] gradeList = {'A', 'B', 'C', 'B'};

        printListElement(stdList);
        printListElement(pointList);
        printListElement(gradeList);

        String[] newstdList = orderArr(stdList);
        System.out.println("newstdList = " + Arrays.toString(newstdList));

        Double[] newpointList = orderArr(pointList);
        System.out.println("newpointList = " + Arrays.toString(newpointList));

        Character[] newGradeList = orderArr(gradeList);
        System.out.println("newGradeList = " + Arrays.toString(newGradeList));

        //StringBuilder std=new StringBuilder("Ali");
        //StringBuilder std1=new StringBuilder("Dli");
        //System.out.println(std.compareTo(std1));

    }

    public static <T> void printListElement(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static <T extends Comparable> T[] orderArr(T[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    T temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}

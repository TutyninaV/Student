import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
ArrayList<Student> students = new ArrayList<Student>();
        int[] mas1 = new int[]{3, 1, 2, 2, 1};
        Student lera = new Student("Lera", mas1);
        students.add(lera);
        int[] mas2 = new int[]{2, 3, 4, 2, 5};
        Student lenar = new Student("Lenar", mas2);
        students.add(lenar);
        int[] mas3 = new int[]{5, 5, 3, 5, 4};
        Student petya = new Student("Petya", mas3);
        students.add(petya);
        int[] mas4 = new int[]{3, 5, 4, 3, 3};
        Student ildan = new Student("Ildan", mas4);
        students.add(ildan);
        int[] mas5 = new int[]{5, 1, 2, 2, 1};
        Student vika = new Student("Vika", mas5);
        students.add(vika);
        double sum = students.stream()
        .map(x -> x.getMas())
        .flatMapToInt(Arrays::stream)
        .reduce(0, (x, y) -> x + y) / 25.0;
        System.out.println("Средний балл = " + sum);
        ArrayList<Double> sr = new ArrayList<>();
        sr.add(Student.people(lera.getMas()));
        sr.add(Student.people(lenar.getMas()));
        sr.add(Student.people(petya.getMas()));
        sr.add(Student.people(ildan.getMas()));
        sr.add(Student.people(vika.getMas()));
        System.out.println(sr);
        }
}
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /*Student деген класс тузунуз.
        * Полялары : String fullName,int age,String email,Gender gender, enum болсун.
        * Баардык эске алынуучу нерселерди эске алыныз.
        * ~~~~~~~Methods~~~~~~~
        * StudentAble деген интерфейстин ичине тузунуз методдорду.
        * 1-Баардык студенттерди чыгарып беруучу метод тузунуз.
        * 2-бардык балдарды чыгарып беруучу  метод жазыныз.
        * 3-бардык кыздарды чыгарып беруучу метод жазыныз.
        * 4-аты менен тапчуу метод жазыныз.
        * 5-баардык студенттердин жашын сорттоп чыгарып бериниз.
        * 6-студенттин фамилиясын кайтарчуу метод тузунуз.        */

        Student student= new Student("Shabdanov Ilim",19,"ilim@gmail",Gender.M);
        Student student1= new Student("Djoldoshov Nuradil",17,"nurik@gmail",Gender.M);
        Student student2= new Student("Nurustanova Albina",18,"albina@gmail",Gender.F);

        Student[] students={student,student1,student2};


        System.out.println(" Oll Students : ");
        System.out.println(Arrays.toString(Student.getOllStudents(students)));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Male Gender : ");
        System.out.println(Arrays.toString(Student.getStudentGenderMale(students)));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Female Gender :");
        System.out.println(Arrays.toString(Student.getStudentGenderFemale(students)));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Enter by name :");
        String name = new Scanner(System.in).nextLine();
        System.out.println(Arrays.toString(Student.findByName(students, name)));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Sort Oll Ages : ");
        System.out.println(Arrays.toString(Student.sortOllAges(students)));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Student last Name :");
        System.out.println(student.getLastName());
        System.out.println(student1.getLastName());
        System.out.println(student2.getLastName());
    }
}
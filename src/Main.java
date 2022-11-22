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

        Student studenting = new Student();
        System.out.println(" Oll Students : ");
        studenting.getOllStudents(students);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Male Gender : ");
        studenting.getStudentGenderMale(students);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Female Gender :");
        studenting.getStudentGenderFemale(students);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Enter by name :");
        String name = new Scanner(System.in).nextLine();
        studenting.findByName(students,name);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Sort Oll Ages : ");
        studenting.sortOllAges(students);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Student last Name :");
        studenting.getLastName(students);

    }
}
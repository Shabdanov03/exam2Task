import java.util.Arrays;

public class Student {
    private  String email;
    private String fullName;
    private int age;
    private String emile;
    private Gender gender;

    public Student(String fullName, int age, String email, Gender gender) {
        this.fullName = fullName;
        chekcAge(age);
        this.gender=gender;
       chekcEmail(email);
    }

    private void chekcAge(int age){
        if (age>0&&age<150){
            this.age=age;
        }
        else System.out.println(" invalid age :");
    }
    private void chekcEmail(String email){
        if (email.contains("@")){
            this.email=email;
        }
        else System.out.println(" invalid email :");
    }
    public Student() {

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmile(String emile) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void getOllStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void getStudentGenderMale(Student[] students) {
        for (Student student : students) {
            if (student.getGender().equals(Gender.M)) System.out.println(student);
        }
    }

    public void getStudentGenderFemale(Student[] students) {
        for (Student student : students) {
            if (student.getGender().equals(Gender.F)) System.out.println(student);

        }
    }

    public void findByName(Student[] students, String name) {
        for (Student student : students) {
            if (student.getFullName().contains(name)) {
                System.out.println(student);
            }
        }
    }

    public void sortOllAges(Student[] students) {
        int[] arrayAges = new int[students.length];
        int index = 0;
        for (Student student : students) {
            arrayAges[index] = student.getAge();
            index++;
        }
        Arrays.sort(arrayAges);
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length; j++) {
                if (students[j].getAge() == arrayAges[i]) {
                    System.out.println(students[j].getFullName() + " " + students[j].getAge());
                }
            }

        }
    }

    public void getLastName(Student[] students) {
        for (Student student : students) {
            String[] array = student.getFullName().split(" ");
            for (int i = 1; i < array.length; i++) {
                System.out.println(array[i]);
            }
            }
        }


    @Override
    public String toString() {
        return  " Student  => " +
                " fullName='" + fullName + '\'' +
                " age = " + age +
                " emile = '" + email + '\'' +
                " gender = " + gender;
    }
}

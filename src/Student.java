import java.util.Arrays;

public class Student {
    private String email;
    private String fullName;
    private int age;
    private String emile;
    private Gender gender;

    public Student(String fullName, int age, String email, Gender gender) {
        this.fullName = fullName;
        chekcAge(age);
        this.gender = gender;
        chekcEmail(email);
    }

    private void chekcAge(int age) {
        if (age > 0 && age < 150) {
            this.age = age;
        } else System.out.println(" invalid age :");
    }

    private void chekcEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else System.out.println(" invalid email :");
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

    public static Student[] getOllStudents(Student[] students) {
        return students;
    }

    public static Student[] getStudentGenderMale(Student[] students) {
        int counter = 0;
        for (Student student : students) {
            if (student.getGender().equals(Gender.M)) counter++;
        }
        Student[] arrayM=new Student[counter];
        int index = 0;
        for (Student student : students) {
            if (student.getGender().equals(Gender.M)) {
                arrayM[index]=student;
            }
        }
        return students;

    }

    public static Student[] getStudentGenderFemale(Student[] students) {
        int counter = 0;
        for (Student student : students) {
            if (student.getGender().equals(Gender.F)) counter++;
        }
        Student[] arrayF=new Student[counter];
        int index = 0;
        for (Student student : students) {
            if (student.getGender().equals(Gender.F)) {
                arrayF[index]=student;
            }
        }
        return students;

    }

    public static Student[] findByName(Student[] students, String name) {
        for (Student student : students) {
            if (student.getFullName().contains(name)) {
                return new Student[]{student};
            }
        }return null;
    }

    public static Student[] sortOllAges(Student[] students) {
        int[] arrayAges = new int[students.length];
        int index = 0;
        for (Student student : students) {
            arrayAges[index] = student.getAge();
            index++;
        }
        Arrays.sort(arrayAges);
        Student[] studentsSort = new Student[students.length];
        for (int i = 0; i < students.length; i++) {
            for (Student student : students) {
                if (student.getAge() == arrayAges[i]) {
                    studentsSort[i] = student;

                }
            }

        }return studentsSort;
    }

    public  String getLastName() {
     String[] name = getFullName().split(" ");
     String lastName="";
        for (int i = 0; i < name.length-1; i++) {
            lastName="%s %s".formatted(lastName,name[i]);
        }
        lastName = lastName.trim();
     return lastName;
    }


    @Override
    public String toString() {
        return " Student  => " +
                " fullName='" + fullName + '\'' +
                " age = " + age +
                " emile = '" + email + '\'' +
                " gender = " + gender;
    }
}

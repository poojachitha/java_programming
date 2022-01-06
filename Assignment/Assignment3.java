package Assignment;

public class Assignment3 {
    public static void main(String[] args) {

        Student[] students = new Student[3];
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.setName("Hani");
        s1.setAge(12);
        s1.setEmail("hani@gmail.com");
        s1.setAddress("Chennai");

        s2.setName("Divya");
        s2.setAge(14);
        s2.setEmail("divya@gmail.com");
        s2.setAddress("Andhra Pradesh");

        s3.setName("Kevin");
        s3.setAge(17);
        s3.setEmail("kevin@gmail.com");
        s3.setAddress("Chennai");

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        Teacher[] teacher = new Teacher[1];
        Teacher t1 = new Teacher();
        // Teacher t2 = new Teacher();
        // Teacher t3 = new Teacher();
        t1.setName("Hari");
        t1.setAge(30);
        t1.setEmail("hari@gmail.com");
        t1.setAddress("Andhra Pradesh");

        teacher[0] = t1;

        Batch b1 = new Batch();
        b1.setName("JAVA BATCH");
        b1.setSize(3);
        b1.setStudent(students);
        b1.setTeacher(teacher);
        System.out.println("-------------------------------------------");
        System.out.println("BATCH NAME IS ---------> " + b1.getName());
        System.out.println("BATCH SIZE IS ---------> " + b1.getSize());
        b1.printDetails();

    }
}

class Student {
    private String name;
    private int age;
    private String email;
    private String address;

    public Student() {
        System.out.println("Student default consructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class Teacher {
    private String name;
    private int age;
    private String email;
    private String address;

    public Teacher() {
        System.out.println("Teacher default constructor");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Batch {
    private String name;
    private int size;
    private Student[] student;
    private Teacher[] teacher;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Teacher[] getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher[] teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] students) {
        this.student = students;
    }

    public void printDetails() {
        for (int i = 0; i < student.length; i++) {
            Student s = student[i];
            System.out.println("Student name is    -------> " + s.getName());
            System.out.println("Student age is     -------> " + s.getAge());
            System.out.println("Student email is   -------> " + s.getEmail());
            System.out.println("Student address is -------> " + s.getAddress());
            System.out.println("------------------------------------------------");
        }
        for (int i = 0; i < teacher.length; i++) {
            Teacher t = teacher[i];
            System.out.println("Teacher name is    -------> " + t.getName());
            System.out.println("Teacher age is     -------> " + t.getAge());
            System.out.println("Teacher email is   -------> " + t.getEmail());
            System.out.println("Teacher address is -------> " + t.getAddress());
        }
    }

}

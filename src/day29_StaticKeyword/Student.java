package day29_StaticKeyword;

class Student {
    int number;
    String name;
    static String college = "ITS";


    Student (int r, String n, String college) {
        this.number = r;
        this.name = n;
        this.college = college;
    }

    public static void main(String[] args) {
        Student student1 = new Student(111, "Karan", "MIT");
        Student student2 = new Student(222, "Aryan", "Harvard");

        System.out.println(student1.number + " " + student1.name + " " + student1.college);
        System.out.println(student2.number + " " + student2.name + " " + student2.college);

    }
}

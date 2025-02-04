public class Student extends Person {

    double gpa;

    Student(String first_name , String last_name , double gpa)
    {
        super(first_name, last_name);
        this.gpa = gpa;
    }
    void show_gpa()
    {
        System.err.println(this.first_name + " " + this.last_name + " " + this.gpa);
    }
}

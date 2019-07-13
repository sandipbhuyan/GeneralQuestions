class Person
{
    private String name;
    private String dateOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}

class Teacher extends Person
{
    double salary;
    String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Student extends Person{
    int studentId;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}

class CollegeStudent extends Student
{
    String collegeName;
    String year;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
}

public class School
{
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Arpita");
        p.setDateOfBirth("08/01/1997");
        System.out.println("The Person details are :");
        System.out.println("Name : " + p.getName() + " DOB : "+p.getDateOfBirth());

        Teacher t = new Teacher();
        t.setSalary(10000);
        t.setSubject("Hindi");
        t.setName("T1");
        t.setDateOfBirth("10/2/1978");
        System.out.println("Teacher Details are: ");
        System.out.println("Name : " + t.getName() + " DOB : " + t.getDateOfBirth() + " Salary : " + t.getSalary() + " Subject : " + t.getSubject());

        Student s = new Student();
        s.setName("Arpita");
        s.setDateOfBirth("08/1/1997");
        s.setStudentId(1);
        System.out.println("Student Details are: ");
        System.out.println("Name : " + s.getName() + " DOB : " + s.getDateOfBirth() + " StudentId : " + s.getStudentId() );

        CollegeStudent cs = new CollegeStudent();
        cs.setName("Arpita");
        cs.setDateOfBirth("8/1/1997");
        cs.setStudentId(1);
        cs.setYear("fourth");
        cs.setCollegeName("CET");
        System.out.println("College Student Details are: ");
        System.out.println("Name : " + cs.getName() + " DOB : " + cs.getDateOfBirth() + " StudentId : " + cs.getStudentId() + " College Name: " + cs.getCollegeName() + " Year : " + cs.getYear());

    }
}
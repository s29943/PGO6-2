import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student s=new Student("John", "Doe", "doe@wp.pl", "zlota 12", "333222111", new Date(1980, 1, 1));
        Student s2=new Student("Anne", "smith", "ane@wp.pl", "zlota 12", "333222111", new Date(1980, 1, 1));

        StudyProgram it=new StudyProgram("IT","AAA",7,5);
        StudyProgram managment=new StudyProgram("managment","AAA",7,5);


        s.enrollStudent(it);
        s2.enrollStudent(managment);

        s.addGrage(5,"PGO");
        s.addGrage(2,"PIP");


        Students.promoteAllStudents();
        Students.displayInfoAboutAllStudents();
    }
}
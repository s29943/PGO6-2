import java.util.ArrayList;
import java.util.Date;

public class Student {
    private String fname;
    private String lname;
    private String email;
    private String adress;
    private String phoneNumber;
    private Date birthDate = new Date();
    private static int studentCount=1;

    private String indexNumber;
    private ArrayList<Grade>grades= new ArrayList<>();
    private int currentSemester;
    private String studentStatus;

    private StudyProgram studyprogramme;


    public Student(String fname, String lname, String email, String adress, String phoneNumder, Date birthDate) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.adress = adress;
        this.phoneNumber=phoneNumder;
        this.birthDate=birthDate;

        this.indexNumber="s"+studentCount++;
        Students.addStudent(this);
        this.grades=new ArrayList<Grade>();
        this.currentSemester=0;
        this.studentStatus="candidate";
        }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getIndexNumber() {return indexNumber;}

    public void setIndexNumber(String indexNumber) {this.indexNumber = indexNumber;}


    public int getCurrentSemester() {return currentSemester;}

    public void setCurrentSemester(int currentSemester) {this.currentSemester = currentSemester;}

    public String getStudentStatus() {return studentStatus;}

    public void setStudentStatus(String studentStatus) {this.studentStatus = studentStatus;}

    public String getStudyprogramme() {
        if (studyprogramme == null) {
            return "Student has not started studying yet.";
        } else {
            return studyprogramme.getName();
        }
    }

    public void setStudyprogramme(StudyProgram studyprogramme) {this.studyprogramme = studyprogramme;}

    public void addGrage(int value, String name) {
        Grade grade=new Grade(value, name);
        grades.add(grade);
    }

    public void enrollStudent(StudyProgram studyProgramme){
        setStudentStatus("Student");
        setCurrentSemester(1);
        setStudyprogramme(studyProgramme);
    }
    private int itnCounter(){
        int itnCount = 0;
        for (Grade grade : grades){
            if (grade.getValue() < 3){
                itnCount++;
            }
        }
        return itnCount;}
    public void promoteToNextSemester() {
        if (itnCounter() > studyprogramme.getNumberOfAllowedITNs()) {
            System.out.println("Student has exceeded the allowed number of ITNs.");
        }
        if (currentSemester >= studyprogramme.getNumberOfSemesters()) {
            setStudentStatus("Graduate");
        } else {
            setCurrentSemester(currentSemester++);
        }
    }



}


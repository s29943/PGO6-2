import java.util.ArrayList;

public class StudyProgram {

    private String name;
    private String description;
    private int numberOfSemesters;
    private int numberOfAllowedITNs;

    public StudyProgram(String name, String description, int numberOfSemesters, int numberOfAllowedITNs) {
        this.name = name;
        this.description = description;
        this.numberOfSemesters = numberOfSemesters;
        this.numberOfAllowedITNs = numberOfAllowedITNs;
    }

    public String getName() {return name;}

    public String getDescription() {
        return description;
    }

    public int getNumberOfSemesters() {
        return numberOfSemesters;
    }

    public int getNumberOfAllowedITNs() {
        return numberOfAllowedITNs;
    }
}

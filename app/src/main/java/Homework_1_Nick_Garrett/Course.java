package Homework_1_Nick_Garrett;

import java.lang.reflect.Array;

public class Course {
    int numberOfCredits, courseNumber;
    String courseName, department, departmentCode;

    static String[] codes;
    static {
        codes = new String[6];
        codes[0] = "CS";
        codes[1] = "CHEM";
        codes[2] = "PHYS";
        codes[3] = "MATH";
        codes[4] = "BTNY";
        codes[5] = "ZOO";
    }

    //course number, name, number of credits
    public Course() {
        this.department = null;
        this.courseName = null;
        this.courseNumber = 0;
        this.numberOfCredits = 0;
        this.departmentCode = null;
    }

    public Course(String department, String courseName, int courseNumber, int numberOfCredits) {
        this.department = department;
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.numberOfCredits = numberOfCredits;

        //   "Computer Science","Mathematics","Chemistry","Physics","Botany","Zoology"
        String code;
        switch (department){
            case "Computer Science":
                code = codes[0];
                break;
            case "Mathematics":
                code = codes[1];
                break;
            case "Chemistry":
                code = codes[2];
                break;
            case "Physics":
                code = codes[3];
                break;
            case "Botany":
                code = codes[4];
                break;
            case "Zoology":
                code = codes[5];
                break;

            default:
                code = "ERROR: UNABLE TO FIND CODE";
        }

        this.departmentCode = code;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDepartment() {
        return department;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

}

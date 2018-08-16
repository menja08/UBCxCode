package model;

public class Transcript {

    public Transcript(String studentName, int studentID){

    }

    //TODO: Design specification for this method
    //requires: the grade should be between 0.0 and 4.0, the course should not be null
    //modifies: creates a new list
    //effects: returns a list with the course and grade
    public void addGrade(String course, double grade){ }

    //TODO: Design specification for this method
    // This method should return course name and grade in some consistent String format
    //requires: a list of strings with courses and grades
    //modifies:
    //effects: displays course name and grade
    //returns course name and grade in format CourseName: Grade
    public String getCourseAndGrade(String course){ return null; }

    //TODO: Design specification for this method
    //requires: a list of strings with courses and grades
    //modifies:
    //effects: displays student names, courses and grades
    //prints course names with grades earned; displays student academic record
    public void printTranscript(){ }

    //TODO: Design specification for this method
    //REQUIRES: a list of grades
    //Modifies:
    //Effects: calculates the average grade
    public double getGPA(){ return 0.0; }

    //getter
    public String getStudentName() { return "no student name entered";}

    //setter
    public void setStudent(String studentName, int studentID) {

    }
}
/*
* In this project, we want to print out a list of courses with grades achieved and calculate averages
* */
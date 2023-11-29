public class StudentProfile {
    String firstName;
    String lastName;
    int expectedYearToGraduate;
    double GPA;
    String declaredMajor;
    
    // constructor
    public StudentProfile(String firstName, String lastName,
                    int expectedYearToGraduate, double GPA,
                    String declaredMajor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedYearToGraduate = expectedYearToGraduate;
        this.GPA = GPA;
        this.declaredMajor = declaredMajor;
    }

    // method (function): increments a student's expected graduation year by one  
    public int incrementExpectedGraduationYear() {
        return expectedYearToGraduate + 1;
    }
}

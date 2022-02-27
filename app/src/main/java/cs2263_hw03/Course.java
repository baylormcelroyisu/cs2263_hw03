package cs2263_hw03;

/**
 * Keeps course information.
 */
public class Course {

    private static final String[] codes = {"CS","MATH","CHEM","PHYS","BIOL","EE"};
    private static final String[] departments = {"Computer Science", "Mathematics", "Chemistry", "Physics", "Biology", "Electrical Engineering"};

    private int dept;
    private String number;
    private String name;
    private String credits;

    /**
     * Create a new course
     * @param dept department #, number from 0 to 5.
     * @param number course number, typically ### or ####
     * @param name course name
     * @param credits course credit hours
     */
    public Course(int dept, String number, String name, String credits){
        this.dept = dept;
        this.number = number;
        this.name = name;
        this.credits = credits;
    }

    /**
     * Turns course info into a String
     * @return a String
     */
    @Override
    public String toString() {
        return codes[dept] + " " + number + " " + name + " " + credits + "cr";
    }

    public int getDept(){
        return dept;
    }
    public String getDeptName() {
        return departments[dept];
    }

    public void setDept(int dept) {
        this.dept = dept;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }

    /**
     * Gets number of departments.
     * @return number of departments
     */
    public int getSize(){
        return departments.length;
    }
}

package cs2263_hw03;

import java.util.ArrayList;

/**
 * Maintains the catalog of courses.
 */
public class CourseProcessor  {

    private ArrayList<Course> courses = new ArrayList<>();

    /**
     * Add a course to the catalog.
     * @param dept department #, number from 0 to 5.
     * @param number course number, typically ### or ####
     * @param name course name
     * @param credits course credit hours
     */
    public void addCourse(int dept, String number, String name, String credits){
        Course c = new Course(dept, number, name, credits);
        courses.add(c);
    }

    /**
     * Get a String of all courses in a department.
     * @param dept department number
     * @return String of courses with break lines
     */
    public String deptString(int dept){
        String tempStr = "";
        for(Course c: courses){
            if(c.getDept() == dept){
                tempStr = tempStr + c.toString() + "\n";
            }
        }
        return tempStr;
    }

    /**
     * Get a String of all courses in the catalog
     * @return String of courses with breaklines
     */
    public String toString(){
        String tempStr = "";
        for(Course c: courses){
            for (int i=0;i<=c.getSize();i++)
                if(c.getDept() == i){
                    tempStr = tempStr + c.toString() + "\n";
                }
        }
        return tempStr;
    }
}

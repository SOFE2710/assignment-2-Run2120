import java.util.Vector;

public class Student extends Person{
    private String id;
    private String name;
    private Vector<Course> courses = new Vector<Course>(); // contains all courses the student is registered in


    public Student(String stdId, String stdName) {
        this.name = stdName;
        this.id = stdId;
    }


    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void registerFor(Course courseN){
        courses.add(courseN);
    }


    public String toString() {
        // return a string representation of a student using the following format:
        // 100234546 John McDonald
        // Registered courses: ELEE 2110, ELEE 2790, SOFE 2710, SOFE 2800, SOFE 2850
        System.out.println(this.id + " "  + this.name);
        System.out.println("Registered courses: ");
        for(int i = 0;i<courses.size();i++) {
            System.out.print(courses.get(i).getCode() + " " + courses.get(i).getNumber() + "\n");
        }
        System.out.println("\n");
        return " ";
    }

    public boolean equals(Student stud){
        if(this.id == stud.getId()){
            if (name.equals(stud.getName())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean isRegisteredInCourse(Course cour){
        int i = 0;
        while(i<courses.size()){
            if(cour.getCode().equals(courses.get(i).getCode())){
                if(cour.getNumber() == courses.get(i).getNumber()){
                    return true;
                }
            }
            i++;
        }
        return false;
    }

    public boolean isRegisteredInCourse(int number){
        int i = 0;
        int temp;
        while(i<courses.size()){
            if(courses.get(i).getNumber() == number){
                return true;
            }
            i++;
        }
        return false;
    }
}

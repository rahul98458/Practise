package Composition;

public class School {
    static String name="ox";
    private Teacher teacher;
    private Student student;
    public School(Teacher teacher, Student student) {
        this.teacher = teacher;
        this.student = student;
    }
    public String getName() {
        return name;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public Student getStudent() {
        return student;
    }
    @Override
    public String toString() {
        return "School [name=" + name + ", teacher=" + teacher + ", student=" + student + "]";
    }
}

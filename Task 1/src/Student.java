import java.util.ArrayList;
public class Student {
    private String name;
    private ArrayList<Course> courses = new ArrayList<>();

public Student(String name)
{
    this.name = name;
}
public void addcourse(Course course)
{
courses.add(course);
}

    @Override
    public String toString() {
        return name;
    }
}

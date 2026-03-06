package src.models;

import java.util.ArrayList;
import java.util.List;

 public class Student {
    public String name;
    public int id;
    public List<Integer> marks;

    public Student(String name, int id)
    {
        this.name=name;
        this.id= id;
        this.marks = new ArrayList<>();
        
    }

    public void addMark(int mark)
    {
        marks.add(mark);
        System.out.println("Mark : " + mark + "added successfully");
    }

    public void getAverage()
    {
        double average = 0;
        for (Integer mark : marks) {
            average = average + mark;
        }

        System.out.println("Average is : " + average);

    }

    public void getInformation()
    {
        System.out.println("Student name : " + name);
        System.out.println("Student id : " + id);
        System.out.println("List of marks : " + marks);
    }
}

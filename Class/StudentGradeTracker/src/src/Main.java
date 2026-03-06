
package src;

import src.models.Student;

class Main{
    public static void main() {

        Student s1 = new Student("raghul",1);
        s1.addMark(12);
        s1.addMark(13);
        s1.addMark(45);
        s1.getAverage();
        s1.getInformation();

    }
}
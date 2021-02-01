package Homework_1_Nick_Garrett;

import java.util.Vector;

public class vectorClass<Course>{

    public static Vector vector = new Vector();

    public static Vector getVector() {
        return vector;
    }

    public void setVector(Vector<Course> vector) {
        this.vector = vector;
    }

    public void addVector(Course course){
        vector.add(course);
    }

    @Override
    public String toString() {
        return "vectorClass{" + "vector=" + getVector() + '}';
    }
}

public class Student implements Measurable {
    private double age;

    public Student(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + age +
                '}';
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }


    @Override
    public double getSize() {
        return age;
    }
}

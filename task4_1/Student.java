package task4_1;

class Student {
    private String rollNo;
    private String name;
    private int age;
    private String course;

    public Student(String rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;
        setName(name);
        setAge(age);
        this.course = course;
    }

    public void setAge(int age) throws AgeNotWithinRangeException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age must be between 15 and 21.");
        }
        this.age = age;
    }

    public void setName(String name) throws NameNotValidException {
        if (!name.matches("[a-zA-Z ]+")) {
            throw new NameNotValidException("Name should not contain numbers or special symbols.");
        }
        this.name = name;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

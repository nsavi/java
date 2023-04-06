// Student.java
class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// Test.java
class test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("VIT");
        System.out.println(s.getName());
    }
}


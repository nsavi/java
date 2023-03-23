class Student {
    int id;
    String name;
    int age;

    // Constructor with two arguments
    Student(int i, String n) {
        id = i;
        name = n;
    }

    // Constructor with three arguments
    Student(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    // Method to display student information
    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Student s1 = new Student(111, "Karan"); // Using constructor with two arguments
        Student s2 = new Student(222, "Aryan", 25); // Using constructor with three arguments

        s1.display(); // Output: 111 Karan 0
        s2.display(); // Output: 222 Aryan 25
    }
}


	

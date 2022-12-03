public class Student {
    int age;
    int grade;
    String name;
    boolean isBoarder;
    boolean isHomework;

    public void print(){
        System.out.println("The student " + name + " is " + age + " years old"); //the + is a concatenation
        System.out.println("They are in " + grade + " grade");
        System.out.println("It is " + isBoarder + " that they are a boarder");
        System.out.println("It is " + isHomework + " that they have completed their homework");
    }

    public Student(int page, int pgrade, String pname, boolean pisBoarder, boolean pisHomework) {
        age = page;
        grade = pgrade;
        name = pname;
        isBoarder = pisBoarder;
        isHomework = pisHomework;
    }
}


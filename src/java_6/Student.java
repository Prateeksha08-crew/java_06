package java_6;
public class Student {
    private int studentId;
    private String name;
    private int[] marks;

    public Student(int studentId, String name, int[] marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return marks;
    }
    public int getTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public String getGrade() {
        int total = getTotalMarks();
        int avg = total / marks.length;

        if (avg >= 90) return "A+";
        else if (avg >= 80) return "A";
        else if (avg >= 70) return "B";
        else if (avg >= 60) return "C";
        else return "F";
    }

    public void displayStudentInfo() {
        System.out.println("\n Student ID: " + studentId);
        System.out.println(" Name: " + name);
        System.out.println(" Total Marks: " + getTotalMarks());
        System.out.println(" Grade: " + getGrade());
    }
}


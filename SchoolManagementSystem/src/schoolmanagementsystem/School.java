package schoolmanagementsystem;

import java.util.List;

public class School {

     private List<Teacher> teachers;
     private List<Student> students;
     private static int TotalMoneySpent;
     private static int TotalMoneyEarned;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers=teachers;
        this.students=students;
        TotalMoneyEarned=0;
        TotalMoneySpent=0;
    }

    public int getTotalMoneyEarned() {
        return TotalMoneyEarned;
    }

    public static void setMoneyEarned(int moneyEarned) {
        TotalMoneyEarned+= moneyEarned;
    }

    public int getTotalMoneySpent() {
        return TotalMoneySpent;
    }

    public static void updateTotalMoneySpent(int moneySpent) {
      TotalMoneyEarned-=moneySpent;
    }


    /**
     *
     * @return the list of students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     *
     * @param student is added to the list of students in school
     */
    public  void addStudents(Student student) {
        students.add(student);
    }

    /**
     *
     * @return the list of teachers
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     *
     * @param teacher  is added to the list of teachers in the school
     */
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }
}

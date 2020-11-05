package schoolmanagementsystem;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args)
    {

         Teacher lizzy=new Teacher(1, "Lizzy", 1000);
         Teacher rita=new Teacher(2, "Rita", 1500);
         Teacher sita=new Teacher(3, "Sita", 900);
         List<Teacher> teachersList=new ArrayList<>();
         teachersList.add(lizzy);
         teachersList.add(rita);
         teachersList.add(sita);
        // System.out.print(teachersList);

         Student ram=new Student(1, "Ram", 8);
         Student shyam=new Student(1, "Shyam", 9);
         Student riya=new Student(1, "Riya", 10);

         List<Student> studentsList=new ArrayList<>();

         School lukes=new School(teachersList, studentsList);

         //System.out.print(riya.getName()+" studies in:"+riya.getGrade()+" grade");
        lukes.addStudents(ram);
        lukes.addStudents(shyam);
        lukes.addStudents(riya);
        riya.updateFees(5000);
        shyam.updateFees(10000);
        System.out.println("Lukes has earned $" +lukes.getTotalMoneyEarned());

        sita.receiveSalary(sita.getSalary());

        System.out.println(lukes.getTotalMoneyEarned());

        System.out.println(riya);
        System.out.println(lizzy);




    }
}

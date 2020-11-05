package schoolmanagementsystem;
// created by Sourav on 14/10/20
//this class is used to keep a track of the students.


public class Student {
 private int id;
 private String name;
 private int grade;
 private int fees_paid;
 private int fees_total;

    /**
     * id parameter is a unique paramete for a stuydent.
     *
     * @param id this is a unique attribute of the student
     ** @param name the name of a particular student remains the same
     * @param grade the grade of a student varies
     */
  public Student(int id, String name, int grade)
  {
      this.fees_paid=0;
      this.fees_total= 30000;
      this.id=id;
      this.name=name;
      this.grade=grade;

  }
  //we would not alter the id, and the name of the student;
    public void setGrade(int grade)
    {
        this.grade=grade;
    }

    /**
     * in this method we will update the fees by addind the fees_paid
     * @param fees
     */
    public void  updateFees(int fees)
    {
        fees_paid+= fees;
        School.setMoneyEarned(fees_paid);
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getGrade()
    {
        return grade;
    }

    public int getFees_total()
    {
        final int fees_total = this.fees_total;
        return  fees_total;
    }

 public int getfeesLeft()
 {
     return fees_total-=fees_paid;

 }

    @Override
    public String toString() {
        return "The name of the student is " +name+ " and the fees paid by him is $" +fees_paid;
    }
}

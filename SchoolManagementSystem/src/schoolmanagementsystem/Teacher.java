package schoolmanagementsystem;

public class Teacher
{
    /**
     * this is a class for the teachers
     * id for a teacher
     * name of the teacher
     * salary of the teacher
     */
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher(int id, String name, int salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    /**
     *
     * @param sal this will the salary that we will pass through this function
     * @return this method will set the salary of the teacher
      */
    public void setSalary(int sal)
    {
        this.salary=sal;
    }

    /**
     *
     * @return the id which is unique of the teacher
     */
    public int getId()
    {
        return id;
    }

    /**
     *
     * @return the salary of the teacher
     */
    public int getSalary()
    {
        return salary;
    }

    /**
     *
     * @return the name of the teacher
     */
    public String getName()
    {
      return name;
    }
    public void receiveSalary(int salary)
    {
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salaryEarned);
    }

    @Override
    public String toString() {
        return "The name of the teacher is "+name+ " and her salary is $" +salary;
    }
}

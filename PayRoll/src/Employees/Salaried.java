package Employees;

import Exceptions.ExceptionsAndGetString;

public class Salaried extends Employee
{
    private double salary;

    public Salaried(int code, String name)
    {
        super(code,name);
        setSalary();
    }

    public void setSalary()
    {
        System.out.println("Salário Mensal:");
        this.salary = ExceptionsAndGetString.tryingCatchDouble(900,9000);
    }

    public double getSalary()
    {
        return salary;
    }

    @Override
    public String toString()
    {
        return super.toString()
                + "Salário - " + this.salary + "\n";
    }
}

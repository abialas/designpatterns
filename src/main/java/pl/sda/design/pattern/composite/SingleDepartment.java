package pl.sda.design.pattern.composite;

/**
 * Created by adam.
 */
public class SingleDepartment implements Department {

    private String name;
    private double monthSalary;

    public SingleDepartment(String name, double monthSalary) {
        this.name = name;
        this.monthSalary = monthSalary;
    }

    @Override
    public double getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(double monthSalary) {
        this.monthSalary = monthSalary;
    }

    @Override
    public String toString() {
        return "SingleDepartment{" + "name='" + name + '\'' + ", monthSalary=" + monthSalary + '}';
    }
}

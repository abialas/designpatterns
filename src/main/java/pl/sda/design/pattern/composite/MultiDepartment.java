package pl.sda.design.pattern.composite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by adam.
 */
public class MultiDepartment implements Department {

    private Collection<Department> childDepartments;
    private String name;

    public MultiDepartment(String name) {
        this.name = name;
        childDepartments = new ArrayList<>();
    }

    public void addChildDepartment(Department department) {
        childDepartments.add(department);
    }

    @Override
    public double getMonthSalary() {
        return childDepartments.stream()
          .mapToDouble(Department::getMonthSalary)
          .sum();
    }

    @Override
    public String toString() {
        return childDepartments.stream()
          .map(Objects::toString)
          .collect(Collectors.joining("\n\r"));
    }

    public Iterator<Department> getChildDepartments() {
        return childDepartments.iterator();
    }

}

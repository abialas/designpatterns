package pl.sda.design.pattern.composite;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by adam.
 */
public class MultiDepartmentTest {

    @Test
    public void givenHierarchyOfDepartmentsWhenGetSalaryThenReturnCorrectSum() {
        Department salesDepartment = new SingleDepartment("Sales", 1000000.0);
        Department hrDepartment = new SingleDepartment("HR", 20000.0);
        SingleDepartment javaDepartment = new SingleDepartment("java", 50000.0);
        SingleDepartment cDepartment = new SingleDepartment("c", 40000.0);
        MultiDepartment softDepartment = new MultiDepartment("soft");
        softDepartment.addChildDepartment(javaDepartment);
        softDepartment.addChildDepartment(cDepartment);

        MultiDepartment company = new MultiDepartment("HQ");
        company.addChildDepartment(salesDepartment);
        company.addChildDepartment(hrDepartment);
        company.addChildDepartment(softDepartment);

        assertThat(company.getMonthSalary(), equalTo(1110000.0));
    }

}

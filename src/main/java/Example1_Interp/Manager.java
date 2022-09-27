package Example1_Interp;

import java.util.ArrayList;
import java.util.List;

class Manager extends Employee {


    private double bonus;
    private List<Employee> subs = new ArrayList<Employee>();


    public Manager(String n, double s, Employee[] es) {
        super(n, s);
        bonus = 0;
        if (es != null) {
            for (Employee e : es) {
                add(e);
            }
        }
    }


    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double b) {
        bonus = b;
    }

    public void add(Employee sub) {
        if (!subs.contains(sub)) {
            subs.add(sub);
        }
    }

    public void remove(Employee sub) {
        subs.remove(sub);
    }

    //В каждом классе вызываем метод PrettyPrint + проходимся по всей коллекции
    @Override
    public void prettyPrint(String initialIndent) {
        System.out.println(initialIndent + WorkExp.getDetails(this));
        for (Employee employee : subs) {
            employee.prettyPrint(WorkExp.EMP_INDENT+initialIndent);
        }
    }


}

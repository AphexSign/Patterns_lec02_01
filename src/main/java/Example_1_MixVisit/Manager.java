package Example_1_MixVisit;

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

    public List<Employee> getSubs() {
        return this.subs;
    }

    public void accept(PrettyPrintVisitor visitorMethod, String initialIndent) {
        visitorMethod.visit(this, initialIndent);
    }


}

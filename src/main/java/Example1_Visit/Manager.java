package Example1_Visit;

import java.util.ArrayList;
import java.util.List;

class Manager extends Employee {

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
    private double bonus;
    private List<Employee> subs = new ArrayList<Employee>();


    @Override
    public void accept(Visit v, String indent) {
        v.visit(this,indent);

        for(Employee employee:subs){
            employee.accept(v,WorkUtil.EMP_INDENT+indent);
        }
    }
}

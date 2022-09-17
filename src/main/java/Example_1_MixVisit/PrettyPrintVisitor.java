package Example_1_MixVisit;

import java.util.List;

public class PrettyPrintVisitor implements VisitorMethod {

    private boolean condition = true;


    @Override
    public void visit(Manager manager, String indent) {

        if (this.condition) {
            System.out.println(getDetails(manager));
            indent=indent.concat("---");
            this.condition = false;
        }

        List<Employee> employeeList = manager.getSubs();

        for (Employee employee : employeeList) {
            System.out.println(indent + getDetails(employee));

            if (isManager(employee)) {
                indent = indent.concat("---");
                processManager((Manager) employee, indent);
            }
            indent = "---";
        }

    }

    @Override
    public void visit() {
        System.out.println("Null method of prettyPrintVisitor");
    }

    public void processManager(Manager manager, String indent) {
        visit(manager, indent);
    }

    private boolean isManager(Employee employee){
        return employee.getClass() == Manager.class;
    }

    private String getDetails(Employee employee){
        return employee.getName()+" ("+employee.getSalary()+") "+employee.getClass().getSimpleName();
    }





}

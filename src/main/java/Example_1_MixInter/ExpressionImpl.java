package Example_1_MixInter;

import java.util.List;

public class ExpressionImpl implements Expression {
    private boolean condition = true;


    @Override
    public void interpret(Manager manager,String indent) {

        if (this.condition) {
            System.out.println(getDetails(manager));
            indent=indent.concat("---");
            this.condition = false;
        }

        List<Employee> employeeList= manager.getSubs();
        for (Employee employee : employeeList) {
            System.out.println(indent+getDetails(employee));

            if(isManager(employee)){
                indent=indent.concat("---");
                processManager((Manager) employee,indent);
            }
            indent="---";
        }
    }

    private void processManager(Manager manager, String indent) {
        interpret(manager, indent);
    }

    private boolean isManager(Employee employee){
        return employee.getClass() == Manager.class;
    }

    private String getDetails(Employee employee){
        return employee.getName()+" ("+employee.getSalary()+") "+employee.getClass().getSimpleName();
    }



}

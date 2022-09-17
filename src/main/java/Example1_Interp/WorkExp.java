package Example1_Interp;

public class WorkExp {
    final static String EMP_INDENT="---";

    public static String getDetails(Employee employee){
        return employee.getName()+" ("+employee.getSalary()+") "+employee.getClass().getSimpleName();
    }


}

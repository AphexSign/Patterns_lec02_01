package Example1_Visit;

public class WorkUtil {
    final static String EMP_INDENT="---";

    public static String getDetails(Employee employee){
        return employee.getName()+" "+employee.getSalary()+") "+employee.getClass().getSimpleName();
    }
}

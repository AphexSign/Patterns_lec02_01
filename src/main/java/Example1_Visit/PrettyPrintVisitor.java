package Example1_Visit;

public class PrettyPrintVisitor implements Visit {

    @Override
    public void visit(Manager manager, String indent) {
        System.out.println(indent+WorkUtil.getDetails(manager));
    }

    @Override
    public void visit(Employee employee, String indent) {
        System.out.println(indent+WorkUtil.getDetails(employee));

    }
}

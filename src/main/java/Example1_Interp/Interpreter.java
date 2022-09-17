package Example1_Interp;

public class Interpreter {
    public static void main(String[] args) {

        final String initialIndent = "";
        Manager CEO = new Manager("Alice", 1, new Employee[]
                { new Manager("Erin", 200000, new Employee[]
                        { new Employee("Frank", 30000) }),
                        new Employee("Bob", 40000),
                        new Manager("Dan", 100000, null),
                        new Employee("Carlos", 50000),
                        new Manager("T1",10,new Employee[]{new Manager("T2",20,new Employee[]{new Manager("T3",30,new Employee[]{new Employee("B1",50)})})}),
                        new Employee("b5",90)
                });
        CEO.setBonus(1000000);
        CEO.prettyPrint(initialIndent);
    }
}

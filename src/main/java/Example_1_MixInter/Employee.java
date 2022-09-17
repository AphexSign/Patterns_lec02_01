package Example_1_MixInter;

class Employee {
    public Employee(String n, double s) {
        name = n;
        salary = s;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }


    public final boolean equals(Object other)  {
        if (this == other) return true;
        if (other == null) return false;
        if (!(other instanceof Employee)) return false;
        Employee e = (Employee) other;
        return name.equals(e.name);

    }

    public final int hashCode() {
        return name.hashCode();
    }
    private String name;
    private double salary;
}

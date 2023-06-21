package ObjectArray;

public class Employee {
    private int id;
    private String name;
    Address add;
    public Employee(int id, String name, Address add) {
        this.id = id;
        this.name = name;
        this.add = add;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Address getAdd() {
        return add;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", add=" + add + "]";
    }
}

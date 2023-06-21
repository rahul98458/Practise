package List;

public class Teacher {
    private int id;
    private String name;
    Address add;
   
    public Teacher(int id, String name, Address add) {
        this.id = id;
        this.name = name.toUpperCase();
        this.add = add;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public  String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Address getAdd() {
        return add;
    }
    public void setAdd(Address add) {
        this.add = add;
    }
    @Override
    public String toString() {
        return "Teacher [id=" + id + ", name=" + name + ", add=" + add + "]";
    }

}

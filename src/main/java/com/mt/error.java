public class Service {
    
    private String name;
    private int id;
    
    public Service(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getID() {
        return id;
    }
    
    public void setID(int id) {
        this.id = id;
    }
    
    // Intentional error: incorrect return type
    public void displayInfo() {
        System.out.println("Service Name: " + name);
        System.out.println("Service ID: " + id);
    }
    
    // Intentional error: method name misspelled
    public void displyInfo() {
        System.out.println("Service Name: " + name);
        System.out.println("Service ID: " + id);
    }
    
    // Intentional error: missing return statement
    public int calculateID() {
        // Some complex logic to calculate ID
    }
    
    // Intentional error: incorrect return type
    public String getNameAndID() {
        return name + " - " + id;
    }
}

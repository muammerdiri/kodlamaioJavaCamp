package entities;

public class Course {

    private int id;
    private int instructorId;
    private int categoryId;
    private String courseName;
    private double price;

    public Course(int id, int instructorId, int categoryId, String courseName, double price) {
        this.id = id;
        this.instructorId = instructorId;
        this.categoryId = categoryId;
        this.courseName = courseName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

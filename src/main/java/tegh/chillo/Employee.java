package tegh.chillo;

public class Employee {
    private String name;
    private String emailAddress;
    private String phone;
    private String department;
    private String address;
    private int yearOfBirthday;
    private float salary;

    public Employee(){
        System.out.println("Super-class constructor");
    }

    public Employee(String name,
                    String emailAddress,
                    String phone,
                    String departement,
                    String address,
                    int yearOfBirthday) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.phone = phone;
        this.department = departement;
        this.address = address;
        this.yearOfBirthday = yearOfBirthday;
    }

    public Employee(String name,
                    String emailAddress,
                    String phone,
                    String department,
                    String address,
                    int yearOfBirthday,
                    float salary) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.phone = phone;
        this.department = department;
        this.address = address;
        this.yearOfBirthday = yearOfBirthday;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setYearOfBirthday(int yearOfBirthday) {
        this.yearOfBirthday = yearOfBirthday;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhone() {
        return phone;
    }

    public String getDepartment() {
        return department;
    }

    public String getAddress() {
        return address;
    }

    public int getYearOfBirthday() {
        return yearOfBirthday;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}

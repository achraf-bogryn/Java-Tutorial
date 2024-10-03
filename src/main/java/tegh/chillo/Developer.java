package tegh.chillo;

public class Developer extends Employee {
    private String projectName;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Developer(){
        System.out.println("Sub-class constructor");
    }

    public Developer(String name,
                     String emailAddress,
                     String phone,
                     String departement,
                     String address,
                     int yearOfBirthday,
                     String projectName) {
        super(name, emailAddress, phone, departement, address, yearOfBirthday);
        this.projectName = projectName;
    }
}

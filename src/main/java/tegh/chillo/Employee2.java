package tegh.chillo;

public class Employee2 {
    private int id ;
    private float salary;
    private PersonalInformation personalInformation;
    private Department dept;

    public Employee2(int id, float salary,
                     String firstName,
                     String middleName,
                     String lastName,
                     String bloodGroup,
                     String accountNumber,
                     String nationality,
                     int yearOfBirthday,
                     Department dept) {


        this.id = id;
        this.salary = salary;
        this.personalInformation = new PersonalInformation(firstName,
                lastName,
                middleName,
                lastName,
                bloodGroup,
                accountNumber,
                yearOfBirthday);
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public PersonalInformation getPersonalInformation() {
        return personalInformation;
    }

    public void setPersonalInformation(PersonalInformation personalInformation) {
        this.personalInformation = personalInformation;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "id=" + id +
                ", salary=" + salary +
                ", personalInformation=" + personalInformation +
                ", dept=" + dept +
                '}';
    }
}

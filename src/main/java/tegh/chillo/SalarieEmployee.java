package tegh.chillo;

public class SalarieEmployee extends Employee{
    float bonus;
    public SalarieEmployee() {}

    public SalarieEmployee(String name,
                           String emailAddress,
                           String phone,
                           String department,
                           String address,
                           int yearOfBirthday,
                           float salary,
                           float bonus) {
        super(name,
              emailAddress,
              phone,
              department,
              address,
              yearOfBirthday,
              salary);
        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }
    @Override
    public float getSalary() {
        return super.getSalary() + this.bonus;
    }


}

package tegh.chillo;

public class HourlyEmployee extends Employee {
    private float workOurPrice;
    private int hourlyRate;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name,
                          String emailAddress,
                          String phone,
                          String department,
                          String address,
                          int yearOfBirthday,
                          float salary,
                          float workOurPrice,
                          int hourlyRate) {
        super(name,
              emailAddress,
              phone,
              department,
              address,
              yearOfBirthday,
              salary);
        this.workOurPrice = workOurPrice;
        this.hourlyRate = hourlyRate;
    }

    public float getWorkOurPrice() {
        return workOurPrice;
    }

    public void setWorkOurPrice(float workOurPrice) {
        this.workOurPrice = workOurPrice;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public float getSalary() {
        return this.workOurPrice * this.hourlyRate;
    }


}

package tegh.chillo;

public class DailyEmployee extends Employee{
    private float workDayPrice;
    private int dailyRate;

    public DailyEmployee(){}

    public DailyEmployee(String name,
                         String emailAddress,
                         String phone,
                         String department,
                         String address,
                         int yearOfBirthday,
                         float salary,
                         float workDayPrice ,
                         int dailyRate) {
        super(name,
              emailAddress,
              phone,
              department,
              address,
              yearOfBirthday,
              salary);
        this.workDayPrice = workDayPrice;
        this.dailyRate = dailyRate;
    }

    public float getWorkDayPrice() {
        return workDayPrice;
    }

    public void setWorkDayPrice(float workDayPrice) {
        this.workDayPrice = workDayPrice;
    }

    public int getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(int dailyRate) {
        this.dailyRate = dailyRate;
    }
    @Override
    public float getSalary() {
        return this.workDayPrice * this.dailyRate;
    }

}

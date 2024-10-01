package tegh.chillo;

public class Account {
    private int acountNo;
    private String name;
    private  float amount;

    public void setAcountNo(int acountNo) {
        this.acountNo = acountNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getAcountNo() {
        return acountNo;
    }

    public String getName() {
        return name;
    }

    public float getAmount() {
        return amount;
    }

    void insert(int accountnumber , String name , float amount) {
         this.acountNo = accountnumber;
         this.name = name;
         this.amount = amount;
    }

    void deposit(float amount) {
     this.amount += amount;
     System.out.println("deposit : "+ amount);
    }

    void withdraw(float amount) {
        if(this.amount > amount) {
            this.amount -= amount;
            System.out.println("withdraw : "+ amount);
        }
        else {
            System.out.println("You can't have deposit this amount from your account ");
        }

    }

    void checkBalance(){
      System.out.println("Check balance : "+ this.amount);
    }

    @Override
    public String toString() {
        return "Account{" +
                "acountNo=" + acountNo +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}

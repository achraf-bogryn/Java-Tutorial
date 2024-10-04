package tegh.chillo;

public class PersonalInformation {
    private String firstName;
    private String middleName;
    private String lastName;
    private String bloodGroup;
    private String accountNumber;
    private String nationality;
    private int yearOfBirthday;



    public PersonalInformation(String firstName,
                               String middleName,
                               String lastName,
                               String bloodGroup,
                               String accountNumber,
                               String nationality,
                                int yearOfBirthday) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.bloodGroup = bloodGroup;
        this.accountNumber = accountNumber;
        this.nationality = nationality;
        this.yearOfBirthday = yearOfBirthday;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getYearOfBirthday() {
        return yearOfBirthday;
    }

    public void setYearOfBirthday(int yearOfBirthday) {
        this.yearOfBirthday = yearOfBirthday;
    }

    @Override
    public String toString() {
        return "PersonalInformation{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", nationality='" + nationality + '\'' +
                ", yearOfBirthday=" + yearOfBirthday +
                '}';
    }
}

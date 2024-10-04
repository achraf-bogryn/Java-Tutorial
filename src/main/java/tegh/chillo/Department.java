package tegh.chillo;

public class Department {
    private int depNO;
    private String deptName;

    public Department(){}

    public Department(int depNO, String deptName) {
        this.depNO = depNO;
        this.deptName = deptName;
    }

    public int getDepNO() {
        return depNO;
    }

    public void setDepNO(int depNO) {
        this.depNO = depNO;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "depNO=" + depNO +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}

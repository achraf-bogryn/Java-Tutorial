package tegh.chillo;

public class Student {
   private  int no;
   private String password;
   private boolean LoggedIn;
   private static int count = 1;
   private String name;
   private static String college="IT";
   private static  int minimalPassword =6;

    public Student(String name , String password) {
        this.no = count;
        this.name = name;
        this.password = password;
        count++;
    }

    public String getPassword() {
        return password;
    }

    public boolean logIn(int enterDno  , String enterPassword) {
        if(enterDno == this.no && enterPassword.equals(this.password)) {
            LoggedIn = true;
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean validatePassword(String password){
        if(password.length() >= minimalPassword){
            return true;
        }
        return false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void display(){
        System.out.println("no : "+count);
        System.out.println("college : "+college);
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name +
                ", college='" + college +
                '\'' +
                '}';
    }
}

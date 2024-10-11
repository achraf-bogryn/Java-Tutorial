package tegh.chillo.enums;

public class main {
    enum WeekDays{
        MONDAY("workin Day") , TUESDAY , WEDNESDAY , THURSDAY , FRIDAY("DAY OFF") , SATURDAY , SUNDAY;
        private String status;
        WeekDays(){

        }
        WeekDays(String status){
            this.status = status;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }


    public static void main(String[] args) {
     Numbers val = Numbers.ONE;

     switch (val) {
         case ONE:
             System.out.println("ONE");
             break;
         case TWO:
             System.out.println("TWO");
             break;
         case THREE:
             System.out.println("THREE");
             break;
     }

        System.out.println("monday : "+WeekDays.MONDAY.getStatus());
        System.out.println("friday : "+WeekDays.FRIDAY.getStatus());
    }
}

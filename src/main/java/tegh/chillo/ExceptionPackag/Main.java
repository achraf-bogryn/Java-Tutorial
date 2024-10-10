package tegh.chillo.ExceptionPackag;

import tegh.chillo.interfacePackage.Car;

import java.io.FileInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        We can add ty-ressources isinde try() as parameter without use fially ro close connection
//        if we have more than one connection we can separet this connection by using semicolone
//        try {
//            int []arr = new int[]{1,2,3};
//            System.out.println(arr[3]);
//            int x=7/0;
//            System.out.println("hii");
//            System.out.println("hii2");
//        }
//        catch (java.lang.ArrayIndexOutOfBoundsException e | ArithmeticException e) {
//            System.out.println(e);
//        }
//        catch (java.lang.ArithmeticException e){
//            System.out.println(e);
//        }
//        catch (java.lang.ArrayIndexOutOfBoundsException | ArithmeticException e) {
//            System.out.println(e);
//        }

//        We can call the parents of all exception call Exception

//        catch (Exception e) {
//            System.out.println(e);
//            System.exit(0);
//        }
//        Finaly always eecute if ew have exceptio or not , but in catch if we use System.exit() ,
//        then finally can't be execute
//        finally {
//            System.out.println("finaly");
//        }
//        try{
//            System.out.println(div(5,0));
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }

//        System.out.println("1");
//       try{
//           validate(-1);
//       }
//       catch (ArithmeticException ae ){
//           System.out.println(ae.getMessage());
//       }
//
//        }
//
//
//        public static int div(int a, int b) throws Exception{
//            System.out.println("divide a on b");
//            return a/b;

        try {
            Scanner in = new Scanner(System.in);
            NoNameBank acc1 = new NoNameBank();
            String option = "";

            do {
                System.out.println("1. DEPOSUTE");
                System.out.println("2. WITHDRAW");
                System.out.println("3. BALANCE ENQUIRY");
                System.out.println(" ENTER OPTIO");
                option = in.next();

                switch (option) {
                    case "1": {
                        System.out.println("ENTER DEPOSIT AMOUNT");
                        double amt = in.nextDouble();
                        acc1.deposit(amt);
                        acc1.balanceEnquiry();
                        break;
                    }
                    case "2": {
                        System.out.println("ENTER WITHDRAW AMOUNT");
                        double amt = in.nextDouble();
                        double wd = acc1.withdraw(amt);
                        System.out.println("WITHDRAW AMOUNT IS : " + wd);
                        acc1.balanceEnquiry();
                        break;
                    }
                    case "3": {
                        acc1.balanceEnquiry();
                        break;
                    }
                    default: {
                        System.out.println("INVALID OPTION");
                    }
                }
                System.out.println("DO YPU WANT CONTINUE YES/NO");
                option = in.next();

            }while (option.equalsIgnoreCase("YES")) ;
        }
            catch(InvalidAmountException iae){
                System.out.println(iae.getMessage());
            }catch(InsufficientFundsException ife){
                System.out.println(ife.getMessage());
            }catch(NumberFormatException nfe){
                System.out.println(nfe.getMessage());
            }catch(InputMismatchException ime){
                System.out.println(ime.getMessage());
            }


        }

    }



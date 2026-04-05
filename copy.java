import java.util.*;
class copy {    
    public static void main(String[] args) {
      Scanner abc = new Scanner(System.in);
      System.out.println("                                            .....Al Shifa Pharmacy....                                ");
      int pass=12345;
      int choice=0;
      System.out.println("________________________________");
      System.out.println("Login");
      System.out.print("User ID: ");
      int id=abc.nextInt();
      System.out.print("Password: ");
      int password=abc.nextInt();
      System.out.println("________________________________");
      if(pass==password){
          System.out.println("Welcome to Al Shifa Pharmacy"); 
          while(choice!=4){
          System.out.println("________________________________");
          System.out.println("Menue");
          System.out.println("1.Patient Detail");
          System.out.println("2.Medicines Detail and Bill");
          System.out.println("3.Employees Detail");
          System.out.println("4.Exit");
          System.out.println("________________________________");
          System.out.print("Enter your choice:");
          choice=abc.nextInt();
          if(choice==1){
          System.out.println("Patient Account Number");
          int number1=abc.nextInt();
          abc.nextLine();
          System.out.println("Admission Date");
          String admission=abc.nextLine();
          System.out.println("Discharge Date");
          String discharge=abc.nextLine();
          System.out.println("Patient Name");
          String patientName=abc.nextLine();
          System.out.println("Diagnosis");
          String diagnosis=abc.nextLine();
          System.out.println("_________________________________");
          System.out.println("Bill Issue Date");
          String issueDate=abc.nextLine();
          System.out.println("Bill Issue Day");
          String issueDay=abc.nextLine();
          }else if(choice==2){
          System.out.println("________________________________________________");
          System.out.println("              Enter Medicine 01 Detail          ");
          abc.nextLine();
          System.out.print("Enter Medicine 1 name: ");
          String name1=abc.nextLine();
          System.out.print("Enter Medicine 1 code: ");
          long code1=abc.nextInt();
          System.out.print("Enter Medicine 1 price: ");
          int price1=abc.nextInt();
          abc.nextLine();
          System.out.println("________________________________________________");
          System.out.println("              Enter Medicine 02 Detail          ");
          System.out.print("Enter Medicine 2 name: ");
          String name2=abc.nextLine();
          System.out.print("Enter Medicine 2 code: ");
          long code2=abc.nextInt();
          System.out.print("Enter Medicine 2 price: ");
          int price2=abc.nextInt();
          abc.nextLine();
          System.out.println("_________________________________________________");
          System.out.println("            Enter Medicine 03 Detail             ");
          System.out.print("Enter Medicine 3 name: ");
          String name3=abc.nextLine();
          System.out.print("Enter Medicine 3 code: ");
          long code3=abc.nextInt();
          System.out.print("Enter Medicine 3 price: ");
          int price3=abc.nextInt();
          abc.nextLine();
          System.out.println("_______________________________________________________");
          System.out.println("Medicine                Code                Price      ");
          System.out.println("_______________________________________________________");
          System.out.printf("%-25s%-20d%-15d        \n",name1, code1, price1);
          System.out.printf("%-25s%-20d%-15d        \n",name2, code2, price2);
          System.out.printf("%-25s%-20d%-15d        \n",name3, code3, price3);
          System.out.println("-------------------------------------------------------");  
          int Total =price1 + price2 + price3;
          System.out.println("                                         TOTAL PRICE= "+Total);
          }else if(choice==3){
          System.out.println("*************************************************************");
          System.out.println("                   Employees Detail                          ");
          System.out.println("*************************************************************");
          System.out.println("_____________________________________________________________");
          System.out.println("                   Employee 01 Detail                        ");
          System.out.println("_____________________________________________________________");
          System.out.print("Enter Employee ID: ");
          int id1=abc.nextInt();
          abc.nextLine();
          System.out.print("Enter Employee Name: ");
          String employee1=abc.nextLine();
          System.out.print("Enter Employee Address: ");
          String address1=abc.nextLine();
          System.out.print("Working Hours per day: ");
          double working1=abc.nextDouble();
          abc.nextLine();
          System.out.print("Salary per Hour: ");
          double perhour1=abc.nextDouble();
          abc.nextLine();
          double salaryperday1=working1*perhour1;
          System.out.print("Salary per day: "+salaryperday1);
          double salarypermonth1=salaryperday1*30;
          System.out.println("Salary per month: "+salarypermonth1);
          System.out.println("_____________________________________________________________");
          System.out.println("                      Employee 02 Detail                     ");
          System.out.println("_____________________________________________________________");
          System.out.print("Enter Employee ID: ");
          int id2=abc.nextInt();
          abc.nextLine();
          System.out.print("Enter Employee Name: ");
          String employee2=abc.nextLine();
          System.out.print("Enter Employee Address: ");
          String address2=abc.nextLine();
          System.out.print("Working Hours per day: ");
          double working2=abc.nextDouble();
          abc.nextLine();
          System.out.print("Salary per Hour: ");
          double perhour2=abc.nextDouble();
          abc.nextLine();
          double salaryperday2=working2*perhour2;
          System.out.println("Salary per day: "+salaryperday2); 
          double salarypermonth2=salaryperday2*30;
          System.out.println("Salary per month: "+salarypermonth2);
          System.out.println("____________________________________________________________");
          System.out.println("                      Employee 03 Detail                     ");
          System.out.println("_____________________________________________________________");
          System.out.print("Enter Employee ID: ");
          int id3=abc.nextInt();
          abc.nextLine();
          System.out.print("Enter Employee Name: ");
          String employee3=abc.nextLine();
          System.out.print("Enter Employee Address: ");
          String address3=abc.nextLine();
          System.out.print("Working Hours per day: ");
          double working3=abc.nextDouble();
          abc.nextLine();
          System.out.print("Salary per Hour: ");
          double perhour3=abc.nextDouble();
          abc.nextLine();
          double salaryperday3=working3*perhour3;
          System.out.println("Salary per day: "+salaryperday3);
          double salarypermonth3=salaryperday3*30;
          System.out.println("Salary per month: "+salarypermonth3);
          System.out.println("__________________________________________________________________________________________________________________");
          System.out.println("Employee ID        Name             Address             Working Hours/Day        Salary/Day         Salary/Month  ");
          System.out.println("__________________________________________________________________________________________________________________");
          System.out.printf("%-20d%-20s%-20s%-20f%-20f%-20f \n",id1, employee1, address1, working1,salaryperday1,salarypermonth1);
          System.out.printf("%-20d%-20s%-20s%-20f%-20f%-20f\n",id2, employee2, address2, working2,salaryperday2,salarypermonth2);
          System.out.printf("%-20d%-20s%-20s%-20f%-20f%-20f\n",id3, employee3, address3, working3,salaryperday3,salarypermonth3); 
          }else if(choice==4){
          System.out.println("Thanks");
          }
          
        }
      }
      else if(pass!=password){
         System.out.println("Invalid password");
      
      }

  }    
}





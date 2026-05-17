import java.util.*;

public class project{  
    public static double Total(double price){
      double total=0;
      total=total+price;
          return total;    
    }  
    public static float salaryperday(float workingperhour,float salaryperhour){
        float salaryperday=workingperhour*salaryperhour;
        return salaryperday;
    }
    public static float salarypermonth(float salaryperday) {
      float salarypermonth=salaryperday*30;
      return salarypermonth;
    }

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
        char ans;
        do{
          System.out.println("Welcome to Al Shifa Pharmacy"); 
          System.out.println("________________________________");
          System.out.println("Menue");
          System.out.println("1.Patient Detail");
          System.out.println("2.Medicines Detail and Bill");
          System.out.println("3.Employees Detail");
          System.out.println("________________________________");
          System.out.print("Enter your choice:");
          choice=abc.nextInt();
          abc.nextLine();
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
          System.out.println("*************************************************************");
          System.out.println("                   Medicines Detail                          ");
          System.out.println("*************************************************************");
          String[] names=new String[3];
          long[] codes=new long[3];
          double[] prices=new double[3];
          double total=0;
          for (int i=0;i<names.length;i++){
            System.out.print("Enter Medicine "+(i+1)+" name: ");
            names[i]=abc.nextLine();
            System.out.print("Enter Medicine "+(i+1)+" code: ");
            codes[i]=abc.nextLong();
            abc.nextLine();
             System.out.print("Enter Medicine "+(i+1)+" price: ");
             prices[i]=abc.nextDouble();
             abc.nextLine();
             System.out.println("        <--->   ");
          }
             System.out.println("_______________________________________________________");
             System.out.println("Medicine                 Code                Price      ");
             System.out.println("_______________________________________________________");
          for(int i=0;i<names.length;i++){
             System.out.printf("%-25s%-20d%-15.2f%n",names[i], codes[i], prices[i]);
          }
             System.out.println("-------------------------------------------------------");
             double bill=0; 
            for(int i=0;i<names.length;i++){
              bill+=Total(prices[i]);
            }
            System.out.println("                                     Total Bill:"+bill);
          }else if(choice==3){
          System.out.println("*************************************************************");
          System.out.println("                   Employees Detail                          ");
          System.out.println("*************************************************************");
          float salarypermonth=0;
          float salPerDay=0;
          int[] id_=new int[3];
          String[] employees=new String[3];
          String[] address=new String[3];
          float[] workingHours=new float[3];
          float salaryPerHour[]=new float[3];
          for (int x=0;x<employees.length;x++){
            System.out.print("Enter Employee "+(x+1)+" ID: ");
            id_[x]=abc.nextInt();
            abc.nextLine();
            System.out.print("Enter Employee "+(x+1)+" name: ");
            employees[x]=abc.nextLine();
            System.out.print("Enter Employee "+(x+1)+" address: ");
            address[x]=abc.nextLine();
            System.out.print("Enter Employee "+(x+1)+" Working Hours: ");
            workingHours[x]=abc.nextFloat();
            System.out.print("Enter Employee "+(x+1)+" Salary per hour: ");
            salaryPerHour[x]=abc.nextFloat();
            salPerDay=salaryperday(workingHours[x],salaryPerHour[x]);
            System.out.println("Salary per day: "+salPerDay); 
            salarypermonth=salarypermonth(salPerDay);
            System.out.println("Salary per month: "+salarypermonth);
            System.out.println("        <--->   ");
          }
          System.out.println("__________________________________________________________________________________________________________________");
          System.out.println("Employee ID         Name              Address            Working Hours/Day        Salary/Day         Salary/Month ");
          System.out.println("__________________________________________________________________________________________________________________");
          for (int x=0;x<employees.length;x++){
          System.out.printf("%-20d%-20s%-20s%-20.2f%-22.2f%-20.2f%n",id_[x], employees[x], address[x], workingHours[x],salPerDay,salarypermonth); 
          }
          }
          System.out.println("If you wanna see the menu again press y");
          ans=abc.next().charAt(0);
        } while(ans=='y');
        
      }
      else if(pass!=password){
         System.out.println("Invalid password");
      
      }

  }    
}
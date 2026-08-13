import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
      try{
        File myFile=new File("myFile.txt");
        myFile.createNewFile();
        FileWriter writer=new FileWriter(myFile);      
        Scanner abc = new Scanner(System.in);
        System.out.println("                                            .....Al Shifa Pharmacy....                                ");
        writer.write("                                            .....Al Shifa Pharmacy....                                \n");
        int pass=12345;
        int choice=0;
        System.out.println("__________________________________________");
        writer.write("__________________________________________\n");
        System.out.println("Login");
        writer.write("Login\n");
        System.out.print("User ID: ");
        int id=abc.nextInt();
        writer.write("User ID: "+id+"\n");
        System.out.print("Password: ");
        int password=abc.nextInt();
        writer.write("Password: "+password+"\n");
        System.out.println("__________________________________________");
        writer.write("__________________________________________\n");  
       if(pass==password){
        char ans;
        int med=0;
        int emp=0;
        System.out.print("How many medicines data you wanna add: ");
        med=abc.nextInt();
        abc.nextLine();
        writer.write("How many medicines data you wanna add: "+med+"\n");
        String[] names=new String[med];
        long[] codes=new long[med];
        double[] prices=new double[med];
        System.out.print("How many employees data you wanna add: ");
        emp=abc.nextInt();
        abc.nextLine();
        writer.write("How many employees data you wanna add: "+emp+"\n");
        System.out.println("__________________________________________");
        writer.write("__________________________________________\n");
        int[] id_=new int[emp];
        String[] employees=new String[emp];
        String[] address=new String[emp];
        float[] workingHours=new float[emp];
        float[] salaryPerHour=new float[emp];
        float[] salaryperday=new float[emp];
        float[] salarypermonth=new float[emp];
        double total=0;
        do{
          System.out.println("Welcome to Al Shifa Pharmacy"); 
          writer.write("Welcome to Al Shifa Pharmacy\n"); 
          System.out.println("__________________________________________");
          writer.write("__________________________________________\n");
          System.out.println("Menue");
          writer.write("Menue\n");
          System.out.println("1.Patient Detail");
          writer.write("1.Patient Detail\n");
          System.out.println("2.Medicines Detail and Bill");
          writer.write("2.Medicines Detail and Bill\n");
          System.out.println("3.Employees Detail");
          writer.write("3.Employees Detail\n");
          System.out.println("4.Search Medicine");
          writer.write("4.Search Medicine\n");
          System.out.println("5.Search Employee");
          writer.write("5.Search Employee\n");
          System.out.println("6.Sort Medicine");
          writer.write("6.Sort Medicine\n");
          System.out.println("7.Update Medicine");
          writer.write("7.Update Medicine\n");
          System.out.println("8.Delete Medicine");
          writer.write("8.Delete Medicine\n");
          System.out.println("9.Display All Records");
          writer.write("9.Display All Records\n");
          System.out.println("10.Exit");
          writer.write("10.Exit\n");
          System.out.println("__________________________________________");
          writer.write("__________________________________________\n");
          System.out.print("Enter your choice: ");
          choice=abc.nextInt();
          abc.nextLine();
          writer.write("Enter your choice: "+choice+"\n");
          if(choice==1){
              System.out.print("Patient Account Number: ");
              int number1=abc.nextInt();
              abc.nextLine();
              writer.write("Patient Account Number: "+number1+"\n");
              System.out.print("Admission Date: ");
              String admission=abc.nextLine();
              writer.write("Admission Date: "+admission+"\n");
              System.out.print("Discharge Date: ");
              String discharge=abc.nextLine();
              writer.write("Discharge Date: "+discharge+"\n");
              System.out.print("Patient Name: ");
              String patientName=abc.nextLine();
              writer.write("Patient Name: "+patientName+"\n");
              System.out.print("Diagnosis: ");
              String diagnosis=abc.nextLine();
              writer.write("Diagnosis: "+diagnosis+"\n");
              System.out.println("__________________________________________");
              writer.write("__________________________________________\n");
              System.out.print("Bill Issue Date: ");
              String issueDate=abc.nextLine();
              writer.write("Bill Issue Date: "+issueDate+"\n");
              System.out.print("Bill Issue Day: ");
              String issueDay=abc.nextLine();
              writer.write("Bill Issue Day: "+issueDay+"\n");
          }else if(choice==2){
              System.out.println("******************************************");
              writer.write("******************************************\n");
              System.out.println("          Medicines Detail                ");
              writer.write("              Medicines Detail            \n");
              System.out.println("******************************************");
              writer.write("******************************************\n");
            for (int i=0;i<names.length;i++){
              System.out.print("Enter Medicine "+(i+1)+" name: ");
              names[i]=abc.nextLine();
              writer.write("Enter Medicine "+(i+1)+" name: "+names[i]+"\n");
              System.out.print("Enter Medicine "+(i+1)+" code: ");
              codes[i]=abc.nextLong();
              abc.nextLine();
              writer.write("Enter Medicine "+(i+1)+" code: "+codes[i]+"\n");
              System.out.print("Enter Medicine "+(i+1)+" price: ");
              prices[i]=abc.nextDouble();
              abc.nextLine();
              writer.write("Enter Medicine "+(i+1)+" price: "+prices[i]+"\n");
              System.out.println("        <--->   ");
              writer.write("        <--->   \n");
            }
              System.out.println("_______________________________________________________");
              writer.write("_______________________________________________________\n");
              System.out.println("Medicine                 Code                Price      ");
              writer.write("Medicine                 Code                Price      \n");
              System.out.println("_______________________________________________________");
              writer.write("_______________________________________________________\n");
            for(int i=0;i<names.length;i++){
              System.out.printf("%-25s%-20d%-15.2f%n",names[i], codes[i], prices[i]);
              writer.write(names[i]+"\t\t\t\t\t"+codes[i]+"\t\t\t\t\t"+prices[i]+"\n");
            }
              System.out.println("_______________________________________________________");
              writer.write("_______________________________________________________\n");
              double bill=0; 
            for(int i=0;i<names.length;i++){
              bill+=Total(prices[i]);
            }
              System.out.println("                                     Total Bill:"+bill);
              writer.write("                                     Total Bill:"+bill+"\n");
              System.out.println("        <--->   ");
              writer.write("        <--->   \n");
          }else if(choice==3){
              System.out.println("******************************************");
              writer.write("******************************************\n");
              System.out.println("             Employees Detail             ");
              writer.write("                 Employees Detail         \n");
              System.out.println("******************************************");
              writer.write("******************************************\n");  
            for (int x=0;x<employees.length;x++){
              System.out.print("Enter Employee "+(x+1)+" ID: ");
              id_[x]=abc.nextInt();
              abc.nextLine();
              writer.write("Enter Employee "+(x+1)+" ID: "+id_[x]+"\n");
              System.out.print("Enter Employee "+(x+1)+" name: ");
              employees[x]=abc.nextLine();
              writer.write("Enter Employee "+(x+1)+" name: "+employees[x]+"\n");
              System.out.print("Enter Employee "+(x+1)+" address: ");
              address[x]=abc.nextLine();
              writer.write("Enter Employee "+(x+1)+" address: "+address[x]+"\n");
              System.out.print("Enter Employee "+(x+1)+" Working Hours: ");
              workingHours[x]=abc.nextFloat();
              writer.write("Enter Employee "+(x+1)+" Working Hours: "+workingHours[x]+"\n");
              System.out.print("Enter Employee "+(x+1)+" Salary per hour: ");
              salaryPerHour[x]=abc.nextFloat();
              writer.write("Enter Employee "+(x+1)+" Salary per hour: "+salaryPerHour[x]+"\n");
              salaryperday[x]=salaryperday(workingHours[x],salaryPerHour[x]);
              System.out.println("Salary per day: "+salaryperday[x]);
              writer.write("Salary per day: "+salaryperday[x]+"\n"); 
              salarypermonth[x]=salarypermonth(salaryperday[x]);
              System.out.println("Salary per month: "+salarypermonth[x]);
              writer.write("Salary per month: "+salarypermonth[x]+"\n");
              System.out.println("        <--->   ");
              writer.write("        <--->   \n");
          }
              System.out.println("__________________________________________________________________________________________________________________");
              writer.write("__________________________________________________________________________________________________________________\n");
              System.out.println("Employee ID         Name              Address            Working Hours/Day        Salary/Day         Salary/Month ");
              writer.write("Employee ID         Name              Address            Working Hours/Day        Salary/Day         Salary/Month \n");
              System.out.println("__________________________________________________________________________________________________________________");
              writer.write("__________________________________________________________________________________________________________________\n");
          for (int x=0;x<employees.length;x++){
              System.out.printf("%-20d%-20s%-20s%-20.2f%-22.2f%-20.2f%n",id_[x], employees[x], address[x], workingHours[x],salaryperday[x],salarypermonth[x]); 
              writer.write(id_[x]+"\t\t\t\t\t"+employees[x]+"\t"+address[x]+"\t\t\t\t\t"+workingHours[x]+"\t\t\t\t\t"+salaryperday[x]+"\t\t\t\t\t"+salarypermonth[x]+"\n"); 
          }
          }else if(choice==4){
              System.out.println("==============================");
              writer.write("==============================\n");
              System.out.println("Enter Medicine name to search?");
              String target=abc.nextLine();
              writer.write("Enter Medicine name to search?\n"+target+"\n");
              boolean found=false;
          for(int i=0;i<names.length;i++){
            if(names[i].equalsIgnoreCase(target)){
              System.out.println("Found!");
              writer.write("Found!\n");
              System.out.println("Name: " + names[i]);
              writer.write("Name: " + names[i]+"\n");
              System.out.println("Code: " + codes[i]);
              writer.write("Code: " + codes[i]+"\n");
              System.out.println("Price: " + prices[i]);
              writer.write("Price: " + prices[i]+"\n");
              System.out.println("        <--->   ");
              writer.write("        <--->   \n");
              found = true;
              break;
            }
          }
          if(!found){
            System.out.println("Medicine name not found!");
            writer.write("Medicine name not found!");
            System.out.println("        <--->   ");
              writer.write("        <--->   ");
          } 
          }else if(choice==5){
              System.out.println("==============================");
              writer.write("==============================\n");
              System.out.println("Enter Employee name to search?");
              String empName=abc.nextLine();
              writer.write("Enter Employee name to search?\n"+empName+"\n");
              boolean found=false;
          for(int x=0;x<employees.length;x++){
            if(employees[x].equalsIgnoreCase(empName)){
              System.out.println("Found!");
              writer.write("Found!\n");
              System.out.println("Name: " + employees[x]);
              writer.write("Name: " + employees[x]+"\n");
              System.out.println("ID: " + id_[x]);
              writer.write("ID: " + id_[x]+"\n");
              System.out.println("Address: " + address[x]);
              writer.write("Address: " + address[x]+"\n");
              System.out.println("Working Hours: "+workingHours[x]);
              writer.write("Working Hours: "+workingHours[x]+"\n");
              System.out.println("Salary per day: "+salaryperday[x]);
              writer.write("Salary per day: "+salaryperday[x]+"\n");
              System.out.println("Salary per month: "+salarypermonth[x]);
              writer.write("Salary per month: "+salarypermonth[x]+"\n");
              System.out.println("        <--->   ");
              writer.write("        <--->   ");
              found = true;
              break;
            } 
          }
          if(!found){
              System.out.println("Employee not found");
              writer.write("Employee not found\n");
              System.out.println("        <--->   ");
              writer.write("        <--->   ");
            }
        }else if(choice==6){
          for (int i=0;i<med-1;i++) {
            for (int j=0;j<med-i-1;j++) {
              if (prices[j]>prices[j+1]) {
                double tempPrice=prices[j];
                prices[j]=prices[j+1];
                prices[j+1]=tempPrice;
                String tempName=names[j];
                names[j]=names[j+1];
                names[j+1]=tempName;
                long tempCode=codes[j];
                codes[j]=codes[j+1];
                codes[j+1]=tempCode;
              }
            }
          }
                System.out.println("===========================");
                writer.write("=============================\n");
                System.out.println("Sorted Medicines:");
                writer.write("Sorted Medicines:\n");
                System.out.println("_______________________________________________________");
                writer.write("_______________________________________________________\n");
                System.out.println("Medicine                 Code                Price      ");
                writer.write("Medicine                 Code                Price      \n");
                System.out.println("_______________________________________________________");
                writer.write("_______________________________________________________\n");
            for (int i = 0; i < med; i++) {
                System.out.printf("%-25s%-20d%-15.2f%n", names[i], codes[i], prices[i]);
                writer.write(names[i] + "\t\t\t\t\t" + codes[i] + "\t\t\t\t\t" + prices[i] + "\n");
            }
        }else if(choice==7){
          System.out.println("===================================");
              writer.write("===================================\n");
                System.out.print("Enter medicine name to update: ");
                String target = abc.nextLine();
                writer.write("Update Medicine: " + target + "\n");
                boolean found = false;
            for (int i = 0; i < med; i++) {
              if (names[i].equalsIgnoreCase(target)) {
                System.out.print("Enter new name: ");
                names[i] = abc.nextLine();          
                writer.write("Enter new name: "+names[i]+"\n");
                System.out.print("Enter new code: ");
                codes[i] = abc.nextLong();
                abc.nextLine();
                writer.write("Enter new code: "+codes[i]+"\n");
                System.out.print("Enter new price: ");
                prices[i] = abc.nextDouble();
                abc.nextLine();
                writer.write("Enter new price: "+prices[i]+"\n");
                System.out.println("Updated - Name: " + names[i] + " Code: " + codes[i] + " Price: " + prices[i]);
                writer.write("Updated - Name: " + names[i] + " Code: " + codes[i] + " Price: " + prices[i] + "\n");
                System.out.println("Record updated successfully!");
                writer.write("Record updated successfully!\n");
                System.out.println("        <--->   ");
                writer.write("        <--->   ");
                found = true;
                break;
              }
            }
              if (!found) {
                System.out.println("Medicine not found!");
                writer.write("Medicine not found!\n");
                System.out.println("        <--->   ");
                writer.write("        <--->   ");
              }
        }else if(choice==8){
                System.out.print("Enter medicine name to delete: ");
                String target = abc.nextLine();
                writer.write("Delete Medicine: " + target + "\n");
                boolean found = false;
              for (int i = 0; i < med; i++) {
                if (names[i].equalsIgnoreCase(target)) {
                  for (int j = i; j < med - 1; j++) {
                    names[j]  = names[j + 1];
                    codes[j]  = codes[j + 1];
                    prices[j] = prices[j + 1];
                  }
                med--;
                System.out.println("Record deleted successfully!");
                writer.write("Medicine deleted. Remaining count: " + med + "\n");
                System.out.println("        <--->   ");
                writer.write("        <--->   ");
                found=true;
                break;
                }
              }
              if (!found) {
               System.out.println("Medicine not found!");
               writer.write("Medicine not found!\n");
               System.out.println("        <--->   ");
               writer.write("        <--->   ");
              }
        }else if(choice==9){
              System.out.println("                 === All Medicines ===                 ");
              writer.write("                     === All Medicines ===\n               ");
              System.out.println("_______________________________________________________");
              writer.write("_______________________________________________________\n");
              System.out.println("Medicine                 Code                Price      ");
              writer.write("Medicine                 Code                Price      \n");
              System.out.println("_______________________________________________________");
              writer.write("_______________________________________________________\n");
            for (int i = 0; i < med; i++) { 
              System.out.printf("%-25s%-20d%-15.2f%n", names[i], codes[i], prices[i]);
              writer.write(names[i] + "\t" + codes[i] + "\t" + prices[i] + "\n");
              System.out.println("        <--->   ");
              writer.write("        <--->   ");
              }
              System.out.println("                              === All Employees ===                                          ");
              writer.write("                                  === All Employees ===                                      \n");
              System.out.println("_____________________________________________________________________________________________");
              writer.write("_____________________________________________________________________________________________\n");
              System.out.println("Employee ID    Name          Address        Hours/Day    Salary/Day    Salary/Month");
              writer.write("Employee ID    Name          Address        Hours/Day    Salary/Day    Salary/Month\n");
              System.out.println("_____________________________________________________________________________________________");
              writer.write("_____________________________________________________________________________________________\n");
            for (int x = 0; x < emp; x++) {
              System.out.printf("%-15d%-15s%-15s%-13.2f%-14.2f%-15.2f%n",id_[x], employees[x], address[x], workingHours[x], salaryperday[x], salarypermonth[x]);
              writer.write(id_[x] + "\t" + employees[x] + "\t" + address[x] + "\t"+ workingHours[x] + "\t" + salaryperday[x]+ "\t" + salarypermonth[x]+ "\n");  
              System.out.println("        <--->   ");
              writer.write("        <--->   ");                           
            }
          }else if(choice==10){
            System.out.println("Exiting...");
            writer.write("Exiting...\n");
            break;
          }else{
            System.out.println("Invalid choice! Try choosing between 1 to 10.");
            writer.write("Invalid choice! Try choosing between 1 to 10.\n");
            System.out.println("        <--->   ");
              writer.write("        <--->   ");
          }
          System.out.println("If you wanna see the menu again press y");
          ans=abc.next().charAt(0);
        } while(ans=='y');
        
      }
      else if(pass!=password){
        System.out.println("Invalid password");
        writer.write("Invalid password");
      }
          writer.flush();
          writer.close();
    } catch(IOException e){
          System.out.println("Error occured while creating a file!");
          e.printStackTrace();
     } catch(InputMismatchException e){ 
          System.out.println("Invalid input! Please enter the correct data type.");
    }
  }
}  

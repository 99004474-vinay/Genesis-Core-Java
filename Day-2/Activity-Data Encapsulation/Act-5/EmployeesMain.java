
import java.io.*;

class EmployeesMain
{
   public static void main(String[] args) throws Exception
   {
      Employee em=new Employee();
      String emName;
      String emAddress;
      String emMobile;
      int ch;
      BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
      emName=sc.readLine();
      emAddress=sc.readLine();
      emMobile=sc.readLine();
      
      em.setName(emName);
      em.setAddress(emAddress);
      em.setMobile(emMobile);
      System.out.println("Employee Details:");
      System.out.println("Name:"+em.getName());
      System.out.println("Address:"+em.getAddress());
      System.out.println("Mobile:"+em.getMobile());
      System.out.println("Verify and update Details");
      
      do
      {
         System.out.println("MENU");
         System.out.println("1. Update Employee name\n2. Update Employee Address\n3. Update Employee mobile\n4. All information correct/Exit");
         
         ch=Integer.parseInt(sc.readLine());
         switch(ch)
         {
            case 1: System.out.println("Current Employee Name:"+em.getName());
                    System.out.println("Enter Name:");
                    String newName;
                    newName=sc.readLine();
                    em.setName(newName);
                    break;
            case 2: System.out.println("Current Employee Address:"+em.getAddress());
                    System.out.println("Enter Address:");
                    String newAddress=sc.readLine();
                    em.setAddress(newAddress);
                    break;
            case 3: System.out.println("Current Employee Mobile:"+em.getMobile());
                    System.out.println("Enter Mobile:");
                    String newMobile=sc.readLine();
                    em.setMobile(newMobile);
                    break;
            case 4: System.out.println("Details are:");
                     System.out.println("Name:"+em.getName());
                     System.out.println("Address:"+em.getAddress());
                     System.out.println("Mobile:"+em.getMobile());
         }
      }while(ch!=5);
   }
}

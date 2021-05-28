import java.util.*;
class EmployeeMain
{
  public static void main(String[] args){
   Employee em=new Employee();
   
   String emName;
   String emAddress;
   String emMobile;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Name:");
   emName=sc.nextLine();
   System.out.println("Enter Address:");
   emAddress=sc.nextLine();
   System.out.println("Enter Mobile:");
   emMobile=sc.nextLine();
   System.out.println("Employee Details");

   em.setName(emName);
   System.out.println(em.getName());
   em.setAddress(emAddress);
   System.out.println(em.getAddress());
   em.setMobile(emMobile);
   System.out.println(em.getMobile());
 }
}

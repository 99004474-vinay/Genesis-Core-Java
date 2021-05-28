import java.util.*;
class CustomerMain
{
  public static void main(String[] args){
   Customer cus=new Customer();
   String line;
 
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Details:");
   line=sc.nextLine();
   String[] cust=line.split(",");
   System.out.println("Customer Details");

   cus.setName(cust[0]);
   System.out.println("Name:"+cus.getName());
   cus.setAddress(cust[1]);
   System.out.println("Address:"+cus.getAddress());
   cus.setMobile(cust[2]);
   System.out.println("Mobile:"+cus.getMobile());
 }
}

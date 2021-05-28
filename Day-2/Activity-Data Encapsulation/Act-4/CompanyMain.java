import java.util.*;
class CompanyMain
{
   public static void main(String[] args)
   {
     Company cm=new Company();
     Scanner sc=new Scanner(System.in);
     String line;
     String[] employees;
     String comName;
     String teamlead;
     System.out.println("Enter Company Name:");
     comName=sc.nextLine();
     System.out.println("Enter Employees:");
     line=sc.nextLine();
     employees=line.split(",");
     System.out.println("Enter Team Lead:");
     teamlead=sc.nextLine();

     cm.setName(comName);
     //System.out.println("Company Name:"+cm.getName());
     cm.setEmployees(employees);
     //System.out.println("Employees:"+String.join(",",cm.getEmployees()));
     cm.setTeamLead(teamlead);
     int f=0;
     
     for(int i=0;i<employees.length;i++)
     {
        if(employees[i].equals(cm.getTeamLead()))
        {
            System.out.println("Company Name:"+cm.getName());
            System.out.println("Employees:"+String.join(",",cm.getEmployees()));
           System.out.println("Team Lead:"+cm.getTeamLead());
           f=1;
           break;
        }
     }   
        if(f==0)
        {
           System.out.println("Invalid Input");
        }
        
}
}

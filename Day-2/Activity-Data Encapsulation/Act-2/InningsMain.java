import java.util.*;
class InningsMain
{
   public static void main(String[] args)
   {
     Innings in=new Innings();
     Scanner sc=new Scanner(System.in);
     String teamName;
     String innName;
     int innruns;
     System.out.println("Enter Team Name:");
     teamName=sc.nextLine();
     System.out.println("Enter Session Name:");
     innName=sc.nextLine();
     System.out.println("Enter Runs Scored:");
     innruns=sc.nextInt();
     
     in.setTeamName(teamName);
     in.setInningsName(innName);
     in.setRuns(innruns);
     
     in.displayInningsDetials();
   }
}

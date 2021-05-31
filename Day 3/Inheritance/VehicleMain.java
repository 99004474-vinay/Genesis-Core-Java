
import java.io.*;
public class VehicleMain {

	/**
	 * @param args
	 * @throws IOException
	 */
	/**
	 * @param args
	 * @throws IOException
	 */
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int ch;
		do
		{
			System.out.println("1.Four Wheeler\n2.Two Wheeler\n");

			System.out.println("Enter Vehicle type:");
			ch=Integer.parseInt(br.readLine());
			switch(ch)
			{
			case 1: System.out.println("Enter Vechicle Make:");
					String make1=br.readLine();
			
					System.out.println("Enter Vechicle Number:");
					String vno1=br.readLine();
					System.out.println("Fuel Type:");
					String FT1;
					int fno1;
					System.out.println("\n1.Petrol\n2.Diesel");
					fno1=Integer.parseInt(br.readLine());
					if(fno1==1)
						FT1="Petrol";
					else
						FT1="Diesel";
					System.out.println("Enter Fuel Capacity:");
					int fc1=Integer.parseInt(br.readLine());
					System.out.println("Enter CC:");
					int cc1=Integer.parseInt(br.readLine());
					System.out.println("Enter Audio System:");
					String ad=br.readLine();
					System.out.println("Enter Number of Doors:");
					int ndr=Integer.parseInt(br.readLine());
					
					FourWheeler fw=new FourWheeler(make1,vno1,FT1,fc1,cc1,ad,ndr);
					fw.displayMake();
					System.out.println("****Basic Information****");
					fw.displayBasicInfo();
					System.out.println("***Detailed Information***");
					fw.displayDetailInfo();
					break;
			case 2: System.out.println("Enter Vechicle Make:");
					String make=br.readLine();
					
					System.out.println("Enter Vechicle Number:");
					String vno=br.readLine();
					System.out.println("enter Fuel Type:");
					String FT;
					int fno;
					System.out.println("\n1.Petrol\n2.Diesel");
					fno=Integer.parseInt(br.readLine());
					if(fno==1)
						FT="Petrol";
					else
						FT="Diesel";
					System.out.println("Enter Fuel Capacity:");
					int fc=Integer.parseInt(br.readLine());
					System.out.println("Enter CC:");
					int cc=Integer.parseInt(br.readLine());
					System.out.println("KickStart Available(yes/no):");
					String kick=br.readLine();
					TwoWheeler tw=new TwoWheeler(make,vno,FT,fc,cc,kick);
					tw.displayMake();
					System.out.println("****Basic Information****");
					tw.displayBasicInfo();
					System.out.println("***Detailed Information***");
					tw.displayDetaiInfo();
					break;
			}
		}while(ch!=3);
		
	}

}

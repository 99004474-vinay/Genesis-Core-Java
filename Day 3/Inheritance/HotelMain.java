import java.io.*;
public class HotelMain {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.Delux Room\n2.Delux AC Room\n3.Suit Room");
		System.out.println("Select Room Type:");
		int ch=Integer.parseInt(br.readLine());
		switch(ch)
		{
		case 1: System.out.println("Hotel Name:");
				String hname=br.readLine();
				System.out.println("Room Square Feet Area:");
				int sqft=Integer.parseInt(br.readLine());
				System.out.println("Room has TV (yes/no):");
				boolean tv=false;
				String TV=br.readLine();
				if(TV.equals("yes"))
				{
					tv=true;
				}
				System.out.println("Room has Wifi (yes/no:)");
				boolean wifi=false;
				String WIFI=br.readLine();
				if(WIFI.equals("yes"))
				{
					wifi=true;
				}
				DeluxRoom dr=new DeluxRoom(hname,sqft,tv,wifi);
				System.out.println("Room Tariff per day is:"+dr.calculateTarrif());
				break;
		case 2: System.out.println("Hotel Name:");
				String hname1=br.readLine();
				System.out.println("Room Square Feet Area:");
				int sqft1=Integer.parseInt(br.readLine());
				System.out.println("Room has TV (yes/no):");
				boolean tv1=false;
				String TV1=br.readLine();
				if(TV1.equals("yes"))
				{
					tv1=true;
				}
				System.out.println("Room has Wifi (yes/no:)");
				boolean wifi1=false;
				String WIFI1=br.readLine();
				if(WIFI1.equals("yes"))
				{
					wifi1=true;
				}
				DeluxACRoom da=new DeluxACRoom(hname1,sqft1,tv1,wifi1);
				System.out.println("Room Tariff per day is:"+da.calculateTarrif());
				break;
		case 3: System.out.println("Hotel Name:");
				String hname2=br.readLine();
				System.out.println("Room Square Feet Area:");
				int sqft2=Integer.parseInt(br.readLine());
				System.out.println("Room has TV (yes/no):");
				boolean tv2=false;
				String TV2=br.readLine();
				if(TV2.equals("yes"))
				{
					tv2=true;
				}
				System.out.println("Room has Wifi (yes/no:)");
				boolean wifi2=false;
				String WIFI2=br.readLine();
				if(WIFI2.equals("yes"))
				{
					wifi2=true;
				}
				SuitRoom sr=new SuitRoom(hname2,sqft2,tv2,wifi2);
				System.out.println("Room Tariff per day is:"+sr.calculateTarrif());
				break;
		}
	}

}

package hospital;

import java.util.*;

public class Hospital {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Department d = new Department();
		Doctors doc = new Doctors();
		while(true) {
			int f=0;
			System.out.println("Are you:\n1.Patient\n2.Doctor\nPress any key to exit");
			int c = sc.nextInt();
			sc.nextLine();
			switch(c) {
				case 1:
					System.out.println("Enter your name:");
					String name = sc.nextLine();
					
					System.out.println("Enter your age:");
					int age = sc.nextInt();
					
					String sex="";
					System.out.println("Press 1 - Male\nPress 2 - Female\nPress 3 - Other");
					int c1 = sc.nextInt();
					if(c1==1)
						sex="Male";
					else if(c1==2)
						sex="Female";
					else if(c1==3)
						sex="Other";
					
					String department="";
					int c2;

					
					Iterator<String> itr = d.dep.iterator();
					int i=1;
					while(itr.hasNext()) {
						System.out.println("Press "+i+" : "+itr.next());
						i++;
					}
					c2=sc.nextInt();
			        department = d.dep.get(c2-1);
			        
			        Patients p = new Patients(name,sex,age,department);
			        
			        System.out.println("You are assigned to:"+p.dispDoc());
					
			        
			        doc.add(name,age,sex,p.dispDoc());
			        
					break;
				case 2:
					System.out.println("Enter your name:");
					String dName = sc.nextLine();
					doc.display(dName);
					break;
				default:
					f=1;
					break;
			}
			if(f==1)
				break;
		}
		sc.close();
	}
}

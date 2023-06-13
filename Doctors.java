package hospital;

import java.util.*;
public class Doctors{
	
	ArrayList<ArrayList> pet = new ArrayList<>();
	HashMap<String,ArrayList<ArrayList>> dPet = new HashMap<>();
	
	public Doctors(String name,String sex,int age,String department){
		super(name,sex,age,department);
	}
	public Doctors(){
		dPet.put("Dr. Ashish Sabharwal", new ArrayList<>());
		dPet.put("Dr. Sanjay Sachdeva", new ArrayList<>());
		dPet.put("Dr. Surbhi Anand", new ArrayList<>());
		dPet.put("Dr. Gagan Gautam", new ArrayList<>());
		dPet.put("Dr. Sandeep Batra", new ArrayList<>());
		dPet.put("Dr. Aditya Gupta", new ArrayList<>());
		dPet.put("Dr. Bipin S Walia", new ArrayList<>());
		dPet.put("Dr. Amandeep Singh Dhillon", new ArrayList<>());
		dPet.put("Dr. SKS Marya", new ArrayList<>());
		dPet.put("Dr. Gaurav Kharya", new ArrayList<>());
	}
	
	
	void add(String name, int age,String sex,String docName) {
		ArrayList<Object> a = new ArrayList<>();
		a.add(name);
		a.add(age);
		a.add(sex);
		
		dPet.get(docName).add((ArrayList) a.clone());
	}
	
	void display(String n) {
		System.out.println("Welcome "+n+"\nYour patients are:");
		System.out.println(dPet.get(n));
	}
}

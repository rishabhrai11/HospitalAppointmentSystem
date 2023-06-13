package hospital;

import java.util.*;
public class Department {
	HashMap<String,String> depDoc = new HashMap<>();
	ArrayList<String> dep = new ArrayList<>();
	public Department(){
		dep.add("ENT");
		dep.add("ORTHOLOGY");
		dep.add("CARDIOLOGY");
		dep.add("PATHOLOGY");
		dep.add("DERMATOLOGY");
		dep.add("PHYSIOTHERAOY");
		dep.add("SEXUAL HEALTH");
		dep.add("GYNAECOLOGIST");
		dep.add("PEDIATRICIAN");
		dep.add("PSYCHOLOGY");
		
		depDoc.put(dep.get(0), "Dr. Ashish Sabharwal");
		depDoc.put(dep.get(1), "Dr. Sanjay Sachdeva");
		depDoc.put(dep.get(2), "Dr. Surbhi Anand");
		depDoc.put(dep.get(3), "Dr. Gagan Gautam");
		depDoc.put(dep.get(4), "Dr. Sandeep Batra");
		depDoc.put(dep.get(5), "Dr. Aditya Gupta");
		depDoc.put(dep.get(6), "Dr. Bipin S Walia");
		depDoc.put(dep.get(7), "Dr. Amandeep Singh Dhillon");
		depDoc.put(dep.get(8), "Dr. SKS Marya");
		depDoc.put(dep.get(9), "Dr. Gaurav Kharya");
	}
}

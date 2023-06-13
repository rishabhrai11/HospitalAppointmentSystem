package hospital;

public class Patients extends Department{
	String name;
	String sex;
	int age;
	String department;
	 
	public Patients(String name,String sex,int age,String department){
		super();
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.department=department;
	}
	
	String dispDoc() {
		return depDoc.get(department);
	}
	
	
	
	
	
}

package jacksonapi.client;

import jacksonapi.employee;
import jacksonapi.util.jasoutil;

public class test {
	/*public void name()
	{
		System.out.print("success");
	}*/

	public static void main(String[] args) {
		
		employee emp=new employee();
		//emp.name();
		//System.out.println("success");
		emp.setUser_id(1);
		emp.setUser_firstname("aakash");
		emp.setUser_lastname("mittal");
		emp.setUser_age(20);
		emp.setUser_email("aakash.mittal@gmail.com");
		emp.setUser_country("India");
		String jsonemp=jasoutil.convertJavaToJson(emp);
		System.out.println(jsonemp);
		
	}

}

package Return_Keyword.com;

public class Return_Keyword {
	int age = 25;
	
	public int display() {
		System.out.println("Return keyword used to return the value of variables when their method invoked");
		return age;
	}

	public static void main(String[] args) { 
		Return_Keyword RK = new Return_Keyword();
		System.out.println(RK.display());	
	}	
}

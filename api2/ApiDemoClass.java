package api2;

public class ApiDemoClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String st="Good Morning";
	try {
		for(int i=0;i<st.length()+1;i++) {
//			Thread.sleep(500);
			System.out.print(st.charAt(i));
		}
	}catch(StringIndexOutOfBoundsException e) {
		System.err.println(" sth wrong");
	}
	}

}

package api;


class AA{
	int a;
	int b;
	public AA(int a,int b) {
		this.a =a;
		this.b=b;
	}
	
	
	@Override
	public boolean equals(Object obj2) {
		AA obj=(AA)obj2;
		return (obj.a==this.a && obj.b==this.b);
	}
	
	@Override
	public String toString() {
		return "AA object created";
	}
}

public class ObjectTest {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA obj1=new AA(1, 2);
		AA obj2=new AA(1, 2);
		System.out.println(obj1.equals(obj2));
	}

}

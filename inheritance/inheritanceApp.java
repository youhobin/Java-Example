class Cal{
	int v1, v2;
	Cal(int v1, int v2){
		this.v1 = v1; this.v2 = v2;
	}
	public int sum() {
		return this.v1+v2;
	}
}
class Cal3 extends Cal{

	Cal3(int v1, int v2) {
		super(v1, v2);
		System.out.println("Cal3");
	}
	public int minus() {
		return this.v1-v2;
	}
}
public class inheritanceApp {
	public static void main(String[] args) {
		Cal c = new Cal(2,1);
		Cal3 c3 = new Cal3(4,2);
		System.out.println(c.sum());
		System.out.println(c3.sum());
		System.out.println(c3.minus());
	}

}

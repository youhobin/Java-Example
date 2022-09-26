class Foo{
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";
	
	public static void classMethod() {
		System.out.println(classVar); // Ok
//		instanceVar Error
	}
	public void instanceMethod() {
		System.out.println(classVar); 
		System.out.println(instanceVar);
	}
}
public class staticApp {

	public static void main(String[] args) {
		System.out.println(Foo.classVar);
//		Foo.instanceVar error
		Foo.classMethod(); // Ok 
//		Foo.instanceMethod() Error
		
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		System.out.println(f1.classVar);
		System.out.println(f1.instanceVar);
		
	}

}

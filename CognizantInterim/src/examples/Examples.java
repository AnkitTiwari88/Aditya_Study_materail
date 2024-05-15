package examples;

public class Examples {
	
	public static void run() {
		System.out.println("Hello World");
	}

	public static void main(String[] args) {
		Examples.run();
		NewFile.fun();
		NewFile a = new NewFile(6);
		System.out.println(a.getInt());
	}

}

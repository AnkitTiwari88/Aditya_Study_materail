package examples;

public class Shapes {
	
	int l ;
	int w;
	
	public Shapes(int l , int w){
		this.l= l;
		this.w=w;
	}
	
	public void area() {
		System.out.println("Area in shapes is:"+ l*w);
	}

}

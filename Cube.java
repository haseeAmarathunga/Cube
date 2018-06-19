//developed by Hasitha AMarathunga
public class Cube
{
	double area;
	int leng;
	double volume;
	Cube(int length){
		leng=length;
}
	public void getArea(){
		area=6*leng*leng;
		System.out.println("Area : "+area);
}
	public void getVolume(){
		volume=Math.pow(leng,3);
		System.out.println("Volume : "+volume);
}
	public void getLength(){
		System.out.println("Length : "+leng);
	}
	
	public static void main(String args[]){
		Cube c=new Cube(10);
		c.getArea();//get area from Cube function
		c.getVolume(); //get Volue from cube function
}
}

public class Cube
{
	double area;
	int len;
	double volume;
	Cube(int length){
		len=length;
}
	public void getArea(){
		area=6*len*len;
		System.out.println("Area : "+area);
}
	public void getVolume(){
		volume=Math.pow(len,3);
		System.out.println("Volume : "+volume);
}
	public void getLength(){
		System.out.println("Length : "+len);
	}
	
	public static void main(String args[]){
		Cube c=new Cube(10);
		c.getArea();//get area from Cube function
		c.getVolume(); //get Volue from cube function
}

}

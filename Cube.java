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
	
	public static void main(String[] args){
		Cube c=new Cube(8);
		c.getArea();
		c.getVolume();
}

}

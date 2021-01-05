public class Test01{
	public static void main(String[] args){
		Car c =new Car(new YMH());
		c.carStar();
		Car e =new Car(new HONDA());
		e.carStar();
		
		//因此当厂家都按照此接口生产发动机的时候，汽车厂商便可以随意更换发动机
	}
}
package day22_Threadd.demo3;

public class MyDaemon extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(getName()+"  "+i);
		}
	}
}

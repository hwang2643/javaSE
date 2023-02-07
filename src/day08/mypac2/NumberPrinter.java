package day08.mypac2;

public class NumberPrinter {
	
	public void printNumber() throws InterruptedException {
		for(int i = 0; i<10; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}

}

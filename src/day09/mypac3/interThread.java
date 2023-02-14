package day09.mypac3;

public class interThread extends Object implements Runnable {

	@Override
	public void run() {
		System.out.println("InterThread가 시작되었습니다.");
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

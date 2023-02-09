package day09.mypac2;

public class Brother extends Thread {
	public wallet wallet;
	public int money;
	 public Brother(wallet wallet) {
		 this.wallet = wallet;
	 }
	 public void run() {
		 while(true) {
			 // 지갑에서 돈을 인출해서 저장한다.
			 int returnedMoney = wallet.getMoney();
			 if(returnedMoney == 0) // 지갑 잔고가 0이면
				 break;
			 
			 money = money + returnedMoney;
			 
		 }
		 
		 System.out.println("Brother 총 재산 : " + money);
	 }

}

package Week4;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount acc1=new CheckingAccount();
		acc1.balance=499.99;
		acc1.name="Han";
		
		acc1.withdraw(100);
		acc1.interestRate=0.5;
		acc1.balance+=acc1.calcinterest();
		System.out.println(acc1.balance);
		
		Bond myBond=new Bond();
		myBond.name="Lonfg-Term Bond";
		myBond.balance=1000.00;
		myBond.setTermandRate(24);
		
		System.out.println("Bond Name: "+myBond.name);
		System.out.println("Initital Balance: $"+myBond.balance);
		System.out.println("Term: "+myBond.term+" months");
		System.out.println("Interest Rate: "+myBond.rate*100+"%");
		
		//Test earning for a few months
		for(int i=0;i<=24;i++) {
			System.out.println("\nEarning interest for month "+(i+1));
			myBond.earnInterest();
		}
	}

}

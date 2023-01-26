package day5;

public class TesterBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankA a=new BankA();
		BankB b=new BankB();
		BankC c=new BankC();
		
		System.out.println("Bank A: "+a.getBalance());
		System.out.println("Bank B: "+b.getBalance());
		System.out.println("Bank C: "+c.getBalance());
	}

}

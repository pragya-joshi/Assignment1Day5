package day5;

public class MyCalculator implements AdvancedArithmetic {
	public int divisorSum(int n) {
		int sum=0;
		
		for(int i=1;i<=n && n<1001;i++) {
			if(n%i==0)
				sum+=i;
		}
		return sum;
	}
}

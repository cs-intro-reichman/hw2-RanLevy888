// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	int n = Integer.parseInt(args[0]);
	String tp = args[1];
	 int seed = 1;
     int temp =0;
	 int counter =1;
	 if(tp.equals("v")){
	for(int i = 1 ; i <= n ; i++  ){
		seed =i;
		System.out.print(seed);
		while(temp!=1){
			if(seed%2==0){
				seed=seed/2;
			System.out.print(" " + seed);
			}
			else{
				seed =seed*3+1;
			System.out.print(" "+ seed);
			}
           counter++;
		   temp = seed;
		}
		System.out.println(" (" + counter + ")");
        counter = 1;
		   temp =0;
	}
	 }
System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");;
	}
}

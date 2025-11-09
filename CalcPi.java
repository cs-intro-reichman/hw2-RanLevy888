// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) {
		 int n = Integer.parseInt(args[0]) - 1;
		 double up =1;
		 double down =1;
		 double togther = up/down;
		 boolean check = false;
		 double sum = 1;
		 if(n!=0||n!=1){
		 for( int i = 1 ; i <= n ; i++){
		   down = down +2; 
         togther = up/down;
          if(check==false){
			sum = sum - togther;
			check = true;
		  }
          else{
			sum = sum + togther;
			check = false;
		  }
		 }
		}
		if(n==1){
			System.out.println("pi according to Java: " + Math.PI );
		 System.out.println("pi approximated:      " + 4.0);
		}
		 System.out.println("pi according to Java: " + Math.PI );
		 System.out.println("pi approximated:      " + sum*4);


	}
}

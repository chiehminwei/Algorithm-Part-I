
public class Exp {
	private double x;
	
	public Exp(double a){
		x=a;
	}
	public double getExp(){
		return x;
	}

	public double comp_Exp(double d){
			x=d;
		    double term = 1.0;
	        double sum = 0.0;
	        for (int n = 1; sum != sum + term; n++) {
	            sum += term;
	            term *= x/n;
	        }
	        
	        return sum;
	}
	
	public double comp_Exp_all(double d1){
	if(checkNegative()){
		return 1 / comp_Exp(-d1);}
	return comp_Exp(d1);
	}
	
	public boolean checkNegative(){
		boolean check_neg=false;
		 if (x < 0) {
			 check_neg = true;}
		 return check_neg;
		
	}
	
	
	
	
	public static double expc(double a){
		Exp e1=new Exp(a);
		return e1.comp_Exp_all(e1.getExp());
				
		
	}

	public static void main(String[] args) {
		double x = -5;
		System.out.println(expc(x));
        System.out.println(Math.exp(x));
	}

}

//Real time example

class Program10{
	public static void main(String[] args){
		float salary=50000.00f;

		if(salary<=0.00f){
			System.out.println("Don't go outside.");
		}
		else if(salary>=10000.00f){
			System.out.println("Go outside, get decent meal.");
		}
		else if(salary>=25000.00f){
			System.out.println("Dinner in Hotel.");
		}
		else{
			System.out.println("Eat at mess");
		}
	}
}

class BasicForDemo5{
    public static void main(String[] args){
        //according to the number of month print the days in that month
		int m=10;
		if(m<13){
		if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
			System.out.println("there are 31 days");
		}else{
			if(m==4){
				System.out.println("number of days are 28/29");
			} else{
				System.out.println("number of days are 30");
			}
		}} else{
			System.out.println("Invalid number of month");
		}
    }
}
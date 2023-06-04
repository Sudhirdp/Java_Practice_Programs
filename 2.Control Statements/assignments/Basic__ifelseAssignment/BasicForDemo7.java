class BasicForDemo7{
    public static void main(String[] args){
        //Profit or loss. Take cost and selling price and find profit or loss
		int sp=1200;
		int cp=1000;
		if(sp-cp>0){
			System.out.println("got a profit of "+(sp-cp));
		} else{
			System.out.println("we got loss of "+(cp-sp));
		}
    }
}
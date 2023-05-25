//write a java program in which according to month no. print the no.of days in that month

public class program5 {
    public static void main(String[] args) {
        int month=15;
        if(month<0 || month>12)
        System.out.println("Invalid month");
        if(month==1)
        System.out.println("january has 31 days");
        if(month==2)
        System.out.println("february has 28 days");
        if(month==3)
        System.out.println("march has 31 days");
        if(month==4)
        System.out.println("april has 30 days");
        if(month==5)
        System.out.println("may has 31 days");
        if(month==6)
        System.out.println("june has 30 days");
        if(month==7)
        System.out.println("july has 31 days");
        if(month==8)
        System.out.println("august has 31 days");
        if(month==9)
        System.out.println("september has 30 days");
        if(month==10)
        System.out.println("october has 31 days");
        if(month==11)
        System.out.println("november has 30 days");
        if(month==12)
        System.out.println("december has 31 days");
    
   	/*if(month==1 || month==3 || month==5|| month==7|| month==8||month==10||month==12){
	        System.out.println("this month has 31 days");
	} else if(month ==2){
	        System.out.println("This month has 28/29 days");
	} else{
	        System.out.println("This month has 31 days");
	}*/

    }
}

    



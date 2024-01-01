public class break_continue {
    public static void main(String [] args){
        //break & continue statements work only for loops and switch cases
        //break is used to stop iterating loop after particular conditions matches
        //continue is used to skip that particular iteration in loop and continue looping

        System.out.println("Break is used here to break loop when 1st number divisible by 3 comes");
        int n=40;
        for(int i=1;i<=n;i++){
            if(i%3==0){
                break;
            }
            System.out.println(i);
        }

        System.out.println("This skips numbers divisible by 4 and continues to run code till end");
        for(int i=1;i<=n;i++){
            if(i%4==0){
                continue;
            }
            System.out.println(i);
        }

    }
}

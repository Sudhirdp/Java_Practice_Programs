public class MyCharAtDemo {

    static char myCharAt(String str,int x){
        char array[]=str.toCharArray();
        return array[x];
    }

    public static void main(String args[]){
        String str="SudhirPatil";
        System.out.println(myCharAt(str,3));
        String str2="Sudhir";
        System.out.println(str2.compareTo(str2));
    }
}

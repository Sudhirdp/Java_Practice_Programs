//this is not StringBuffere code
class stringNBuffer1 {
    public static void main(String[] args){

        String str1="Shashi";
        System.out.println(System.identityHashCode(str1));
         str1=str1.concat("Nagal");
        System.out.println(System.identityHashCode(str1));
//Imp Note
//here for both new object is created for first obj is created at scp pointed by str1 100 addrees
// and second on heap change address 100 to 200.
    }
}

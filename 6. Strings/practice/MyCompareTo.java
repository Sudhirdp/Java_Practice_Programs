public class MyCompareTo {

    static int myCompareTo(String str1,String str2){
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        int n;
        if(arr1.length>arr2.length){
            n=arr2.length;
        } else{
            n=arr1.length;
        }
        int comp=0;
//        if(arr1.length!=arr2.length){
//            for(int i=0;i<n;i++){
//                if(arr1[i]!=arr2[i]){
//                    comp= arr1[i]-arr2[i];
//                } else {
//                    comp=arr1.length-arr2.length;
//                }
//            }
//        }
        for(int i=0;i<n;i++){
            if(arr1[i]!=arr2[i]){
                comp=arr1[i]-arr2[i];
                break;
            } else{
                if(i==n){

                }
            }
        }
        return comp;
    }

    public static void main(String args[]){
        String str="Sudhir";
        String str2="SuDhir";
        System.out.println(myCompareTo(str2,str));
    }
}

class stringNBuffer3 {
    public static void main(String[] args) {

        // Creation of StringBuffer
        //StringBuffer sb=new StringBuffer("Shashi");
        // StringBuffer sb1=new StringBuffer();
        StringBuffer sb2 = new StringBuffer(100);

        sb2.append("Biencaps");
        sb2.append("Core2Web");

        System.out.println(sb2);
        System.out.println(sb2.capacity());

        sb2.append("Instructors");
        System.out.println(sb2);
        System.out.println(sb2.capacity());

    }
}


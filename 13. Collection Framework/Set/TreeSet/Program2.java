import java.util.*;

class Fam implements Comparable<Fam>{
    String name = null;
    int age = 0;

    Fam(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Fam o) {
        return (name.compareTo(((Fam)o).name));
    }

    public String toString(){
        return "{"+ name + ","+ age + "}";
    }
    
}

class TreeSetDemo {
    public static void main(String [] args){
        TreeSet ts = new TreeSet();
        
        ts.add(new Fam("Kabir",9));
        ts.add(new Fam("Ashu",19));
        ts.add(new Fam("Prashanjit",16));
        ts.add(new Fam("Maitri",13));

        System.out.println(ts);
    }
}

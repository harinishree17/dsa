class Example{
    static int val = 10;
    int va = 0;
    Example(){
        System.out.println("inside cons");
    }
    Example(int t){
        this.va = t;
        System.out.println("inside param cons");
    }
    static{
        System.out.println("inside stat");
    }
}

public class Try{
    public static void main(String[] args) {
        Example a1 = new Example();
        Example a2 = new Example(20);
    }
}
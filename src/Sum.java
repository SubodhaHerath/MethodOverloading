public class Sum {
    void sum(int a,double b){
        System.out.println(a+b);
    }
    void sum(int c, int d){
        System.out.println(c+d);
    }

    public static void main(String[] args) {
        Sum s = new Sum();
        s.sum(56,34.2);
        s.sum(24,27);
    }
}

public class StrIn {
    void display(double a){
        System.out.println("Display");
    }
    void display(String b){
        System.out.println("String");
    }

    public static void main(String[] args) {
        StrIn si = new StrIn();
        si.display(2578.5);
        si.display("BMW");
    }
}

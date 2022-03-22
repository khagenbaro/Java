package Static;

public class StaticExample {
    public static void main(String[] args) {
        for(int i =0;i<10;i++){
            Increment increment = new Increment();
            System.out.println(increment.count);

        }
    }
}

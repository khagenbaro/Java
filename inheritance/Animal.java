package inheritance;

public class Animal {
    int i =4;
    public Animal(String type){
        System.out.println("Animal  constructor with string type");
    }
    public Animal(){
        System.out.println("Animal  constructor with no type");
    }
    public Animal(Integer i){
        this.i =i;
        System.out.println("cost with type int "+i);
    }

}
class Tiger extends  Animal{
    /**super keyword is used to call the superclass constructor with arguments integer*/
    Tiger(Integer num){
        super(23);
    }
    /**super keyword is used to call the superclass constructor with no  arguments */
    Tiger(String str){
        super("super class const from subclass using super keyword");
    }
    Tiger(){
        super();
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();// obj with no type
        Tiger tiger1 = new Tiger("H"); // obj with string type
        Tiger tiger2 = new Tiger(12); // obj with int type



    }

}

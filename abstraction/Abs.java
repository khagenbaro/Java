package abstraction;

interface Abs {
    void login();

}

class Test implements Abs {
    public static void main(String[] args) {
        Abs obj = new Test();
        obj.login();

    }

    @Override
    public void login() {
        System.out.println("Hi");
    }
}



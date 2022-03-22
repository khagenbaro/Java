package Interfaces;

interface Cat extends Animal {
        static void main(String[] args) {
                Cat anim = new Cat() {
                        @Override
                        public void eat() {
                                System.out.println("in anonymous class");
                        }

                        @Override
                        public void run() {

                        }
                };
               // anim.dangerous();
        }
//        Animal anim = new Cat();
}
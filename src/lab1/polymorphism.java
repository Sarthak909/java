package lab1;

public class polymorphism {
    //oops//static or early binding cpolymorphism
    public static void main(String[] args) {
        polymorphism(){

        }
        System.out.println("A");
        polymorphism cc = new polymorphism();
        cc.m1();
    }
    void m1(int a){
        System.out.println("B");
    }
    void m1(int a,String b){
        System.out.println("B");
    }
    void m1(){
        System.out.println("c");
    }
}

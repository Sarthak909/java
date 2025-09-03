

interface Inter1{
    //if empty it is called marker interface
    //if the interface has one method than it is called functional interface
   int x=112;
     void method1();
    void method2();

}
interface Inter2{
    //if empty it is called marker interface
    //if the interface has one method than it is called functional interface
    int x=111;
    void method3();
}
public class interfaci impliments Inter1,Inter2 {
    public static void main(String[] args) {
        System.out.println("Main entry point");
        System.out.println(Inter1.x);
        int x = 113;
        System.out.println(x);
    }
    public void method1() {
        System.out.println("this is my method");
    }

    public void method3() {
        System.out.println("this is my method");
    }
}

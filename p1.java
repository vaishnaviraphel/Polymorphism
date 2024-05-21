package Java_practice2.Polymorphism.methodoverloading;

public class p1 {
    void Gift(String a){
        System.out.println("A is string "+a);
    }
    int Gift(int x){
        System.out.println("X is int "+x);
        return x;
    }
    int Gift(float x){
        System.out.println("X is int "+x);
        return 89;
    }
    void Gift(double x){
        System.out.println("X is double "+x);
    }

    public static void main(String[] args) {
        p1 runner = new p1();
        runner.Gift(34);
    }
}

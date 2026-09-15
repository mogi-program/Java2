package ai0915;

public class VaruableTest1 {
    static int a = 100;
    int b = 100;

    static void method1(){
        int a = 300;
        int b = 7000;
        VaruableTest1 vt = new VaruableTest1();
        b = vt.b;
        System.out.println("지역 변수 a에 저장된 값" + a);
    }

    static void method2(){
        a += 20;
        System.out.println("전역 변수 a에 저장된 값" + a);
    }

    public static void main(String[] args) {
        method1();
        method2();
    }
}

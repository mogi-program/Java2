package ai0908;

public class OverLoadingTest {
    public static int calc(int n1, int n2, char op){
        int result = 0;

        switch(op){
            case '+': result = n1+n2; break;
            case '-': result = n1-n2; break;
            case '*': result = n1*n2; break;
            case '/': result = n1/n2; break;
        }

        return result;
    }

    public static int calc(int n1, int n2, int n3, char op){
        int result = 0;

        switch(op){
            case '+': result = n1+n2+n3; break;
            case '-': result = n1-n2-n3; break;
            case '*': result = n1*n2*n3; break;
            case '/': result = n1/n2/n3; break;
        }

        return result;
    }

    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 3;
        int n3 = 7;
        char op = '+';

        System.out.println(calc(n1,n2,op));
        System.out.println(calc(n1,n2,n3,op));
    }
}

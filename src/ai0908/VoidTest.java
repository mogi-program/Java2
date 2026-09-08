package ai0908;

public class VoidTest {
    public static void printLine(char c, int count){
        for(int i = 0 ; i < count; i++){
            System.out.print(c);

        }
    }

    public static void main(String[] args) {
        char[] chars = {'☆','♡','♧','▽','△','□','◁'};
//        printLine('☆',10);
//        printLine('♡',20);
//        printLine('♧',30);
//        printLine('▽',40);
//        printLine('△',50);
//        printLine('□',60);
//        printLine('◁',70);
        for(int i = 0 ; i < chars.length; i++){
            printLine(chars[i],(i+1)*10);
            System.out.println();
        }
    }
}

import sun.java2d.loops.DrawLine;

public class Main {

//    Method draw line witch size 10
    public static void DrawLine () {
        for (int i = 0; i < 10; i++ ) {
            System.out.print("*");
        }
        System.out.println();
    }

// Draw box with size 10x10
    public static void DrawBox() {
        for (int i = 0; i < 10; i++ ) {
            System.out.println();
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
            }
        }
        System.out.println();
    }

//    Draw empty box with size 10x10
    public static void EmtyBox(){
        for (int i = 0; i < 10; i++ ) {
            System.out.println();
            for (int j = 0; j < 10; j++) {
                if ( i == 0 || i == 9 || j == 0 || j == 9 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DrawLine();
        DrawBox();
        EmtyBox();
    }

}

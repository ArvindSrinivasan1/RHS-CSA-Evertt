public class AppMain {
    // Desired output (two different examples, depending on what the constant is set to)...
    // SIZE = 3
    //   #============#
    //   |    <><>    |
    //   |  <>....<>  |
    //   |<>........<>|
    //   |<>........<>|
    //   |  <>....<>  |
    //   |    <><>    |
    //   #============#
    // SIZE = 4
    //   #================#
    //   |      <><>      |
    //   |    <>....<>    |
    //   |  <>........<>  |
    //   |<>............<>|
    //   |<>............<>|
    //   |  <>........<>  |
    //   |    <>....<>    |
    //   |      <><>      |
    //   #================#
    public static int SIZE = 4;
  

    public static void main(String[] args) {
        drawTopBottom();
        drawMiddle();
        drawTopBottom();
    }

    public static void drawTopBottom() {
        System.out.print("#");
        for (int i = 0; i < SIZE*4; i++ ){
            System.out.print("=");
        }
        System.out.println("#");
    }
    public static void drawMiddle() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print("|");
            for (int k = 0; k<(SIZE*4-4-4*i)/2; k++){
                System.out.print(" ");

            }
            System.out.print("<>");
            for (int j=0; j< 4*i; j++)
                System.out.print(".");
            System.out.print("<>");
            for (int k = 0; k<(SIZE*4-4-4*i)/2; k++){
                System.out.print(" ");
            }
            
            System.out.println("|");
        }
        for (int i = 0; i < SIZE; i++ ){
            System.out.print("|");
            for (int k = 0; k<(SIZE*4-((4 * SIZE)-i*4)) / 2; k++){
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int j = 0; j<((SIZE - 1) *4)-i*4; j++)
                System.out.print(".");
            System.out.print("<>");
            for (int k = 0; k<(SIZE*4-((4 * SIZE)-i*4)) / 2; k++){
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}
public class SquareTriangle extends Rectangle {

    SquareTriangle(int width, int height) {
        super(width, height);
    }

    void drawBottomLeft() {
        for (int i = 0; i < this.width; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("\t*\t");
            }
            System.out.println("\n");
        }
    }

    void drawTopLeft() {
        for (int i = this.width; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("\t*\t");
            }
            System.out.println("\n");
        }
    }

}

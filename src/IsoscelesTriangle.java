public class IsoscelesTriangle extends Area {
    IsoscelesTriangle(int width, int height) {
        super(width, height);
    }

    void draw() {
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                if (j >= this.width / 2 - i && j <= this.width / 2 + i) {
                    System.out.print("\t*");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println("\n");
        }
    }
}

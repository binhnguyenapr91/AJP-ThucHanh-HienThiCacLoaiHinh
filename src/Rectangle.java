public class Rectangle extends Area {

    Rectangle(int width, int height) {
       super(width,height);
    }

    void draw(){
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                System.out.print("*\t");
            }
            System.out.println("\n");
        }
    }
}

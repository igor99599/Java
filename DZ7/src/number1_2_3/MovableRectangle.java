package number1_2_3;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    private boolean SpeedTest(){return topLeft.getSpeed() == bottomRight.getSpeed();}

    public MovableRectangle(){this.topLeft = new MovablePoint(); this.bottomRight = new MovablePoint();}
    public MovableRectangle(int x1, int y1, int x2, int y2){
        this.topLeft = new MovablePoint(x1, y1);
        this.bottomRight = new MovablePoint(x2, y2);
    }
    public MovableRectangle(int x1, int y1, int x2, int y2, int speed){
        this.topLeft = new MovablePoint(x1, y1, speed);
        this.bottomRight = new MovablePoint(x2, y2, speed);
    }


    @Override
    public void moveUp() {
        if(this.SpeedTest()){
            this.topLeft.moveUp();
            this.bottomRight.moveUp();
        }
    }

    @Override
    public void moveDown() {
        if(this.SpeedTest()){
            this.topLeft.moveDown();
            this.bottomRight.moveDown();
        }
    }

    @Override
    public void moveRight() {
        if(this.SpeedTest()){
            this.topLeft.moveRight();
            this.bottomRight.moveRight();
        }
    }

    @Override
    public void moveLeft() {
        if(this.SpeedTest()){
            this.topLeft.moveLeft();
            this.bottomRight.moveLeft();
        }
    }

    @Override
    public String toString() {
        return "MovableRectangle{" + "topLeft=" + topLeft + ", bottomRight=" + bottomRight + '}';}
}

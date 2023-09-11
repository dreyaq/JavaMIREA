package Proj1;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        ball.setX(1);
        ball.setY(2);
        System.out.println(ball.toString());
        ball.move(2,3);
        ball.setXY(4,7);
        System.out.println(ball.toString());
    }
}

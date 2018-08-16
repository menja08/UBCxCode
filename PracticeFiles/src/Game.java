public class Game {

    public static void main(String[] args) {
        Game g = new Game();
        g.playGame();
    }

    public void playGame() {
        Ball ball = new Ball();
        ball.setSpeed(10);
        passBall(ball);
        ball.setSpeed(30);
    }

    public void passBall(Ball ball) {
        ball.setSpeed(ball.getSpeed() + 5); //(1)
        catchBall(ball); //(2)
    }

    public void catchBall(Ball ball) {
        Ball newBall = new Ball();
        newBall.setSpeed(40);
        newBall.setSpeed(0); //(3)
        ball = newBall; //(4)
        System.out.println("Caught the ball");
    }
}

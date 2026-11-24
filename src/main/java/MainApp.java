import forms.Turtle;
import forms.World;

public class MainApp
{
    public static void main(String[] args)
    {
        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
        World world = new World(1000, 1000);
        Turtle turtle = new Turtle(world,-100, -100);
        
        int width = 1000;
        int height = 1000;

//        // calculate the hypotenuse (diagonal)
//        // a2 + b2 = c2
//        double widthSquared = Math.pow(width, 2);
//        double heightSquared = Math.pow(height, 2);
//        double hypotenuse = Math.sqrt(widthSquared + heightSquared);
//
//
//        turtle.setPenWidth(3);
//        turtle.setColor(Color.GREEN);
//
//        turtle.turnRight(45);
//        turtle.forward(hypotenuse);
//
//        turtle.penUp();
//        turtle.goTo(100, 100);
//        turtle.turnRight(90);
//
//        turtle.penDown();
//        turtle.forward(hypotenuse);

        turtle.setShellSize(25); // Making a bigger turtle

        world.setLocation(0,0);

        //turtle.drop("src/main/resources/tortuga-ninja.png", 250); adding a pic
        
        //square
//        turtle.setDelay(0.005);
//        for (int i = 0; i < 4; i++){
//            turtle.turnRight(90);
//            turtle.forward();
//        }

        // circle
//        turtle.setDelay(0.005);
//        for (int i = 0; i < 360; i++) {
//            turtle.forward(3);
//            turtle.turnRight(1);
//        }




    }
}

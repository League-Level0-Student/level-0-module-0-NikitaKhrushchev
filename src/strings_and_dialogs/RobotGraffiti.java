package strings_and_dialogs;
import org.jointheleague.graphical.robot.Robot;
public class RobotGraffiti {
	static Robot mark = new Robot();
	public static void main(String[] args) {
		d();
		mark.move(70);
		y();
		mark.move(70);
		l();
		mark.move(70);
	
	
	}
public static void d() {
	mark.setSpeed(30);
	mark.penDown();
	int len = (int) (360/3.14159);
	mark.move(len);
	mark.turn(90);
	for (int i = 0; i < 180; i++) {
	mark.move(1);	
	mark.turn(1);
	}
	mark.turn(180);
	mark.penUp();
	
}
public static void y() {
		mark.turn(-90);
	mark.move(50);
	mark.turn(135);
	mark.penDown();
	int len2 = (int) 70.7106781187;
	mark.move(len2);
	mark.turn(-90);
	mark.move(-len2);
	mark.move(len2*2);
	mark.move(-len2);
	mark.turn(45);
	mark.penUp();
}
public static void l() {
	mark.penDown();
		mark.turn(-90);
	int len = (int) (360/3.14159);
	mark.move(len);
	mark.move(-len);
	mark.turn(90);
	

	
	mark.penUp();
}
}
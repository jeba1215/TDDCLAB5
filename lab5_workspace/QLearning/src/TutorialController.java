public class TutorialController extends Controller {

    public SpringObject object;

    ComposedSpringObject cso;

    /* These are the agents senses (inputs) */
	DoubleFeature x; /* Positions */
	DoubleFeature y;
	DoubleFeature vx; /* Velocities */
	DoubleFeature vy;
	DoubleFeature angle; /* Angle */

    /* Example:
     * x.getValue() returns the vertical position of the rocket 
     */

	/* These are the agents actuators (outputs)*/
	RocketEngine leftRocket;
	RocketEngine middleRocket;
	RocketEngine rightRocket;

    /* Example:
     * leftRocket.setBursting(true) turns on the left rocket 
     */
	
	public void init() {
		cso = (ComposedSpringObject) object;
		x = (DoubleFeature) cso.getObjectById("x");
		y = (DoubleFeature) cso.getObjectById("y");
		vx = (DoubleFeature) cso.getObjectById("vx");
		vy = (DoubleFeature) cso.getObjectById("vy");
		angle = (DoubleFeature) cso.getObjectById("angle");

		leftRocket = (RocketEngine) cso.getObjectById("rocket_engine_left");
		rightRocket = (RocketEngine) cso.getObjectById("rocket_engine_right");
		middleRocket = (RocketEngine) cso.getObjectById("rocket_engine_middle");
	}

    public void tick(int currentTime) {

    	System.out.println("Current time: " + currentTime + " angle : " + angle.getValue() + " vx: " + vx.getValue() +  " vy: " + vy.getValue());
    	System.out.println("x: " + x.getValue() +  " y: " + y.getValue());

    	if (angle.getValue() > 0.1) {
			rightRocket.setBursting(true);
			leftRocket.setBursting(false);
		} else if(angle.getValue() < -0.1){
			rightRocket.setBursting(false);
			leftRocket.setBursting(true);					
		} else if(y.getValue() < -1500 || y.getValue() > 800){
			rightRocket.setBursting(false);
			leftRocket.setBursting(false);			
		} else {
			rightRocket.setBursting(true);
			leftRocket.setBursting(true);				
		}
    }

}

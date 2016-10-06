public class StateAndReward {

	
	/* State discretization function for the angle controller */
	public static String getStateAngle(double angle, double vx, double vy) {
		String state = "OneStateToRuleThemAll";
		/* TODO: IMPLEMENT THIS FUNCTION */
		
		/*if(angle < 0.1 && angle > -0.1)
			state = "middleState";
		else if(angle > 0.1 && angle < 0.5)
			state = "rightTiltState";
		else if(angle > 0.5)
			state = "rightHeavyTiltState";
		else if(angle < -0.1 && angle > -0.5)
			state = "lefttTiltState";
		else if(angle < -0.5)
			state = "leftHeavyTiltState";*/
		
		int num = discretize(angle, 36, -3.14, 3.14);
		state = "state"+num;
		//System.out.println(state);
		return state;
	}

	/* Reward function for the angle controller */
	public static double getRewardAngle(double angle, double vx, double vy) {

		/* TODO: IMPLEMENT THIS FUNCTION */
		
		double reward = 0;
		
		if(angle < 0.2 && angle > -0.2)
			reward = 1;
		else if(angle > 0.2 && angle < 0.4)
			reward = 0.7;
		else if(angle > 0.4 && angle < 0.8)
			reward = 0.4;
		else if(angle > 0.8)
			reward = 0;
		else if(angle < -0.2 && angle > -0.4)
			reward = 0.7;
		else if(angle < -0.4 && angle > -0.8)
			reward = 0.4;
		else if(angle < -0.8)
			reward = 0;
		
		//reward = discretize(angle, 10, -3.14, 3.14);
		
		reward = ((3.14) - Math.abs(angle)) / (3.14);
		

		return reward;
	}

	/* State discretization function for the full hover controller */
	public static String getStateHover(double angle, double vx, double vy) {

		/* TODO: IMPLEMENT THIS FUNCTION */

		String state = "OneStateToRuleThemAll2";
		
		return state;
	}

	/* Reward function for the full hover controller */
	public static double getRewardHover(double angle, double vx, double vy) {

		/* TODO: IMPLEMENT THIS FUNCTION */
		
		double reward = 0;

		return reward;
	}

	// ///////////////////////////////////////////////////////////
	// discretize() performs a uniform discretization of the
	// value parameter.
	// It returns an integer between 0 and nrValues-1.
	// The min and max parameters are used to specify the interval
	// for the discretization.
	// If the value is lower than min, 0 is returned
	// If the value is higher than min, nrValues-1 is returned
	// otherwise a value between 1 and nrValues-2 is returned.
	//
	// Use discretize2() if you want a discretization method that does
	// not handle values lower than min and higher than max.
	// ///////////////////////////////////////////////////////////
	public static int discretize(double value, int nrValues, double min,
			double max) {
		if (nrValues < 2) {
			return 0;
		}

		double diff = max - min;

		if (value < min) {
			return 0;
		}
		if (value > max) {
			return nrValues - 1;
		}

		double tempValue = value - min;
		double ratio = tempValue / diff;

		return (int) (ratio * (nrValues - 2)) + 1;
	}

	// ///////////////////////////////////////////////////////////
	// discretize2() performs a uniform discretization of the
	// value parameter.
	// It returns an integer between 0 and nrValues-1.
	// The min and max parameters are used to specify the interval
	// for the discretization.
	// If the value is lower than min, 0 is returned
	// If the value is higher than min, nrValues-1 is returned
	// otherwise a value between 0 and nrValues-1 is returned.
	// ///////////////////////////////////////////////////////////
	public static int discretize2(double value, int nrValues, double min,
			double max) {
		double diff = max - min;

		if (value < min) {
			return 0;
		}
		if (value > max) {
			return nrValues - 1;
		}

		double tempValue = value - min;
		double ratio = tempValue / diff;

		return (int) (ratio * nrValues);
	}

}

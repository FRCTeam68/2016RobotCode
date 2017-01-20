package org.usfirst.frc.team68.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
    private static RobotMap robotMap;
    public static PidProfile shooterPID;
//    public static PidProfile armPID;
    public static PidProfile IntakeArmPID;
    public static PidProfile driveLeftPID;
    public static PidProfile driveRightPID;
    public static PidProfile climberPID;
    
//    public static final String ARM_DRAWBRIDGE_PATH_FILENAME = "/paths/ARM_DBRIDGE.xml";
//    public static final String ARM_SALLYPORT_PATH_FILENAME = "/paths/ARM_SPORT.xml";
    
    public static final String DT_DRAWBRIDGE_PATH_FILENAME = "/paths/DT_DBRIDGE.xml";
    public static final String DT_SALLYPORT_PATH_FILENAME = "/paths/DT_SPORT.xml";
    
    public static final String DT_AUTON1_PATH_FILENAME = "/paths/DT_AUTON1.xml";
    public static final String DT_AUTON2_PATH_FILENAME = "/paths/DT_AUTON2.xml";
    public static final String DT_AUTON3_PATH_FILENAME = "/paths/DT_AUTON3.xml";
    
    public static PointPath ArmDrawbridgePath;
    public static PointPath ArmSallyportPath;
    
    public static PointPath DtDrawbridgePath;
    public static PointPath DtSallyportPath;
    
    public static PointPath DtAuton1Path;
    public static PointPath DtAuton2Path;
    public static PointPath DtAuton3Path;
    
    public static RobotMap getRobotMap() {
    	if( robotMap == null) {
    		robotMap = new RobotMap();
    	}
    	return robotMap;
    }

	private RobotMap() {
	    //Shooter PID 6000RPM
		/*
	    shooterPID = new PidProfile();
	    shooterPID.slot = 0;
	    shooterPID.f = 0.0;
	    shooterPID.p = .40;
	    shooterPID.i = 0.00001;
	    shooterPID.d = 0.000000002;
	    */
		
		//Shooter PID 4300RPM
		shooterPID = new PidProfile();
	    shooterPID.slot = 0;
	    shooterPID.f = 0.0;
	    shooterPID.p = .210;
	    shooterPID.i = 0.0000264;
	    shooterPID.d = 0.000000002;
	    
	    //Arm PID - one profile for all three axes
//	    armPID = new PidProfile();
//	    armPID.slot = 0;
//	    armPID.f = 0.0;
//	    armPID.p = .5;
//	    armPID.i = 0.5;
//	    armPID.d = 0.0;
	    
	    //IntakeArm PID - one profile for all three axes
	    IntakeArmPID = new PidProfile();
	    IntakeArmPID.slot = 0;
	    IntakeArmPID.f = 0.0;
	    IntakeArmPID.p = 1;
	    IntakeArmPID.i = 0.0;
	    IntakeArmPID.d = 0.0;

	    // Drive PID
	    driveLeftPID = new PidProfile();
	    driveLeftPID.slot = 0;
	    driveLeftPID.f = 0.0;
	    driveLeftPID.p = 0.1;
	    driveLeftPID.i = 0.0;
	    driveLeftPID.d = 0.0;
	    
	    driveRightPID = new PidProfile();
	    driveRightPID.slot = 0;
	    driveRightPID.f = 0.0;
	    driveRightPID.p = 0.1;
	    driveRightPID.i = 0.0;
	    driveRightPID.d = 0.0;
	    
	    //Climber PID
	    climberPID = new PidProfile();
	    climberPID.slot = 0;
	    climberPID.f = 0.0;
	    climberPID.p = .5;
	    climberPID.i = 0.5;
	    climberPID.d = 0.0;
	    
//	    ArmDrawbridgePath = PathLoader.loadPath(ARM_DRAWBRIDGE_PATH_FILENAME);
//	    ArmSallyportPath = PathLoader.loadPath(ARM_SALLYPORT_PATH_FILENAME);
	    /*
	    DtDrawbridgePath = PathLoader.loadPath(DT_DRAWBRIDGE_PATH_FILENAME);
	    DtSallyportPath = PathLoader.loadPath(DT_SALLYPORT_PATH_FILENAME);
	    
	    DtAuton1Path = PathLoader.loadPath(DT_AUTON1_PATH_FILENAME);
	    DtAuton2Path = PathLoader.loadPath(DT_AUTON2_PATH_FILENAME);
	    DtAuton3Path = PathLoader.loadPath(DT_AUTON3_PATH_FILENAME);
	    */
	    
	}
	
	public static final double MATCH_TIME = 134;
	
	public static final int ENERGY_FULL = 370000;

    // DriveTrain Constants
    public static final int DRIVE_LEFT_FRONT = 3;			// CAN bus ID 1
    public static final int DRIVE_RIGHT_FRONT = 4;			// CAN bus ID 2
    public static final int DRIVE_LEFT_REAR = 1;			// CAN bus ID 3
    public static final int DRIVE_RIGHT_REAR = 2;			// CAN bus ID 4
    public static final int DRIVE_SHIFTER_PCM_A = 2;		// PCM ID 2
    public static final int DRIVE_SHIFTER_PCM_B = 3;		// PCM ID 3
    public static final double DRIVE_MULT = .85;
    
    public static final double DRIVE_RECLAIM = 0.5;
    
    //Shooter Constants
    public static final int SHOOTER_PRIMARY_MOTOR = 5;  	// CAN bus ID 5
    public static final int SHOOTER_FOLLOWER_MOTOR = 6; 	// CAN bus ID 6
    public static final int HOOD_FORWARD = 0;
    public static final int HOOD_REVERSE = 1;
    public static final int SHOOTER_FEED_DELAY = 2;
    
    //new balls
    //public static final double SHOOTER_SHOOTING_SPEED = 5200;
    
    //old
    //public static final double SHOOTER_SHOOTING_SPEED = 6000;
    
    public static final double SHOOTER_SHOOTING_SPEED = 4300;
    
    public static final double SHOOTER_SPEED_THRESHOLD = .02;  // 2% Threshold
    
    public static final int FLASHLIGH_SPIKE_PORT = 1;
    
    //Shooter RPM values
    public static double[] shooterRPM = {0,500,1000,1500,2000,2500,3000,3500,4000,4500,5000,5500};
      
    //Climber Constants
    public static final int CLIMBER_WINCH_MOTOR = 7 ;  	// CAN bus ID 7
    public static final int CLIMBER_LATCH_FORWARD = 4;
    public static final int CLIMBER_LATCH_REVERSE = 5;
    public static final double CLIMBER_WINCH_POWER = 1;
          
    //Arm Constants
//    public static final int ARM_BASE_MOTOR = 0;  			// CAN bus ID 
//    public static final int ARM_SHOULDER_MOTOR = 8; 		// CAN bus ID 8
//    public static final int ARM_ELBOW_MOTOR = 9;			// CAN bus ID 9
//    public static final double ARM_BASE_GEAR_RATIO = 1;
//    public static final double ARM_SHOULDER_GEAR_RATIO = 2;
//    public static final double ARM_ELBOW_GEAR_RATIO = 2; 
//    public static final double ARM_SHOULDER_LENGTH = 24;
//    public static final double ARM_ELBOW_LENGTH = 21.5;
//    public static final int ARM_ENCODER_COUNTS_PER_REV = 1440;
//    public static final double ARM_BASE_HOME = 0;
//    public static final double ARM_BASE_HOME_THRESHOLD = 1;
//
//    //Timeout
//    public static final int ARM_SETARMPOINT_ITERATION_MAX = 10000;
//    //IN DEGREES!
//    public static final double ELBOW_CLEARENCE_F_SHOULDER = 5;
//    public static final double SHOULDER_CLEARENCE_F_BASE = 80;
//    public static final double BASE_MIN_SAFETY_ANGLE = -90;
//    public static final double BASE_MAX_SAFETY_ANGLE = 90;
//    public static final double SHOULDER_MIN_SAFETY_ANGLE = -1;
//    public static final double SHOULDER_MAX_SAFETY_ANGLE = 120;
//    public static final double ELBOW_MIN_SAFETY_ANGLE = -1;
//    public static final double ELBOW_MAX_SAFETY_ANGLE = 360;

    
    //Intake Constants
    public static final int INTAKE_ROLLER_MOTOR = 10;  	// CAN bus ID 10
    public static final int INTAKE_ARM_MOTOR = 11;		// CAN bus ID 11
    public static final int INTAKE_BEAM_BREAK = 0;		// DIO port 0
    public static final int INTAKE_ARM_ENCODER_COUNTS_PER_REV = 1440;
    public static final int INTAKE_ARM_GEAR_RATIO = 10;
    public static final double INTAKE_IN_SPEED = 1;
    public static final double INTAKE_OUT_SPEED = 1;
    public static final double INTAKE_ARM_SHOOTING_SAFETY_ANGLE = 0;
    public static final double INTAKE_ARM_HOME = 0;
    public static final double INTAKE_ARM_HOME_THRESHOLD = 1;
    public static final int INTAKE_BOULDER_FEED_SPEED = 1;
    //Intake position array (in degrees) these are the predefined points 
    public static double[] intakePositions = {-10, -6.6, -3.5, 0};
    //Intake joysitck multiplier  A value to multiply the analog value from the joystick by when controlling manually
    //position will be incremented by the resulting number of degrees per iteration (approx 20ms)
    public static final double INTAKE_JOYSTICK_MULT = 3.5;
    public static final double INTAKE_JOYSTICK_MULT_SLOW = 0.25;
    public static final double INTAKE_ARM_DEADBAND = 0.3;
    public static final double INTAKE_ARM_UP_MAX = 95;
    

    // Joystick Port Mapping Constants
    public static final int LEFT_JOYSTICK = 0;			// USB port 0
    public static final int RIGHT_JOYSTICK = 1;			// USB port 1
    public static final int JOYSTICK_Y = 1;				// This works for both joysticks
    public static final int JOYSTICK_TRIGGER = 1;		// This works for both joysticks
    public static final int JOYSTICK_BUTTON2 = 2;		// This works for both joysticks
    public static final int JOYSTICK_BUTTON4 = 4;		// This works for both joysticks
    public static final int JOYSTICK_BUTTON5 = 5;		// This works for both joysticks
    public static final int JOYSTICK_BUTTON6 = 6;
    public static final int JOYSTICK_BUTTON7 = 7;
    public static final int JOYSTICK_BUTTON8 = 8;		// This works for both joysticks
    public static final int JOYSTICK_BUTTON9 = 9;		// This works for both joysticks
    public static final int JOYSTICK_BUTTON10 = 10;
    public static final int JOYSTICK_BUTTON11 = 11;
    
    
    // xBoxController Button & Axis Mapping Constants
    // Buttons
    public static final int XBOX_CONTROLLER = 2;		// USB port 2
    public static final int XBOX_A = 1;
    public static final int XBOX_B = 2;
    public static final int XBOX_X = 3;
    public static final int XBOX_Y = 4;
    public static final int XBOX_LB = 5;
    public static final int XBOX_RB = 6;
    public static final int XBOX_BACK = 7;
    public static final int XBOX_START = 8;
    public static final int XBOX_RJB = 9;
    public static final int XBOX_LJB = 10;
    //POV
    public static final int XBOX_POV_D = 4;
    // Axis
    public static final int XBOX_LY = 1;
    public static final int XBOX_RY = 5;
    public static final int XBOX_LT = 2;
    public static final int XBOX_RT = 3;

    
    // Pneumatics Port Mapping Constants
    public static final int PCM_MAIN = 0;
    public static final int AIR_PRESSURE_SENSOR = 1;
    public static final double AIR_FULL = 0.92;
    public static final double AIR_EMPTY = 0.35;
    
    // Axis Camera
    public static final String AXIS_CAMERA_HOST_NAME = "axis-camera";
    public static final String AXIS_CAMERA_IP = "10.0.68.11";
    
    //GRIP
    public static final double SCREENWIDTH = 320;
    public static final double SCREENHEIGHT = 240;
    public static final double DT_VIS_CENTER_P = 0.025;
    public static final double DT_VIS_TURN_POWER_MAX = 0.4;
    public static final double DT_VIS_TURN_POWER_MIN = 0.25;
    
    public static final double X_TAR = 260;
    public static final double X_TOL = 10;
    
}


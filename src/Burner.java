public class Burner {
	
	public enum Temperature{
		BLAZING("VERY HOT! DON'T TOUCH"), HOT("CAREFUL"), WARM("warm"), COLD("cooool");
		private final String display;

	    Temperature(String display) {
	        this.display = display;
	    }

	    // Override toString() method to return the string representation
	    @Override
	    public String toString() {
	        return display;
	    }
		
	}
	
	
	private int timer; //private??
	private Setting mySetting;
	public static final int TIME_DURATION = 2;
	private Temperature myTemperature;
	
	
	public Burner() {
		myTemperature = Temperature.COLD;
		mySetting = Setting.OFF;
		timer = TIME_DURATION;
		// TODO Auto-generated njnnknknkkr jkjbkijnlhu
	}

	public void plusButton() {
		switch (mySetting) {
	        case OFF:
	            mySetting = Setting.LOW;
	            break;
	        case LOW:
	            mySetting = Setting.MEDIUM;
	            break;
	        case MEDIUM:
	            mySetting = Setting.HIGH;
	            break;
	        case HIGH:
	            // Already at highest setting, do nothing
	            break;
		}
	}
	
	public Temperature getTemperature() {
		return myTemperature;
		
	}
    public void minusButton() {
        switch (mySetting) {
            case HIGH:
                mySetting = Setting.MEDIUM;
                break;
            case MEDIUM:
                mySetting = Setting.LOW;
                break;
            case LOW:
                mySetting = Setting.OFF;
                break;
            case OFF:
                // Already at lowest setting, do nothing
                break;
        }
        timer = TIME_DURATION;  // reset timer
    }
	
    public void updateTemperature() {
    	if (timer > 0) {
    		timer--;
    	}
    	else { 
    		switch(mySetting) {
    		case OFF:
    			myTemperature = Temperature.COLD;
    			break;
    		case LOW: 
    			myTemperature = Temperature.WARM;
    			break;
    		case MEDIUM:
    			myTemperature =Temperature.HOT;
    			break;
    		case HIGH:
    			myTemperature = Temperature.BLAZING;
    			break;
    		}
    		timer = TIME_DURATION;
    	}
    }
    	
        public void display() {
            System.out.println("Burner setting: " + mySetting + " | Temperature: " + myTemperature);
        }
    }

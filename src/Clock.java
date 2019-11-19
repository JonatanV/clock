public class Clock {
    private String displayString;
    private NumberDisplay hours;
    private NumberDisplay minutes;
    int minLimit = 60;
    int houLimit = 24;

    /**
     * Sets hours and minutes to their respective limits.
     */

    public Clock() {
        this.hours = new NumberDisplay(houLimit);
        this.minutes = new NumberDisplay(minLimit);
    }

    /**
     * Sets a value to hours and minutes.
     * @param hours sets the value to 0
     * @param minutes sets the value to 0
     */

    public Clock(int hours, int minutes){
        this();
        this.hours.setValue(0);
        this.minutes.setValue(0);
    }

    /**
     * Increases minutes and if it becomes 0 hours increases.
     */

    public void timeTick(){
        minutes.increment();
        if (minutes.getValue() == 0){
            hours.increment();
        }
    }

    /**
     *  Sets the time using hours and minutes
     * @param hours sets the value of hours
     * @param minutes  sets the value of hours
     */

    public void setTime(int hours, int minutes){
        this.hours.setValue(hours);
        this.minutes.setValue(minutes);
    }

    /**
     * Gets the time by returning displayString
     * @return returns displayString
     */

    public String getTime(){

        return displayString;
    }

    /**
     * updates the display
     */

    private void updateDisplay(){
        displayString = hours.getDisplayValue() +':'+ minutes.getDisplayValue();
    }

    public static void main(String[] args) {
        Clock isseRolex = new Clock();
        isseRolex.setTime(8,59);
        isseRolex.timeTick();
        isseRolex.updateDisplay();
        System.out.println(isseRolex.getTime());
    }
}

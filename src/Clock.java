public class Clock {
    private String displayString;
    private NumberDisplay hours;
    private NumberDisplay minutes;

    public Clock() {
        this.hours = new NumberDisplay(24);
        this.minutes = new NumberDisplay(60);
    }
    public Clock(int hours, int minutes){
        this();
        this.hours.setValue(0);
        this.minutes.setValue(0);
    }
    public void timeTick(){
        minutes.increment();
    }
    public void setTime(int hours, int minutes){
        this.hours.setValue(hours);
        this.minutes.setValue(minutes);
    }
    public String getTime(){

        return displayString;
    }
    private void updateDisplay(){
        displayString = hours.getDisplayValue() +';'+ minutes.getDisplayValue();
    }

    public static void main(String[] args) {
    }

}

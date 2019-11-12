public class Clock {
    private String displayString;
    private NumberDisplay hours;
    private NumberDisplay minutes;
    int minLimit = 60;
    int houLimit = 24;

    public Clock() {
        this.hours = new NumberDisplay(houLimit);
        this.minutes = new NumberDisplay(minLimit);
    }
    public Clock(int hours, int minutes){
        this();
        this.hours.setValue(0);
        this.minutes.setValue(0);
    }
    public void timeTick(){
        minutes.increment();
        if (minutes.getValue() == 0){
            hours.increment();
        }
    }
    public void setTime(int hours, int minutes){
        this.hours.setValue(hours);
        this.minutes.setValue(minutes);
    }
    public String getTime(){

        return displayString;
    }
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

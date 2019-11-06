public class NumberDisplay extends Clock{
    private int limit;
    private int value;

    public NumberDisplay(int maxLimit) {
        value = 0;
        limit = maxLimit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int newValue) {
        if(newValue >limit && newValue < 0){

        }else {newValue = value;}
    }
    public String getDisplayValue(){
        String displayValue = Integer.toString(value);
        if (value < 10){
            displayValue  = "0" + displayValue;
        }
        return displayValue;
    }
    public void increment(){
        value++;
        if(value==limit){
            value = 0;
        }
    }
}

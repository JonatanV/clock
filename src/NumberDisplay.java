public class NumberDisplay {
    private int limit;
    private int value;

    /**
     * Creates a NuberDisplay with a starting value of 0 and a maxLimit
     * @param maxLimit limits NumberDisplay max value
     */

    public NumberDisplay(int maxLimit) {
        value = 0;
        limit = maxLimit;
    }

    /**
     * gets the value of value
     * @return returns the value oc the variable value
     */

    public int getValue() {
        return value;
    }

    /**
     * Sets a value to the NumberDisplay and if its greater than limit and less than zero nothing happens. Else it sets value to new value
     * @param newValue
     */

    public void setValue(int newValue) {
        if(newValue >limit && newValue < 0){

        }else {value = newValue;}
    }

    /**
     * Makes DisplayValue into a string. If value is less than ten it puts a zero before DisplayValue.
     * @return REeturns DisplayValue.
     */

    public String getDisplayValue(){
        String displayValue = Integer.toString(value);
        if (value < 10){
            displayValue  = "0" + displayValue;
        }
        return displayValue;
    }

    /**
     * Value increases until it hits limit when it does it turns value into zero.
     */

    public void increment(){
        value++;
        if(value==limit){
            value = 0;
        }
    }
}

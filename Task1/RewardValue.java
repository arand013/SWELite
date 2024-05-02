public class RewardValue {
    private double value;
    private String valueType;
    RewardValue(double cashValue)
    {
        value = cashValue;
        valueType = "cash";
    }

    RewardValue(float milesValue)
    {
        value =milesValue;
        valueType = "miles";
    }

    public double getCashValue()
    {
        if(valueType.equals("miles"))
            return value*0.0035;
        else if(valueType.equals("cash"))
            return value;
        else return 0;

    }
    public float getMilesValue()
    {
        if(valueType.equals("cash"))
            return Float.parseFloat(String.valueOf(value/0.0035));
        else if(valueType.equals("miles"))
            return Float.parseFloat(String.valueOf(value));
        else return 0;
    }
}
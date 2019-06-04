package lt.minvib.magicprefexample.gsonpreference;

import com.google.gson.annotations.SerializedName;


/**
 * Created by minda on 2016-01-03.
 */
public class ModelSimple {

    @SerializedName("integerNumber")
    private int integerNumber;

    @SerializedName("string")
    private String string;

    @SerializedName("doubleNumber")
    private double doubleNumber;

    @SerializedName("longNumber")
    private long longNumber;

    @SerializedName("booleanValue")
    private boolean booleanValue;


    public ModelSimple(int integerNumber, String string, double doubleNumber, long longNumber, boolean booleanValue) {
        this.integerNumber = integerNumber;
        this.string = string;
        this.doubleNumber = doubleNumber;
        this.longNumber = longNumber;
        this.booleanValue = booleanValue;
    }

    public ModelSimple() {
    }

    public int getIntegerNumber() {
        return integerNumber;
    }

    public String getString() {
        return string;
    }

    public double getDoubleNumber() {
        return doubleNumber;
    }

    public long getLongNumber() {
        return longNumber;
    }


    public boolean isBooleanValue() {
        return booleanValue;
    }

}

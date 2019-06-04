package lt.minvib.magicprefexample.jsonpreference;

import org.json.JSONException;
import org.json.JSONObject;

import lt.minvib.magicpreferences.JSONPreference;

/**
 * Created by minda on 2016-01-03.
 */
public class ModelSimple implements JSONPreference<ModelSimple> {

    private int integerNumber;
    private String string;
    private double doubleNumber;
    private long longNumber;
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

    @Override
    public String toJSON() throws JSONException {

        JSONObject object  = new JSONObject();
        object.put("integerNumber",integerNumber);

        if(string != null) {
            object.put("string", string);
        }
        object.put("doubleNumber",doubleNumber);
        object.put("longNumber",longNumber);

        object.put("booleanValue",booleanValue);

        return object.toString();
    }

    @Override
    public ModelSimple fromJSON(String string) throws JSONException {

        JSONObject object  = new JSONObject(string);

        this.integerNumber = object.getInt("integerNumber");
        this.string =  object.optString("string",null);
        this.doubleNumber =  object.getDouble("doubleNumber");
        this.longNumber =  object.getLong("longNumber");
        this.booleanValue =  object.getBoolean("booleanValue");

        return this;
    }
}

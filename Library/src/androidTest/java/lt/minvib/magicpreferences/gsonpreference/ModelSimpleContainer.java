package lt.minvib.magicpreferences.gsonpreference;

import com.google.gson.annotations.SerializedName;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import lt.minvib.magicpreferences.JSONPreference;

/**
 * Created by minda on 2016-01-03.
 */
public class ModelSimpleContainer {

    @SerializedName("simples")
    private List<ModelSimple> simples;

    @SerializedName("extraDetails")
    private String extraDetails;

    public ModelSimpleContainer(List<ModelSimple> simple, String extraDetails) {
        this.simples = simple;
        this.extraDetails = extraDetails;
    }

    public ModelSimpleContainer() {
        simples = new ArrayList<>();
        extraDetails = null;
    }


    public List<ModelSimple> getSimples() {
        return simples;
    }

    public void setSimples(List<ModelSimple> simples) {
        this.simples = simples;
    }

    public String getExtraDetails() {
        return extraDetails;
    }

    public void setExtraDetails(String extraDetails) {
        this.extraDetails = extraDetails;
    }
}

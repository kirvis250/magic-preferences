package lt.minvib.magicpreferences.jsonpreference;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import lt.minvib.magicpreferences.JSONPreference;

/**
 * Created by minda on 2016-01-03.
 */
public class ModelSimpleContainer implements JSONPreference<ModelSimpleContainer> {

    private List<ModelSimple> simples;
    private String extraDetails;

    public ModelSimpleContainer(List<ModelSimple> simple, String extraDetails) {
        this.simples = simple;
        this.extraDetails = extraDetails;
    }

    public ModelSimpleContainer() {
        simples = new ArrayList<>();
        extraDetails = null;
    }

    @Override
    public String toJSON() throws JSONException {

        JSONObject object  = new JSONObject();
        JSONArray array = new JSONArray();

        if(simples != null)
            for(ModelSimple simps : simples){
                array.put(new JSONObject(simps.toJSON()));
            }

        object.put("simples",array);

        if(extraDetails != null) {
            object.put("extraDetails", extraDetails);
        }


        return object.toString();
    }

    @Override
    public ModelSimpleContainer fromJSON(String string) throws JSONException {
        simples = new ArrayList<>();
        JSONObject object  = new JSONObject(string);
        JSONArray array = object.getJSONArray("simples");

        if(array != null)
            for(int i = 0; i < array.length(); i++)
            {
                simples.add(new ModelSimple().fromJSON(array.get(i).toString()));
            }

        extraDetails = object.getString("extraDetails");
        return this;
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

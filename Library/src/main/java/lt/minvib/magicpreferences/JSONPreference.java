package lt.minvib.magicpreferences;

import org.json.JSONException;

/**
 * Created by Mindaugas Viburys on 2015-12-21.
 * farmis-as noFrame.lt
 */
public interface JSONPreference<T> {
    String toJSON() throws JSONException;
    T fromJSON(String string) throws JSONException;
}

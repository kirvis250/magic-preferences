package lt.minvib.magicprefexample;



import org.junit.Test;

import androidx.test.platform.app.InstrumentationRegistry;
import lt.minvib.magicpreferences.MagicBooleanPreference;
import lt.minvib.magicpreferences.MagicFloatPreference;
import lt.minvib.magicpreferences.MagicIntegerPreference;
import lt.minvib.magicpreferences.MagicLongPreference;
import lt.minvib.magicpreferences.MagicStringPreference;

import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;
import static junit.framework.TestCase.assertEquals;


/**
 * Created by minda on 2016-01-03.
 */
public class TestBasicPreferences {



    @Test
    public void testStringPreference(){
       String value = "labarasfshgrr";
        MagicStringPreference pref = new MagicStringPreference(null,"simple",null);
        pref.set(getInstrumentation().getContext(),value);
        String prefFinal = pref.get(getInstrumentation().getContext());
        assertEquals(value,prefFinal);
    }


    @Test
    public void testLongPreference(){
        Long value =  5L;
        MagicLongPreference pref = new MagicLongPreference(null,"simple",0L);
        pref.set(getInstrumentation().getContext(),value);
        Long prefFinal = pref.get(getInstrumentation().getContext());
        assertEquals(value,prefFinal);
    }


    @Test
    public void testIntegerPreference(){
        int value =  5;
        MagicIntegerPreference pref = new MagicIntegerPreference(null,"simple",0);
        pref.set(getInstrumentation().getContext(),value);
        int prefFinal = pref.get(getInstrumentation().getContext());
        assertEquals(value,prefFinal);
    }

    @Test
    public void testFloatPreference(){
        float value = 5.0f;
        MagicFloatPreference pref = new MagicFloatPreference(null,"simple",0.1f);
        pref.set(getInstrumentation().getContext(),value);
        float prefFinal = pref.get(getInstrumentation().getContext());
        assertEquals(value,prefFinal);
    }


    @Test
    public void testBooleanPreference(){
        boolean value = true;
        MagicBooleanPreference pref = new MagicBooleanPreference(null,"simple",false);
        pref.set(getInstrumentation().getContext(),value);
        boolean prefFinal = pref.get(getInstrumentation().getContext());
        assertEquals(value,prefFinal);
    }

}

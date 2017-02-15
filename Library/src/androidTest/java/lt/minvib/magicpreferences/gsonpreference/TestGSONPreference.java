package lt.minvib.magicpreferences.gsonpreference;

import android.test.InstrumentationTestCase;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import lt.minvib.magicpreferences.MagicGsonPreference;

/**
 * Created by minda on 2016-01-03.
 */
public class TestGSONPreference extends InstrumentationTestCase {


    public void testGsonSimple(){
        ModelSimple simple = new ModelSimple(1, "one",1.1,1L,false);

        MagicGsonPreference<ModelSimple> modelsimple = new MagicGsonPreference<>(null,"simple",null, ModelSimple.class);
        modelsimple.set(getInstrumentation().getContext(),simple);

        ModelSimple simplefinal = modelsimple.get(getInstrumentation().getContext());

        assertEquals(simple.getIntegerNumber(),simplefinal.getIntegerNumber());
        assertEquals(simple.getDoubleNumber(),simplefinal.getDoubleNumber());
        assertEquals(simple.getString(),simplefinal.getString());
        assertEquals(simple.getLongNumber(),simplefinal.getLongNumber());
        assertEquals(simple.isBooleanValue(),simplefinal.isBooleanValue());
    }




    public void testGsonContainer(){

        List<ModelSimple> simpleList = new ArrayList<>();
        simpleList.add( new ModelSimple(0, "one",1.1,1L,false));
        simpleList.add( new ModelSimple(1, "one",1.1,1L,false));
        simpleList.add( new ModelSimple(2, "one",1.1,1L,false));
        simpleList.add( new ModelSimple(3, "one",1.1,1L,false));
        simpleList.add( new ModelSimple(4, "one",1.1,1L,false));
        simpleList.add( new ModelSimple(5, "one",1.1,1L,false));

       ModelSimpleContainer container = new ModelSimpleContainer(simpleList,"labas");

        MagicGsonPreference<ModelSimpleContainer> modelsimple = new MagicGsonPreference<>(null,"simple",null, ModelSimpleContainer.class);
        modelsimple.set(getInstrumentation().getContext(),container);

        ModelSimpleContainer simplefinal = modelsimple.get(getInstrumentation().getContext());

        assertEquals(container.getExtraDetails(),simplefinal.getExtraDetails());

        for(int i = 0; i < simplefinal.getSimples().size() ; i++ ){

            ModelSimple orig = simpleList.get(i);
            ModelSimple fina = simplefinal.getSimples().get(i);

            assertEquals(orig.getIntegerNumber(),fina.getIntegerNumber());
            assertEquals(orig.getDoubleNumber(),fina.getDoubleNumber());
            assertEquals(orig.getString(),fina.getString());
            assertEquals(orig.getLongNumber(),fina.getLongNumber());
            assertEquals(orig.isBooleanValue(),fina.isBooleanValue());
        }
    }


}

package lt.minvib.magicprefexample.jsonpreference;


import java.util.ArrayList;
import java.util.List;

import lt.minvib.magicpreferences.MagicJsonPreference;

import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by minda on 2016-01-03.
 */
public class TestJsonPreference {


    public void testJsonSimple(){
        ModelSimple simple = new ModelSimple(1, "one",1.1,1L,false);

        MagicJsonPreference<ModelSimple> modelsimple = new MagicJsonPreference<>(null,"simple",null,new ModelSimple());
        modelsimple.set(getInstrumentation().getContext(),simple);

        ModelSimple simplefinal = modelsimple.get(getInstrumentation().getContext());

        assertEquals(simple.getIntegerNumber(),simplefinal.getIntegerNumber());
        assertEquals(simple.getDoubleNumber(),simplefinal.getDoubleNumber());
        assertEquals(simple.getString(),simplefinal.getString());
        assertEquals(simple.getLongNumber(),simplefinal.getLongNumber());
        assertEquals(simple.isBooleanValue(),simplefinal.isBooleanValue());
    }



    public void testJsonContainer(){

        List<ModelSimple> simpleList = new ArrayList<>();
        simpleList.add( new ModelSimple(0, "one",1.1,1L,false));
        simpleList.add( new ModelSimple(1, "one",1.1,1L,false));
        simpleList.add( new ModelSimple(2, "one",1.1,1L,false));
        simpleList.add( new ModelSimple(3, "one",1.1,1L,false));
        simpleList.add( new ModelSimple(4, "one",1.1,1L,false));
        simpleList.add( new ModelSimple(5, "one",1.1,1L,false));

        ModelSimpleContainer container = new ModelSimpleContainer(simpleList,"labas");

        MagicJsonPreference<ModelSimpleContainer> modelsimple = new MagicJsonPreference<>(null,"simple",null,new ModelSimpleContainer());
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

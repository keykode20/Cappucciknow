package co.uk.emilyo.cbt.node.impl.git;

import co.uk.emilyo.cbt.node.Node;
import co.uk.emilyo.cbt.node.impl.git.old.FeatureFileMapper;
import co.uk.emilyo.cbt.node.impl.git.old.MapToClass;
import com.helger.jcodemodel.JClassAlreadyExistsException;

import java.io.IOException;

/**
 * Created by Emilio on 09/07/2018.
 */
public class MapToClassGeneratorNode extends Node {


    @Override
    public Object action(Object o) {
        FeatureFileMapper featureFileMapper = (FeatureFileMapper)o;
        MapToClass mapToClass = new MapToClass();
        try {
            mapToClass.classGenerator(featureFileMapper);
        } catch (JClassAlreadyExistsException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return mapToClass;

    }
}

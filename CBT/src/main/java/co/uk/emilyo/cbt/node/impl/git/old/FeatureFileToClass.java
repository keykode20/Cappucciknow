package co.uk.emilyo.cbt.node.impl.git.old;

import com.helger.jcodemodel.JClassAlreadyExistsException;

import java.io.IOException;

/**
 * Created by Emilio on 07/06/2018.
 */
public interface FeatureFileToClass {
    public void classGenerator(FeatureFileMapper proxy) throws JClassAlreadyExistsException, IOException;
}
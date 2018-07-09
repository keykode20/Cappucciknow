package co.uk.emilyo.cbt.node.impl.git.old;

/**
 * @author Emilio
 */
public interface FeatureFileReader {
    /**
     *
     * @param resourcePath is the resource path you want to transform
     * @return FeatureFileMapper is the data structure used to <br>
     *     contain the structure of the feature file.
     *
     */
    FeatureFileMapper getContent(String resourcePath);
}
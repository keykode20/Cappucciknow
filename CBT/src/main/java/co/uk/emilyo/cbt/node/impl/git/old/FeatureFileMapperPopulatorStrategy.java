package co.uk.emilyo.cbt.node.impl.git.old;

import java.util.Collection;

/**
 * Created by Emilio on 07/06/2018.
 */
public interface FeatureFileMapperPopulatorStrategy {
    /**
     *
     * @param mapper is the data structure to populate. <br>
     *        Each implementation should have a strategy on how populate the map
     */
    void populate(Collection<String> list, FeatureFileMapper mapper);
}

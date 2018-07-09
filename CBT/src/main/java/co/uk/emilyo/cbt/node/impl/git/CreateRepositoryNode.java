package co.uk.emilyo.cbt.node.impl.git;

import co.uk.emilyo.cbt.node.Node;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;

import java.io.File;
import java.io.IOException;

/**
 * Created by Emilio on 08/07/2018.
 */
public class CreateRepositoryNode extends Node {

    private Node generateResourceChain;

    @Override
    public Object action(Object o) {

        Repository repo = null;
        try {
            repo = FileRepositoryBuilder.create(new File("C:\\jiraplugin\\Cappucciknow\\src\\main\\java\\my\\code\\generated",".git"));
            repo.create();
            generateResourceChain.action(null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Node getGenerateResourceChain() {
        return generateResourceChain;
    }

    public void setGenerateResourceChain(Node generateResourceChain) {
        this.generateResourceChain = generateResourceChain;
    }
}

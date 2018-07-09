package co.uk.emilyo.cbt.node.impl.git;

import co.uk.emilyo.cbt.node.Node;
import co.uk.emilyo.cbt.node.impl.git.old.FeatureFileMapper;
import co.uk.emilyo.cbt.node.impl.git.old.FileSystemFeatureFileReaderImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Emilio on 09/07/2018.
 */
public class FileSystemResourceReaderNode extends Node {
    @Override
    public Object action(Object o) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        FileSystemFeatureFileReaderImpl fileSystemFeatureFileReaderImpl = ctx.getBean("fileSystemFeatureFileReaderImpl", FileSystemFeatureFileReaderImpl.class);
        String fileName = "C://lines//lines.txt";
        FeatureFileMapper content = fileSystemFeatureFileReaderImpl.getContent(fileName);
        return content;
    }
}

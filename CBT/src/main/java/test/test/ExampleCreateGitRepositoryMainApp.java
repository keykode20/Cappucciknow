package test.test;

import co.uk.emilyo.cbt.node.Node;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Emilio on 09/07/2018.
 */
public class ExampleCreateGitRepositoryMainApp {



    public static void main(String... args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        Node node1 = ctx.getBean("createRepo",Node.class);
        node1.start(null);
    }
}

import co.uk.emilyo.cbt.node.Node;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Emilio on 08/07/2018.
 */
public class ExampleMainApp {
    public static void main(String... args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        Node node1 = ctx.getBean("node1", Node.class);
        Object ciao = node1.start("ciao");
        System.out.println(ciao);
    }
}

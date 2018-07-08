import co.uk.emilyo.hook.jira.client.JiraClient;

import java.io.IOException;

/**
 * Created by Emilio on 08/07/2018.
 */

/**
 * run this with jira server up and running!
 */
public class JiraTestExample {
    public static void main(String... args){
        JiraClient myJiraClient = new JiraClient("admin", "admin", "http://localhost:2990/jira");
        System.out.println(myJiraClient.getIssue("ASD-8").getDescription());
        try {
            myJiraClient.getJiraRestClient().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

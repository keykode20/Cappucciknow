package co.uk.emilyo.hook.controller;

import co.uk.emilyo.hook.jira.client.JiraClient;
import com.atlassian.jira.rest.client.api.domain.Issue;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;

/**
 * Created by Emilio on 08/07/2018.
 */
@Controller
public class WebHookController {

    @PostMapping("/jira")
    public void webHook(@RequestBody String json, Model model) throws JSONException {
        System.out.println(json);
        JiraClient myJiraClient = new JiraClient(
                "admin",
                "admin",
                "http://localhost:2990/jira");

        JSONObject obj = new JSONObject(json);
        JSONObject issue2 = obj.getJSONObject("issue");
        System.out.println(issue2.get("id"));
        Issue issue = myJiraClient.getIssue("ASD-36");
        System.out.println(issue.getDescription());

        ObjectMapper mapper = new ObjectMapper();
        String issue1 = obj.get("issue").toString();
        System.out.println(issue1);
    }
}

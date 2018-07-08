package co.uk.emilyo.hook.controller;

import org.codehaus.jettison.json.JSONException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by Emilio on 08/07/2018.
 */
@Controller
public class WebHookController {

    @PostMapping("/jira")
    public void webHook(@RequestBody String json, Model model) throws JSONException {

    }
}

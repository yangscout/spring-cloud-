package cn.itcast.controller;

import cn.itcast.client.SidecarAPIClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("sidecarpy")
public class SidecarController {

    @Autowired
    private SidecarAPIClient sidecarAPIClient;

    @RequestMapping("/java-user")
    public String JavaUser() {
        return "{'username': 'java', 'password': 'java'}";
    }

    @RequestMapping("/python-user")
    public String PythonUser() {
        return sidecarAPIClient.getUser().toString();
    }
    @RequestMapping("/python-health")
    public String Pythonhealth() {
        return sidecarAPIClient.getHealth().toString();
    }

}
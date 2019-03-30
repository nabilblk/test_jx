package ma.nabilblk.test_jx.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {
    @RequestMapping(method = RequestMethod.GET, path = "/ping")
    public String ping(){
        return "pong";
    }
}

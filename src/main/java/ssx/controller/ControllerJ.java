package ssx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ssx.service.ServiceJ;

import java.util.Map;

@Controller
@CrossOrigin
public class ControllerJ {
    @Autowired
    ServiceJ serviceJ;

    @RequestMapping(value = "/tenth/addname.do")
    @ResponseBody
    public Map addName(@RequestBody Map map){
        return serviceJ.addName(map);
    }
}

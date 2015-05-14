package cn.edu.swust.vis.resource;

import cn.edu.swust.vis.resource.domain.Hello;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloController
{
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Hello> getHello()
    {
        return new ResponseEntity<Hello>(new Hello("Hello SWUST"), HttpStatus.OK);
    }
}

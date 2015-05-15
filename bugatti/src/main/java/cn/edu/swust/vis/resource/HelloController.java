package cn.edu.swust.vis.resource;

import cn.edu.swust.vis.resource.domain.Hello;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/hello")
public class HelloController
{
    @RequestMapping(method = RequestMethod.GET)
    public Hello getHello()
    {
        return new Hello("Hello SWUST VIS");
    }

    @RequestMapping(method = RequestMethod.POST)
    public Hello setMixedHello(@RequestBody Hello hello)
    {
        return hello;
    }
}

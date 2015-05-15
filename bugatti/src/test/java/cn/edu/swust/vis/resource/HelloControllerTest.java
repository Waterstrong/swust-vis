package cn.edu.swust.vis.resource;

import cn.edu.swust.vis.resource.domain.Hello;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;


public class HelloControllerTest
{

    private HelloController helloController;

    @Before
    public void setUp()
    {
        helloController = new HelloController();
    }

    @Test
    public void should_be_able_to_get_hello()
    {
        Hello hello = helloController.getHello();

        assertThat(hello.getMessage()).isEqualTo("Hello SWUST VIS");
    }

    @Test
    public void should_be_able_to_set_hello()
    {
        Hello expectedHello = helloController.setMixedHello(new Hello("Hello World"));

        assertThat(expectedHello.getMessage()).isEqualTo("Hello World");
    }
}

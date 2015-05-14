package cn.edu.swust.vis.resource;

import cn.edu.swust.vis.resource.domain.Hello;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;


public class HelloControllerTest
{
    @Test
    public void should_be_able_to_get_hello_world_string()
    {
        HelloController helloWorldController = new HelloController();

        ResponseEntity<Hello> response = helloWorldController.getHello();

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody().getMessage()).isEqualTo("Hello SWUST");
    }
}

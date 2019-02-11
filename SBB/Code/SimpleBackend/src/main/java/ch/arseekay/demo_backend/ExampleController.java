package ch.arseekay.demo_backend;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@ApiOperation(value = "Gibt eine Test Antwort zurück")
public class ExampleController {
    @GetMapping(value = "/test")
    public String getTestValue() {
        return "Test";
    }

    @ApiOperation(value = "Gibt Eingabe als Antwort zurück")
    @PostMapping(value = "/echo")
    public String getEcho(@RequestParam(value = "call") String call) {
        return call;
    }
}

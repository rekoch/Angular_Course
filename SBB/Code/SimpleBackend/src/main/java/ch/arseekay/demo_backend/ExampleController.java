package ch.arseekay.demo_backend;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@ApiOperation(value = "Gibt eine Test Antwort zurück")
public class ExampleController {
    @GetMapping(value = "/test")
    public String getTestValue() {
        return "{\"response\": \"Test\"}";
    }

    @ApiOperation(value = "Gibt Eingabe als Antwort zurück")
    @PostMapping(value = "/echo")
    public String getEcho(@RequestParam(value = "call") String call) {
        return "{\"response\":" + call + "}";
    }

    @ApiOperation(value = "Gibt einen Fehler zurück")
    @GetMapping(value = "/error")
    public HttpEntity getError() {
        return new ResponseEntity<>("Dieser Aufruf ist leider fehlgeschlagen. Probieren wird leider auch nichts bringen. Versuch es nur", HttpStatus.I_AM_A_TEAPOT);
    }
}

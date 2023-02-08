import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@Slf4j
@RequestMapping("/testcontroller")
public class TestController {

    @GetMapping("{id}")
    public ResponseEntity<String> getById() {
        log.info("Sono passato");
        return new ResponseEntity<>("Ciao", HttpStatus.OK);
    }

}

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/testcontroller")
public class TestController {

    @GetMapping("{id}")
    public ResponseEntity<String> getById() {

        return new ResponseEntity<>("Ciao", HttpStatus.OK);
    }

}

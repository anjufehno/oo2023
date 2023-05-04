package ee.jelizaveta.kodutooapp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class AllahindlustController {
    List<Allahindlust> allahindlusts = new ArrayList<>(Arrays.asList(
            new Allahindlust(1, 20, true),
            new Allahindlust(2,15, true),
            new Allahindlust(3,10, true),
            new Allahindlust(4,15, true)
    ));

    @GetMapping("kindlustused")
    public List<Allahindlust> saaKindlustused() {
        return allahindlusts;
    }
}
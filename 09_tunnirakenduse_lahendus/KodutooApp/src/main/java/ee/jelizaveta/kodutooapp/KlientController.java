package ee.jelizaveta.kodutooapp;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class KlientController {

    List<Klient> kliendid = new ArrayList<>(Arrays.asList(
            new Klient(1, "Liza", "Kruglova"),
            new Klient(2, "Michael", "Novak"),
            new Klient(3, "Martin", "Svidinskii"),
            new Klient(4, "Artjom", "Pigarev")
    ));

    @GetMapping("kliendid")
    public List<Klient> saaKliendid() {
        return kliendid;
    }

    @DeleteMapping("kustuta-klient/{index}")
    public String kustutaIsik(@PathVariable int index) {
        kliendid.remove(index);
        return "Klient sai kustutatud!";
    }

    @PostMapping("lisa-klient")
    public List<Klient> lisaKlient(
            @RequestParam int id,
            @RequestParam String eesnimi,
            @RequestParam String perenimi) {
        kliendid.add(new Klient(id, eesnimi, perenimi));
        return kliendid;
    }

}
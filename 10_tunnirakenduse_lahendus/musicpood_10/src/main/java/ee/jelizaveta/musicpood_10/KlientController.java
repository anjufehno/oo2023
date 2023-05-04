package ee.jelizaveta.musicpood_10;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.GetExchange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController

public class KlientController {
    List<Klient> kliendid = new ArrayList<>(Arrays.asList(
            new Klient(1, "Martin","Nesvetajev", new Date()),
            new Klient(2, "Alex", "Svid", new Date()),
            new Klient(3, "Artjom", "Pigarev", new Date()),
            new Klient(4, "Michael", "Must", new Date()),
            new Klient(5, "Jelizaveta", "Krug", new Date())
    ));

    @GetMapping("kliendid")
    public List<Klient> saaKliendid() {
        return kliendid;
    }

    @DeleteMapping("kustuta-klient/{index}")
    public String kustutaKlient(@PathVariable int index) {
        kliendid.remove(index);
        return "Klient kustutatud!";
    }

    @PostMapping("lisa-klient")
    public List<Klient> lisaIsikURLParameetritega(
            @RequestParam int id,
            @RequestParam String eesnimi,
            @RequestParam String perenimi) {
        kliendid.add(new Klient(id, eesnimi, perenimi, new Date()));
        return kliendid;
    }
}
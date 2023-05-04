package ee.jelizaveta.musicpood_10;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.GetExchange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController

public class ToodeController {
    List<Toode> instrumentid = new ArrayList<>(Arrays.asList(
            new Toode(1, "Drumid", 150),
            new Toode(2, "Kitari", 300),
            new Toode(3, "Viiul", 190),
            new Toode(4, "Klaver", 500),
            new Toode(5, "Orel", 700)
    ));

    @GetMapping("instrumentid")
    public List<Toode> saaInstrumentid() {
        return instrumentid;
    }

    @DeleteMapping("kustuta-ratas/{index}")
    public String kustutaInstrument(@PathVariable int index) {
        instrumentid.remove(index);
        return "Instrumentid kustutatud!";
    }

    @PostMapping("lisa-ratas")
    public List<Toode> lisaRatas(
            @RequestParam int id,
            @RequestParam String muusikainstrument,
            @RequestParam int hind) {
        instrumentid.add(new Toode(id, muusikainstrument,  hind));
        return instrumentid;
    }
}
package ee.jelizaveta.kodutooapp;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@RestController
public class IphonidListController {
    List<Iphonid> iphonid = new ArrayList<>(Arrays.asList(
            new Iphonid(1,"Model S", 1000, true),
            new Iphonid(2,"Model XY", 1500, true),
            new Iphonid(3,"Model 3", 1750, true)
    ));

    @GetMapping("iphonid")
    public List<Iphonid> saaIphonid() {
        return iphonid;
    }

    @GetMapping ("kustuta-iphonid/{index}")
    public String kustutaIphonid(@PathVariable int index) {
        iphonid.remove(index);
        return "Iphonid kustutatud!";
    }

    @GetMapping("lisa-iphonid")
    public List<Iphonid> lisaIphonidURLParameetritega(
            @RequestParam int id,
            @RequestParam String nimi,
            @RequestParam float hind,
            @RequestParam boolean aktiivne) {
        iphonid.add(new Iphonid(id, nimi, hind, aktiivne));
        return iphonid;
    }
}
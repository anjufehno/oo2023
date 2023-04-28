package ee.jelizaveta.kodutooapp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class IphonidController {
    Iphonid iphonid = new Iphonid(1, "Model S", 1000, true);

    @GetMapping("iphonid")
    public Iphonid saaIphonid(){
        return iphonid;
    }

    @GetMapping("kustuta-iphonid")
    public String kustutaIphonid(){
        iphonid = null;
        return "Edukalt kustutatud";
    }

    @GetMapping("muuda-tootab")
    public Iphonid muudaTootab() {
        iphonid.setIphontootab(!iphonid.isIphontootab());
        return iphonid;
    }

}

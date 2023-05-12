package ee.jelizaveta.kontrolltoo.lemmikloom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class OmanikController {

    @Autowired
    LemmikLoomRepository lemmikLoomRepository;

    @Autowired
    OmanikRepository omanikRepository;

   public List<Omanik> omaniks = new ArrayList<>(Arrays.asList(
        new Omanik(1L, "Svidinski"),
        new Omanik(2L, "Roots"),
        new Omanik(3L, "Pigarev")
    ));


    @GetMapping("lisa-LemmikLoom")
    public List<LemmikLoom> lisaOmaniks(
            @RequestParam Long id,
            @RequestParam String nimi,
            @RequestParam float kaal,
            @RequestParam Long omanikId,
            @RequestParam int kogus
    ) {
        Omanik omanik = omanikRepository.findById(omanikId).get();
        lemmikLoomRepository.save(new LemmikLoom(id, nimi, kaal, omanikId, kogus));
        return lemmikLoomRepository.findAll();
    }

    @GetMapping("lisa-omanik")
    public List<Omanik> lisaOmanik(
            @RequestParam Long id,
            @RequestParam String perenimi
    ) {
        omanikRepository.save(new Omanik(id,perenimi));
        return omanikRepository.findAll();
    }
    @GetMapping("leia-koig-suurem")
    public LemmikLoom leiaKaalSurr(
            @RequestParam float kaal
    ) {
        List<LemmikLoom> lemmikLooms = lemmikLoomRepository.findAll();
        for (LemmikLoom lemmikLoom : lemmikLooms) {
            if (lemmikLoom.getKaal() > lemmikLoom.getKaal()) {
                return lemmikLoom;
            }
        }
        return null;
    }
    @GetMapping("leia-koig-vaikem")
    public LemmikLoom leiaKaalVaike(
            @RequestParam float kaal
    ) {
        List<LemmikLoom> lemmikLooms = lemmikLoomRepository.findAll();
        for (LemmikLoom lemmikLoom : lemmikLooms) {
            if (lemmikLoom.getKaal() < lemmikLoom.getKaal()) {
                return lemmikLoom;
            }
        }
        return null;
    }
}

package ee.jelizaveta.kodutooapp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Klient {
    private int id;
    private String eesnimi;
    private String perenimi;
}
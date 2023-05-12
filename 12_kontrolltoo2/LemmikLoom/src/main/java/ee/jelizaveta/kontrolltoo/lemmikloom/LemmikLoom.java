package ee.jelizaveta.kontrolltoo.lemmikloom;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class LemmikLoom {
    @Id
    private Long id;
    public String nimi;
    public float kaal;
    private Long omanikId;
    private int kogus;

}

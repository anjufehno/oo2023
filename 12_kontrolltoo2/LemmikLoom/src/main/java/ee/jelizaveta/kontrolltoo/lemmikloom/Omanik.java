package ee.jelizaveta.kontrolltoo.lemmikloom;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Omanik {
    @Id
    private Long omanikId;
    private String perenimi;
}

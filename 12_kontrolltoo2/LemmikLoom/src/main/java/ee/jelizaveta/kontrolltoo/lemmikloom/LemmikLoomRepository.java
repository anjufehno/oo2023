package ee.jelizaveta.kontrolltoo.lemmikloom;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface LemmikLoomRepository extends JpaRepository<LemmikLoom, String> {
    List<LemmikLoom> findByOmanik(Omanik omanik);
}

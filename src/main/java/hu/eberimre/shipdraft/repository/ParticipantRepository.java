package hu.eberimre.shipdraft.repository;

import hu.eberimre.shipdraft.domain.Participant;
import hu.eberimre.shipdraft.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant, Integer> {


}

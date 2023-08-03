package hu.eberimre.shipdraft.repository;

import hu.eberimre.shipdraft.domain.Participant;
import hu.eberimre.shipdraft.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant, Integer> {


    Optional<Participant> findByPerson_Id(Integer id);
    Optional<Participant> deleteByPerson_Id(Integer id);
}

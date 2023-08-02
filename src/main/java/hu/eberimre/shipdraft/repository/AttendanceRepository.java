package hu.eberimre.shipdraft.repository;

import hu.eberimre.shipdraft.domain.Attendance;
import hu.eberimre.shipdraft.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Integer> {


}

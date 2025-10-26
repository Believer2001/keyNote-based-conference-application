package enset.ma.configurationservice.repositroy;

import enset.ma.configurationservice.entities.Conference;

@RestRepositoryRestResource

public interface ConferenceRespository extends JpaRepository<Conference, String> {
}

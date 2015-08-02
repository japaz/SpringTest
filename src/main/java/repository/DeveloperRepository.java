package repository;

import org.springframework.data.repository.CrudRepository;

import entity.Developer;

public interface DeveloperRepository extends CrudRepository<Developer, Long> {

}

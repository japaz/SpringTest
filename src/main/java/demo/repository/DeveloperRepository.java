package demo.repository;

import org.springframework.data.repository.CrudRepository;

import demo.entity.Developer;

public interface DeveloperRepository extends CrudRepository<Developer, Long> {

}

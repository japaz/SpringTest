package repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import entity.Skill;

public interface SkillRepository extends CrudRepository<Skill, Long> {
	public List<Skill> findByLabel(String label);
}

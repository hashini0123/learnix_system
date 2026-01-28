package edu.icet.repository;

import edu.icet.model.entity.SchoolClassEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolClassRepository extends JpaRepository<SchoolClassEntity,Integer> {
}

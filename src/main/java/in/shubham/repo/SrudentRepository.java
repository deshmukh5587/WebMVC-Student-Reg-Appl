package in.shubham.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shubham.entity.StudentEntity;

public interface SrudentRepository extends JpaRepository<StudentEntity, Integer> {
	

}

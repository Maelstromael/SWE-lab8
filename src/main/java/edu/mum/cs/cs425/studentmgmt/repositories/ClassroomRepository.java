package edu.mum.cs.cs425.studentmgmt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.cs425.studentmgmt.model.Classroom;

@Repository
public interface ClassroomRepository extends JpaRepository<Classroom, Long>{

}

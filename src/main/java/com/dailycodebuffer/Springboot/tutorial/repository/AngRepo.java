package com.dailycodebuffer.Springboot.tutorial.repository;

import com.dailycodebuffer.Springboot.tutorial.entity.Angestellter;
import com.dailycodebuffer.Springboot.tutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AngRepo extends JpaRepository<Angestellter,Long> {

    List<Angestellter> findAllByDepartment(Department department);
}

package com.dailycodebuffer.Springboot.tutorial.repository;

import com.dailycodebuffer.Springboot.tutorial.entity.Angestellter;
import com.dailycodebuffer.Springboot.tutorial.entity.Department;

import java.util.List;

public interface DBZugriffAng {

    Angestellter angestellterSpeichern(Angestellter angestellter);
    List<Angestellter> alleAngestellten();
    List<Angestellter> alleAngestelltenimDepartment(Department department);
    void angestellterLoeschenmitId(Long id);




}

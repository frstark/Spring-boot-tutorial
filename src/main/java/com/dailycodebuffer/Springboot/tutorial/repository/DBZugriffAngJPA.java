package com.dailycodebuffer.Springboot.tutorial.repository;

import com.dailycodebuffer.Springboot.tutorial.entity.Angestellter;
import com.dailycodebuffer.Springboot.tutorial.entity.Department;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBZugriffAngJPA implements DBZugriffAng {

    private AngRepo angRepo;

    public DBZugriffAngJPA(AngRepo angRepo) {
        this.angRepo = angRepo;
    }

    @Override
    public Angestellter angestellterSpeichern(Angestellter angestellter) {
        return this.angRepo.save(angestellter);
    }

    @Override
    public List<Angestellter> alleAngestellten() {
        return this.angRepo.findAll();
    }

    @Override
    public List<Angestellter> alleAngestelltenimDepartment(Department department) {
        return this.angRepo.findAllByDepartment(department);
    }

    @Override
    public void angestellterLoeschenmitId(Long id) {
        this.angRepo.deleteById(id);
    }
}

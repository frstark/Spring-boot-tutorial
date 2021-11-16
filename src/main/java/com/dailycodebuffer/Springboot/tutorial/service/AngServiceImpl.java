package com.dailycodebuffer.Springboot.tutorial.service;


import com.dailycodebuffer.Springboot.tutorial.entity.Angestellter;
import com.dailycodebuffer.Springboot.tutorial.entity.Department;
import com.dailycodebuffer.Springboot.tutorial.repository.DBZugriffAng;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AngServiceImpl implements AngService {

    private  DBZugriffAng dbZugriffAng;

    public AngServiceImpl(DBZugriffAng dbZugriffAng) {this.dbZugriffAng = dbZugriffAng;}


    @Override
    public Angestellter angestellterSpeichern(Angestellter angestellter) {
        return this.dbZugriffAng.angestellterSpeichern(angestellter);
    }

    @Override
    public List<Angestellter> alleAngestellten() {
        return this.dbZugriffAng.alleAngestellten();
    }

    @Override
    public List<Angestellter> alleAngestelltenimDepartment(Department department) {
        return this.dbZugriffAng.alleAngestelltenimDepartment(department);
    }

    @Override
    public void angestellterLoeschenmitId(Long id) {
        this.dbZugriffAng.angestellterLoeschenmitId(id);
    }
}

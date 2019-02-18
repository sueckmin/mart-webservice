package com.moons.webservice.domain.Emps;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Emp {

    @EmbeddedId
    private EmpId empId;

    private String name;

    @Builder
    public Emp(EmpId empId, String name){
        this.empId = empId;
        this.name = name;
    }

}

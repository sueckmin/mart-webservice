package com.moons.webservice.dto.Emps;

import com.moons.webservice.domain.emps.Emp;
import lombok.Getter;

@Getter
public class EmpMainResponseDto {
    private String employeedId;
    private String companyId;
    private String name;

    public EmpMainResponseDto(Emp emp) {
        this.employeedId = emp.getEmpId().getEmployeedId();
        this.companyId = emp.getEmpId().getCompanyId();
        this.name = emp.getName();
    }

}

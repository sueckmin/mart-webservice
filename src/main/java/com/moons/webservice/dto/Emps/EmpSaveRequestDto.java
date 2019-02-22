package com.moons.webservice.dto.Emps;

import com.moons.webservice.domain.emps.Emp;
import com.moons.webservice.domain.emps.EmpId;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EmpSaveRequestDto {

    private String employeedId;
    private String companyId;
    private String name;

    @Builder
    public EmpSaveRequestDto(String employeedId, String companyId, String name){
        this.employeedId = employeedId;
        this.companyId = companyId;
        this.name = name;
    }

    public Emp toEntity(){
        return Emp.builder()
                .empId(new EmpId(employeedId, companyId))
                .name(name)
                .build();
    }

}

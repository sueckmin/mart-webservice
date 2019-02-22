package com.moons.webservice.domain.emps;

import lombok.*;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class EmpId implements Serializable {

    private String employeedId;

    private String companyId;

    public EmpId(String employeedId, String companyId){
        this.employeedId = employeedId;
        this.companyId = companyId;
    }

    @Override
     public int hashCode(){ return Objects.hash(getCompanyId(), getEmployeedId()); }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        EmpId that = (EmpId) obj;

        return Objects.equals(getCompanyId(), that.getCompanyId()) &&
                Objects.equals(getEmployeedId(), getEmployeedId());
    }
}

package com.moons.webservice.domain.etls;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class EtlsId implements Serializable {

    @GeneratedValue
    private Long id;
    private String etlId;

    @Builder
    public EtlsId(String etlId){
        this.etlId = etlId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(!(o instanceof EtlsId)) return false;
        EtlsId that = (EtlsId) o;
        return Objects.equals(getEtlId(), that.getEtlId()) &&
                Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode(){
        return Objects.hash(getId(), getEtlId());
    }

    }

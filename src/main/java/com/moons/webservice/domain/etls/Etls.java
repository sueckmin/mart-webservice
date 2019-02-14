package com.moons.webservice.domain.etls;

import com.moons.webservice.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Etls extends BaseTimeEntity {


    @EmbeddedId
    private EtlsId id;

    private String etlTp;
    private String etlGrpId;

    private String etlNM;
    private String jobId;
    private String preEtlId;
    private String jobCycle;
    private String cycleTime;
    private String etlPk;
    private String grpEtlId;
    private String tblId;

    @Builder
    public Etls(EtlsId id, String etlTp, String etlGrpId, String etlNM, String jobId, String preEtlId, String jobCycle, String cycleTime, String etlPk, String grpEtlId, String tblId){
        this.id = id;
        this.etlTp = etlTp;
        this.etlGrpId = etlGrpId;
        this.etlNM = etlNM;
        this.jobId = jobId;
        this.preEtlId = preEtlId;
        this.jobCycle = jobCycle;
        this.cycleTime = cycleTime;
        this.etlPk = etlPk;
        this.grpEtlId = grpEtlId;
        this.tblId = tblId;
    }

}

package com.moons.webservice.dto.etls;

import com.moons.webservice.domain.etls.Etls;
import com.moons.webservice.domain.etls.EtlsId;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class EtlsSaveRequestDto {

    private String etlId;
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
    public EtlsSaveRequestDto(String etlId, String etlTp, String etlGrpId, String etlNM, String jobId, String preEtlId, String jobCycle, String cycleTime, String etlPk, String grpEtlId, String tblId){
        this.etlId = etlId;
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

    public Etls toEntity(){
        return Etls.builder()
                .id(new EtlsId(etlId))
                .etlTp(etlTp)
                .etlGrpId(etlGrpId)
                .etlNM(etlNM)
                .jobId(jobId)
                .preEtlId(preEtlId)
                .jobCycle(jobCycle)
                .cycleTime(cycleTime)
                .etlPk(etlPk)
                .grpEtlId(grpEtlId)
                .tblId(tblId)
                .build();
    }

}

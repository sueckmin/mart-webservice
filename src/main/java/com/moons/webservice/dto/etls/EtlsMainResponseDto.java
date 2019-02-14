package com.moons.webservice.dto.etls;

import com.moons.webservice.domain.etls.Etls;
import lombok.Getter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Getter
public class EtlsMainResponseDto {
    private Long id;

    private String etlTp;
    private String etlGrpId;
    private String etlId;
    private String etlNM;
    private String jobId;
    private String preEtlId;
    private String jobCycle;
    private String cycleTime;
    private String etlPk;
    private String grpEtlId;
    private String tblId;
    private String modifiedDate;

    public EtlsMainResponseDto(Etls entity){
        id = entity.getId().getId();
        etlTp = entity.getEtlTp();
        etlGrpId = entity.getEtlGrpId();
        etlId = entity.getId().getEtlId();
        etlNM = entity.getEtlNM();
        jobId = entity.getJobId();
        preEtlId = entity.getPreEtlId();
        jobCycle = entity.getJobCycle();
        cycleTime = entity.getCycleTime();
        etlPk = entity.getEtlPk();
        grpEtlId = entity.getGrpEtlId();
        tblId = entity.getTblId();
        modifiedDate = toStringDateTime(entity.getModifiedDate());
    }

    private String toStringDateTime(LocalDateTime localDateTime){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return Optional.ofNullable(localDateTime)
                .map(formatter::format)
                .orElse("");

}
}

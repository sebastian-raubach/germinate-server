/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


// @formatter:off
/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTableCompoundData implements Serializable {

    private static final long serialVersionUID = -1614462134;

    private Integer    germplasmId;
    private String     germplasmGid;
    private String     germplasmName;
    private String     entityParentName;
    private String     entityParentGeneralIdentifier;
    private String     entityType;
    private Integer    datasetId;
    private String     datasetName;
    private String     datasetDescription;
    private Integer    compoundId;
    private String     compoundName;
    private String     unitName;
    private Timestamp  recordingDate;
    private BigDecimal compoundValue;

    public ViewTableCompoundData() {}

    public ViewTableCompoundData(ViewTableCompoundData value) {
        this.germplasmId = value.germplasmId;
        this.germplasmGid = value.germplasmGid;
        this.germplasmName = value.germplasmName;
        this.entityParentName = value.entityParentName;
        this.entityParentGeneralIdentifier = value.entityParentGeneralIdentifier;
        this.entityType = value.entityType;
        this.datasetId = value.datasetId;
        this.datasetName = value.datasetName;
        this.datasetDescription = value.datasetDescription;
        this.compoundId = value.compoundId;
        this.compoundName = value.compoundName;
        this.unitName = value.unitName;
        this.recordingDate = value.recordingDate;
        this.compoundValue = value.compoundValue;
    }

    public ViewTableCompoundData(
        Integer    germplasmId,
        String     germplasmGid,
        String     germplasmName,
        String     entityParentName,
        String     entityParentGeneralIdentifier,
        String     entityType,
        Integer    datasetId,
        String     datasetName,
        String     datasetDescription,
        Integer    compoundId,
        String     compoundName,
        String     unitName,
        Timestamp  recordingDate,
        BigDecimal compoundValue
    ) {
        this.germplasmId = germplasmId;
        this.germplasmGid = germplasmGid;
        this.germplasmName = germplasmName;
        this.entityParentName = entityParentName;
        this.entityParentGeneralIdentifier = entityParentGeneralIdentifier;
        this.entityType = entityType;
        this.datasetId = datasetId;
        this.datasetName = datasetName;
        this.datasetDescription = datasetDescription;
        this.compoundId = compoundId;
        this.compoundName = compoundName;
        this.unitName = unitName;
        this.recordingDate = recordingDate;
        this.compoundValue = compoundValue;
    }

    public Integer getGermplasmId() {
        return this.germplasmId;
    }

    public void setGermplasmId(Integer germplasmId) {
        this.germplasmId = germplasmId;
    }

    public String getGermplasmGid() {
        return this.germplasmGid;
    }

    public void setGermplasmGid(String germplasmGid) {
        this.germplasmGid = germplasmGid;
    }

    public String getGermplasmName() {
        return this.germplasmName;
    }

    public void setGermplasmName(String germplasmName) {
        this.germplasmName = germplasmName;
    }

    public String getEntityParentName() {
        return this.entityParentName;
    }

    public void setEntityParentName(String entityParentName) {
        this.entityParentName = entityParentName;
    }

    public String getEntityParentGeneralIdentifier() {
        return this.entityParentGeneralIdentifier;
    }

    public void setEntityParentGeneralIdentifier(String entityParentGeneralIdentifier) {
        this.entityParentGeneralIdentifier = entityParentGeneralIdentifier;
    }

    public String getEntityType() {
        return this.entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public Integer getDatasetId() {
        return this.datasetId;
    }

    public void setDatasetId(Integer datasetId) {
        this.datasetId = datasetId;
    }

    public String getDatasetName() {
        return this.datasetName;
    }

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    public String getDatasetDescription() {
        return this.datasetDescription;
    }

    public void setDatasetDescription(String datasetDescription) {
        this.datasetDescription = datasetDescription;
    }

    public Integer getCompoundId() {
        return this.compoundId;
    }

    public void setCompoundId(Integer compoundId) {
        this.compoundId = compoundId;
    }

    public String getCompoundName() {
        return this.compoundName;
    }

    public void setCompoundName(String compoundName) {
        this.compoundName = compoundName;
    }

    public String getUnitName() {
        return this.unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public Timestamp getRecordingDate() {
        return this.recordingDate;
    }

    public void setRecordingDate(Timestamp recordingDate) {
        this.recordingDate = recordingDate;
    }

    public BigDecimal getCompoundValue() {
        return this.compoundValue;
    }

    public void setCompoundValue(BigDecimal compoundValue) {
        this.compoundValue = compoundValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewTableCompoundData (");

        sb.append(germplasmId);
        sb.append(", ").append(germplasmGid);
        sb.append(", ").append(germplasmName);
        sb.append(", ").append(entityParentName);
        sb.append(", ").append(entityParentGeneralIdentifier);
        sb.append(", ").append(entityType);
        sb.append(", ").append(datasetId);
        sb.append(", ").append(datasetName);
        sb.append(", ").append(datasetDescription);
        sb.append(", ").append(compoundId);
        sb.append(", ").append(compoundName);
        sb.append(", ").append(unitName);
        sb.append(", ").append(recordingDate);
        sb.append(", ").append(compoundValue);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}

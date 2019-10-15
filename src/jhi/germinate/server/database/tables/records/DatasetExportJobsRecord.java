/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.records;


import com.google.gson.JsonArray;

import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.enums.DatasetExportJobsStatus;
import jhi.germinate.server.database.tables.DatasetExportJobs;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


// @formatter:off
/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DatasetExportJobsRecord extends UpdatableRecordImpl<DatasetExportJobsRecord> implements Record10<Integer, String, String, Integer, DatasetExportJobsStatus, Boolean, Integer, JsonArray, Timestamp, Timestamp> {

    private static final long serialVersionUID = 70112028;

    /**
     * Setter for <code>germinate_template_3_7_0.dataset_export_jobs.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.dataset_export_jobs.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.dataset_export_jobs.uuid</code>.
     */
    public void setUuid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.dataset_export_jobs.uuid</code>.
     */
    public String getUuid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.dataset_export_jobs.job_id</code>.
     */
    public void setJobId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.dataset_export_jobs.job_id</code>.
     */
    public String getJobId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.dataset_export_jobs.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.dataset_export_jobs.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.dataset_export_jobs.status</code>.
     */
    public void setStatus(DatasetExportJobsStatus value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.dataset_export_jobs.status</code>.
     */
    public DatasetExportJobsStatus getStatus() {
        return (DatasetExportJobsStatus) get(4);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.dataset_export_jobs.visibility</code>.
     */
    public void setVisibility(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.dataset_export_jobs.visibility</code>.
     */
    public Boolean getVisibility() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.dataset_export_jobs.experiment_type_id</code>.
     */
    public void setExperimentTypeId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.dataset_export_jobs.experiment_type_id</code>.
     */
    public Integer getExperimentTypeId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.dataset_export_jobs.dataset_ids</code>.
     */
    public void setDatasetIds(JsonArray value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.dataset_export_jobs.dataset_ids</code>.
     */
    public JsonArray getDatasetIds() {
        return (JsonArray) get(7);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.dataset_export_jobs.created_on</code>.
     */
    public void setCreatedOn(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.dataset_export_jobs.created_on</code>.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.dataset_export_jobs.updated_on</code>.
     */
    public void setUpdatedOn(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.dataset_export_jobs.updated_on</code>.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, Integer, DatasetExportJobsStatus, Boolean, Integer, JsonArray, Timestamp, Timestamp> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, Integer, DatasetExportJobsStatus, Boolean, Integer, JsonArray, Timestamp, Timestamp> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return DatasetExportJobs.DATASET_EXPORT_JOBS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return DatasetExportJobs.DATASET_EXPORT_JOBS.UUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return DatasetExportJobs.DATASET_EXPORT_JOBS.JOB_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return DatasetExportJobs.DATASET_EXPORT_JOBS.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<DatasetExportJobsStatus> field5() {
        return DatasetExportJobs.DATASET_EXPORT_JOBS.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return DatasetExportJobs.DATASET_EXPORT_JOBS.VISIBILITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return DatasetExportJobs.DATASET_EXPORT_JOBS.EXPERIMENT_TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<JsonArray> field8() {
        return DatasetExportJobs.DATASET_EXPORT_JOBS.DATASET_IDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return DatasetExportJobs.DATASET_EXPORT_JOBS.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return DatasetExportJobs.DATASET_EXPORT_JOBS.UPDATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getJobId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetExportJobsStatus component5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component6() {
        return getVisibility();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getExperimentTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonArray component8() {
        return getDatasetIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getJobId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetExportJobsStatus value5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getVisibility();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getExperimentTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonArray value8() {
        return getDatasetIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetExportJobsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetExportJobsRecord value2(String value) {
        setUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetExportJobsRecord value3(String value) {
        setJobId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetExportJobsRecord value4(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetExportJobsRecord value5(DatasetExportJobsStatus value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetExportJobsRecord value6(Boolean value) {
        setVisibility(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetExportJobsRecord value7(Integer value) {
        setExperimentTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetExportJobsRecord value8(JsonArray value) {
        setDatasetIds(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetExportJobsRecord value9(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetExportJobsRecord value10(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetExportJobsRecord values(Integer value1, String value2, String value3, Integer value4, DatasetExportJobsStatus value5, Boolean value6, Integer value7, JsonArray value8, Timestamp value9, Timestamp value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DatasetExportJobsRecord
     */
    public DatasetExportJobsRecord() {
        super(DatasetExportJobs.DATASET_EXPORT_JOBS);
    }

    /**
     * Create a detached, initialised DatasetExportJobsRecord
     */
    public DatasetExportJobsRecord(Integer id, String uuid, String jobId, Integer userId, DatasetExportJobsStatus status, Boolean visibility, Integer experimentTypeId, JsonArray datasetIds, Timestamp createdOn, Timestamp updatedOn) {
        super(DatasetExportJobs.DATASET_EXPORT_JOBS);

        set(0, id);
        set(1, uuid);
        set(2, jobId);
        set(3, userId);
        set(4, status);
        set(5, visibility);
        set(6, experimentTypeId);
        set(7, datasetIds);
        set(8, createdOn);
        set(9, updatedOn);
    }
// @formatter:on
}

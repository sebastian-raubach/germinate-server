/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.tables.ViewTableTrialsData;

import org.jooq.Field;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.TableRecordImpl;


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
public class ViewTableTrialsDataRecord extends TableRecordImpl<ViewTableTrialsDataRecord> implements Record18<Integer, String, String, String, String, String, Integer, String, String, String, String, String, Integer, String, String, String, Timestamp, String> {

    private static final long serialVersionUID = -2091566497;

    /**
     * Setter for <code>germinate_template_4_0_0.view_table_trials_data.germplasm_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setGermplasmId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.view_table_trials_data.germplasm_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getGermplasmId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.view_table_trials_data.germplasm_gid</code>. A unique identifier.
     */
    public void setGermplasmGid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.view_table_trials_data.germplasm_gid</code>. A unique identifier.
     */
    public String getGermplasmGid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.view_table_trials_data.germplasm_name</code>. A unique name which defines an entry in the germinatbase table.
     */
    public void setGermplasmName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.view_table_trials_data.germplasm_name</code>. A unique name which defines an entry in the germinatbase table.
     */
    public String getGermplasmName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.view_table_trials_data.entity_parent_name</code>. A unique name which defines an entry in the germinatbase table.
     */
    public void setEntityParentName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.view_table_trials_data.entity_parent_name</code>. A unique name which defines an entry in the germinatbase table.
     */
    public String getEntityParentName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.view_table_trials_data.entity_parent_general_identifier</code>. A unique identifier.
     */
    public void setEntityParentGeneralIdentifier(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.view_table_trials_data.entity_parent_general_identifier</code>. A unique identifier.
     */
    public String getEntityParentGeneralIdentifier() {
        return (String) get(4);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.view_table_trials_data.entity_type</code>. The name of the entity type.
     */
    public void setEntityType(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.view_table_trials_data.entity_type</code>. The name of the entity type.
     */
    public String getEntityType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.view_table_trials_data.dataset_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setDatasetId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.view_table_trials_data.dataset_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getDatasetId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.view_table_trials_data.dataset_name</code>. Describes the dataset.
     */
    public void setDatasetName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.view_table_trials_data.dataset_name</code>. Describes the dataset.
     */
    public String getDatasetName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.view_table_trials_data.dataset_description</code>. The name of this dataset.
     */
    public void setDatasetDescription(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.view_table_trials_data.dataset_description</code>. The name of this dataset.
     */
    public String getDatasetDescription() {
        return (String) get(8);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.view_table_trials_data.location_name</code>. The site name where the location is.
     */
    public void setLocationName(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.view_table_trials_data.location_name</code>. The site name where the location is.
     */
    public String getLocationName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.view_table_trials_data.country_name</code>. Country name.
     */
    public void setCountryName(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.view_table_trials_data.country_name</code>. Country name.
     */
    public String getCountryName() {
        return (String) get(10);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.view_table_trials_data.country_code2</code>. ISO 2 Code for country.
     */
    public void setCountryCode2(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.view_table_trials_data.country_code2</code>. ISO 2 Code for country.
     */
    public String getCountryCode2() {
        return (String) get(11);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.view_table_trials_data.trait_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setTraitId(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.view_table_trials_data.trait_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getTraitId() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.view_table_trials_data.trait_name</code>. Phenotype full name.
     */
    public void setTraitName(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.view_table_trials_data.trait_name</code>. Phenotype full name.
     */
    public String getTraitName() {
        return (String) get(13);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.view_table_trials_data.trait_name_short</code>. Shortened name for the phenotype. This is used in table columns where space is an issue.
     */
    public void setTraitNameShort(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.view_table_trials_data.trait_name_short</code>. Shortened name for the phenotype. This is used in table columns where space is an issue.
     */
    public String getTraitNameShort() {
        return (String) get(14);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.view_table_trials_data.unit_name</code>. The name of the unit. This should be the name of the unit in full.
     */
    public void setUnitName(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.view_table_trials_data.unit_name</code>. The name of the unit. This should be the name of the unit in full.
     */
    public String getUnitName() {
        return (String) get(15);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.view_table_trials_data.recording_date</code>. Date when the phenotypic result was recorded. Should be formatted 'YYYY-MM-DD HH:MM:SS' or just 'YYYY-MM-DD' where a timestamp is not available.
     */
    public void setRecordingDate(Timestamp value) {
        set(16, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.view_table_trials_data.recording_date</code>. Date when the phenotypic result was recorded. Should be formatted 'YYYY-MM-DD HH:MM:SS' or just 'YYYY-MM-DD' where a timestamp is not available.
     */
    public Timestamp getRecordingDate() {
        return (Timestamp) get(16);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.view_table_trials_data.trait_value</code>. The phenotype value for this phenotype_id and germinatebase_id combination.
     */
    public void setTraitValue(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.view_table_trials_data.trait_value</code>. The phenotype value for this phenotype_id and germinatebase_id combination.
     */
    public String getTraitValue() {
        return (String) get(17);
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<Integer, String, String, String, String, String, Integer, String, String, String, String, String, Integer, String, String, String, Timestamp, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<Integer, String, String, String, String, String, Integer, String, String, String, String, String, Integer, String, String, String, Timestamp, String> valuesRow() {
        return (Row18) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ViewTableTrialsData.VIEW_TABLE_TRIALS_DATA.GERMPLASM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ViewTableTrialsData.VIEW_TABLE_TRIALS_DATA.GERMPLASM_GID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ViewTableTrialsData.VIEW_TABLE_TRIALS_DATA.GERMPLASM_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ViewTableTrialsData.VIEW_TABLE_TRIALS_DATA.ENTITY_PARENT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ViewTableTrialsData.VIEW_TABLE_TRIALS_DATA.ENTITY_PARENT_GENERAL_IDENTIFIER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ViewTableTrialsData.VIEW_TABLE_TRIALS_DATA.ENTITY_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return ViewTableTrialsData.VIEW_TABLE_TRIALS_DATA.DATASET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ViewTableTrialsData.VIEW_TABLE_TRIALS_DATA.DATASET_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ViewTableTrialsData.VIEW_TABLE_TRIALS_DATA.DATASET_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return ViewTableTrialsData.VIEW_TABLE_TRIALS_DATA.LOCATION_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return ViewTableTrialsData.VIEW_TABLE_TRIALS_DATA.COUNTRY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return ViewTableTrialsData.VIEW_TABLE_TRIALS_DATA.COUNTRY_CODE2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return ViewTableTrialsData.VIEW_TABLE_TRIALS_DATA.TRAIT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return ViewTableTrialsData.VIEW_TABLE_TRIALS_DATA.TRAIT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return ViewTableTrialsData.VIEW_TABLE_TRIALS_DATA.TRAIT_NAME_SHORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return ViewTableTrialsData.VIEW_TABLE_TRIALS_DATA.UNIT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field17() {
        return ViewTableTrialsData.VIEW_TABLE_TRIALS_DATA.RECORDING_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return ViewTableTrialsData.VIEW_TABLE_TRIALS_DATA.TRAIT_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getGermplasmId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getGermplasmGid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getGermplasmName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getEntityParentName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getEntityParentGeneralIdentifier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getEntityType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getDatasetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getDatasetName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getDatasetDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getLocationName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getCountryName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getCountryCode2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component13() {
        return getTraitId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getTraitName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getTraitNameShort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getUnitName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component17() {
        return getRecordingDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getTraitValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getGermplasmId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getGermplasmGid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getGermplasmName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getEntityParentName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getEntityParentGeneralIdentifier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getEntityType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getDatasetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getDatasetName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getDatasetDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getLocationName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getCountryName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getCountryCode2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getTraitId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getTraitName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getTraitNameShort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getUnitName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value17() {
        return getRecordingDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getTraitValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTrialsDataRecord value1(Integer value) {
        setGermplasmId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTrialsDataRecord value2(String value) {
        setGermplasmGid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTrialsDataRecord value3(String value) {
        setGermplasmName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTrialsDataRecord value4(String value) {
        setEntityParentName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTrialsDataRecord value5(String value) {
        setEntityParentGeneralIdentifier(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTrialsDataRecord value6(String value) {
        setEntityType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTrialsDataRecord value7(Integer value) {
        setDatasetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTrialsDataRecord value8(String value) {
        setDatasetName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTrialsDataRecord value9(String value) {
        setDatasetDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTrialsDataRecord value10(String value) {
        setLocationName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTrialsDataRecord value11(String value) {
        setCountryName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTrialsDataRecord value12(String value) {
        setCountryCode2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTrialsDataRecord value13(Integer value) {
        setTraitId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTrialsDataRecord value14(String value) {
        setTraitName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTrialsDataRecord value15(String value) {
        setTraitNameShort(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTrialsDataRecord value16(String value) {
        setUnitName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTrialsDataRecord value17(Timestamp value) {
        setRecordingDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTrialsDataRecord value18(String value) {
        setTraitValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTrialsDataRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, Integer value7, String value8, String value9, String value10, String value11, String value12, Integer value13, String value14, String value15, String value16, Timestamp value17, String value18) {
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
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewTableTrialsDataRecord
     */
    public ViewTableTrialsDataRecord() {
        super(ViewTableTrialsData.VIEW_TABLE_TRIALS_DATA);
    }

    /**
     * Create a detached, initialised ViewTableTrialsDataRecord
     */
    public ViewTableTrialsDataRecord(Integer germplasmId, String germplasmGid, String germplasmName, String entityParentName, String entityParentGeneralIdentifier, String entityType, Integer datasetId, String datasetName, String datasetDescription, String locationName, String countryName, String countryCode2, Integer traitId, String traitName, String traitNameShort, String unitName, Timestamp recordingDate, String traitValue) {
        super(ViewTableTrialsData.VIEW_TABLE_TRIALS_DATA);

        set(0, germplasmId);
        set(1, germplasmGid);
        set(2, germplasmName);
        set(3, entityParentName);
        set(4, entityParentGeneralIdentifier);
        set(5, entityType);
        set(6, datasetId);
        set(7, datasetName);
        set(8, datasetDescription);
        set(9, locationName);
        set(10, countryName);
        set(11, countryCode2);
        set(12, traitId);
        set(13, traitName);
        set(14, traitNameShort);
        set(15, unitName);
        set(16, recordingDate);
        set(17, traitValue);
    }
// @formatter:on
}

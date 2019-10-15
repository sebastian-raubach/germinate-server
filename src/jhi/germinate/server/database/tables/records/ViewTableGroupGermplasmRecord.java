/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.records;


import com.google.gson.JsonArray;

import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import jhi.germinate.server.database.tables.ViewTableGroupGermplasm;

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
public class ViewTableGroupGermplasmRecord extends TableRecordImpl<ViewTableGroupGermplasmRecord> {

    private static final long serialVersionUID = 2062892589;

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_group_germplasm.germplasm_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setGermplasmId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_group_germplasm.germplasm_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getGermplasmId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_group_germplasm.germplasm_gid</code>. A unique identifier.
     */
    public void setGermplasmGid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_group_germplasm.germplasm_gid</code>. A unique identifier.
     */
    public String getGermplasmGid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_group_germplasm.germplasm_name</code>. A unique name which defines an entry in the germinatbase table.
     */
    public void setGermplasmName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_group_germplasm.germplasm_name</code>. A unique name which defines an entry in the germinatbase table.
     */
    public String getGermplasmName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_group_germplasm.germplasm_number</code>. This is the unique identifier for accessions within a genebank, and is assigned when a sample is
entered into the genebank collection (e.g. ‘PI 113869’).
     */
    public void setGermplasmNumber(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_group_germplasm.germplasm_number</code>. This is the unique identifier for accessions within a genebank, and is assigned when a sample is
entered into the genebank collection (e.g. ‘PI 113869’).
     */
    public String getGermplasmNumber() {
        return (String) get(3);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_group_germplasm.germplasm_puid</code>. Any persistent, unique identifier assigned to the accession so it can be unambiguously referenced at the global level and the information associated with it harvested through automated means. Report one PUID for each accession.
     */
    public void setGermplasmPuid(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_group_germplasm.germplasm_puid</code>. Any persistent, unique identifier assigned to the accession so it can be unambiguously referenced at the global level and the information associated with it harvested through automated means. Report one PUID for each accession.
     */
    public String getGermplasmPuid() {
        return (String) get(4);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_group_germplasm.entity_type_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setEntityTypeId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_group_germplasm.entity_type_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getEntityTypeId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_group_germplasm.entity_type_name</code>. The name of the entity type.
     */
    public void setEntityTypeName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_group_germplasm.entity_type_name</code>. The name of the entity type.
     */
    public String getEntityTypeName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_group_germplasm.entity_parent_id</code>. Foreign key to germinatebase (germinatebase.id).
     */
    public void setEntityParentId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_group_germplasm.entity_parent_id</code>. Foreign key to germinatebase (germinatebase.id).
     */
    public Integer getEntityParentId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_group_germplasm.biological_status_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setBiologicalStatusId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_group_germplasm.biological_status_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getBiologicalStatusId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_group_germplasm.biological_status_name</code>. Previoulsy known as sampstat.
     */
    public void setBiologicalStatusName(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_group_germplasm.biological_status_name</code>. Previoulsy known as sampstat.
     */
    public String getBiologicalStatusName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_group_germplasm.synonyms</code>. The synonyms as a json array.
     */
    public void setSynonyms(JsonArray value) {
        set(10, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_group_germplasm.synonyms</code>. The synonyms as a json array.
     */
    public JsonArray getSynonyms() {
        return (JsonArray) get(10);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_group_germplasm.collector_number</code>. Original identifier assigned by the collector(s) of the sample, normally composed of the name or
initials of the collector(s) followed by a number (e.g. ‘FM9909’). This identifier is essential for
identifying duplicates held in different collections.
     */
    public void setCollectorNumber(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_group_germplasm.collector_number</code>. Original identifier assigned by the collector(s) of the sample, normally composed of the name or
initials of the collector(s) followed by a number (e.g. ‘FM9909’). This identifier is essential for
identifying duplicates held in different collections.
     */
    public String getCollectorNumber() {
        return (String) get(11);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_group_germplasm.genus</code>. Genus name for the species.
     */
    public void setGenus(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_group_germplasm.genus</code>. Genus name for the species.
     */
    public String getGenus() {
        return (String) get(12);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_group_germplasm.species</code>. Species name in lowercase.
     */
    public void setSpecies(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_group_germplasm.species</code>. Species name in lowercase.
     */
    public String getSpecies() {
        return (String) get(13);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_group_germplasm.subtaxa</code>. Subtaxa name.
     */
    public void setSubtaxa(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_group_germplasm.subtaxa</code>. Subtaxa name.
     */
    public String getSubtaxa() {
        return (String) get(14);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_group_germplasm.location</code>. The site name where the location is.
     */
    public void setLocation(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_group_germplasm.location</code>. The site name where the location is.
     */
    public String getLocation() {
        return (String) get(15);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_group_germplasm.latitude</code>. Latitude of the location.
     */
    public void setLatitude(BigDecimal value) {
        set(16, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_group_germplasm.latitude</code>. Latitude of the location.
     */
    public BigDecimal getLatitude() {
        return (BigDecimal) get(16);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_group_germplasm.longitude</code>. Longitude of the location.
     */
    public void setLongitude(BigDecimal value) {
        set(17, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_group_germplasm.longitude</code>. Longitude of the location.
     */
    public BigDecimal getLongitude() {
        return (BigDecimal) get(17);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_group_germplasm.elevation</code>. The elevation of the site in metres.
     */
    public void setElevation(BigDecimal value) {
        set(18, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_group_germplasm.elevation</code>. The elevation of the site in metres.
     */
    public BigDecimal getElevation() {
        return (BigDecimal) get(18);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_group_germplasm.country_name</code>. Country name.
     */
    public void setCountryName(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_group_germplasm.country_name</code>. Country name.
     */
    public String getCountryName() {
        return (String) get(19);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_group_germplasm.country_code</code>. ISO 2 Code for country.
     */
    public void setCountryCode(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_group_germplasm.country_code</code>. ISO 2 Code for country.
     */
    public String getCountryCode() {
        return (String) get(20);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_group_germplasm.coll_date</code>. Collecting date of the sample, where YYYY is the year, MM is the month and DD is the day.
Missing data (MM or DD) should be indicated with hyphens or ‘00’ [double zero]. 
     */
    public void setCollDate(Date value) {
        set(21, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_group_germplasm.coll_date</code>. Collecting date of the sample, where YYYY is the year, MM is the month and DD is the day.
Missing data (MM or DD) should be indicated with hyphens or ‘00’ [double zero]. 
     */
    public Date getCollDate() {
        return (Date) get(21);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_group_germplasm.pdci</code>. Passport Data Completeness Index. This is calculated by Germinate. Manual editing of this field will be overwritten.
     */
    public void setPdci(Double value) {
        set(22, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_group_germplasm.pdci</code>. Passport Data Completeness Index. This is calculated by Germinate. Manual editing of this field will be overwritten.
     */
    public Double getPdci() {
        return (Double) get(22);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_group_germplasm.image_count</code>.
     */
    public void setImageCount(Long value) {
        set(23, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_group_germplasm.image_count</code>.
     */
    public Long getImageCount() {
        return (Long) get(23);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_group_germplasm.first_image_path</code>.
     */
    public void setFirstImagePath(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_group_germplasm.first_image_path</code>.
     */
    public String getFirstImagePath() {
        return (String) get(24);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_group_germplasm.group_id</code>. Foreign key to groups (groups.id).
     */
    public void setGroupId(Integer value) {
        set(25, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_group_germplasm.group_id</code>. Foreign key to groups (groups.id).
     */
    public Integer getGroupId() {
        return (Integer) get(25);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewTableGroupGermplasmRecord
     */
    public ViewTableGroupGermplasmRecord() {
        super(ViewTableGroupGermplasm.VIEW_TABLE_GROUP_GERMPLASM);
    }

    /**
     * Create a detached, initialised ViewTableGroupGermplasmRecord
     */
    public ViewTableGroupGermplasmRecord(Integer germplasmId, String germplasmGid, String germplasmName, String germplasmNumber, String germplasmPuid, Integer entityTypeId, String entityTypeName, Integer entityParentId, Integer biologicalStatusId, String biologicalStatusName, JsonArray synonyms, String collectorNumber, String genus, String species, String subtaxa, String location, BigDecimal latitude, BigDecimal longitude, BigDecimal elevation, String countryName, String countryCode, Date collDate, Double pdci, Long imageCount, String firstImagePath, Integer groupId) {
        super(ViewTableGroupGermplasm.VIEW_TABLE_GROUP_GERMPLASM);

        set(0, germplasmId);
        set(1, germplasmGid);
        set(2, germplasmName);
        set(3, germplasmNumber);
        set(4, germplasmPuid);
        set(5, entityTypeId);
        set(6, entityTypeName);
        set(7, entityParentId);
        set(8, biologicalStatusId);
        set(9, biologicalStatusName);
        set(10, synonyms);
        set(11, collectorNumber);
        set(12, genus);
        set(13, species);
        set(14, subtaxa);
        set(15, location);
        set(16, latitude);
        set(17, longitude);
        set(18, elevation);
        set(19, countryName);
        set(20, countryCode);
        set(21, collDate);
        set(22, pdci);
        set(23, imageCount);
        set(24, firstImagePath);
        set(25, groupId);
    }
// @formatter:on
}

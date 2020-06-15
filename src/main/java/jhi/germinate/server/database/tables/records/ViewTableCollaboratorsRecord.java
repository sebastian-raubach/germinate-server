/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.records;


import javax.annotation.Generated;

import jhi.germinate.server.database.tables.ViewTableCollaborators;

import org.jooq.Field;
import org.jooq.Record13;
import org.jooq.Row13;
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
public class ViewTableCollaboratorsRecord extends TableRecordImpl<ViewTableCollaboratorsRecord> implements Record13<Integer, String, String, String, String, Integer, String, String, Integer, Integer, String, String, String> {

    private static final long serialVersionUID = 87444431;

    /**
     * Setter for <code>germinate_template_4_20_06_15.view_table_collaborators.collaborator_id</code>.
     */
    public void setCollaboratorId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.view_table_collaborators.collaborator_id</code>.
     */
    public Integer getCollaboratorId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.view_table_collaborators.collaborator_first_name</code>. Last name (surname) of the author(s), researcher(s), scientist(s), student(s) responsible for producing the information product.
     */
    public void setCollaboratorFirstName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.view_table_collaborators.collaborator_first_name</code>. Last name (surname) of the author(s), researcher(s), scientist(s), student(s) responsible for producing the information product.
     */
    public String getCollaboratorFirstName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.view_table_collaborators.collaborator_last_name</code>. First name (and middle name if available) of the author(s), researcher(s), scientist(s), student(s) responsible for producing the information product.
     */
    public void setCollaboratorLastName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.view_table_collaborators.collaborator_last_name</code>. First name (and middle name if available) of the author(s), researcher(s), scientist(s), student(s) responsible for producing the information product.
     */
    public String getCollaboratorLastName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.view_table_collaborators.collaborator_email</code>. E-mail address of the author(s), researcher(s), scientist(s), student(s) responsible for producing the information product.
     */
    public void setCollaboratorEmail(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.view_table_collaborators.collaborator_email</code>. E-mail address of the author(s), researcher(s), scientist(s), student(s) responsible for producing the information product.
     */
    public String getCollaboratorEmail() {
        return (String) get(3);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.view_table_collaborators.collaborator_phone</code>. Phone number of the author(s), researcher(s), scientist(s), student(s) responsible for producing the information product.
     */
    public void setCollaboratorPhone(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.view_table_collaborators.collaborator_phone</code>. Phone number of the author(s), researcher(s), scientist(s), student(s) responsible for producing the information product.
     */
    public String getCollaboratorPhone() {
        return (String) get(4);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.view_table_collaborators.institution_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setInstitutionId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.view_table_collaborators.institution_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getInstitutionId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.view_table_collaborators.institution_name</code>. The institute name.
     */
    public void setInstitutionName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.view_table_collaborators.institution_name</code>. The institute name.
     */
    public String getInstitutionName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.view_table_collaborators.institution_address</code>. The postal address of the institute.
     */
    public void setInstitutionAddress(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.view_table_collaborators.institution_address</code>. The postal address of the institute.
     */
    public String getInstitutionAddress() {
        return (String) get(7);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.view_table_collaborators.dataset_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setDatasetId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.view_table_collaborators.dataset_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getDatasetId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.view_table_collaborators.country_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setCountryId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.view_table_collaborators.country_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getCountryId() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.view_table_collaborators.country_name</code>. Country name.
     */
    public void setCountryName(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.view_table_collaborators.country_name</code>. Country name.
     */
    public String getCountryName() {
        return (String) get(10);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.view_table_collaborators.country_code2</code>. ISO 2 Code for country.
     */
    public void setCountryCode2(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.view_table_collaborators.country_code2</code>. ISO 2 Code for country.
     */
    public String getCountryCode2() {
        return (String) get(11);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.view_table_collaborators.country_code3</code>. ISO 3 Code for country.
     */
    public void setCountryCode3(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.view_table_collaborators.country_code3</code>. ISO 3 Code for country.
     */
    public String getCountryCode3() {
        return (String) get(12);
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, String, String, String, String, Integer, String, String, Integer, Integer, String, String, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, String, String, String, String, Integer, String, String, Integer, Integer, String, String, String> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ViewTableCollaborators.VIEW_TABLE_COLLABORATORS.COLLABORATOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ViewTableCollaborators.VIEW_TABLE_COLLABORATORS.COLLABORATOR_FIRST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ViewTableCollaborators.VIEW_TABLE_COLLABORATORS.COLLABORATOR_LAST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ViewTableCollaborators.VIEW_TABLE_COLLABORATORS.COLLABORATOR_EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ViewTableCollaborators.VIEW_TABLE_COLLABORATORS.COLLABORATOR_PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return ViewTableCollaborators.VIEW_TABLE_COLLABORATORS.INSTITUTION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ViewTableCollaborators.VIEW_TABLE_COLLABORATORS.INSTITUTION_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ViewTableCollaborators.VIEW_TABLE_COLLABORATORS.INSTITUTION_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return ViewTableCollaborators.VIEW_TABLE_COLLABORATORS.DATASET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return ViewTableCollaborators.VIEW_TABLE_COLLABORATORS.COUNTRY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return ViewTableCollaborators.VIEW_TABLE_COLLABORATORS.COUNTRY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return ViewTableCollaborators.VIEW_TABLE_COLLABORATORS.COUNTRY_CODE2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return ViewTableCollaborators.VIEW_TABLE_COLLABORATORS.COUNTRY_CODE3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getCollaboratorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getCollaboratorFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCollaboratorLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCollaboratorEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getCollaboratorPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getInstitutionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getInstitutionName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getInstitutionAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getDatasetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getCountryId();
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
    public String component13() {
        return getCountryCode3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCollaboratorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCollaboratorFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCollaboratorLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCollaboratorEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCollaboratorPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getInstitutionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getInstitutionName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getInstitutionAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getDatasetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getCountryId();
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
    public String value13() {
        return getCountryCode3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCollaboratorsRecord value1(Integer value) {
        setCollaboratorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCollaboratorsRecord value2(String value) {
        setCollaboratorFirstName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCollaboratorsRecord value3(String value) {
        setCollaboratorLastName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCollaboratorsRecord value4(String value) {
        setCollaboratorEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCollaboratorsRecord value5(String value) {
        setCollaboratorPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCollaboratorsRecord value6(Integer value) {
        setInstitutionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCollaboratorsRecord value7(String value) {
        setInstitutionName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCollaboratorsRecord value8(String value) {
        setInstitutionAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCollaboratorsRecord value9(Integer value) {
        setDatasetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCollaboratorsRecord value10(Integer value) {
        setCountryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCollaboratorsRecord value11(String value) {
        setCountryName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCollaboratorsRecord value12(String value) {
        setCountryCode2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCollaboratorsRecord value13(String value) {
        setCountryCode3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCollaboratorsRecord values(Integer value1, String value2, String value3, String value4, String value5, Integer value6, String value7, String value8, Integer value9, Integer value10, String value11, String value12, String value13) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewTableCollaboratorsRecord
     */
    public ViewTableCollaboratorsRecord() {
        super(ViewTableCollaborators.VIEW_TABLE_COLLABORATORS);
    }

    /**
     * Create a detached, initialised ViewTableCollaboratorsRecord
     */
    public ViewTableCollaboratorsRecord(Integer collaboratorId, String collaboratorFirstName, String collaboratorLastName, String collaboratorEmail, String collaboratorPhone, Integer institutionId, String institutionName, String institutionAddress, Integer datasetId, Integer countryId, String countryName, String countryCode2, String countryCode3) {
        super(ViewTableCollaborators.VIEW_TABLE_COLLABORATORS);

        set(0, collaboratorId);
        set(1, collaboratorFirstName);
        set(2, collaboratorLastName);
        set(3, collaboratorEmail);
        set(4, collaboratorPhone);
        set(5, institutionId);
        set(6, institutionName);
        set(7, institutionAddress);
        set(8, datasetId);
        set(9, countryId);
        set(10, countryName);
        set(11, countryCode2);
        set(12, countryCode3);
    }
// @formatter:on
}

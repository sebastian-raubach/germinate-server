/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.records;


import com.google.gson.JsonArray;

import javax.annotation.Generated;

import jhi.germinate.server.database.enums.ViewTableTraitsDataType;
import jhi.germinate.server.database.tables.ViewTableTraits;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Row11;
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
public class ViewTableTraitsRecord extends TableRecordImpl<ViewTableTraitsRecord> implements Record11<Integer, String, String, String, ViewTableTraitsDataType, Integer, String, String, String, JsonArray, Long> {

    private static final long serialVersionUID = -922855229;

    /**
     * Create a detached ViewTableTraitsRecord
     */
    public ViewTableTraitsRecord() {
        super(ViewTableTraits.VIEW_TABLE_TRAITS);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_traits.trait_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getTraitId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_traits.trait_name</code>. Phenotype full name.
     */
    public void setTraitName(String value) {
        set(1, value);
    }

    /**
     * Create a detached, initialised ViewTableTraitsRecord
     */
    public ViewTableTraitsRecord(Integer traitId, String traitName, String traitNameShort, String traitDescription, ViewTableTraitsDataType dataType, Integer unitId, String unitName, String unitDescription, String unitAbbreviation, JsonArray synonyms, Long count) {
        super(ViewTableTraits.VIEW_TABLE_TRAITS);

        set(0, traitId);
        set(1, traitName);
        set(2, traitNameShort);
        set(3, traitDescription);
        set(4, dataType);
        set(5, unitId);
        set(6, unitName);
        set(7, unitDescription);
        set(8, unitAbbreviation);
        set(9, synonyms);
        set(10, count);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_traits.trait_name_short</code>. Shortened name for the phenotype. This is used in table columns where space is an issue.
     */
    public void setTraitNameShort(String value) {
        set(2, value);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_traits.trait_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setTraitId(Integer value) {
        set(0, value);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_traits.trait_description</code>. Full description of the phenotype. This should contain enough infomation to accurately identify the phenoytpe and how it was recorded.
     */
    public void setTraitDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_traits.trait_name</code>. Phenotype full name.
     */
    public String getTraitName() {
        return (String) get(1);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_traits.trait_name_short</code>. Shortened name for the phenotype. This is used in table columns where space is an issue.
     */
    public String getTraitNameShort() {
        return (String) get(2);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_traits.trait_description</code>. Full description of the phenotype. This should contain enough infomation to accurately identify the phenoytpe and how it was recorded.
     */
    public String getTraitDescription() {
        return (String) get(3);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_traits.data_type</code>. Defines the data type of the phenotype. This can be of float, int or char types.
     */
    public ViewTableTraitsDataType getDataType() {
        return (ViewTableTraitsDataType) get(4);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_traits.data_type</code>. Defines the data type of the phenotype. This can be of float, int or char types.
     */
    public void setDataType(ViewTableTraitsDataType value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_traits.unit_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getUnitId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_traits.unit_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setUnitId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_traits.unit_name</code>. The name of the unit. This should be the name of the unit in full.
     */
    public String getUnitName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_traits.unit_name</code>. The name of the unit. This should be the name of the unit in full.
     */
    public void setUnitName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_traits.unit_description</code>. A description of the unit. If the unit is not a standard SI unit then it is beneficial to have a description which explains what the unit it, how it is derived and any other information which would help identifiy it.
     */
    public String getUnitDescription() {
        return (String) get(7);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_traits.unit_description</code>. A description of the unit. If the unit is not a standard SI unit then it is beneficial to have a description which explains what the unit it, how it is derived and any other information which would help identifiy it.
     */
    public void setUnitDescription(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_traits.unit_abbreviation</code>. This should be the unit abbreviation.
     */
    public String getUnitAbbreviation() {
        return (String) get(8);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_traits.unit_abbreviation</code>. This should be the unit abbreviation.
     */
    public void setUnitAbbreviation(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_traits.synonyms</code>. The synonyms as a json array.
     */
    public JsonArray getSynonyms() {
        return (JsonArray) get(9);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_traits.synonyms</code>. The synonyms as a json array.
     */
    public void setSynonyms(JsonArray value) {
        set(9, value);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_traits.count</code>.
     */
    public Long getCount() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_traits.count</code>.
     */
    public void setCount(Long value) {
        set(10, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ViewTableTraits.VIEW_TABLE_TRAITS.TRAIT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ViewTableTraits.VIEW_TABLE_TRAITS.TRAIT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ViewTableTraits.VIEW_TABLE_TRAITS.TRAIT_NAME_SHORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ViewTableTraits.VIEW_TABLE_TRAITS.TRAIT_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, String, String, String, ViewTableTraitsDataType, Integer, String, String, String, JsonArray, Long> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, String, String, String, ViewTableTraitsDataType, Integer, String, String, String, JsonArray, Long> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ViewTableTraitsDataType> field5() {
        return ViewTableTraits.VIEW_TABLE_TRAITS.DATA_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return ViewTableTraits.VIEW_TABLE_TRAITS.UNIT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ViewTableTraits.VIEW_TABLE_TRAITS.UNIT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ViewTableTraits.VIEW_TABLE_TRAITS.UNIT_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ViewTableTraits.VIEW_TABLE_TRAITS.UNIT_ABBREVIATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getTraitId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTraitName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTraitNameShort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getTraitDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<JsonArray> field10() {
        return ViewTableTraits.VIEW_TABLE_TRAITS.SYNONYMS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field11() {
        return ViewTableTraits.VIEW_TABLE_TRAITS.COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTraitsDataType component5() {
        return getDataType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getUnitId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getUnitName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getUnitDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getUnitAbbreviation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getTraitId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTraitName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTraitNameShort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTraitDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonArray component10() {
        return getSynonyms();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component11() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTraitsDataType value5() {
        return getDataType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getUnitId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getUnitName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getUnitDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getUnitAbbreviation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTraitsRecord value1(Integer value) {
        setTraitId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTraitsRecord value2(String value) {
        setTraitName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTraitsRecord value3(String value) {
        setTraitNameShort(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTraitsRecord value4(String value) {
        setTraitDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonArray value10() {
        return getSynonyms();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value11() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTraitsRecord value5(ViewTableTraitsDataType value) {
        setDataType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTraitsRecord value6(Integer value) {
        setUnitId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTraitsRecord value7(String value) {
        setUnitName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTraitsRecord value8(String value) {
        setUnitDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTraitsRecord value9(String value) {
        setUnitAbbreviation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTraitsRecord value10(JsonArray value) {
        setSynonyms(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTraitsRecord value11(Long value) {
        setCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTraitsRecord values(Integer value1, String value2, String value3, String value4, ViewTableTraitsDataType value5, Integer value6, String value7, String value8, String value9, JsonArray value10, Long value11) {
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
        return this;
    }
// @formatter:on
}

/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.records;


import javax.annotation.Generated;

import jhi.germinate.server.database.enums.ViewTableGermplasmAttributesAttributeType;
import jhi.germinate.server.database.tables.ViewTableGermplasmAttributes;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
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
public class ViewTableGermplasmAttributesRecord extends TableRecordImpl<ViewTableGermplasmAttributesRecord> implements Record10<Integer, String, String, Integer, String, String, ViewTableGermplasmAttributesAttributeType, String, Integer, String> {

    private static final long serialVersionUID = 2078734004;

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_germplasm_attributes.germplasm_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setGermplasmId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_germplasm_attributes.germplasm_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getGermplasmId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_germplasm_attributes.germplasm_gid</code>. A unique identifier.
     */
    public void setGermplasmGid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_germplasm_attributes.germplasm_gid</code>. A unique identifier.
     */
    public String getGermplasmGid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_germplasm_attributes.germplasm_name</code>. A unique name which defines an entry in the germinatbase table.
     */
    public void setGermplasmName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_germplasm_attributes.germplasm_name</code>. A unique name which defines an entry in the germinatbase table.
     */
    public String getGermplasmName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_germplasm_attributes.attribute_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setAttributeId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_germplasm_attributes.attribute_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getAttributeId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_germplasm_attributes.attribute_name</code>. Defines the name of the attribute.
     */
    public void setAttributeName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_germplasm_attributes.attribute_name</code>. Defines the name of the attribute.
     */
    public String getAttributeName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_germplasm_attributes.attribute_description</code>. Describes the attribute. This should expand on the name to make it clear what the attribute actually is.
     */
    public void setAttributeDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_germplasm_attributes.attribute_description</code>. Describes the attribute. This should expand on the name to make it clear what the attribute actually is.
     */
    public String getAttributeDescription() {
        return (String) get(5);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_germplasm_attributes.attribute_type</code>. Describes the data type of the attribute. This can be INT, FLOAT or CHAR type.
     */
    public void setAttributeType(ViewTableGermplasmAttributesAttributeType value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_germplasm_attributes.attribute_type</code>. Describes the data type of the attribute. This can be INT, FLOAT or CHAR type.
     */
    public ViewTableGermplasmAttributesAttributeType getAttributeType() {
        return (ViewTableGermplasmAttributesAttributeType) get(6);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_germplasm_attributes.target_table</code>.
     */
    public void setTargetTable(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_germplasm_attributes.target_table</code>.
     */
    public String getTargetTable() {
        return (String) get(7);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_germplasm_attributes.foreign_id</code>. Foreign key to germinatebase (germinatebase.id).
     */
    public void setForeignId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_germplasm_attributes.foreign_id</code>. Foreign key to germinatebase (germinatebase.id).
     */
    public Integer getForeignId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_germplasm_attributes.attribute_value</code>. The value of the attribute.
     */
    public void setAttributeValue(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_germplasm_attributes.attribute_value</code>. The value of the attribute.
     */
    public String getAttributeValue() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, Integer, String, String, ViewTableGermplasmAttributesAttributeType, String, Integer, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, Integer, String, String, ViewTableGermplasmAttributesAttributeType, String, Integer, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES.GERMPLASM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES.GERMPLASM_GID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES.GERMPLASM_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES.ATTRIBUTE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES.ATTRIBUTE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES.ATTRIBUTE_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ViewTableGermplasmAttributesAttributeType> field7() {
        return ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES.ATTRIBUTE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES.TARGET_TABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES.FOREIGN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES.ATTRIBUTE_VALUE;
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
    public Integer component4() {
        return getAttributeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getAttributeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getAttributeDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableGermplasmAttributesAttributeType component7() {
        return getAttributeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getTargetTable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getForeignId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getAttributeValue();
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
    public Integer value4() {
        return getAttributeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getAttributeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getAttributeDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableGermplasmAttributesAttributeType value7() {
        return getAttributeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getTargetTable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getForeignId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getAttributeValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableGermplasmAttributesRecord value1(Integer value) {
        setGermplasmId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableGermplasmAttributesRecord value2(String value) {
        setGermplasmGid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableGermplasmAttributesRecord value3(String value) {
        setGermplasmName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableGermplasmAttributesRecord value4(Integer value) {
        setAttributeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableGermplasmAttributesRecord value5(String value) {
        setAttributeName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableGermplasmAttributesRecord value6(String value) {
        setAttributeDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableGermplasmAttributesRecord value7(ViewTableGermplasmAttributesAttributeType value) {
        setAttributeType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableGermplasmAttributesRecord value8(String value) {
        setTargetTable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableGermplasmAttributesRecord value9(Integer value) {
        setForeignId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableGermplasmAttributesRecord value10(String value) {
        setAttributeValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableGermplasmAttributesRecord values(Integer value1, String value2, String value3, Integer value4, String value5, String value6, ViewTableGermplasmAttributesAttributeType value7, String value8, Integer value9, String value10) {
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
     * Create a detached ViewTableGermplasmAttributesRecord
     */
    public ViewTableGermplasmAttributesRecord() {
        super(ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES);
    }

    /**
     * Create a detached, initialised ViewTableGermplasmAttributesRecord
     */
    public ViewTableGermplasmAttributesRecord(Integer germplasmId, String germplasmGid, String germplasmName, Integer attributeId, String attributeName, String attributeDescription, ViewTableGermplasmAttributesAttributeType attributeType, String targetTable, Integer foreignId, String attributeValue) {
        super(ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES);

        set(0, germplasmId);
        set(1, germplasmGid);
        set(2, germplasmName);
        set(3, attributeId);
        set(4, attributeName);
        set(5, attributeDescription);
        set(6, attributeType);
        set(7, targetTable);
        set(8, foreignId);
        set(9, attributeValue);
    }
// @formatter:on
}

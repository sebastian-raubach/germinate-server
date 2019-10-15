/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.records;


import javax.annotation.Generated;

import jhi.germinate.server.database.enums.ViewTablePedigreesRelationshipType;
import jhi.germinate.server.database.tables.ViewTablePedigrees;

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
public class ViewTablePedigreesRecord extends TableRecordImpl<ViewTablePedigreesRecord> implements Record10<Integer, String, String, Integer, String, String, ViewTablePedigreesRelationshipType, String, String, String> {

    private static final long serialVersionUID = 1194954075;

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_pedigrees.parent_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setParentId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_pedigrees.parent_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getParentId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_pedigrees.parent_gid</code>. A unique identifier.
     */
    public void setParentGid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_pedigrees.parent_gid</code>. A unique identifier.
     */
    public String getParentGid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_pedigrees.parent_name</code>. A unique name which defines an entry in the germinatbase table.
     */
    public void setParentName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_pedigrees.parent_name</code>. A unique name which defines an entry in the germinatbase table.
     */
    public String getParentName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_pedigrees.child_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setChildId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_pedigrees.child_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getChildId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_pedigrees.child_gid</code>. A unique identifier.
     */
    public void setChildGid(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_pedigrees.child_gid</code>. A unique identifier.
     */
    public String getChildGid() {
        return (String) get(4);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_pedigrees.child_name</code>. A unique name which defines an entry in the germinatbase table.
     */
    public void setChildName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_pedigrees.child_name</code>. A unique name which defines an entry in the germinatbase table.
     */
    public String getChildName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_pedigrees.relationship_type</code>. Male or Female parent. Should be recorded as 'M' (male) or 'F' (female).
     */
    public void setRelationshipType(ViewTablePedigreesRelationshipType value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_pedigrees.relationship_type</code>. Male or Female parent. Should be recorded as 'M' (male) or 'F' (female).
     */
    public ViewTablePedigreesRelationshipType getRelationshipType() {
        return (ViewTablePedigreesRelationshipType) get(6);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_pedigrees.relationship_description</code>. Can be used as a meta-data field to describe the relationships if a complex rellationship is required. Examples may include, 'is a complex cross containing', 'F4 generation' and so on. This is used by the Helium pedigree visualiztion tool.
     */
    public void setRelationshipDescription(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_pedigrees.relationship_description</code>. Can be used as a meta-data field to describe the relationships if a complex rellationship is required. Examples may include, 'is a complex cross containing', 'F4 generation' and so on. This is used by the Helium pedigree visualiztion tool.
     */
    public String getRelationshipDescription() {
        return (String) get(7);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_pedigrees.pedigree_description</code>. The name of the pedigree.
     */
    public void setPedigreeDescription(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_pedigrees.pedigree_description</code>. The name of the pedigree.
     */
    public String getPedigreeDescription() {
        return (String) get(8);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_pedigrees.pedigree_author</code>. Who is responsible for the creation of the pedigree. Attribution should be included in here for pedigree sources.
     */
    public void setPedigreeAuthor(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_pedigrees.pedigree_author</code>. Who is responsible for the creation of the pedigree. Attribution should be included in here for pedigree sources.
     */
    public String getPedigreeAuthor() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, Integer, String, String, ViewTablePedigreesRelationshipType, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, Integer, String, String, ViewTablePedigreesRelationshipType, String, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ViewTablePedigrees.VIEW_TABLE_PEDIGREES.PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ViewTablePedigrees.VIEW_TABLE_PEDIGREES.PARENT_GID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ViewTablePedigrees.VIEW_TABLE_PEDIGREES.PARENT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ViewTablePedigrees.VIEW_TABLE_PEDIGREES.CHILD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ViewTablePedigrees.VIEW_TABLE_PEDIGREES.CHILD_GID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ViewTablePedigrees.VIEW_TABLE_PEDIGREES.CHILD_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ViewTablePedigreesRelationshipType> field7() {
        return ViewTablePedigrees.VIEW_TABLE_PEDIGREES.RELATIONSHIP_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ViewTablePedigrees.VIEW_TABLE_PEDIGREES.RELATIONSHIP_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ViewTablePedigrees.VIEW_TABLE_PEDIGREES.PEDIGREE_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return ViewTablePedigrees.VIEW_TABLE_PEDIGREES.PEDIGREE_AUTHOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getParentGid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getParentName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getChildId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getChildGid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getChildName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTablePedigreesRelationshipType component7() {
        return getRelationshipType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getRelationshipDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getPedigreeDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getPedigreeAuthor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getParentGid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getParentName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getChildId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getChildGid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getChildName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTablePedigreesRelationshipType value7() {
        return getRelationshipType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getRelationshipDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getPedigreeDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getPedigreeAuthor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTablePedigreesRecord value1(Integer value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTablePedigreesRecord value2(String value) {
        setParentGid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTablePedigreesRecord value3(String value) {
        setParentName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTablePedigreesRecord value4(Integer value) {
        setChildId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTablePedigreesRecord value5(String value) {
        setChildGid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTablePedigreesRecord value6(String value) {
        setChildName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTablePedigreesRecord value7(ViewTablePedigreesRelationshipType value) {
        setRelationshipType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTablePedigreesRecord value8(String value) {
        setRelationshipDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTablePedigreesRecord value9(String value) {
        setPedigreeDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTablePedigreesRecord value10(String value) {
        setPedigreeAuthor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTablePedigreesRecord values(Integer value1, String value2, String value3, Integer value4, String value5, String value6, ViewTablePedigreesRelationshipType value7, String value8, String value9, String value10) {
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
     * Create a detached ViewTablePedigreesRecord
     */
    public ViewTablePedigreesRecord() {
        super(ViewTablePedigrees.VIEW_TABLE_PEDIGREES);
    }

    /**
     * Create a detached, initialised ViewTablePedigreesRecord
     */
    public ViewTablePedigreesRecord(Integer parentId, String parentGid, String parentName, Integer childId, String childGid, String childName, ViewTablePedigreesRelationshipType relationshipType, String relationshipDescription, String pedigreeDescription, String pedigreeAuthor) {
        super(ViewTablePedigrees.VIEW_TABLE_PEDIGREES);

        set(0, parentId);
        set(1, parentGid);
        set(2, parentName);
        set(3, childId);
        set(4, childGid);
        set(5, childName);
        set(6, relationshipType);
        set(7, relationshipDescription);
        set(8, pedigreeDescription);
        set(9, pedigreeAuthor);
    }
// @formatter:on
}

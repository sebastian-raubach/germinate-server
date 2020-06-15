/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.tables.ViewTableLinks;

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
public class ViewTableLinksRecord extends TableRecordImpl<ViewTableLinksRecord> implements Record11<Integer, String, Boolean, Integer, String, String, String, Integer, String, String, Timestamp> {

    private static final long serialVersionUID = -439702032;

    /**
     * Setter for <code>germinate_template_4_20_06_15.view_table_links.link_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setLinkId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.view_table_links.link_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getLinkId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.view_table_links.link_description</code>. A description of the link.
     */
    public void setLinkDescription(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.view_table_links.link_description</code>. A description of the link.
     */
    public String getLinkDescription() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.view_table_links.link_visibility</code>. Determines if the link is visible or not: {0, 1}
     */
    public void setLinkVisibility(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.view_table_links.link_visibility</code>. Determines if the link is visible or not: {0, 1}
     */
    public Boolean getLinkVisibility() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.view_table_links.linktype_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setLinktypeId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.view_table_links.linktype_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getLinktypeId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.view_table_links.linktype_description</code>. A description of the link.
     */
    public void setLinktypeDescription(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.view_table_links.linktype_description</code>. A description of the link.
     */
    public String getLinktypeDescription() {
        return (String) get(4);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.view_table_links.linktype_target_table</code>. This is the table that the link links to.
     */
    public void setLinktypeTargetTable(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.view_table_links.linktype_target_table</code>. This is the table that the link links to.
     */
    public String getLinktypeTargetTable() {
        return (String) get(5);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.view_table_links.linktype_target_column</code>. This is the column that is used to generate the link.
     */
    public void setLinktypeTargetColumn(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.view_table_links.linktype_target_column</code>. This is the column that is used to generate the link.
     */
    public String getLinktypeTargetColumn() {
        return (String) get(6);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.view_table_links.link_foreign_id</code>.
     */
    public void setLinkForeignId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.view_table_links.link_foreign_id</code>.
     */
    public Integer getLinkForeignId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.view_table_links.hyperlink</code>. The actual hyperlink.
     */
    public void setHyperlink(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.view_table_links.hyperlink</code>. The actual hyperlink.
     */
    public String getHyperlink() {
        return (String) get(8);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.view_table_links.placeholder</code>. The part of the link that will be replaced by the value of the target column.
     */
    public void setPlaceholder(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.view_table_links.placeholder</code>. The part of the link that will be replaced by the value of the target column.
     */
    public String getPlaceholder() {
        return (String) get(9);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.view_table_links.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.view_table_links.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(10);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, String, Boolean, Integer, String, String, String, Integer, String, String, Timestamp> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, String, Boolean, Integer, String, String, String, Integer, String, String, Timestamp> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ViewTableLinks.VIEW_TABLE_LINKS.LINK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ViewTableLinks.VIEW_TABLE_LINKS.LINK_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field3() {
        return ViewTableLinks.VIEW_TABLE_LINKS.LINK_VISIBILITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ViewTableLinks.VIEW_TABLE_LINKS.LINKTYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ViewTableLinks.VIEW_TABLE_LINKS.LINKTYPE_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ViewTableLinks.VIEW_TABLE_LINKS.LINKTYPE_TARGET_TABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ViewTableLinks.VIEW_TABLE_LINKS.LINKTYPE_TARGET_COLUMN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return ViewTableLinks.VIEW_TABLE_LINKS.LINK_FOREIGN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ViewTableLinks.VIEW_TABLE_LINKS.HYPERLINK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return ViewTableLinks.VIEW_TABLE_LINKS.PLACEHOLDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return ViewTableLinks.VIEW_TABLE_LINKS.UPDATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getLinkId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getLinkDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component3() {
        return getLinkVisibility();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getLinktypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getLinktypeDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getLinktypeTargetTable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getLinktypeTargetColumn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getLinkForeignId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getHyperlink();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getPlaceholder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getLinkId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getLinkDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value3() {
        return getLinkVisibility();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getLinktypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getLinktypeDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getLinktypeTargetTable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getLinktypeTargetColumn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getLinkForeignId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getHyperlink();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getPlaceholder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableLinksRecord value1(Integer value) {
        setLinkId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableLinksRecord value2(String value) {
        setLinkDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableLinksRecord value3(Boolean value) {
        setLinkVisibility(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableLinksRecord value4(Integer value) {
        setLinktypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableLinksRecord value5(String value) {
        setLinktypeDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableLinksRecord value6(String value) {
        setLinktypeTargetTable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableLinksRecord value7(String value) {
        setLinktypeTargetColumn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableLinksRecord value8(Integer value) {
        setLinkForeignId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableLinksRecord value9(String value) {
        setHyperlink(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableLinksRecord value10(String value) {
        setPlaceholder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableLinksRecord value11(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableLinksRecord values(Integer value1, String value2, Boolean value3, Integer value4, String value5, String value6, String value7, Integer value8, String value9, String value10, Timestamp value11) {
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

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewTableLinksRecord
     */
    public ViewTableLinksRecord() {
        super(ViewTableLinks.VIEW_TABLE_LINKS);
    }

    /**
     * Create a detached, initialised ViewTableLinksRecord
     */
    public ViewTableLinksRecord(Integer linkId, String linkDescription, Boolean linkVisibility, Integer linktypeId, String linktypeDescription, String linktypeTargetTable, String linktypeTargetColumn, Integer linkForeignId, String hyperlink, String placeholder, Timestamp updatedOn) {
        super(ViewTableLinks.VIEW_TABLE_LINKS);

        set(0, linkId);
        set(1, linkDescription);
        set(2, linkVisibility);
        set(3, linktypeId);
        set(4, linktypeDescription);
        set(5, linktypeTargetTable);
        set(6, linktypeTargetColumn);
        set(7, linkForeignId);
        set(8, hyperlink);
        set(9, placeholder);
        set(10, updatedOn);
    }
// @formatter:on
}

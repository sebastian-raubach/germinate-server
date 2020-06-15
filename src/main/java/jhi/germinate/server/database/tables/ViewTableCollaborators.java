/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables;


import javax.annotation.Generated;

import jhi.germinate.server.database.GerminateTemplate_4_20_06_15;
import jhi.germinate.server.database.tables.records.ViewTableCollaboratorsRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class ViewTableCollaborators extends TableImpl<ViewTableCollaboratorsRecord> {

    private static final long serialVersionUID = -380201182;

    /**
     * The reference instance of <code>germinate_template_4_20_06_15.view_table_collaborators</code>
     */
    public static final ViewTableCollaborators VIEW_TABLE_COLLABORATORS = new ViewTableCollaborators();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableCollaboratorsRecord> getRecordType() {
        return ViewTableCollaboratorsRecord.class;
    }

    /**
     * The column <code>germinate_template_4_20_06_15.view_table_collaborators.collaborator_id</code>.
     */
    public final TableField<ViewTableCollaboratorsRecord, Integer> COLLABORATOR_ID = createField("collaborator_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>germinate_template_4_20_06_15.view_table_collaborators.collaborator_first_name</code>. Last name (surname) of the author(s), researcher(s), scientist(s), student(s) responsible for producing the information product.
     */
    public final TableField<ViewTableCollaboratorsRecord, String> COLLABORATOR_FIRST_NAME = createField("collaborator_first_name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "Last name (surname) of the author(s), researcher(s), scientist(s), student(s) responsible for producing the information product.");

    /**
     * The column <code>germinate_template_4_20_06_15.view_table_collaborators.collaborator_last_name</code>. First name (and middle name if available) of the author(s), researcher(s), scientist(s), student(s) responsible for producing the information product.
     */
    public final TableField<ViewTableCollaboratorsRecord, String> COLLABORATOR_LAST_NAME = createField("collaborator_last_name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "First name (and middle name if available) of the author(s), researcher(s), scientist(s), student(s) responsible for producing the information product.");

    /**
     * The column <code>germinate_template_4_20_06_15.view_table_collaborators.collaborator_email</code>. E-mail address of the author(s), researcher(s), scientist(s), student(s) responsible for producing the information product.
     */
    public final TableField<ViewTableCollaboratorsRecord, String> COLLABORATOR_EMAIL = createField("collaborator_email", org.jooq.impl.SQLDataType.VARCHAR(255), this, "E-mail address of the author(s), researcher(s), scientist(s), student(s) responsible for producing the information product.");

    /**
     * The column <code>germinate_template_4_20_06_15.view_table_collaborators.collaborator_phone</code>. Phone number of the author(s), researcher(s), scientist(s), student(s) responsible for producing the information product.
     */
    public final TableField<ViewTableCollaboratorsRecord, String> COLLABORATOR_PHONE = createField("collaborator_phone", org.jooq.impl.SQLDataType.VARCHAR(255), this, "Phone number of the author(s), researcher(s), scientist(s), student(s) responsible for producing the information product.");

    /**
     * The column <code>germinate_template_4_20_06_15.view_table_collaborators.institution_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableCollaboratorsRecord, Integer> INSTITUTION_ID = createField("institution_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_template_4_20_06_15.view_table_collaborators.institution_name</code>. The institute name.
     */
    public final TableField<ViewTableCollaboratorsRecord, String> INSTITUTION_NAME = createField("institution_name", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "The institute name.");

    /**
     * The column <code>germinate_template_4_20_06_15.view_table_collaborators.institution_address</code>. The postal address of the institute.
     */
    public final TableField<ViewTableCollaboratorsRecord, String> INSTITUTION_ADDRESS = createField("institution_address", org.jooq.impl.SQLDataType.CLOB, this, "The postal address of the institute.");

    /**
     * The column <code>germinate_template_4_20_06_15.view_table_collaborators.dataset_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableCollaboratorsRecord, Integer> DATASET_ID = createField("dataset_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_template_4_20_06_15.view_table_collaborators.country_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableCollaboratorsRecord, Integer> COUNTRY_ID = createField("country_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_template_4_20_06_15.view_table_collaborators.country_name</code>. Country name.
     */
    public final TableField<ViewTableCollaboratorsRecord, String> COUNTRY_NAME = createField("country_name", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "Country name.");

    /**
     * The column <code>germinate_template_4_20_06_15.view_table_collaborators.country_code2</code>. ISO 2 Code for country.
     */
    public final TableField<ViewTableCollaboratorsRecord, String> COUNTRY_CODE2 = createField("country_code2", org.jooq.impl.SQLDataType.CHAR(2).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "ISO 2 Code for country.");

    /**
     * The column <code>germinate_template_4_20_06_15.view_table_collaborators.country_code3</code>. ISO 3 Code for country.
     */
    public final TableField<ViewTableCollaboratorsRecord, String> COUNTRY_CODE3 = createField("country_code3", org.jooq.impl.SQLDataType.CHAR(3).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "ISO 3 Code for country.");

    /**
     * Create a <code>germinate_template_4_20_06_15.view_table_collaborators</code> table reference
     */
    public ViewTableCollaborators() {
        this(DSL.name("view_table_collaborators"), null);
    }

    /**
     * Create an aliased <code>germinate_template_4_20_06_15.view_table_collaborators</code> table reference
     */
    public ViewTableCollaborators(String alias) {
        this(DSL.name(alias), VIEW_TABLE_COLLABORATORS);
    }

    /**
     * Create an aliased <code>germinate_template_4_20_06_15.view_table_collaborators</code> table reference
     */
    public ViewTableCollaborators(Name alias) {
        this(alias, VIEW_TABLE_COLLABORATORS);
    }

    private ViewTableCollaborators(Name alias, Table<ViewTableCollaboratorsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableCollaborators(Name alias, Table<ViewTableCollaboratorsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return GerminateTemplate_4_20_06_15.GERMINATE_TEMPLATE_4_20_06_15;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCollaborators as(String alias) {
        return new ViewTableCollaborators(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCollaborators as(Name alias) {
        return new ViewTableCollaborators(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableCollaborators rename(String name) {
        return new ViewTableCollaborators(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableCollaborators rename(Name name) {
        return new ViewTableCollaborators(name, null);
    }
// @formatter:on
}

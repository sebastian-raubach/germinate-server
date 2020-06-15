/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.GerminateTemplate_4_20_06_15;
import jhi.germinate.server.database.tables.records.ViewTableUsergroupsRecord;

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
public class ViewTableUsergroups extends TableImpl<ViewTableUsergroupsRecord> {

    private static final long serialVersionUID = 106990513;

    /**
     * The reference instance of <code>germinate_template_4_20_06_15.view_table_usergroups</code>
     */
    public static final ViewTableUsergroups VIEW_TABLE_USERGROUPS = new ViewTableUsergroups();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableUsergroupsRecord> getRecordType() {
        return ViewTableUsergroupsRecord.class;
    }

    /**
     * The column <code>germinate_template_4_20_06_15.view_table_usergroups.user_group_id</code>.
     */
    public final TableField<ViewTableUsergroupsRecord, Integer> USER_GROUP_ID = createField("user_group_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>germinate_template_4_20_06_15.view_table_usergroups.user_group_name</code>. The name of the user group.
     */
    public final TableField<ViewTableUsergroupsRecord, String> USER_GROUP_NAME = createField("user_group_name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "The name of the user group.");

    /**
     * The column <code>germinate_template_4_20_06_15.view_table_usergroups.user_group_description</code>. A description of the user group.
     */
    public final TableField<ViewTableUsergroupsRecord, String> USER_GROUP_DESCRIPTION = createField("user_group_description", org.jooq.impl.SQLDataType.CLOB, this, "A description of the user group.");

    /**
     * The column <code>germinate_template_4_20_06_15.view_table_usergroups.created_on</code>. When the record was created.
     */
    public final TableField<ViewTableUsergroupsRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP, this, "When the record was created.");

    /**
     * The column <code>germinate_template_4_20_06_15.view_table_usergroups.count</code>.
     */
    public final TableField<ViewTableUsergroupsRecord, Long> COUNT = createField("count", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>germinate_template_4_20_06_15.view_table_usergroups</code> table reference
     */
    public ViewTableUsergroups() {
        this(DSL.name("view_table_usergroups"), null);
    }

    /**
     * Create an aliased <code>germinate_template_4_20_06_15.view_table_usergroups</code> table reference
     */
    public ViewTableUsergroups(String alias) {
        this(DSL.name(alias), VIEW_TABLE_USERGROUPS);
    }

    /**
     * Create an aliased <code>germinate_template_4_20_06_15.view_table_usergroups</code> table reference
     */
    public ViewTableUsergroups(Name alias) {
        this(alias, VIEW_TABLE_USERGROUPS);
    }

    private ViewTableUsergroups(Name alias, Table<ViewTableUsergroupsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableUsergroups(Name alias, Table<ViewTableUsergroupsRecord> aliased, Field<?>[] parameters) {
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
    public ViewTableUsergroups as(String alias) {
        return new ViewTableUsergroups(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableUsergroups as(Name alias) {
        return new ViewTableUsergroups(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableUsergroups rename(String name) {
        return new ViewTableUsergroups(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableUsergroups rename(Name name) {
        return new ViewTableUsergroups(name, null);
    }
// @formatter:on
}

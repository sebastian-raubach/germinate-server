/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jhi.germinate.server.database.GerminateTemplate_4_20_06_15;
import jhi.germinate.server.database.tables.records.UsergroupmembersRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.TableImpl;


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
public class Usergroupmembers extends TableImpl<UsergroupmembersRecord> {

    private static final long serialVersionUID = -2001464896;

    /**
     * The reference instance of <code>germinate_template_4_20_06_15.usergroupmembers</code>
     */
    public static final Usergroupmembers USERGROUPMEMBERS = new Usergroupmembers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UsergroupmembersRecord> getRecordType() {
        return UsergroupmembersRecord.class;
    }

    /**
     * The column <code>germinate_template_4_20_06_15.usergroupmembers.id</code>.
     */
    public final TableField<UsergroupmembersRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>germinate_template_4_20_06_15.usergroupmembers.user_id</code>.
     */
    public final TableField<UsergroupmembersRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>germinate_template_4_20_06_15.usergroupmembers.usergroup_id</code>.
     */
    public final TableField<UsergroupmembersRecord, Integer> USERGROUP_ID = createField("usergroup_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>germinate_template_4_20_06_15.usergroupmembers.created_on</code>. When the record was created.
     */
    public final TableField<UsergroupmembersRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_template_4_20_06_15.usergroupmembers.updated_on</code>. When the record was updated. This may be different from the created on date if changes have been made subsequently to the underlying record.
     */
    public final TableField<UsergroupmembersRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if changes have been made subsequently to the underlying record.");

    /**
     * Create a <code>germinate_template_4_20_06_15.usergroupmembers</code> table reference
     */
    public Usergroupmembers() {
        this(DSL.name("usergroupmembers"), null);
    }

    /**
     * Create an aliased <code>germinate_template_4_20_06_15.usergroupmembers</code> table reference
     */
    public Usergroupmembers(String alias) {
        this(DSL.name(alias), USERGROUPMEMBERS);
    }

    /**
     * Create an aliased <code>germinate_template_4_20_06_15.usergroupmembers</code> table reference
     */
    public Usergroupmembers(Name alias) {
        this(alias, USERGROUPMEMBERS);
    }

    private Usergroupmembers(Name alias, Table<UsergroupmembersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Usergroupmembers(Name alias, Table<UsergroupmembersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
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
    public Identity<UsergroupmembersRecord, Integer> getIdentity() {
        return Internal.createIdentity(jhi.germinate.server.database.tables.Usergroupmembers.USERGROUPMEMBERS, jhi.germinate.server.database.tables.Usergroupmembers.USERGROUPMEMBERS.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UsergroupmembersRecord> getPrimaryKey() {
        return Internal.createUniqueKey(jhi.germinate.server.database.tables.Usergroupmembers.USERGROUPMEMBERS, "KEY_usergroupmembers_PRIMARY", jhi.germinate.server.database.tables.Usergroupmembers.USERGROUPMEMBERS.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UsergroupmembersRecord>> getKeys() {
        return Arrays.<UniqueKey<UsergroupmembersRecord>>asList(
              Internal.createUniqueKey(jhi.germinate.server.database.tables.Usergroupmembers.USERGROUPMEMBERS, "KEY_usergroupmembers_PRIMARY", jhi.germinate.server.database.tables.Usergroupmembers.USERGROUPMEMBERS.ID)
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Usergroupmembers as(String alias) {
        return new Usergroupmembers(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Usergroupmembers as(Name alias) {
        return new Usergroupmembers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Usergroupmembers rename(String name) {
        return new Usergroupmembers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Usergroupmembers rename(Name name) {
        return new Usergroupmembers(name, null);
    }
// @formatter:on
}

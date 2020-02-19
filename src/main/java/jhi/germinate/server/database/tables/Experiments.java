/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables;


import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jhi.germinate.server.database.GerminateTemplate_4_0_0;
import jhi.germinate.server.database.tables.records.ExperimentsRecord;

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
 * Defines ecperiments that are held in Germinate.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Experiments extends TableImpl<ExperimentsRecord> {

    private static final long serialVersionUID = -1603606133;

    /**
     * The reference instance of <code>germinate_template_4_0_0.experiments</code>
     */
    public static final Experiments EXPERIMENTS = new Experiments();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ExperimentsRecord> getRecordType() {
        return ExperimentsRecord.class;
    }

    /**
     * The column <code>germinate_template_4_0_0.experiments.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ExperimentsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_template_4_0_0.experiments.experiment_name</code>. The name of the experiment.
     */
    public final TableField<ExperimentsRecord, String> EXPERIMENT_NAME = createField("experiment_name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "The name of the experiment.");

    /**
     * The column <code>germinate_template_4_0_0.experiments.user_id</code>. Foreign key to Gatekeeper users (Gatekeeper users.id).

     */
    public final TableField<ExperimentsRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER, this, "Foreign key to Gatekeeper users (Gatekeeper users.id).\n");

    /**
     * The column <code>germinate_template_4_0_0.experiments.description</code>. Describes the experiment.
     */
    public final TableField<ExperimentsRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "Describes the experiment.");

    /**
     * The column <code>germinate_template_4_0_0.experiments.experiment_date</code>. The date that the experiment was carried out.
     */
    public final TableField<ExperimentsRecord, Date> EXPERIMENT_DATE = createField("experiment_date", org.jooq.impl.SQLDataType.DATE, this, "The date that the experiment was carried out.");

    /**
     * The column <code>germinate_template_4_0_0.experiments.created_on</code>. When the record was created.
     */
    public final TableField<ExperimentsRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_template_4_0_0.experiments.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<ExperimentsRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * Create a <code>germinate_template_4_0_0.experiments</code> table reference
     */
    public Experiments() {
        this(DSL.name("experiments"), null);
    }

    /**
     * Create an aliased <code>germinate_template_4_0_0.experiments</code> table reference
     */
    public Experiments(String alias) {
        this(DSL.name(alias), EXPERIMENTS);
    }

    /**
     * Create an aliased <code>germinate_template_4_0_0.experiments</code> table reference
     */
    public Experiments(Name alias) {
        this(alias, EXPERIMENTS);
    }

    private Experiments(Name alias, Table<ExperimentsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Experiments(Name alias, Table<ExperimentsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Defines ecperiments that are held in Germinate."));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return GerminateTemplate_4_0_0.GERMINATE_TEMPLATE_4_0_0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ExperimentsRecord, Integer> getIdentity() {
        return Internal.createIdentity(jhi.germinate.server.database.tables.Experiments.EXPERIMENTS, jhi.germinate.server.database.tables.Experiments.EXPERIMENTS.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ExperimentsRecord> getPrimaryKey() {
        return Internal.createUniqueKey(jhi.germinate.server.database.tables.Experiments.EXPERIMENTS, "KEY_experiments_PRIMARY", jhi.germinate.server.database.tables.Experiments.EXPERIMENTS.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ExperimentsRecord>> getKeys() {
        return Arrays.<UniqueKey<ExperimentsRecord>>asList(
              Internal.createUniqueKey(jhi.germinate.server.database.tables.Experiments.EXPERIMENTS, "KEY_experiments_PRIMARY", jhi.germinate.server.database.tables.Experiments.EXPERIMENTS.ID)
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Experiments as(String alias) {
        return new Experiments(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Experiments as(Name alias) {
        return new Experiments(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Experiments rename(String name) {
        return new Experiments(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Experiments rename(Name name) {
        return new Experiments(name, null);
    }
// @formatter:on
}

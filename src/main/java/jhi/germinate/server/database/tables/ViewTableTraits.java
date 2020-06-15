/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables;


import com.google.gson.JsonArray;

import javax.annotation.Generated;

import jhi.germinate.server.database.GerminateTemplate_4_20_06_15;
import jhi.germinate.server.database.enums.ViewTableTraitsDataType;
import jhi.germinate.server.database.tables.records.ViewTableTraitsRecord;
import jhi.germinate.server.util.SynonymBinding;

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
public class ViewTableTraits extends TableImpl<ViewTableTraitsRecord> {

    private static final long serialVersionUID = -62002229;

    /**
     * The reference instance of <code>germinate_template_4_20_06_15.view_table_traits</code>
     */
    public static final ViewTableTraits VIEW_TABLE_TRAITS = new ViewTableTraits();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableTraitsRecord> getRecordType() {
        return ViewTableTraitsRecord.class;
    }

    /**
     * The column <code>germinate_template_4_20_06_15.view_table_traits.trait_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableTraitsRecord, Integer> TRAIT_ID = createField("trait_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_template_4_20_06_15.view_table_traits.trait_name</code>. Phenotype full name.
     */
    public final TableField<ViewTableTraitsRecord, String> TRAIT_NAME = createField("trait_name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "Phenotype full name.");

    /**
     * The column <code>germinate_template_4_20_06_15.view_table_traits.trait_name_short</code>. Shortened name for the phenotype. This is used in table columns where space is an issue.
     */
    public final TableField<ViewTableTraitsRecord, String> TRAIT_NAME_SHORT = createField("trait_name_short", org.jooq.impl.SQLDataType.CHAR(10), this, "Shortened name for the phenotype. This is used in table columns where space is an issue.");

    /**
     * The column <code>germinate_template_4_20_06_15.view_table_traits.trait_description</code>. Full description of the phenotype. This should contain enough infomation to accurately identify the phenoytpe and how it was recorded.
     */
    public final TableField<ViewTableTraitsRecord, String> TRAIT_DESCRIPTION = createField("trait_description", org.jooq.impl.SQLDataType.CLOB, this, "Full description of the phenotype. This should contain enough infomation to accurately identify the phenoytpe and how it was recorded.");

    /**
     * The column <code>germinate_template_4_20_06_15.view_table_traits.data_type</code>. Defines the data type of the phenotype. This can be of float, int or char types.
     */
    public final TableField<ViewTableTraitsRecord, ViewTableTraitsDataType> DATA_TYPE = createField("data_type", org.jooq.impl.SQLDataType.VARCHAR(5).nullable(false).defaultValue(org.jooq.impl.DSL.inline("int", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(jhi.germinate.server.database.enums.ViewTableTraitsDataType.class), this, "Defines the data type of the phenotype. This can be of float, int or char types.");

    /**
     * The column <code>germinate_template_4_20_06_15.view_table_traits.unit_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableTraitsRecord, Integer> UNIT_ID = createField("unit_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_template_4_20_06_15.view_table_traits.unit_name</code>. The name of the unit. This should be the name of the unit in full.
     */
    public final TableField<ViewTableTraitsRecord, String> UNIT_NAME = createField("unit_name", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "The name of the unit. This should be the name of the unit in full.");

    /**
     * The column <code>germinate_template_4_20_06_15.view_table_traits.unit_description</code>. A description of the unit. If the unit is not a standard SI unit then it is beneficial to have a description which explains what the unit it, how it is derived and any other information which would help identifiy it.
     */
    public final TableField<ViewTableTraitsRecord, String> UNIT_DESCRIPTION = createField("unit_description", org.jooq.impl.SQLDataType.CLOB, this, "A description of the unit. If the unit is not a standard SI unit then it is beneficial to have a description which explains what the unit it, how it is derived and any other information which would help identifiy it.");

    /**
     * The column <code>germinate_template_4_20_06_15.view_table_traits.unit_abbreviation</code>. This should be the unit abbreviation.
     */
    public final TableField<ViewTableTraitsRecord, String> UNIT_ABBREVIATION = createField("unit_abbreviation", org.jooq.impl.SQLDataType.CHAR(10), this, "This should be the unit abbreviation.");

    /**
     * The column <code>germinate_template_4_20_06_15.view_table_traits.synonyms</code>. The synonyms as a json array.
     */
    public final TableField<ViewTableTraitsRecord, JsonArray> SYNONYMS = createField("synonyms", org.jooq.impl.DefaultDataType.getDefaultDataType("\"germinate_template_4_20_06_15\".\"view_table_traits_synonyms\""), this, "The synonyms as a json array.", new SynonymBinding());

    /**
     * The column <code>germinate_template_4_20_06_15.view_table_traits.count</code>.
     */
    public final TableField<ViewTableTraitsRecord, Long> COUNT = createField("count", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>germinate_template_4_20_06_15.view_table_traits</code> table reference
     */
    public ViewTableTraits() {
        this(DSL.name("view_table_traits"), null);
    }

    /**
     * Create an aliased <code>germinate_template_4_20_06_15.view_table_traits</code> table reference
     */
    public ViewTableTraits(String alias) {
        this(DSL.name(alias), VIEW_TABLE_TRAITS);
    }

    /**
     * Create an aliased <code>germinate_template_4_20_06_15.view_table_traits</code> table reference
     */
    public ViewTableTraits(Name alias) {
        this(alias, VIEW_TABLE_TRAITS);
    }

    private ViewTableTraits(Name alias, Table<ViewTableTraitsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableTraits(Name alias, Table<ViewTableTraitsRecord> aliased, Field<?>[] parameters) {
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
    public ViewTableTraits as(String alias) {
        return new ViewTableTraits(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableTraits as(Name alias) {
        return new ViewTableTraits(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableTraits rename(String name) {
        return new ViewTableTraits(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableTraits rename(Name name) {
        return new ViewTableTraits(name, null);
    }
// @formatter:on
}

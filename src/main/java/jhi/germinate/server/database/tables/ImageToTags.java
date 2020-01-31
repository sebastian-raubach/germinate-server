/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jhi.germinate.server.database.GerminateTemplate_4_0_0;
import jhi.germinate.server.database.tables.records.ImageToTagsRecord;

import org.jooq.Field;
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
public class ImageToTags extends TableImpl<ImageToTagsRecord> {

    private static final long serialVersionUID = -475324346;

    /**
     * The reference instance of <code>germinate_template_4_0_0.image_to_tags</code>
     */
    public static final ImageToTags IMAGE_TO_TAGS = new ImageToTags();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ImageToTagsRecord> getRecordType() {
        return ImageToTagsRecord.class;
    }

    /**
     * The column <code>germinate_template_4_0_0.image_to_tags.image_id</code>.
     */
    public final TableField<ImageToTagsRecord, Integer> IMAGE_ID = createField("image_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>germinate_template_4_0_0.image_to_tags.imagetag_id</code>.
     */
    public final TableField<ImageToTagsRecord, Integer> IMAGETAG_ID = createField("imagetag_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>germinate_template_4_0_0.image_to_tags.created_on</code>.
     */
    public final TableField<ImageToTagsRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>germinate_template_4_0_0.image_to_tags.updated_on</code>.
     */
    public final TableField<ImageToTagsRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>germinate_template_4_0_0.image_to_tags</code> table reference
     */
    public ImageToTags() {
        this(DSL.name("image_to_tags"), null);
    }

    /**
     * Create an aliased <code>germinate_template_4_0_0.image_to_tags</code> table reference
     */
    public ImageToTags(String alias) {
        this(DSL.name(alias), IMAGE_TO_TAGS);
    }

    /**
     * Create an aliased <code>germinate_template_4_0_0.image_to_tags</code> table reference
     */
    public ImageToTags(Name alias) {
        this(alias, IMAGE_TO_TAGS);
    }

    private ImageToTags(Name alias, Table<ImageToTagsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ImageToTags(Name alias, Table<ImageToTagsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
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
    public UniqueKey<ImageToTagsRecord> getPrimaryKey() {
        return Internal.createUniqueKey(jhi.germinate.server.database.tables.ImageToTags.IMAGE_TO_TAGS, "KEY_image_to_tags_PRIMARY", jhi.germinate.server.database.tables.ImageToTags.IMAGE_TO_TAGS.IMAGE_ID, jhi.germinate.server.database.tables.ImageToTags.IMAGE_TO_TAGS.IMAGETAG_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ImageToTagsRecord>> getKeys() {
        return Arrays.<UniqueKey<ImageToTagsRecord>>asList(
              Internal.createUniqueKey(jhi.germinate.server.database.tables.ImageToTags.IMAGE_TO_TAGS, "KEY_image_to_tags_PRIMARY", jhi.germinate.server.database.tables.ImageToTags.IMAGE_TO_TAGS.IMAGE_ID, jhi.germinate.server.database.tables.ImageToTags.IMAGE_TO_TAGS.IMAGETAG_ID)
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageToTags as(String alias) {
        return new ImageToTags(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageToTags as(Name alias) {
        return new ImageToTags(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ImageToTags rename(String name) {
        return new ImageToTags(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ImageToTags rename(Name name) {
        return new ImageToTags(name, null);
    }
// @formatter:on
}

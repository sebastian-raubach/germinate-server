/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.tables.Locationtypes;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


// @formatter:off
/**
 * Describes a location.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LocationtypesRecord extends UpdatableRecordImpl<LocationtypesRecord> implements Record5<Integer, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 99034243;

    /**
     * Setter for <code>germinate_template_4_20_06_15.locationtypes.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.locationtypes.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.locationtypes.name</code>. The name of the location type. 
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.locationtypes.name</code>. The name of the location type. 
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.locationtypes.description</code>. A description of the location type.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.locationtypes.description</code>. A description of the location type.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.locationtypes.created_on</code>. When the record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.locationtypes.created_on</code>. When the record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.locationtypes.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.locationtypes.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Locationtypes.LOCATIONTYPES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Locationtypes.LOCATIONTYPES.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Locationtypes.LOCATIONTYPES.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Locationtypes.LOCATIONTYPES.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Locationtypes.LOCATIONTYPES.UPDATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationtypesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationtypesRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationtypesRecord value3(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationtypesRecord value4(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationtypesRecord value5(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationtypesRecord values(Integer value1, String value2, String value3, Timestamp value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LocationtypesRecord
     */
    public LocationtypesRecord() {
        super(Locationtypes.LOCATIONTYPES);
    }

    /**
     * Create a detached, initialised LocationtypesRecord
     */
    public LocationtypesRecord(Integer id, String name, String description, Timestamp createdOn, Timestamp updatedOn) {
        super(Locationtypes.LOCATIONTYPES);

        set(0, id);
        set(1, name);
        set(2, description);
        set(3, createdOn);
        set(4, updatedOn);
    }
// @formatter:on
}

/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.enums;


import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


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
public enum DataImportJobsStatus implements EnumType {

    waiting("waiting"),

    running("running"),

    failed("failed"),

    completed("completed"),

    cancelled("cancelled");

    private final String literal;

    private DataImportJobsStatus(String literal) {
        this.literal = literal;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return "data_import_jobs_status";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLiteral() {
        return literal;
    }
// @formatter:on
}
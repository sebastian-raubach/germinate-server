/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.tables.ViewTableNews;

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
public class ViewTableNewsRecord extends TableRecordImpl<ViewTableNewsRecord> implements Record10<Integer, String, String, String, String, Integer, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -76903389;

    /**
     * Setter for <code>germinate_template_4_20_06_15.view_table_news.news_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setNewsId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.view_table_news.news_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getNewsId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.view_table_news.news_title</code>. A title which is used to name this news item. This appears in the Germinate user interface if used.
     */
    public void setNewsTitle(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.view_table_news.news_title</code>. A title which is used to name this news item. This appears in the Germinate user interface if used.
     */
    public String getNewsTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.view_table_news.news_content</code>. The textual content of this news item.
     */
    public void setNewsContent(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.view_table_news.news_content</code>. The textual content of this news item.
     */
    public String getNewsContent() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.view_table_news.news_hyperlink</code>. HTML hyperlink to use for this news item. This can be a link to another source which contains more information or a link to the original source.
     */
    public void setNewsHyperlink(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.view_table_news.news_hyperlink</code>. HTML hyperlink to use for this news item. This can be a link to another source which contains more information or a link to the original source.
     */
    public String getNewsHyperlink() {
        return (String) get(3);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.view_table_news.news_image</code>. Image to use with this news item.
     */
    public void setNewsImage(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.view_table_news.news_image</code>. Image to use with this news item.
     */
    public String getNewsImage() {
        return (String) get(4);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.view_table_news.newstype_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setNewstypeId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.view_table_news.newstype_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getNewstypeId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.view_table_news.newstype_name</code>. Name of the news type.
     */
    public void setNewstypeName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.view_table_news.newstype_name</code>. Name of the news type.
     */
    public String getNewstypeName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.view_table_news.newstype_description</code>. A longer description of the news type.
     */
    public void setNewstypeDescription(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.view_table_news.newstype_description</code>. A longer description of the news type.
     */
    public String getNewstypeDescription() {
        return (String) get(7);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.view_table_news.created_on</code>. When the record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.view_table_news.created_on</code>. When the record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>germinate_template_4_20_06_15.view_table_news.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>germinate_template_4_20_06_15.view_table_news.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, String, String, Integer, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, String, String, Integer, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ViewTableNews.VIEW_TABLE_NEWS.NEWS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ViewTableNews.VIEW_TABLE_NEWS.NEWS_TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ViewTableNews.VIEW_TABLE_NEWS.NEWS_CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ViewTableNews.VIEW_TABLE_NEWS.NEWS_HYPERLINK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ViewTableNews.VIEW_TABLE_NEWS.NEWS_IMAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return ViewTableNews.VIEW_TABLE_NEWS.NEWSTYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ViewTableNews.VIEW_TABLE_NEWS.NEWSTYPE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ViewTableNews.VIEW_TABLE_NEWS.NEWSTYPE_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return ViewTableNews.VIEW_TABLE_NEWS.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return ViewTableNews.VIEW_TABLE_NEWS.UPDATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getNewsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getNewsTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getNewsContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getNewsHyperlink();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getNewsImage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getNewstypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getNewstypeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getNewstypeDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getNewsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getNewsTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getNewsContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getNewsHyperlink();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getNewsImage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getNewstypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getNewstypeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getNewstypeDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableNewsRecord value1(Integer value) {
        setNewsId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableNewsRecord value2(String value) {
        setNewsTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableNewsRecord value3(String value) {
        setNewsContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableNewsRecord value4(String value) {
        setNewsHyperlink(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableNewsRecord value5(String value) {
        setNewsImage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableNewsRecord value6(Integer value) {
        setNewstypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableNewsRecord value7(String value) {
        setNewstypeName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableNewsRecord value8(String value) {
        setNewstypeDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableNewsRecord value9(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableNewsRecord value10(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableNewsRecord values(Integer value1, String value2, String value3, String value4, String value5, Integer value6, String value7, String value8, Timestamp value9, Timestamp value10) {
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
     * Create a detached ViewTableNewsRecord
     */
    public ViewTableNewsRecord() {
        super(ViewTableNews.VIEW_TABLE_NEWS);
    }

    /**
     * Create a detached, initialised ViewTableNewsRecord
     */
    public ViewTableNewsRecord(Integer newsId, String newsTitle, String newsContent, String newsHyperlink, String newsImage, Integer newstypeId, String newstypeName, String newstypeDescription, Timestamp createdOn, Timestamp updatedOn) {
        super(ViewTableNews.VIEW_TABLE_NEWS);

        set(0, newsId);
        set(1, newsTitle);
        set(2, newsContent);
        set(3, newsHyperlink);
        set(4, newsImage);
        set(5, newstypeId);
        set(6, newstypeName);
        set(7, newstypeDescription);
        set(8, createdOn);
        set(9, updatedOn);
    }
// @formatter:on
}

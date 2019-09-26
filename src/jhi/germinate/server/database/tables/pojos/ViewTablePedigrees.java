/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;

import jhi.germinate.server.database.enums.ViewTablePedigreesRelationshipType;


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
public class ViewTablePedigrees implements Serializable {

    private static final long serialVersionUID = 381199311;

    private Integer                            parentId;
    private String                             parentGid;
    private String                             parentName;
    private Integer                            childId;
    private String                             childGid;
    private String                             childName;
    private ViewTablePedigreesRelationshipType relationshipType;
    private String                             relationshipDescription;
    private String                             pedigreeDescription;
    private String                             pedigreeAuthor;

    public ViewTablePedigrees() {}

    public ViewTablePedigrees(ViewTablePedigrees value) {
        this.parentId = value.parentId;
        this.parentGid = value.parentGid;
        this.parentName = value.parentName;
        this.childId = value.childId;
        this.childGid = value.childGid;
        this.childName = value.childName;
        this.relationshipType = value.relationshipType;
        this.relationshipDescription = value.relationshipDescription;
        this.pedigreeDescription = value.pedigreeDescription;
        this.pedigreeAuthor = value.pedigreeAuthor;
    }

    public ViewTablePedigrees(
        Integer                            parentId,
        String                             parentGid,
        String                             parentName,
        Integer                            childId,
        String                             childGid,
        String                             childName,
        ViewTablePedigreesRelationshipType relationshipType,
        String                             relationshipDescription,
        String                             pedigreeDescription,
        String                             pedigreeAuthor
    ) {
        this.parentId = parentId;
        this.parentGid = parentGid;
        this.parentName = parentName;
        this.childId = childId;
        this.childGid = childGid;
        this.childName = childName;
        this.relationshipType = relationshipType;
        this.relationshipDescription = relationshipDescription;
        this.pedigreeDescription = pedigreeDescription;
        this.pedigreeAuthor = pedigreeAuthor;
    }

    public Integer getParentId() {
        return this.parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getParentGid() {
        return this.parentGid;
    }

    public void setParentGid(String parentGid) {
        this.parentGid = parentGid;
    }

    public String getParentName() {
        return this.parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public Integer getChildId() {
        return this.childId;
    }

    public void setChildId(Integer childId) {
        this.childId = childId;
    }

    public String getChildGid() {
        return this.childGid;
    }

    public void setChildGid(String childGid) {
        this.childGid = childGid;
    }

    public String getChildName() {
        return this.childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public ViewTablePedigreesRelationshipType getRelationshipType() {
        return this.relationshipType;
    }

    public void setRelationshipType(ViewTablePedigreesRelationshipType relationshipType) {
        this.relationshipType = relationshipType;
    }

    public String getRelationshipDescription() {
        return this.relationshipDescription;
    }

    public void setRelationshipDescription(String relationshipDescription) {
        this.relationshipDescription = relationshipDescription;
    }

    public String getPedigreeDescription() {
        return this.pedigreeDescription;
    }

    public void setPedigreeDescription(String pedigreeDescription) {
        this.pedigreeDescription = pedigreeDescription;
    }

    public String getPedigreeAuthor() {
        return this.pedigreeAuthor;
    }

    public void setPedigreeAuthor(String pedigreeAuthor) {
        this.pedigreeAuthor = pedigreeAuthor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewTablePedigrees (");

        sb.append(parentId);
        sb.append(", ").append(parentGid);
        sb.append(", ").append(parentName);
        sb.append(", ").append(childId);
        sb.append(", ").append(childGid);
        sb.append(", ").append(childName);
        sb.append(", ").append(relationshipType);
        sb.append(", ").append(relationshipDescription);
        sb.append(", ").append(pedigreeDescription);
        sb.append(", ").append(pedigreeAuthor);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}

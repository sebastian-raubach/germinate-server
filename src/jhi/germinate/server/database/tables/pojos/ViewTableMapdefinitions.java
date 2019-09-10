/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.pojos;


import com.google.gson.JsonArray;

import java.io.Serializable;

import javax.annotation.Generated;


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
public class ViewTableMapdefinitions implements Serializable {

    private static final long serialVersionUID = -260203199;

    private Integer   markerId;
    private String    markerName;
    private JsonArray synonyms;
    private String    mapFeatureType;
    private Integer   mapId;
    private Integer   userId;
    private Boolean   visibility;
    private String    mapName;
    private String    chromosome;
    private Double    position;

    public ViewTableMapdefinitions() {}

    public ViewTableMapdefinitions(ViewTableMapdefinitions value) {
        this.markerId = value.markerId;
        this.markerName = value.markerName;
        this.synonyms = value.synonyms;
        this.mapFeatureType = value.mapFeatureType;
        this.mapId = value.mapId;
        this.userId = value.userId;
        this.visibility = value.visibility;
        this.mapName = value.mapName;
        this.chromosome = value.chromosome;
        this.position = value.position;
    }

    public ViewTableMapdefinitions(
        Integer   markerId,
        String    markerName,
        JsonArray synonyms,
        String    mapFeatureType,
        Integer   mapId,
        Integer   userId,
        Boolean   visibility,
        String    mapName,
        String    chromosome,
        Double    position
    ) {
        this.markerId = markerId;
        this.markerName = markerName;
        this.synonyms = synonyms;
        this.mapFeatureType = mapFeatureType;
        this.mapId = mapId;
        this.userId = userId;
        this.visibility = visibility;
        this.mapName = mapName;
        this.chromosome = chromosome;
        this.position = position;
    }

    public Integer getMarkerId() {
        return this.markerId;
    }

    public void setMarkerId(Integer markerId) {
        this.markerId = markerId;
    }

    public String getMarkerName() {
        return this.markerName;
    }

    public void setMarkerName(String markerName) {
        this.markerName = markerName;
    }

    public JsonArray getSynonyms() {
        return this.synonyms;
    }

    public void setSynonyms(JsonArray synonyms) {
        this.synonyms = synonyms;
    }

    public String getMapFeatureType() {
        return this.mapFeatureType;
    }

    public void setMapFeatureType(String mapFeatureType) {
        this.mapFeatureType = mapFeatureType;
    }

    public Integer getMapId() {
        return this.mapId;
    }

    public void setMapId(Integer mapId) {
        this.mapId = mapId;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Boolean getVisibility() {
        return this.visibility;
    }

    public void setVisibility(Boolean visibility) {
        this.visibility = visibility;
    }

    public String getMapName() {
        return this.mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public String getChromosome() {
        return this.chromosome;
    }

    public void setChromosome(String chromosome) {
        this.chromosome = chromosome;
    }

    public Double getPosition() {
        return this.position;
    }

    public void setPosition(Double position) {
        this.position = position;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewTableMapdefinitions (");

        sb.append(markerId);
        sb.append(", ").append(markerName);
        sb.append(", ").append(synonyms);
        sb.append(", ").append(mapFeatureType);
        sb.append(", ").append(mapId);
        sb.append(", ").append(userId);
        sb.append(", ").append(visibility);
        sb.append(", ").append(mapName);
        sb.append(", ").append(chromosome);
        sb.append(", ").append(position);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}

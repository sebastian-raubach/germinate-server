/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database;


import org.jooq.*;
import org.jooq.impl.*;

import java.util.*;

import javax.annotation.*;

import jhi.germinate.server.database.tables.*;


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
public class GerminateTemplate_3_7_0 extends SchemaImpl {

    private static final long serialVersionUID = -432525064;

    /**
     * The reference instance of <code>germinate_template_3_7_0</code>
     */
    public static final GerminateTemplate_3_7_0 GERMINATE_TEMPLATE_3_7_0 = new GerminateTemplate_3_7_0();

    /**
     * The table <code>germinate_template_3_7_0.analysismethods</code>.
     */
    public final Analysismethods ANALYSISMETHODS = jhi.germinate.server.database.tables.Analysismethods.ANALYSISMETHODS;

    /**
     * Defines attributes data. Attributes which are defined in attributes can have values associated with them. Data which does not warrant new column in the germinatebase table can be added here. Examples include small amounts of data defining germplasm which only exists for a small sub-group of the total database.
     */
    public final Attributedata ATTRIBUTEDATA = jhi.germinate.server.database.tables.Attributedata.ATTRIBUTEDATA;

    /**
     * Describes attributes. Attributes are bits of information that can be joined to, for example, a germinatebase entry. These are bits of data that while important do not warrant adding additional columns in the other tables. Examples would be using this to define ecotypes for germinatebase entries.
     */
    public final Attributes ATTRIBUTES = jhi.germinate.server.database.tables.Attributes.ATTRIBUTES;

    /**
     * Based on Multi Crop Passport Descriptors (MCPD V2 2012) - The coding scheme proposed can be used at 3 different levels of detail: either by using the
general codes (in boldface) such as 100, 200, 300, 400, or by using the more specific codes
such as 110, 120, etc.
100) Wild
110) Natural
120) Semi-natural/wild
130) Semi-natural/sown
200) Weedy
300) Traditional cultivar/landrace
400) Breeding/research material
 410) Breeder's line
 411) Synthetic population
 412) Hybrid
 413) Founder stock/base population
 414) Inbred line (parent of hybrid cultivar)
 415) Segregating population
 416) Clonal selection
 420) Genetic stock
 421) Mutant (e.g. induced/insertion mutants, tilling populations)
 422) Cytogenetic stocks (e.g. chromosome addition/substitution, aneuploids,
amphiploids)
 423) Other genetic stocks (e.g. mapping populations)
500) Advanced or improved cultivar (conventional breeding methods)
600) GMO (by genetic engineering)
 999) Other 
     */
    public final Biologicalstatus BIOLOGICALSTATUS = jhi.germinate.server.database.tables.Biologicalstatus.BIOLOGICALSTATUS;

    /**
     * Holds montly average climate data such as rainfall, temperature or cloud cover. This is based on locations rather than accessions like most of the other tables in Germinate.
     */
    public final Climatedata CLIMATEDATA = jhi.germinate.server.database.tables.Climatedata.CLIMATEDATA;

    /**
     * Climate overlays can be used in conjunction with OpenStreetMap in order to visualize climate data in a geographic context.
     */
    public final Climateoverlays CLIMATEOVERLAYS = jhi.germinate.server.database.tables.Climateoverlays.CLIMATEOVERLAYS;

    /**
     * Defines climates. Climates are measureable weather type characteristics such as temperature or cloud cover.
     */
    public final Climates CLIMATES = jhi.germinate.server.database.tables.Climates.CLIMATES;

    /**
     * The table <code>germinate_template_3_7_0.collaborators</code>.
     */
    public final Collaborators COLLABORATORS = jhi.germinate.server.database.tables.Collaborators.COLLABORATORS;

    /**
     * The coding scheme proposed can be used at 2 different levels of detail: either by using the
general codes such as 10, 20, 30, 40, etc., or by using the more specific codes,
such as 11, 12, etc. See Multi Crop Passport Descriptors (MCPD V2 2012) for further definitions.
     */
    public final Collectingsources COLLECTINGSOURCES = jhi.germinate.server.database.tables.Collectingsources.COLLECTINGSOURCES;

    /**
     * Comments can be added to different entries in Germinate such as entries from germinatebase or markers from the markers table.
     */
    public final Comments COMMENTS = jhi.germinate.server.database.tables.Comments.COMMENTS;

    /**
     * Defines the comment type.
     */
    public final Commenttypes COMMENTTYPES = jhi.germinate.server.database.tables.Commenttypes.COMMENTTYPES;

    /**
     * The table <code>germinate_template_3_7_0.compounddata</code>.
     */
    public final Compounddata COMPOUNDDATA = jhi.germinate.server.database.tables.Compounddata.COMPOUNDDATA;

    /**
     * The table <code>germinate_template_3_7_0.compounds</code>.
     */
    public final Compounds COMPOUNDS = jhi.germinate.server.database.tables.Compounds.COMPOUNDS;

    /**
     * Countries that are used in the locations type tables in Germinate. These are the ISO codes for countries.
     */
    public final Countries COUNTRIES = jhi.germinate.server.database.tables.Countries.COUNTRIES;

    /**
     * If enabled, tracks which user accessed which datasets.
     */
    public final Datasetaccesslogs DATASETACCESSLOGS = jhi.germinate.server.database.tables.Datasetaccesslogs.DATASETACCESSLOGS;

    /**
     * The table <code>germinate_template_3_7_0.datasetcollaborators</code>.
     */
    public final Datasetcollaborators DATASETCOLLABORATORS = jhi.germinate.server.database.tables.Datasetcollaborators.DATASETCOLLABORATORS;

    /**
     * The table <code>germinate_template_3_7_0.datasetmembers</code>.
     */
    public final Datasetmembers DATASETMEMBERS = jhi.germinate.server.database.tables.Datasetmembers.DATASETMEMBERS;

    /**
     * The table <code>germinate_template_3_7_0.datasetmembertypes</code>.
     */
    public final Datasetmembertypes DATASETMEMBERTYPES = jhi.germinate.server.database.tables.Datasetmembertypes.DATASETMEMBERTYPES;

    /**
     * Defines dataset sizes for the items in the datasets table. This table is automatically updated every hour.
     */
    public final Datasetmeta DATASETMETA = jhi.germinate.server.database.tables.Datasetmeta.DATASETMETA;

    /**
     * This defines which users can view which datasets. Requires Germinate Gatekeeper. This overrides the datasets state.
     */
    public final Datasetpermissions DATASETPERMISSIONS = jhi.germinate.server.database.tables.Datasetpermissions.DATASETPERMISSIONS;

    /**
     * Datasets which are defined within Germinate although there can be external datasets which are links out to external data sources most will be held within Germinate.
     */
    public final Datasets DATASETS = jhi.germinate.server.database.tables.Datasets.DATASETS;

    /**
     * The table <code>germinate_template_3_7_0.datasetstates</code>.
     */
    public final Datasetstates DATASETSTATES = jhi.germinate.server.database.tables.Datasetstates.DATASETSTATES;

    /**
     * The table <code>germinate_template_3_7_0.entitytypes</code>.
     */
    public final Entitytypes ENTITYTYPES = jhi.germinate.server.database.tables.Entitytypes.ENTITYTYPES;

    /**
     * Defines ecperiments that are held in Germinate.
     */
    public final Experiments EXPERIMENTS = jhi.germinate.server.database.tables.Experiments.EXPERIMENTS;

    /**
     * The table <code>germinate_template_3_7_0.experimenttypes</code>.
     */
    public final Experimenttypes EXPERIMENTTYPES = jhi.germinate.server.database.tables.Experimenttypes.EXPERIMENTTYPES;

    /**
     * Germinatebase is the Germinate base table which contains passport and other germplasm definition data.
     */
    public final Germinatebase GERMINATEBASE = jhi.germinate.server.database.tables.Germinatebase.GERMINATEBASE;

    /**
     * Defines which entities are contained within a group. These can be the primary key from any table.
     */
    public final Groupmembers GROUPMEMBERS = jhi.germinate.server.database.tables.Groupmembers.GROUPMEMBERS;

    /**
     * Allows the definition of groups within Germinate. Germinate supports a number of different group types such as germinatebase accesion groups and marker groups.
     */
    public final Groups GROUPS = jhi.germinate.server.database.tables.Groups.GROUPS;

    /**
     * The table <code>germinate_template_3_7_0.grouptypes</code>.
     */
    public final Grouptypes GROUPTYPES = jhi.germinate.server.database.tables.Grouptypes.GROUPTYPES;

    /**
     * The table <code>germinate_template_3_7_0.images</code>.
     */
    public final Images IMAGES = jhi.germinate.server.database.tables.Images.IMAGES;

    /**
     * The table <code>germinate_template_3_7_0.imagetypes</code>.
     */
    public final Imagetypes IMAGETYPES = jhi.germinate.server.database.tables.Imagetypes.IMAGETYPES;

    /**
     * Defines institutions within Germinate. Accessions may be associated with an institute and this can be defined here.
     */
    public final Institutions INSTITUTIONS = jhi.germinate.server.database.tables.Institutions.INSTITUTIONS;

    /**
     * The table <code>germinate_template_3_7_0.licensedata</code>.
     */
    public final Licensedata LICENSEDATA = jhi.germinate.server.database.tables.Licensedata.LICENSEDATA;

    /**
     * The table <code>germinate_template_3_7_0.licenselogs</code>.
     */
    public final Licenselogs LICENSELOGS = jhi.germinate.server.database.tables.Licenselogs.LICENSELOGS;

    /**
     * The table <code>germinate_template_3_7_0.licenses</code>.
     */
    public final Licenses LICENSES = jhi.germinate.server.database.tables.Licenses.LICENSES;

    /**
     * Germinate allows to define external links for different types of data. With this feature you can
define links to external resources.
     */
    public final Links LINKS = jhi.germinate.server.database.tables.Links.LINKS;

    /**
     * The link type determines which database table and column are used to construct the final
link. The ”placeholder” in the link (from the links table) will be replaced by the value of the
”target column” in the ”target table”
     */
    public final Linktypes LINKTYPES = jhi.germinate.server.database.tables.Linktypes.LINKTYPES;

    /**
     * The table <code>germinate_template_3_7_0.locales</code>.
     */
    public final Locales LOCALES = jhi.germinate.server.database.tables.Locales.LOCALES;

    /**
     * Describes locations. Locations can be collecting sites or the location of any geographical feature such as research institutes or lab locations.
     */
    public final Locations LOCATIONS = jhi.germinate.server.database.tables.Locations.LOCATIONS;

    /**
     * Describes a location.
     */
    public final Locationtypes LOCATIONTYPES = jhi.germinate.server.database.tables.Locationtypes.LOCATIONTYPES;

    /**
     * Relates genetic markers to a map and assigns a position (if known). Maps are made up of lists of markers and positions (genetic or physiscal and chromosome/linkage group assignation). In the case of QTL the definition_start and definition_end columns can be used to specify a range across a linkage group.
     */
    public final Mapdefinitions MAPDEFINITIONS = jhi.germinate.server.database.tables.Mapdefinitions.MAPDEFINITIONS;

    /**
     * Defines features which can exist on maps. In general this will be the marker type but it can also be used to identify QTL regions.
     */
    public final Mapfeaturetypes MAPFEATURETYPES = jhi.germinate.server.database.tables.Mapfeaturetypes.MAPFEATURETYPES;

    /**
     * Describes genetic maps that have been defined within Germinate.
     */
    public final Maps MAPS = jhi.germinate.server.database.tables.Maps.MAPS;

    /**
     * Defines genetic markers within the database and assigns a type (markertypes).
     */
    public final Markers MARKERS = jhi.germinate.server.database.tables.Markers.MARKERS;

    /**
     * Describes the marker type. Markers (markers) have a defined type. This could be AFLP, MicroSat, SNP and so on. Used to differentiate markers within the markers table and alllows for mixing of marker types on genetic and physical maps.
     */
    public final Markertypes MARKERTYPES = jhi.germinate.server.database.tables.Markertypes.MARKERTYPES;

    /**
     * Describes mega environment data by grouping collection sites (locations) into mega environments. Mega environments in this context are collections of sites which meet the mega environment definition criteria.
     */
    public final Megaenvironmentdata MEGAENVIRONMENTDATA = jhi.germinate.server.database.tables.Megaenvironmentdata.MEGAENVIRONMENTDATA;

    /**
     * Defines the mega environments if used and their temperature and precipitation ranges.
     */
    public final Megaenvironments MEGAENVIRONMENTS = jhi.germinate.server.database.tables.Megaenvironments.MEGAENVIRONMENTS;

    /**
     * Contains information relating to the source of the mega environments. This could be the contributing source including contact and location details or how the mega environments were extracted from current datasets. 
     */
    public final Megaenvironmentsource MEGAENVIRONMENTSOURCE = jhi.germinate.server.database.tables.Megaenvironmentsource.MEGAENVIRONMENTSOURCE;

    /**
     * The table <code>germinate_template_3_7_0.mlsstatus</code>.
     */
    public final Mlsstatus MLSSTATUS = jhi.germinate.server.database.tables.Mlsstatus.MLSSTATUS;

    /**
     * Holds news items that are displayed within Germinate.
     */
    public final News NEWS = jhi.germinate.server.database.tables.News.NEWS;

    /**
     * Defines the news types which are contained the database. The news types are displayed on the Germinate user interface and are not required if the user interface is not used.
     */
    public final Newstypes NEWSTYPES = jhi.germinate.server.database.tables.Newstypes.NEWSTYPES;

    /**
     * This table holds the actual pedigree definition data.
     */
    public final Pedigreedefinitions PEDIGREEDEFINITIONS = jhi.germinate.server.database.tables.Pedigreedefinitions.PEDIGREEDEFINITIONS;

    /**
     * Description of pedigrees. Pedigrees can have a description which details additional information about the pedigree, how it was constructed and who the contact is for the pedigree.
     */
    public final Pedigreedescriptions PEDIGREEDESCRIPTIONS = jhi.germinate.server.database.tables.Pedigreedescriptions.PEDIGREEDESCRIPTIONS;

    /**
     * Allows additional supporting data to be associated with a pedigree definition such as the contributing data source.
     */
    public final Pedigreenotations PEDIGREENOTATIONS = jhi.germinate.server.database.tables.Pedigreenotations.PEDIGREENOTATIONS;

    /**
     * Holds pedigree definitions. A pedigree is constructed from a series of individial-&gt;parent records. This gives a great deal of flexibility in how pedigree networks can be constructed. This table is required for operation with the Helium pedigree viewer.
     */
    public final Pedigrees PEDIGREES = jhi.germinate.server.database.tables.Pedigrees.PEDIGREES;

    /**
     * Contains phenotypic data which has been collected.
     */
    public final Phenotypedata PHENOTYPEDATA = jhi.germinate.server.database.tables.Phenotypedata.PHENOTYPEDATA;

    /**
     * Defines phenoytpes which are held in Germinate.
     */
    public final Phenotypes PHENOTYPES = jhi.germinate.server.database.tables.Phenotypes.PHENOTYPES;

    /**
     * The table <code>germinate_template_3_7_0.schema_version</code>.
     */
    public final SchemaVersion SCHEMA_VERSION = jhi.germinate.server.database.tables.SchemaVersion.SCHEMA_VERSION;

    /**
     * The table <code>germinate_template_3_7_0.storage</code>.
     */
    public final Storage STORAGE = jhi.germinate.server.database.tables.Storage.STORAGE;

    /**
     * The table <code>germinate_template_3_7_0.storagedata</code>.
     */
    public final Storagedata STORAGEDATA = jhi.germinate.server.database.tables.Storagedata.STORAGEDATA;

    /**
     * Allows the definition of synonyms for entries such as germinatebase entries or marker names.
     */
    public final Synonyms SYNONYMS = jhi.germinate.server.database.tables.Synonyms.SYNONYMS;

    /**
     * Synonym type definitions.
     */
    public final Synonymtypes SYNONYMTYPES = jhi.germinate.server.database.tables.Synonymtypes.SYNONYMTYPES;

    /**
     * The species table holds information relating to the species that are deinfed within a particular Germinate instance including common names and ploidy levels.
     */
    public final Taxonomies TAXONOMIES = jhi.germinate.server.database.tables.Taxonomies.TAXONOMIES;

    /**
     * For trials data the treatment is used to distinguish between factors. Examples would include whether the trial was treated with fungicides or not.
     */
    public final Treatments TREATMENTS = jhi.germinate.server.database.tables.Treatments.TREATMENTS;

    /**
     * Holds the names of trial series. Trial series define the name of the trial to which trials data is associated. Examples would include the overarching project.
     */
    public final Trialseries TRIALSERIES = jhi.germinate.server.database.tables.Trialseries.TRIALSERIES;

    /**
     * The 'units' table holds descriptions of the various units that are used in the Germinate database. Examples of these would include International System of Units (SI) base units: kilogram, meter, second, ampere, kelvin, candela and mole but can include any units that are required.
     */
    public final Units UNITS = jhi.germinate.server.database.tables.Units.UNITS;

    /**
     * The table <code>germinate_template_3_7_0.usergroupmembers</code>.
     */
    public final Usergroupmembers USERGROUPMEMBERS = jhi.germinate.server.database.tables.Usergroupmembers.USERGROUPMEMBERS;

    /**
     * The table <code>germinate_template_3_7_0.usergroups</code>.
     */
    public final Usergroups USERGROUPS = jhi.germinate.server.database.tables.Usergroups.USERGROUPS;

    /**
     * VIEW
     */
    public final ViewMcpd VIEW_MCPD = jhi.germinate.server.database.tables.ViewMcpd.VIEW_MCPD;

    /**
     * VIEW
     */
    public final ViewTableGermplasm VIEW_TABLE_GERMPLASM = jhi.germinate.server.database.tables.ViewTableGermplasm.VIEW_TABLE_GERMPLASM;

    /**
     * VIEW
     */
    public final ViewTableMapdefinitions VIEW_TABLE_MAPDEFINITIONS = jhi.germinate.server.database.tables.ViewTableMapdefinitions.VIEW_TABLE_MAPDEFINITIONS;

    /**
     * VIEW
     */
    public final ViewTableMaps VIEW_TABLE_MAPS = jhi.germinate.server.database.tables.ViewTableMaps.VIEW_TABLE_MAPS;

    /**
     * No further instances allowed
     */
    private GerminateTemplate_3_7_0() {
        super("germinate_template_3_7_0", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Analysismethods.ANALYSISMETHODS,
            Attributedata.ATTRIBUTEDATA,
            Attributes.ATTRIBUTES,
            Biologicalstatus.BIOLOGICALSTATUS,
            Climatedata.CLIMATEDATA,
            Climateoverlays.CLIMATEOVERLAYS,
            Climates.CLIMATES,
            Collaborators.COLLABORATORS,
            Collectingsources.COLLECTINGSOURCES,
            Comments.COMMENTS,
            Commenttypes.COMMENTTYPES,
            Compounddata.COMPOUNDDATA,
            Compounds.COMPOUNDS,
            Countries.COUNTRIES,
            Datasetaccesslogs.DATASETACCESSLOGS,
            Datasetcollaborators.DATASETCOLLABORATORS,
            Datasetmembers.DATASETMEMBERS,
            Datasetmembertypes.DATASETMEMBERTYPES,
            Datasetmeta.DATASETMETA,
            Datasetpermissions.DATASETPERMISSIONS,
            Datasets.DATASETS,
            Datasetstates.DATASETSTATES,
            Entitytypes.ENTITYTYPES,
            Experiments.EXPERIMENTS,
            Experimenttypes.EXPERIMENTTYPES,
            Germinatebase.GERMINATEBASE,
            Groupmembers.GROUPMEMBERS,
            Groups.GROUPS,
            Grouptypes.GROUPTYPES,
            Images.IMAGES,
            Imagetypes.IMAGETYPES,
            Institutions.INSTITUTIONS,
            Licensedata.LICENSEDATA,
            Licenselogs.LICENSELOGS,
            Licenses.LICENSES,
            Links.LINKS,
            Linktypes.LINKTYPES,
            Locales.LOCALES,
            Locations.LOCATIONS,
            Locationtypes.LOCATIONTYPES,
            Mapdefinitions.MAPDEFINITIONS,
            Mapfeaturetypes.MAPFEATURETYPES,
            Maps.MAPS,
            Markers.MARKERS,
            Markertypes.MARKERTYPES,
            Megaenvironmentdata.MEGAENVIRONMENTDATA,
            Megaenvironments.MEGAENVIRONMENTS,
            Megaenvironmentsource.MEGAENVIRONMENTSOURCE,
            Mlsstatus.MLSSTATUS,
            News.NEWS,
            Newstypes.NEWSTYPES,
            Pedigreedefinitions.PEDIGREEDEFINITIONS,
            Pedigreedescriptions.PEDIGREEDESCRIPTIONS,
            Pedigreenotations.PEDIGREENOTATIONS,
            Pedigrees.PEDIGREES,
            Phenotypedata.PHENOTYPEDATA,
            Phenotypes.PHENOTYPES,
            SchemaVersion.SCHEMA_VERSION,
            Storage.STORAGE,
            Storagedata.STORAGEDATA,
            Synonyms.SYNONYMS,
            Synonymtypes.SYNONYMTYPES,
            Taxonomies.TAXONOMIES,
            Treatments.TREATMENTS,
            Trialseries.TRIALSERIES,
            Units.UNITS,
            Usergroupmembers.USERGROUPMEMBERS,
            Usergroups.USERGROUPS,
            ViewMcpd.VIEW_MCPD,
            ViewTableGermplasm.VIEW_TABLE_GERMPLASM,
            ViewTableMapdefinitions.VIEW_TABLE_MAPDEFINITIONS,
            ViewTableMaps.VIEW_TABLE_MAPS);
    }
}
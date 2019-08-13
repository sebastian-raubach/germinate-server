/*
 * Copyright $today.year Information and Computational Sciences,
 * The James Hutton Institute.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- View structure for view_mcpd
-- ----------------------------
DROP VIEW IF EXISTS `view_mcpd`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_mcpd` AS select `g`.`puid` AS `PUID`,`institutions`.`code` AS `INSTCODE`,`g`.`general_identifier` AS `ACCENUMB`,`g`.`collnumb` AS `COLLNUMB`,`g`.`collcode` AS `COLLCODE`,`g`.`collname` AS `COLLNAME`,`institutions`.`address` AS `COLLINSTADDRESS`,`g`.`collmissid` AS `COLLMISSID`,`taxonomies`.`genus` AS `GENUS`,`taxonomies`.`species` AS `SPECIES`,`taxonomies`.`species_author` AS `SPAUTHOR`,`taxonomies`.`subtaxa` AS `SUBTAXA`,`taxonomies`.`subtaxa_author` AS `SUBTAUTHOR`,`taxonomies`.`cropname` AS `CROPNAME`,`g`.`name` AS `ACCENAME`,replace(`g`.`acqdate`,'-','') AS `ACQDATE`,`countries`.`country_code3` AS `ORIGCTY`,`locations`.`site_name` AS `COLLSITE`,`locations`.`latitude` AS `DECLATITUDE`,NULL AS `LATITUDE`,`locations`.`longitude` AS `DECLONGITUDE`,NULL AS `LONGITUDE`,`locations`.`coordinate_uncertainty` AS `COORDUNCERT`,`locations`.`coordinate_datum` AS `COORDDATUM`,`locations`.`georeferencing_method` AS `GEOREFMETH`,`locations`.`elevation` AS `ELEVATION`,replace(`g`.`colldate`,'-','') AS `COLLDATE`,`g`.`breeders_code` AS `BREDCODE`,`g`.`breeders_name` AS `BREDNAME`,`g`.`biologicalstatus_id` AS `SAMPSTAT`,`pedigreedefinitions`.`definition` AS `ANCEST`,`g`.`collsrc_id` AS `COLLSRC`,`g`.`donor_code` AS `DONORCODE`,`g`.`donor_name` AS `DONORNAME`,`g`.`donor_number` AS `DONORNUMB`,`g`.`othernumb` AS `OTHERNUMB`,`g`.`duplsite` AS `DUPLSITE`,`g`.`duplinstname` AS `DUPLINSTNAME`,group_concat(`storage`.`description` separator ',') AS `STORAGE`,`g`.`mlsstatus_id` AS `MLSSTAT`,(select `attributedata`.`value` from (`attributedata` left join `attributes` on((`attributes`.`id` = `attributedata`.`attribute_id`))) where ((`attributes`.`target_table` = 'germinatebase') and (`attributes`.`name` = 'Remarks') and (`attributedata`.`foreign_id` = `g`.`id`)) limit 1) AS `REMARKS`,'Accession' AS `Entity Type`,NULL AS `Entity parent ACCENUMB` from ((((((((`germinatebase` `g` left join `taxonomies` on((`taxonomies`.`id` = `g`.`taxonomy_id`))) left join `locations` on((`locations`.`id` = `g`.`location_id`))) left join `countries` on((`countries`.`id` = `locations`.`country_id`))) left join `institutions` on((`institutions`.`id` = `g`.`institution_id`))) left join `pedigreedefinitions` on((`pedigreedefinitions`.`germinatebase_id` = `g`.`id`))) left join `storagedata` on((`storagedata`.`germinatebase_id` = `g`.`id`))) left join `storage` on((`storage`.`id` = `storagedata`.`storage_id`))) left join `attributedata` on((`attributedata`.`foreign_id` = `g`.`id`))) group by `g`.`id`,`pedigreedefinitions`.`id`;

-- ----------------------------
-- View structure for view_table_germplasm
-- ----------------------------
DROP VIEW IF EXISTS `view_table_germplasm`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_table_germplasm` AS select `germinatebase`.`id` AS `germplasmId`,`germinatebase`.`general_identifier` AS `germplasmGid`,`germinatebase`.`name` AS `germplasmName`,`germinatebase`.`number` AS `germplasmNumber`,`germinatebase`.`puid` AS `germplasmPuid`,`entitytypes`.`id` AS `entityTypeId`,`entitytypes`.`name` AS `entityTypeName`,`biologicalstatus`.`id` AS `biologicalStatusId`,`biologicalstatus`.`sampstat` AS `biologicalStatusName`,`synonyms`.`synonyms` AS `synonyms`,`germinatebase`.`collnumb` AS `collectorNumber`,`taxonomies`.`genus` AS `genus`,`taxonomies`.`species` AS `species`,`taxonomies`.`subtaxa` AS `subtaxa`,`countries`.`country_name` AS `countryName`,`countries`.`country_code2` AS `countryCode`,`germinatebase`.`colldate` AS `collDate`,`germinatebase`.`pdci` AS `pdci`,(select count(1) from (`images` left join `imagetypes` on((`imagetypes`.`id` = `images`.`imagetype_id`))) where ((`imagetypes`.`reference_table` = 'germinatebase') and (`images`.`foreign_id` = `germinatebase`.`id`))) AS `imageCount`,(select `images`.`path` from (`images` left join `imagetypes` on((`imagetypes`.`id` = `images`.`imagetype_id`))) where ((`imagetypes`.`reference_table` = 'germinatebase') and (`images`.`foreign_id` = `germinatebase`.`id`)) limit 1) AS `firstImagePath` from ((((((`germinatebase` left join `entitytypes` on((`germinatebase`.`entitytype_id` = `entitytypes`.`id`))) left join `taxonomies` on((`germinatebase`.`taxonomy_id` = `taxonomies`.`id`))) left join `locations` on((`germinatebase`.`location_id` = `locations`.`id`))) left join `countries` on((`locations`.`country_id` = `countries`.`id`))) left join `biologicalstatus` on((`biologicalstatus`.`id` = `germinatebase`.`biologicalstatus_id`))) left join `synonyms` on(((`synonyms`.`foreign_id` = `germinatebase`.`id`) and (`synonyms`.`synonymtype_id` = 1))));

DROP VIEW IF EXISTS `view_table_maps`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_table_maps` AS select `maps`.`id` AS `mapId`,`maps`.`name` AS `mapName`,`maps`.`description` AS `mapDescription`,`maps`.`user_id` AS `userId`,`maps`.`visibility` AS `visibility`,count(1) AS `markerCount` from (`maps` left join `mapdefinitions` on((`maps`.`id` = `mapdefinitions`.`map_id`))) group by `maps`.`id`;

DROP VIEW IF EXISTS `view_table_mapdefinitions`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_table_maps` AS select `markers`.`id` AS `markerId`,`markers`.`marker_name` AS `markerName`,`synonyms`.`synonyms` AS `synonyms`,`mapfeaturetypes`.`description` AS `mapFeatureType`,`maps`.`id` AS `mapId`,`maps`.`user_id` AS `userId`,`maps`.`visibility` AS `visibility`,`maps`.`name` AS `mapName`,`mapdefinitions`.`chromosome` AS `chromosome`,`mapdefinitions`.`definition_start` AS `position` from ((((`markers` left join `mapdefinitions` on((`markers`.`id` = `mapdefinitions`.`marker_id`))) left join `mapfeaturetypes` on((`mapfeaturetypes`.`id` = `mapdefinitions`.`mapfeaturetype_id`))) left join `maps` on((`maps`.`id` = `mapdefinitions`.`map_id`))) left join `synonyms` on(((`synonyms`.`foreign_id` = `markers`.`id`) and (`synonyms`.`synonymtype_id` = 2))));

SET FOREIGN_KEY_CHECKS=1;
/*
 Navicat Premium Data Transfer

 Source Server         : guoLinuxDB
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : 192.168.233.3:3306
 Source Schema         : vehicle

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 15/03/2023 17:00:57
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for a_vehicle
-- ----------------------------
DROP TABLE IF EXISTS `a_vehicle`;
CREATE TABLE `a_vehicle`  (
  `id` bigint NOT NULL,
  `parent_id` bigint NOT NULL,
  `vehicle_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '车名',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of a_vehicle
-- ----------------------------
INSERT INTO `a_vehicle` VALUES (1, 1, '奥迪');
INSERT INTO `a_vehicle` VALUES (2, 2, '大众');
INSERT INTO `a_vehicle` VALUES (3, 3, '宝马');
INSERT INTO `a_vehicle` VALUES (111, 1, '奥迪A4L');
INSERT INTO `a_vehicle` VALUES (112, 1, '奥迪A3');
INSERT INTO `a_vehicle` VALUES (113, 1, '奥迪A5L');
INSERT INTO `a_vehicle` VALUES (114, 1, '奥迪A100L');
INSERT INTO `a_vehicle` VALUES (222, 2, '大众A100');
INSERT INTO `a_vehicle` VALUES (223, 2, '大众B11');

-- ----------------------------
-- Table structure for a_vehicle_content
-- ----------------------------
DROP TABLE IF EXISTS `a_vehicle_content`;
CREATE TABLE `a_vehicle_content`  (
  `vehicle_id` bigint NOT NULL COMMENT 'id',
  `year_style` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年份款式',
  `acceleration_count` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '百公里加速数值',
  `acceleration_unit` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '百公里加速单位',
  `operation_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作类型',
  `vehicle_style` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '汽车类型'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of a_vehicle_content
-- ----------------------------
INSERT INTO `a_vehicle_content` VALUES (111, '2019款', '40', 'TFSI', '手动', '舒适');
INSERT INTO `a_vehicle_content` VALUES (111, '2015款', '50', 'TFSI', '', '旗舰');

SET FOREIGN_KEY_CHECKS = 1;

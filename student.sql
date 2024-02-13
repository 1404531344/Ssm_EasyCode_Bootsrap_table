/*
 Navicat Premium Data Transfer

 Source Server         : root
 Source Server Type    : MySQL
 Source Server Version : 80027
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80027
 File Encoding         : 65001

 Date: 13/02/2024 17:42:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `sid` int(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`sid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 35 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (17, 'asd', NULL);
INSERT INTO `student` VALUES (18, 'adfd', NULL);
INSERT INTO `student` VALUES (19, 'd', NULL);
INSERT INTO `student` VALUES (20, 'd', NULL);
INSERT INTO `student` VALUES (21, 'g', NULL);
INSERT INTO `student` VALUES (22, 'h', NULL);
INSERT INTO `student` VALUES (23, 'f', NULL);
INSERT INTO `student` VALUES (24, 'h', NULL);
INSERT INTO `student` VALUES (25, 'hgdfh', NULL);
INSERT INTO `student` VALUES (26, 'k', NULL);
INSERT INTO `student` VALUES (27, 'l', NULL);
INSERT INTO `student` VALUES (28, 'l', NULL);
INSERT INTO `student` VALUES (29, 'wer', 14);
INSERT INTO `student` VALUES (30, 'wer', 14);
INSERT INTO `student` VALUES (31, '士大夫', 14);
INSERT INTO `student` VALUES (32, '爱的色放', 14);
INSERT INTO `student` VALUES (33, '242', 14);
INSERT INTO `student` VALUES (34, '撒旦乏', 54);

SET FOREIGN_KEY_CHECKS = 1;

/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50712
Source Host           : localhost:3306
Source Database       : ssm

Target Server Type    : MYSQL
Target Server Version : 50712
File Encoding         : 65001

Date: 2020-08-12 09:34:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `log`
-- ----------------------------
DROP TABLE IF EXISTS `log`;
CREATE TABLE `log` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `accout` varchar(18) DEFAULT NULL,
  `accin` varchar(18) DEFAULT NULL,
  `money` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of log
-- ----------------------------
INSERT INTO `log` VALUES ('3', '9', '8', '100');
INSERT INTO `log` VALUES ('4', '1', '2', '200');
INSERT INTO `log` VALUES ('5', '1', '2', '200');
INSERT INTO `log` VALUES ('6', '1', '2', '200');
INSERT INTO `log` VALUES ('7', '3', '2', '200');
INSERT INTO `log` VALUES ('8', '1', '2', '200');
INSERT INTO `log` VALUES ('9', '1', '2', '100');
INSERT INTO `log` VALUES ('10', '1', '2', '200');
INSERT INTO `log` VALUES ('11', '3', '4', '200');
INSERT INTO `log` VALUES ('12', '1', '2', '200');
INSERT INTO `log` VALUES ('13', '3', '2', '200');
INSERT INTO `log` VALUES ('14', '1', '2', '200');
INSERT INTO `log` VALUES ('15', '1', '4', '300');
INSERT INTO `log` VALUES ('16', '1', '2', '400');
INSERT INTO `log` VALUES ('17', '1', '2', '230');
INSERT INTO `log` VALUES ('18', '3', '2', '666');
INSERT INTO `log` VALUES ('19', '4', '2', '666');
INSERT INTO `log` VALUES ('20', '5', '2', '666');
INSERT INTO `log` VALUES ('21', '6', '2', '666');
INSERT INTO `log` VALUES ('22', '7', '2', '666');
INSERT INTO `log` VALUES ('23', '8', '2', '666');
INSERT INTO `log` VALUES ('24', '9', '2', '666');
INSERT INTO `log` VALUES ('25', '11', '22', '33');
INSERT INTO `log` VALUES ('26', '44', '55', '77');
INSERT INTO `log` VALUES ('27', '1', '2', '34');
INSERT INTO `log` VALUES ('28', '1', '2', '34');
INSERT INTO `log` VALUES ('29', '1', '2', '12');
INSERT INTO `log` VALUES ('30', '1', '2', '12');
INSERT INTO `log` VALUES ('31', '1', '2', '12');
INSERT INTO `log` VALUES ('32', '1', '2', '33');
INSERT INTO `log` VALUES ('33', '22', '23', '24');
INSERT INTO `log` VALUES ('34', '24', '25', '226');
INSERT INTO `log` VALUES ('35', '1', '2', '333');
INSERT INTO `log` VALUES ('36', '1', '2', '3332');
INSERT INTO `log` VALUES ('37', '22', '446', '765');
INSERT INTO `log` VALUES ('38', '22', '446', '765');
INSERT INTO `log` VALUES ('39', '2', '33', '4232');
INSERT INTO `log` VALUES ('40', '5', '5', '55');
INSERT INTO `log` VALUES ('41', '5', '5', '55');
INSERT INTO `log` VALUES ('42', '5', '5', '55');

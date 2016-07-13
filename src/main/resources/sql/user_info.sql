/*
Navicat MySQL Data Transfer

Source Server         : 本机
Source Server Version : 50544
Source Host           : localhost:3306
Source Database       : xx_2

Target Server Type    : MYSQL
Target Server Version : 50544
File Encoding         : 65001

Date: 2016-07-13 16:57:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user_info`
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` varchar(32) NOT NULL,
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱-登陆时使用',
  `name` varchar(50) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  `createTime` timestamp NULL DEFAULT NULL,
  `state` int(11) DEFAULT NULL COMMENT '0-禁用 1-启用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------

/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : db_blog

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-05-24 14:45:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_blog
-- ----------------------------
DROP TABLE IF EXISTS `t_blog`;
CREATE TABLE `t_blog` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '???????',
  `title` varchar(200) NOT NULL COMMENT '??????Ŀ',
  `summary` varchar(400) DEFAULT NULL COMMENT '????ժҪ',
  `releaseDate` datetime DEFAULT NULL COMMENT '???????',
  `clickHit` int(11) DEFAULT NULL COMMENT '???۴???',
  `replyHit` int(11) DEFAULT NULL COMMENT '?ظ?????',
  `content` text COMMENT '???????',
  `keyWord` varchar(200) DEFAULT NULL COMMENT '?ؼ??',
  `type_id` int(11) DEFAULT NULL COMMENT '???????????????',
  PRIMARY KEY (`id`),
  KEY `type_id` (`type_id`),
  CONSTRAINT `t_blog_ibfk_1` FOREIGN KEY (`type_id`) REFERENCES `t_blogtype` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_blogger
-- ----------------------------
DROP TABLE IF EXISTS `t_blogger`;
CREATE TABLE `t_blogger` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '????id',
  `username` varchar(50) NOT NULL COMMENT '????????',
  `password` varchar(100) NOT NULL COMMENT '???????',
  `profile` text COMMENT '??????Ϣ',
  `nickname` varchar(50) DEFAULT NULL COMMENT '?????ǳ',
  `sign` varchar(100) DEFAULT NULL COMMENT '????ǩ??',
  `imagename` varchar(100) DEFAULT NULL COMMENT '????ͷ??·??',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_blogtype
-- ----------------------------
DROP TABLE IF EXISTS `t_blogtype`;
CREATE TABLE `t_blogtype` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '????id',
  `typeName` varchar(30) DEFAULT NULL COMMENT '???????',
  `orderNum` int(11) DEFAULT NULL COMMENT '???????',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_comment
-- ----------------------------
DROP TABLE IF EXISTS `t_comment`;
CREATE TABLE `t_comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '???۱?id',
  `userIp` varchar(50) DEFAULT NULL COMMENT '?????ߵ?ip',
  `content` varchar(1000) DEFAULT NULL COMMENT '???????',
  `commentDate` datetime DEFAULT NULL COMMENT '???????',
  `state` int(11) DEFAULT NULL COMMENT '????״̬',
  `blog_id` int(11) DEFAULT NULL COMMENT '???????????????',
  PRIMARY KEY (`id`),
  KEY `blog_id` (`blog_id`),
  CONSTRAINT `t_comment_ibfk_1` FOREIGN KEY (`blog_id`) REFERENCES `t_blog` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_link
-- ----------------------------
DROP TABLE IF EXISTS `t_link`;
CREATE TABLE `t_link` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '???????ӱ?id',
  `linkname` varchar(100) DEFAULT NULL COMMENT '??????????',
  `linkurl` varchar(200) DEFAULT NULL COMMENT '????????url',
  `orderNum` int(11) DEFAULT NULL COMMENT '???????',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

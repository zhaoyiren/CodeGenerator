
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `TB_ORDER`
-- ----------------------------
DROP TABLE IF EXISTS `TB_ORDER`;
CREATE TABLE `TB_ORDER` (
 		`ORDER_ID` varchar(100) NOT NULL,
		`ID` varchar(255) DEFAULT NULL COMMENT '订单ID',
		`ORDERNO` varchar(255) DEFAULT NULL COMMENT '订单编号',
		`ORDERSTATUS` int(11) NOT NULL COMMENT '订单状态',
  		PRIMARY KEY (`ORDER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

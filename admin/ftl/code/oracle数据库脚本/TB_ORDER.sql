-- ----------------------------
-- Table structure for "C##NEWO"."TB_ORDER"
-- ----------------------------
-- DROP TABLE "C##NEWO"."TB_ORDER";
CREATE TABLE "C##NEWO"."TB_ORDER" (
	"ID" VARCHAR2(255 BYTE) NULL ,
	"ORDERNO" VARCHAR2(255 BYTE) NULL ,
	"ORDERSTATUS" NUMBER(11) NULL ,
	"ORDER_ID" VARCHAR2(100 BYTE) NOT NULL 
)
LOGGING
NOCOMPRESS
NOCACHE
;

COMMENT ON COLUMN "C##NEWO"."TB_ORDER"."ID" IS '订单ID';
COMMENT ON COLUMN "C##NEWO"."TB_ORDER"."ORDERNO" IS '订单编号';
COMMENT ON COLUMN "C##NEWO"."TB_ORDER"."ORDERSTATUS" IS '订单状态';
COMMENT ON COLUMN "C##NEWO"."TB_ORDER"."ORDER_ID" IS 'ID';

-- ----------------------------
-- Indexes structure for table TB_ORDER
-- ----------------------------

-- ----------------------------
-- Checks structure for table "C##NEWO"."TB_ORDER"

-- ----------------------------

ALTER TABLE "C##NEWO"."TB_ORDER" ADD CHECK ("ORDER_ID" IS NOT NULL);

-- ----------------------------
-- Primary Key structure for table "C##NEWO"."TB_ORDER"
-- ----------------------------
ALTER TABLE "C##NEWO"."TB_ORDER" ADD PRIMARY KEY ("ORDER_ID");

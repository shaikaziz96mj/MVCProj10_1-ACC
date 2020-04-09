CREATE TABLE "SCOTT"."JOBOPENINGSLIST" 
   (	"JOBID" NUMBER(5,0) NOT NULL ENABLE, 
	"COMPANY" VARCHAR2(20 BYTE), 
	"DOMAIN" VARCHAR2(20 BYTE), 
	"POSITION" VARCHAR2(20 BYTE), 
	"SALARYRANGE" VARCHAR2(20 BYTE), 
	"EXP_REQUIRED" VARCHAR2(20 BYTE), 
	"NUMBER_OF_POSITIONS" NUMBER(3,0), 
	"LOCATION" VARCHAR2(20 BYTE), 
	 CONSTRAINT "JOBOPENINGSLIST_PK" PRIMARY KEY ("JOBID")
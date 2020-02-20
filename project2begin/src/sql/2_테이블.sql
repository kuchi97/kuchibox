--------------------------------------------------------
--  ������ ������ - ������-2��-19-2020   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table TRAILER
--------------------------------------------------------

  CREATE TABLE "RETULIX"."TRAILER" 
   (	"DIV" VARCHAR2(5 BYTE), 
	"GENRE" VARCHAR2(5 BYTE), 
	"NUM" VARCHAR2(5 BYTE), 
	"IDX" VARCHAR2(20 BYTE), 
	"API_IDX" VARCHAR2(20 BYTE), 
	"URL" VARCHAR2(300 BYTE), 
	"TITLE" VARCHAR2(3000 BYTE), 
	"GOOD" NUMBER(10,0), 
	"CLICK" NUMBER(10,0), 
	"ZZIM" NUMBER(10,0), 
	"EMAIL" VARCHAR2(100 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table REVIEW
--------------------------------------------------------

  CREATE TABLE "RETULIX"."REVIEW" 
   (	"DIV" VARCHAR2(5 BYTE), 
	"GENRE" VARCHAR2(5 BYTE), 
	"NUM" VARCHAR2(5 BYTE), 
	"IDX" VARCHAR2(20 BYTE), 
	"TITLE" VARCHAR2(300 BYTE), 
	"URL" VARCHAR2(300 BYTE), 
	"INFO" VARCHAR2(3000 BYTE), 
	"GOOD" NUMBER(10,0), 
	"CLICK" NUMBER(10,0), 
	"ZZIM" NUMBER(10,0), 
	"EMAIL" VARCHAR2(100 BYTE), 
	"T_IDX" VARCHAR2(20 BYTE), 
	"WDATE" DATE DEFAULT sysdate
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table MEMBER
--------------------------------------------------------

  CREATE TABLE "RETULIX"."MEMBER" 
   (	"EMAIL" VARCHAR2(100 BYTE), 
	"PWD" VARCHAR2(100 BYTE), 
	"NAME" VARCHAR2(100 BYTE), 
	"AGE" VARCHAR2(5 BYTE), 
	"POINT" NUMBER(10,0), 
	"SUBS" NUMBER(10,0), 
	"ICON" VARCHAR2(100 BYTE), 
	"CHIMG" VARCHAR2(100 BYTE), 
	"STATE" NUMBER(5,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table NOTICE
--------------------------------------------------------

  CREATE TABLE "RETULIX"."NOTICE" 
   (	"IDX" NUMBER(10,0), 
	"TITLE" VARCHAR2(200 BYTE), 
	"INFO" VARCHAR2(3000 BYTE), 
	"WDATE" DATE, 
	"CLICK" NUMBER(10,0), 
	"NAME" VARCHAR2(100 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table GOOD_REVIEW
--------------------------------------------------------

  CREATE TABLE "RETULIX"."GOOD_REVIEW" 
   (	"EMAIL" VARCHAR2(100 BYTE), 
	"IDX" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table HISTORY
--------------------------------------------------------

  CREATE TABLE "RETULIX"."HISTORY" 
   (	"EMAIL" VARCHAR2(100 BYTE), 
	"IDX" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table SUBS
--------------------------------------------------------

  CREATE TABLE "RETULIX"."SUBS" 
   (	"EMAIL" VARCHAR2(100 BYTE), 
	"EMAIL_SUBS" VARCHAR2(100 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table ZZIM_TRAILER
--------------------------------------------------------

  CREATE TABLE "RETULIX"."ZZIM_TRAILER" 
   (	"EMAIL" VARCHAR2(100 BYTE), 
	"IDX" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
REM INSERTING into RETULIX.TRAILER
SET DEFINE OFF;
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','A','001','DA001',null,'https://www.youtube.com/embed/EpQVbvJ3TFo','����',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','A','002','DA002',null,'https://www.youtube.com/embed/gyzcOT6OqPE','�۴ϼ�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','A','003','DA003',null,'https://www.youtube.com/embed/VknygXeeGnc','����ī ����',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','A','004','DA004',null,'https://www.youtube.com/embed/I7jl4T2crGE','�ַο�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','A','005','DA005',null,'https://www.youtube.com/embed/JGhAJuxl_nU','�谡����',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','A','006','DA006',null,'https://www.youtube.com/embed/Z-TxS18HHns','�¾��� �Ŀ�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','C','001','DC001',null,'https://www.youtube.com/embed/_y5UbAs6j-k','����� �ҽ���',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','C','002','DC002',null,'https://www.youtube.com/embed/gEDuUBkv-qc','�������н� ���̾',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','C','003','DC003',null,'https://www.youtube.com/embed/JZbjJZWggSM','���̺극��ũ',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','C','004','DC004',null,'https://www.youtube.com/embed/W1y0RNDnpJQ','�������� ����ŰŰ',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','C','005','DC005',null,'https://www.youtube.com/embed/UWTuGvLIW2E','�˻系��',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','C','006','DC006',null,'https://www.youtube.com/embed/EXJdwEtqaSs','�� �ɽ�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','C','007','DC007',null,'https://www.youtube.com/embed/RfBgT5djaQw','�� �÷��̽�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','H','001','DH001',null,'https://www.youtube.com/embed/Sx9bjEfzV_s','�ѴϹ�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','H','002','DH002',null,'https://www.youtube.com/embed/x-YJTJsVQ_0','ŷ��',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','H','003','DH003',null,'https://www.youtube.com/embed/AZR9143LSoo','�⹦�� �̾߱�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','H','004','DH004',null,'https://www.youtube.com/embed/Cd79LUQE7-0','���ε�����',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','H','005','DH005',null,'https://www.youtube.com/embed/4Afm7QucvQs','�� �Ͽ콺�� ����',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','R','001','DR001',null,'https://www.youtube.com/embed/n-zpdgYFRe4','���ʰ�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','R','002','DR002',null,'https://www.youtube.com/embed/VwRBeMbf-L0','������',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','R','003','DR003',null,'https://www.youtube.com/embed/pHY8AdAZg4g','�̽��� ������',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','R','004','DR004',null,'https://www.youtube.com/embed/a5XfzDGQPpw','���� ������',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','R','005','DR005',null,'https://www.youtube.com/embed/cRgyTsy5jp8','��ΰ� ü��',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','S','001','DS001',null,'https://www.youtube.com/embed/ThGwRfBw6Cs','�ν�Ʈ �� �����̽�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','S','002','DS002',null,'https://www.youtube.com/embed/5aIgt7d1pT4','��� ������',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','S','003','DS003',null,'https://www.youtube.com/embed/1VQrJsvYxPg','����',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','S','004','DS004',null,'https://www.youtube.com/embed/aE8tkxjueoE','���̷�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','S','005','DS005',null,'https://www.youtube.com/embed/AZR9143LSoo','�⹦�� �̾߱�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','001','MA001',null,'https://www.youtube.com/embed/mck3JCl2uwQ','�����',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','002','MA002',null,'https://www.youtube.com/embed/5dRExhvuGnI','�����-������ ���� ��Ʈ��',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','003','MA003',null,'https://www.youtube.com/embed/xUDhdCsLkjU','�����-���Ǵ�Ƽ ��',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','004','MA004',null,'https://www.youtube.com/embed/PVP5ZJuI57c','�����-�������',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','005','MA005',null,'https://www.youtube.com/embed/SW6EKneLyCI','ŷ����-��ũ�� ������Ʈ',25,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','006','MA006',null,'https://www.youtube.com/embed/fuwE3Lvysvs','ŷ����-��� ��Ŭ',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','007','MA007',null,'https://www.youtube.com/embed/FMxbzIThWNA','�� ��',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','008','MA008',null,'https://www.youtube.com/embed/ux-kWYfEuZM','�� ��-���ε�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','009','MA009',null,'https://www.youtube.com/embed/cs_takIhPxc','�� ��-�Ķ󺧷�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','010','MA010',null,'https://www.youtube.com/embed/cs_takIhPxc','����ū',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','011','MA011',null,'https://www.youtube.com/embed/rylE3y_QFLU','�� ��Ƽ������',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','012','MA012',null,'https://www.youtube.com/embed/p-fDEhVBnv4','�ŵ�ƽ�-�г��� ����',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','013','MA013',null,'https://www.youtube.com/embed/9VNfau-s6Ys','������ ���丮',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','014','MA014',null,'https://www.youtube.com/embed/VLiAEXZK0qY','�̼� ���ļ���-��Ʈ ��������',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','015','MA015',null,'https://www.youtube.com/embed/cdEtgloxhso','�̼� ���ļ���-�α׳��̼�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','016','MA016',null,'https://www.youtube.com/embed/gNJgMo14XWU','�̼� ���ļ���-���ƿ�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','017','MA017',null,'https://www.youtube.com/embed/a6EOkza6fAA','������Ʈ �̺�-�ĸ��� ��',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','018','MA018',null,'https://www.youtube.com/embed/D5y3bOWc938','������Ʈ �̺�-������ ����',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','019','MA019',null,'https://www.youtube.com/embed/cOxYjISc9tI','���� : ��Ʈ ��',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','020','MA020',null,'https://www.youtube.com/embed/N7uu8v34HU8','����� ��',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','001','MC001',null,'https://www.youtube.com/embed/0uC2FaZ4h1I','���� ������ ����',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','002','MC002',null,'https://www.youtube.com/embed/4QyKCokEZXM','�¸�� ���긮��',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','003','MC003',null,'https://www.youtube.com/embed/BaIRaKXrLPk','��������',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','004','MC004',null,'https://www.youtube.com/embed/sLZ8PRLWyKs','���� �̿���',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','005','MC005',null,'https://www.youtube.com/embed/fDhYGAIv4V8','�� �Ƴ��� ��� ��',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','006','MC006',null,'https://www.youtube.com/embed/guug8ToBMwM','������� �����̼�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','007','MC007',null,'https://www.youtube.com/embed/d6sA47lpfIc','�ѷ��ڽ���',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','008','MC008',null,'https://www.youtube.com/embed/Ez5Kvs_cnFQ','�����̼�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','009','MC009',null,'https://www.youtube.com/embed/SribMKGqDAk','��ȫ�ü���',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','010','MC010',null,'https://www.youtube.com/embed/1_m4nB7tscA','�� ����',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','011','MC011',null,'https://www.youtube.com/embed/jH6-ZBUbg-M','����',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','012','MC012',null,'https://www.youtube.com/embed/gg4HdbARFTg','������',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','013','MC013',null,'https://www.youtube.com/embed/-pkNFb9CVj4','�ýǸ� 2km',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','014','MC014',null,'https://www.youtube.com/embed/li4jOV5j7SI','����Ʈ',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','015','MC015',null,'https://www.youtube.com/embed/8ABOCiwhJI4','������ �µ�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','016','MC016',null,'https://www.youtube.com/embed/N0mlAk4_DWw','�������� �׳�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','017','MC017',null,'https://www.youtube.com/embed/8d7irFlE4WQ','������ �ҿ�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','018','MC018',null,'https://www.youtube.com/embed/2m8Ehtb09vo','������',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','019','MC019',null,'https://www.youtube.com/embed/qT_YhXsEhqg','��Ǫ �㽽',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','020','MC020',null,'https://www.youtube.com/embed/VgqnQspA29M','Ȳ���� �ܰ���: ��',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','001','MH001',null,'https://www.youtube.com/embed/tDeiSe0RDWs','�νô�Ʈ',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','002','MH002',null,'https://www.youtube.com/embed/HeHx0lRvbYE','47 ����',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','003','MH003',null,'https://www.youtube.com/embed/Ej25zrnaTXk','�',50,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','004','MH004',null,'https://www.youtube.com/embed/upT8PqyRkNQ','���� ������',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','005','MH005',null,'https://www.youtube.com/embed/hx2wUzYh5EE','�����',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','006','MH006',null,'https://www.youtube.com/embed/x8r2YvJC0Us','����� ħ��',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','007','MH007',null,'https://www.youtube.com/embed/qecwZJFpO0k','�Ķ�븻 ��Ƽ��Ƽ',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','008','MH008',null,'https://www.youtube.com/embed/EDD5p7scmhk','�λ���',45,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','009','MH009',null,'https://www.youtube.com/embed/T1hCa35W34M','�װ�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','010','MH010',null,'https://www.youtube.com/embed/j8tK11xvs54','��ŧ����',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','011','MH011',null,'https://www.youtube.com/embed/Oo1p1yBvMHo','ȭ��',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','012','MH012',null,'https://www.youtube.com/embed/0DXxZwlvjsg','���쵥����',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','013','MH013',null,'https://www.youtube.com/embed/cuY_BGtnU9Y','���ҽý�Ʈ',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','014','MH014',null,'https://www.youtube.com/embed/xG4EEVZy9nE','���־� ������Ʈ',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','015','MH015',null,'https://www.youtube.com/embed/5q-EqZGA03A','28�� ��',20,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','016','MH016',null,'https://www.youtube.com/embed/0Ww2LQsG07c','�����Z',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','017','MH017',null,'https://www.youtube.com/embed/M7UUg2qiJkM','���̾�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','018','MH018',null,'https://www.youtube.com/embed/fb7_v7FKtng','������Ʈ',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','019','MH019',null,'https://www.youtube.com/embed/w3NMBvSo7j4','���񷣵�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','020','MH020',null,'https://www.youtube.com/embed/ckSgdhThuys','���� �����̴�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','001','MR001',null,'https://www.youtube.com/embed/L9y9aJ13oCI','���극��',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','002','MR002',null,'https://www.youtube.com/embed/J-in1bhVyaY','���� ������ ���ϴ�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','003','MR003',null,'https://www.youtube.com/embed/7OIFdWk83no','��ٿ� Ÿ��',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','004','MR004',null,'https://www.youtube.com/embed/07-QBnEkgXU','���ͳ� ������',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','005','MR005',null,'https://www.youtube.com/embed/hlUSgRkkgtw','��󷣵�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','006','MR006',null,'https://www.youtube.com/embed/VFwHs7fEUNs','�� ���� ��Ʈ',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','007','MR007',null,'https://www.youtube.com/embed/ndtX6dtsQ0A','�� �Ӹ� ���� ���찳',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','008','MR008',null,'https://www.youtube.com/embed/mUpJ18MRe8s','�����а���',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','009','MR009',null,'https://www.youtube.com/embed/H9Z3_ifFheQ','���� �����',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','010','MR010',null,'https://www.youtube.com/embed/dstjxwURKxU','�ð� �������� �Ƴ�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','011','MR011',null,'https://www.youtube.com/embed/wG9G4zVyAME','���ڹ� ��ư�� �ð��� �Ųٷ� ����',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','012','MR012',null,'https://www.youtube.com/embed/TkEpOvE24NQ','���� ��ȥ��',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','013','MR013',null,'https://www.youtube.com/embed/ESPFTY8Y-xM','��Ƽ �λ��̵�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','014','MR014',null,'https://www.youtube.com/embed/gPhXjrDANGk','������',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','015','MR015',null,'https://www.youtube.com/embed/40Ahmsbae94','���� �¸�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','016','MR016',null,'https://www.youtube.com/embed/NhHbprenFdw','�� ���� ��',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','017','MR017',null,'https://www.youtube.com/embed/AF4IzD6aVU4','��Ʈ��',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','018','MR018',null,'https://www.youtube.com/embed/f7-7PnEGfwM','�峭���� Ű��',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','019','MR019',null,'https://www.youtube.com/embed/OVKamFhP4xQ','�� ����, �츮�� �����ߴ� �ҳ�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','020','MR020',null,'https://www.youtube.com/embed/nU7QQbCxa5I','ù Ű���� 50��°',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','001','MS001',null,'https://www.youtube.com/embed/7Rz-_40Qf_Y','�����ÿ�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','002','MS002',null,'https://www.youtube.com/embed/hRhyJPmfoNg','���ͽ��ڶ�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','003','MS003',null,'https://www.youtube.com/embed/o_jF3T1DfiY','��Ʋ��',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','004','MS004',null,'https://www.youtube.com/embed/LIQrhm2qk-k','���� �÷��̾� ��',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','005','MS005',null,'https://www.youtube.com/embed/MtWXBWuiwVo','���θ��׿콺',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','006','MS006',null,'https://www.youtube.com/embed/Ku_IseK3xTc','����ο�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','007','MS007',null,'https://www.youtube.com/embed/he21BE70f1Y','���� ���� ����ο�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','008','MS008',null,'https://www.youtube.com/embed/mNezVsOX9N8','�͹̳����� ��ũ ����Ʈ',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','009','MS009',null,'https://www.youtube.com/embed/QVk-PU1xMjQ','�۽�Ʈ��',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','010','MS010',null,'https://www.youtube.com/embed/XNSNti8q_UQ','�ֵ� �ƽ�Ʈ��',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','011','MS011',null,'https://www.youtube.com/embed/90cqM3_Bfvs','����',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','012','MS012',null,'https://www.youtube.com/embed/HuA0SChqiBg','�ȼ�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','013','MS013',null,'https://www.youtube.com/embed/rL6RRIOZyCM','���� �κ�',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','014','MS014',null,'https://www.youtube.com/embed/w0Cii08vz1w','��Ÿ��',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','015','MS015',null,'https://www.youtube.com/embed/yHIZFeKWd1I','Ȥ��Ż�� ���� ����',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','016','MS016',null,'https://www.youtube.com/embed/efZRXYFkIcA','2001 �����̽� ������',5,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','017','MS017',null,'https://www.youtube.com/embed/aYxwHwB6TAw','�׷���Ƽ',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','018','MS018',null,'https://www.youtube.com/embed/wACNe5jpLGw','�ε������ ���� ��������',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','019','MS019',null,'https://www.youtube.com/embed/a1G9EJU4llA','�������',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','020','MS020',null,'https://www.youtube.com/embed/CBw3tM2CcMM','�н�����',null,null,null,'admin@admin.com');
REM INSERTING into RETULIX.REVIEW
SET DEFINE OFF;
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','500','DA500','õ��ų���� ��ġ�� ����� �ȵǴ� ����','https://www.youtube.com/embed/wlao9pF9uug',null,null,null,null,'trip@hotmail.com','DA001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','501','DA501','õ�� ų���� ��Ȥ�� �����ϴ� ���','https://www.youtube.com/embed/x0_1dLKt0g4',null,null,null,null,'bman@yahoo.com','DA001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','502','DA502','[����TV] ������ ų���� ��Ȥ�� 19�ݾ׼�!! ���ø��� ���ۿ�ȭ ���󸮺�!!','https://www.youtube.com/embed/wWVWJCjalqI',null,null,null,null,'youngbotv@daum.net','DA001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','503','DA503','�����̶� �θ��⿣ �ʹ��� �������̰� ��Ȥ�� �����, �۴ϼ� �̾߱�','https://www.youtube.com/embed/DAdlo60ZcqI',null,null,null,null,'genius@gmail.com','DA002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','504','DA504','�����ڴ� ������ ���̴� ���� �����','https://www.youtube.com/embed/VEdReNQRp4E',null,null,null,null,'reviewang@gmail.com','DA002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','505','DA505','�����ڴ� ���Ǿ��� �����Դϴ� [ �۴ϼ� ]','https://www.youtube.com/embed/B7YdJVVmXfM','" ������ �˰� �ִٸ� �� �״´� "',null,null,null,'incheon@yahoo.com','DA002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','506','DA506','DC��󸶰� ��մٰ�? Ȱ�� ���� �ַο� ����','https://www.youtube.com/embed/PyDO_fXlLf0',null,null,null,null,'kimchiman123@gmail.com','DA004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','507','DA507','ȭ��� ������ ���� ������ �κ��ĵ�','https://www.youtube.com/embed/sB45ZBcB_yg','������ �︸���� �ٶ��������� �㿡�� Ȱ�� ��� �Ǵ��� ����ġ�� �׸� �ַο��� �̾߱� .',null,null,null,'hamlet_movies@gmail.com','DA004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','508','DA508','Ȱ�� ȭ��� ������鿡�� ���Ǳ����ϴ� ���2��','https://www.youtube.com/embed/BuGtcmwvQfg',null,null,null,null,'shong@hotmail.com','DA004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','509','DA509','Jessica Jones Review �� (Comparison with Dare Devil.. etc) by Nofeetbird','https://www.youtube.com/embed/zFlFqM7EKwQ',null,null,null,null,'nofootbird@gmail.com','DA003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','510','DA510','[����] ����ī ���� ���� 2 - ���ƿ� �����ߵ� �縳Ž��','https://www.youtube.com/embed/lxyXkFT5oqk',null,null,null,null,'rkdwns@daum.net','DA003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','511','DA511','������ ���� ������� �ʴɷ��� ��� �� �̳������','https://www.youtube.com/embed/6Og6g6HZeD8',null,null,null,null,'ans@daum.net','DA003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','512','DA512','�谡���� ���� E01-02','https://www.youtube.com/embed/5p7ZYztZIs8',null,null,null,null,'uppercut@naver.com','DA005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','513','DA513','�谡���� ���� E03-04','https://www.youtube.com/embed/m2oOXMxveKU',null,null,null,null,'uppercut@naver.com','DA005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','514','DA514','�谡���� �����ù ��� �ؼ���1��','https://www.youtube.com/embed/j32aFtQbRSY','���� ������ �谡���带 ���ô� �е��� ���� �ñ��ϼż� �غ��� Ư��. ���ް��� ��¼�� ���ظ��� �����ϰ� �Ǿ����� �����غ��ҽ��ϴ�',null,null,null,'reviewtns@gmail.com','DA005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','515','DA515','[�ұ迡 ��������] �¾��� �Ŀ�','https://www.youtube.com/embed/T2egnXbcJ7U',null,null,null,null,'cabletv@yahoo.com','DA006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','516','DA516','[�ؿܹ���] ''�¾��� �Ŀ�'' �̱�����, ����� ����. "�� ���߸� �ϴ� ���!"','https://www.youtube.com/embed/9WLwFU3lVCo','�̱� ������ ����Ʈ�� DramaFever ������ �Ұ� �Ǿ�, 6,000�� �̻��� ���䰡 �޸��� ū �α⸦ ���� �ֽ��ϴ�.',null,null,null,'react@gmail.com','DA006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','517','DA517','[���ľ��̢�] �ۼ�Ŀ���� ���������� �޴� ���� ����ZIP','https://www.youtube.com/embed/FMXwmrDTZgk',null,null,null,null,'kbs_antena@daum.net','DA006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','518','DC518','�̿� ���� ���� �����ٴ� ǥġ�� X �տ��� �� ���� �ɹ̰� �� ���� ���� �ƴϾ� | Crash','https://www.youtube.com/embed/ZHmVA1yqbAU','��� �� ��ǳ�� �Բ� �з��۶��̵� ���� ���ѿ� �ҽ����� ��� ��ӳ� �������� �׳ฦ ����� ��Ű�� ����ϰ� �Ǵ� Ư�� �屳 �������� ���� �غ� ���꽺�丮�� �׸� ���',null,null,null,'netvo@daum.net','DC001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','519','DC519','����� �ҽ��� ��� Ư��','https://www.youtube.com/embed/5L6_HwRa_5Y','����� �ҽ��� ��� Ư�� (#crash landing of love#?����˽#����Ǻҽ���#����#�տ���)',null,null,null,'dingo@daum.net','DC001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','520','DC520','[��󸶸���]����Ǻҽ���, ���ǿ����� �� �� ������?','https://www.youtube.com/embed/4brmHAymqqs','�տ���, ���� �⿬�� tvN��� ''����� �ҽ���'' 2ȭ���� ���� ���� �����Դϴ�.
���� ����̶� �ű��ϱ⵵ �ϸ鼭 ���� �κе��� �߱��� ������ �����غô��Ŷ� �ݰ��⵵ �߾��.
������ ��� ������� �ñ��� ����Դϴ�.',null,null,null,'uppercut@naver.com','DC001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','521','DC521','���ϰ� ������ ȣ������ �������н��� ������ ���� ����','https://www.youtube.com/embed/rO63mqUyZlQ','�� �� ������ tvN�� ���ǵ� �����Դϴ�.
���� �Ұ��� �帱 ��󸶴�
#�������н����̾
#�޺�����
#���',null,null,null,'eyesonme@naver.com','DC002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','522','DC522','������ �������н��� ���������͸� ����!','https://www.youtube.com/embed/OygsMKa1xAg','������ �н� ���̾..! ���������� ����.. ȣ���� �������н���� �����ϴµ� �̰� ����.���� �̷� �������� ��վ����ϴ�. �ٵ� �� �������н���� ���縦 ���ؼ� �츮 �����߿� ȭ�� �ٷ���� �ϴ°� ���ƿ�. ��ҿ� ȭ�� ������ ��� �����. ���� ��� �����, �����ε��̳� �л��鿡�� �븮������ ������ �� �ִ� ������� ������ ������ ����. �ݸ鿡 ��� ������̶�簡, ��� �������н�, �̾߱� ����� ���ǰ��� �� �������� ������ �־��. ��е鿡�Դ� ����� ��Ұ� �ǰ����� �ٸ� �е鿡�Դ� �� ��ġ�� �� �ְڴٶ�� ������ ��±���. �̷��κе��� ��� �����ϽǶ� ����غ��ð�.. �и� ����� ����� ��̷ӽ��ϴ�. �ٵ� ���� �ΰ������. ��� �濵���̴ϱ�..! ���� ���� �� ���ߵɰ� ���ֿ�.����',null,null,null,'unjun@naver.com','DC002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','523','DC523','���Ű� �ǻ簡 �������н� ��󸶸� ���ٸ� !? [���д� ep1 ����]','https://www.youtube.com/embed/zFPE5iAidIA','���� ���� ��ſ�̳���? ������ �����Ͻø�, ���� ����ְ� �ǰ��� ������ �Բ��մϴ�. ������ �ǰ��Դϴ٢�',null,null,null,'sogaenam@naver.com','DC002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','524','DC524','���簨 ���� ���� ����� ���迡�� ���α� ��Ʈ���Ӱ� �ȴ�!?','https://www.youtube.com/embed/5IcWFG7abcM','#���̺극��ũ #netflix',null,null,null,'sogaenam@naver.com','DC003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','525','DC525','��� ���������� ����ŰŰ 2��(1) ���� (���� �о��ִ� ����, ��� ���� #19) ��������, �����ڵ�! ����1�� ������ �� �ȴ�? ���ϱ�, ���ϱ�?','https://www.youtube.com/embed/wBNzngP3Myo','���� �о��ִ� ����! ��� ���� ����ȩ ��° �ð��� JTBC ��ȭ��� ���������� ����ŰŰ 2�� ��1ȸ, ��1ȭ ���� ����������, �����ڵ�! ����1�� ������ �� �ȴ�? ���ϱ�, ���ϱ�?���Դϴ�.',null,null,null,'uppercut@naver.com','DC004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','526','DC526','����Ŭ���� [HD] ����� �� *���̰�* �������� ���� ������ ����','https://www.youtube.com/embed/-LVzjwlQFEc','�ٿ��� ���ڡ� ����� �� ���̰�
���� ���� ���� �ÿ����ϰ� �� ���ƹ��� ���̰�',null,null,null,'cabletv@yahoo.com','DC004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','527','DC527','[��������] �ϰ� ���� ������ź�� ��� ���� ''���̰�(Lee Yi kyung)''�� �Ұ��մϴ� *^^* #�������� ����ŰŰ2 #JTBC������','https://www.youtube.com/embed/yzaRghKlT30','���������� ����ŰŰ���� �ϰ� ���� ���� ��ź�� ''���ر�''(���̰�)
������ ���� ���׷��̵�� ��������������ŰŰ2�� ���ر�� �Ĺ�',null,null,null,'react@gmail.com','DC004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','528','DC528','[�����] ���ܰ��� ���̼���vs�����֢� �Ҳ�Ƣ�� ƼŰŸī.zip ���˻系��(Diary of a prosecutor)��','https://www.youtube.com/embed/6CUGkQgnNUM','���ܰ��� 10�� ���� �ο�� �� ��ȭ?
�� �� ƴ ���� �����⸸ �ϸ� �ο�� �� ���
�������� ''�̼���'' vs �̼����� ''������''',null,null,null,'kbs_antena@daum.net','DC005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','529','DC529','(Po����wer) �� ������ ������(Jung Ryeo-won)�� �б⿡ �� ������ ''����2��'' �˻系��(Diary of a prosecutor) 2ȸ','https://www.youtube.com/embed/5C8llbDHRYs','������(������) ���� ����Ʈ ''���Ȱ�''�� ���� ����2��!
"�бⰡ �ִ� ����, ������ ���� ������"
�����ְ� �����ϱ⸸ �� ����2��
����ü �����ִ� �� ������ ������?',null,null,null,'uppercut@naver.com','DC005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','530','DC530','�ֺε��ϵ��� ����� ���� �ɽ���','https://www.youtube.com/embed/c1Ogv7dXkgw','�쿬�� ��Ʈ�� �а� �� ����� �ֺε��� ���ǾƸ� �ɰ��ϴ� ������������ �ŵ쳪�� �Ķ����� �����. �ٷ���� ���� ��̰� �������� ���ø��� �������� �ø��� ���� �ɽ����� �Ұ��ص帳�ϴ�. �� �ɽ��� ù��° ����, 10���� ���Ǽҵ尡 �����Ǿ� ������ ����2 ������ Ȯ���Ǿ� 2019�� �濵 �����Դϴ�.',null,null,null,'uppercut@naver.com','DC006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','531','DC531','������ ���� ���Ĺ��� ��ū ���ܸ���','https://www.youtube.com/embed/Nl860euVVts',null,null,null,null,'reviewtns@gmail.com','DC006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','532','DC532','������ ���� �Ǵµ� �Ǽ��� õ���� �͹��ȴ�','https://www.youtube.com/embed/swkbxDKyqcQ','�ȳ��ϼ���, �̵黷�Դϴ�.
���� �Ұ��ص帱 ��ǰ�� ''�� �÷��̽�(Good Place)'' �Դϴ�.',null,null,null,'kimchiman123@gmail.com','DC007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','533','DC533','�ٴܰ��Ǹſ��� ��� õ������ ������ ��','https://www.youtube.com/embed/m7aD5pFIvLs','��� ���� : �� �÷��̽�
#��ȭ���� #��󸶸��� #��ȭ��õ',null,null,null,'hamlet_movies@gmail.com','DC007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','534','DC534','�ż���100% ��Ư�ϰ� ������ ���ļ���. �� �÷��̽� ���̵� ����','https://www.youtube.com/embed/b33qMSCxXMU','���ø��� ��õ��. õ���� �����Ѵٸ� �ٷ� �� ���ϱ�? ���ø��� ������ ��õ ��� ���̵� ����: �� �÷��̽� ��ư�丶��, IMDb, ��Ÿũ��ƽ���� �������� ���� ��ȭ�� ��󸶸� ��õ�մϴ�.',null,null,null,'shong@hotmail.com','DC007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','535','DC535','��� õ���� �� ����','https://www.youtube.com/embed/sq8X0gjAEtg','������ �ȳ��ϼ��� �߸��Դϴ�.
������ ���ø����� ��� ''�� �÷��̽�''�� ���ؼ� �˾ƺ����� �մϴ�. �װ��� ''�� �÷��̽�'' �������� �Ǽ��� ���� õ���� ���Ե� �������� �̾߱⸦ ��� �ֽ��ϴ�.',null,null,null,'serin@naver.com','DC007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','H','536','DH536','�ΰ��� �丮�ϴ� õ�� ���θ�','https://www.youtube.com/embed/VLiIPiybIf4','���ø��� �濵 ���� ��� �ѴϹ��Դϴ�
*�� ������ ���ø����� ������ �޾� ���۵Ǿ�����, ���� ���� �����ϰ� �ֽ��ϴ�.',null,null,null,'sangung@yahoo.com','DH001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','H','537','DH537','�Ⱬ�ϰ� ������� ����� ���� �������н�','https://www.youtube.com/embed/WwB1GzdD0d4','�̵� �Ұ������Դϴ�
[ CH. ���� ���Դ� ���� �ؿ� ��ȭ ��� �̱���� ���� �Ұ��ص帮�� ��õ �ص帮�� ��ȭ �Ұ� ��Ʃ�� ä���Դϴ� ]
[�̵���õ]
��ȭ��õ �����õ ��ȭ�Ұ� �̵�Ұ� ä��
�ҽ���ó: �̵� - �ѴϹߤ� ���Ǽҽ�: *Aftermath Madness Paranoia
�� �뷡�� ����� ����ϰ� ���������� ������ â���� �� ������ ������ ���� ������ �����ؾ� �մϴ�.
Kevin MacLeod�� Aftermath - Madness Paranoia��(��) Creative Commons Attribution ���̼���(https://creativecommons.org/licenses/... ���� ���̼����� �ο��˴ϴ�.
��ó: http://incompetech.com/music/royalty-...
��Ƽ��Ʈ: http://incompetech.com/
*Back Streets Of Seoul
*Underpass',null,null,null,'chvideochannel@yahoo.com','DH001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','H','538','DH538','���ø��� �������� ��� ŷ�� ���� �Դϴ�','https://www.youtube.com/embed/8uHBM3gNVSU','#���ø���,#ŷ��,#����
���ø����� �������� ��� ŷ�� ���� �����Դϴ�
��󸶼� ���� �̽��� �ֱ׸� ���� �м��ؼ� ������ ������ ���� ���ε� ������ ���ҽ��ϴ�
ŷ�� ����2 �󸥳������� �ФФ�
��հ� ���ּ���',null,null,null,'uppercut@naver.com','DH002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','H','539','DH539','�ΰ� ���� �԰� ���̷����� ������ ������� �� ��������� ����� ��','https://www.youtube.com/embed/bTj2zt9B9xQ','? " ó�����źе��� ������ , ���ƿ�! �˶� �� " ?
?ŷ�� (2019) / #���� #ŷ�� #������
?��ü� ä���� ���ø��� ���� ����� ���۱��ڷκ��� �㰡�޾ҽ��ϴ�.
ŷ�� ���� : http://bit.ly/kingdom2019
?��Ʃ�� �����ϱ� : http://bit.ly/siseon
???�ν�Ÿ�׷� : http://www.instagram.com/kimsiseon
?��� : http://www.facebook.com/siseon13
#���� #���ø��� #�ѱ� #�� #netfilx #god #got #kingdom
#�Ĺ� #��γ� #����
#���� #��� #��ȭ��Ʃ�� #��ü�
#�α� #��ȭ #���� #������ #�輺��
#��� #��� #���� #���� #�Ƿ� #������',null,null,null,'eyesonme@naver.com','DH002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','H','540','DH540','�ķ� ���� ���� �ѱ������� ��Ƴ��� ������','https://www.youtube.com/embed/2S1lq2mvnI8','����! ��ȭģ���� ������ ''��ü��� �����ఢ'' 3��° ��ǰ���� ''ŷ��''�� �Ұ��߽��ϴ�. �� ������ ������ ��� ���� �� ��ǰ�� �󸶳� ������ ��ǰ���� ��� ���� �����ϰ� �ǽ� �ſ���. ���õ� ������ ��հ� ���ֽð� ���� �ֿ� �� ��մ� ��ǰ ��� �ɴϴ�. �ϴ� ������ ŷ�� �Ⱥ��� �е��� ����2 ������ ���� �����ड��~
��� ���� : ŷ�� ����1 (���ø������� ���� �� ����!)
?��ü� ä���� ���� ����� ���۱��ڷκ��� ��� �㰡�޾ҽ��ϴ�.
#���ø��� #�α� #��ȭ���� #��󸶼Ұ�',null,null,null,'eyesonme@naver.com','DH002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','H','541','DH541','�⹦�� �̾߱� ����2 ��� �� ����','https://www.youtube.com/embed/Yu1sZkz_vT8','������ �⹦�� �̾߱� ����2�� ������ ���ҽ��ϴ�
�ѳ� ��ս��ϴ� �� ������ �ι� ������ �ȳ��ϼ��� �ʺ� ����� �ݺ����Դϴ�
���ø��� �������� �������� �������� ������ ���� �մϴ�
�Ƿµ� ���ڶ�� ������ �������� �ּ��� �ܼ��� �ٰŸ��� �����ϱ⸸ �ϴ� ����� ������ ���� �ʰڽ��ϴ�
���� ������� �ٸ� ������ ����� ������ �ְ�����(���簡 ������)
�� �߿����� �Ѱ����� ���ο� ���� ���ο� ����� �����帮�ڽ��ϴ�
�׷� �ʺ� ���� ���� �� �� ���� ! �ݺ����� �Բ� �� �ֽʽÿ�',null,null,null,'netvo@daum.net','DH003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','H','542','DH542','[10�п��] �⹦�� �̾߱� ���� �Ϻ����� | ����3 ���� �� �ʼ� | ���ø��� | ������','https://www.youtube.com/embed/49UXkyf0SuI','�⹦�� �̾߱�3�� ���� ������ ���� 1,2�� ���������ϴٸ顦? (������ ���)
�̰� ���� �ٷ� �⹦�� �̾߱� ����3 ������ ����
#������ #dingomovie
#�⹦���̾߱� #StrangerThings #10�п��
?������ �����ϱ�
http://bit.ly/dingo_movie
����ȭ�� ���� ������ �ñ��ϴٸ� ���� �ٷ� ������ �����ϱ�!��
?������ ��ũ
Facebook: https://www.facebook.com/dingo.movie.kr
Instagram: https://www.instagram.com/dingo_movie/
���̹�TV: https://tv.naver.com/dingomovie',null,null,null,'dingo@daum.net','DH003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','H','543','DH543','(��������) �⹦�� �̾߱� ����3 �̽��� ���� �ؼ� �� ����','https://www.youtube.com/embed/r1XKvk_Jd90','#�⹦���̾߱�,#���ø���,#�ù����̾߱����3
�⹦�� �̾߱� ����3 �̽��� ���� �ؼ���
�����Ϸ� �����Դϴ�',null,null,null,'uppercut@naver.com','DH003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','H','544','DH544','���˽ɸ����� ������ �����ε� ���͡�, ���ø��� �ʰ�����!','https://www.youtube.com/embed/NTAI7i4VovI','����� ��ȭ�� ������ ��̷� Ǯ��� ��, ��ü� ��ȭä���Դϴ�.
* �� ���� �Ұ��� ���ø��� �ø����� ��󸶴� ���ε� ����(����1)�Դϴ�.
* �� ������ ''���ø���'' ���� �������� ���� ���� ��° �����Դϴ�. �׷��� �� �� �ְ� ������ ������ ��ȭ ģ���鿡�� ����帳�ϴ�.
��ȭ,�ϵ�,�̵�,�ߵ�,��� ���� ������ ���� : kim@siseon.kr
��ȭ ���ε� ���� ���� : http://www.netflix.com/title/80114855
��ȭ ���ĸ� ���� �� �ٸ� �ڳ�! ��ȭ�ǹ߰� �ø��� ���� : http://goo.gl/LvB1dj
��ü�X���ø��� �ø��� ����� : https://goo.gl/3fdvij
��ü� �ϻ��� ���� ���̽��� �ȷο�! : http://www.facebook.com/siseon13',null,null,null,'eyesonme@naver.com','DH004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','H','545','DH545','�������н����� ���Ż��°� �ñ��ϴٸ�? - ���ε�����','https://www.youtube.com/embed/PWz0UzaDv2g','���ø��� + ���̺� ���� = �ϰ� ���� ��󸶶�� ������ �ٽ� �� �� ������ ''���ε�����'' �����Դϴ�. ����2���� 19���� ��������, ���Ե��� ���� �پ ����Դϴ�. ����!
#���ε����� #��󸶸��� #���� #���ø���
�����Ŀ��ϱ� : https://fanding.kr/user/ungjune
���ۿ�ȭ�� �Ŀ� : https://fanding.kr/user/ungjune
���� - ���̺� ����, Į ����Ŭ��, �ص�� ���۶�, �ƽ��� ī�ĵ��, ���ƽ� ��Ȩ, �ص�� ���̴�
�⿬ - ������ �׷���, ȦƮ ��Į����, �ȳ� ���, �Ҵ� �߸���Ƽ, �����̽� ��ī, �ѳ� �׷ν�, �� ��Ʋ, ��Ŀ�� ���� �ν�, ���� ���̽�, �˹�Ʈ ����, �η� �۷�����
���� - ���ε�����
���󿡼� �� ���� �̾߱�� ���̽��Ͽ��� : https://bit.ly/2I092rE
�׳� ������ �ϻ� �ν�Ÿ�׷� : https://bit.ly/2KG1XhK
���� ���� �ű�� ������ ��í : https://bit.ly/2rpvQtL
������ ����ϴ� ��� : https://kit.com/ungjune
����Ͻ����� : ungjune@gmail.com
������ SNS �ȷο� ���ֽð�, ���ƿ�, ������ ���� ������!!',null,null,null,'unjun@naver.com','DH004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','H','546','DH546','�������н����� �����ϴ� ������� �ϴ� �� ���� �ൿ��.. ����','https://www.youtube.com/embed/upcurif5VOg','���ø��� ��� [���ε�����] ���丮�ڸ� �� ���俵���Դϴ�.
�� ��󸶴� ���ø������� ���� ����2���� ���� �� �ֽ��ϴ�.
�ƹ�ư ���õ� ã�ƿ��ּż� �����ϴٴ� ���� ����� ���� 20000..
��ſ� �ұ� ���ָ� ��������!!!
p.s ���ڵ� �� ���� ��Ʃ�� ���ε��ϰ� �߰��� �ƿ�Ʈ�� ������������..',null,null,null,'sogaenam@naver.com','DH004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','H','547','DH547','�䰡�� �Ժη� ��� �ȵǴ� ����','https://www.youtube.com/embed/80n_dtbd71U','���ø��� �̵� ''���Ͽ콺�� ����'' ���丮�ڸ� �� ���俵���Դϴ�.
�����մϴ�.',null,null,null,'sogaenam@naver.com','DH005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','H','548','DH548','���ø��� �������� ��� ���Ͽ콺�� ���� ���� The Haunting of Hill House','https://www.youtube.com/embed/A1a24WIaAr8','#���ø���,#�̵�,#���Ͽ콺������
���ø��� �������� ��� ���Ͽ콺�� ���� �����Դϴ�
������ ȣ�� �帣�� ����Դϴ�
���� ��ȭ �����Ͻô� �е�! �� ������
���� ����ֽ��ϴ�',null,null,null,'uppercut@naver.com','DH005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','R','549','DR549','[�̵�][����ƾ] �̱� 10�� ��������� ������ ��������','https://www.youtube.com/embed/dbV9k0JHycI','#�̵�#���ʰ�#����1',null,null,null,'soso@naver.com','DR001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','R','550','DR550','Gossip Girl Complete Series 1-6 Review','https://www.youtube.com/embed/HCRuVnE--Hg','Sharing my thoughts on one of my favourite shows, I love this show so much I hope i''ll continue to love it as I keep rewatching it. Let me know if you have seen it and anything you''d like to share about what you think of it, Favourite Season? Favourite Character? Favourite Moment? I do have one other favourite moment that I didn''t include because it would be a big spoiler Don''t forget to go ahead and subscribe here to keep up to date with all new videos : https://www.youtube.com/subscription_...
For business inquiries: fkvlogsofficial@gmail.com',null,null,null,'fkvlogs24@gmail.com','DR001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','R','551','DR551','Gossip Girl - Season 1 Review','https://www.youtube.com/embed/jQbQucmLxFU','A review of the first season of the TV show "Gossip Girl" by TheFalconReview.',null,null,null,'falconcaptain@gmail.com','DR001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','R','552','DR552','[���������] ''������'' ��','https://www.youtube.com/embed/p_6kvtueve4','[���������]��.��.��. ������� ''������''��!
���˸�(''������''�� ���� ���ϴ�) �̵��� ����, 4�� �ȿ� Ǯ������. �ѳ� �����ϴ� ��..�� �� �ι���!!
#������ #���̺�TVVOD #��� #VOD #����',null,null,null,'cabletv@yahoo.com','DR002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','R','553','DR553','[���˱��� #1] ������ :: ���̿� �Բ��ϴ� �ѱ���� ���� ����!! (������ ����)','https://www.youtube.com/embed/I9CrKI9_u1A','���̿� �Բ��ϴ� �ѱ���� ���� ����!!
���� : [REDC] ��ַ�, ������, ������, ������',null,null,null,'redc@hotmail.com','DR002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','R','554','DR554','���� ���� - ������ ����� �м�','https://www.youtube.com/embed/lIYyFoCe0U8','������ �м� �����Դϴ�.
���� ���� ���� -
�� �뷡�� ����� ����ϰ� ���������� ������ â���� �� ������ ������ ���� ������ �����ؾ� �մϴ�.
Audionautix�� One Fine Day��(��) Creative Commons Attribution ���̼���(https://creativecommons.org/licenses/... ���� ���̼����� �ο��˴ϴ�.
��Ƽ��Ʈ: http://audionautix.com/',null,null,null,'tunachamchi@yahoo.com','DR002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','R','555','DR555','������, �¾��� �Ŀ��� �پ���� tvN ���� ��� [�̽��� ������] ����ġ��','https://www.youtube.com/embed/mjZm-HhuwlQ','"�ƾ�, �̰��� ��Ÿ�۰� ������ �۰��� ��󸶶�� ���̴�."
7�� 7�� ù��۵Ǵ� ������ �۰�, �̺���/���¸� �ֿ��� �̽��� ������!
�̹� ����ġ�� ���ѷα׸� �������� ���� ���䰡 ���ε� �˴ϴ�.
����� ���� �Բ� ������!',null,null,null,'shortcut@daum.net','DR003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','R','556','DR556','[�岿����] ep.05 ��� �̽��ͼǻ��� 1,2ȭ ���� | ȭ���� 400�� ������ ���� ������ ������','https://www.youtube.com/embed/ygBDYPxQyuI','�岿�������� ���� ������ ��� ''�̽��� �ǻ���''
400�� ���ۺ� ���� �� �ô��,
''�¾��� �Ŀ�''�� ''������''�� ������,
�̺����� 9�� ���� ��� ������,
ȭ���� ���� ���� �� ����.',null,null,null,'iconictv@daum.net','DR003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','R','557','DR557','[ENG][�ѱ��ڸ�]�̽��ͼǻ����� �� ��������ģ���� ����! �ؽ������� Mr.Sunshine Review with my British boyfriend l Serin ����','https://www.youtube.com/embed/5PjzUlQMAkA','�ȳ��ϼ��� ������! �׵��� ���� ���� ���� ���ε带 �� �ϴٰ� ����!!! ������ ������ ������ �÷���! �̹� ������ �Ƹ� ���� ������ ���� �߿� ���� �� ������ ���� ������ �;��! ����ģ���� �� ���� ''�̽��� �ǻ���''�̶�� ��󸶸� ���� �Ǿ����. �� ���������δ� ������ �������� �� �ѱ���󸶿��� ����ģ���� �¾�� ó������ �� �ѱ���󸶿����. �׷��� �׷��� ���� ��󸶸� ���� ��� �������� �������� ����� ���� �� ���Ƽ� ���� ������ �����þ��:) ���� ������ �����ϴ�, �̽�ĳ�����̾��� ��� ������ ���� ���Դ� �Ͷ� �� ���� �� ���� �����ϰ� ��󸶸� �þ��. �� ���������δ� �׷� �����鿡�� �ұ��ϰ� �� �� ������� ��󸶶�� ������ �ؿ�. ���� ��� �۰��� ���� �ν��� ������ �� �´� ���̱� ������ �������� �ȼ��̱� ������ �Ϻ��� ���� ���� ���̶�� �����߱���. ���� ��� ������ �� �ϴ� �ϵ� ���� �߿������� �� ���� �б����� �ùٸ� ���縦 ���� ��� �� �ֵ��� �ؼ� ���� ��󸶸� ���ϴ� ���̵��� �򰥸��� ���� ������ �ϸ� ���ڴ� ��� ������ �߱���. ���� ��󸶴� ����� ������ �������� �ƴϴϱ��! �׷� ���� �����ϰ� �� �� �� �� �������, ��ܺ� ���� ��󸶶�� �����մϴ�:) ���� ������� ��·�� ���� ��հ� �þ��!! ��õ�մϴ�!
Hi guys:) I just uploaded a review video with Jamie about a Korean drama ''Mr.Sunshine.'' It was Jamie''s first ever Korean drama and he absolutely loved it. I got recommendation of this drama from lots of students that I''m teaching Korean now and we thought we should try! We had a very honest and clear review of this drama so it you''re interested in it, watch our video and also this video has fair amount of spoilers so be aware of it!!',null,null,null,'serin@naver.com','DR003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','R','558','DR558','���� ������ �м�, ���� ���� ���������?','https://www.youtube.com/embed/gyPmRiH9d7I','#���� ������ #������ #iu
���� �������� �ḻ�� ���� �ǹ��ϱ�? ���� ���� ���������? �۰��μ�, �ѱ� ��� �ŴϾƷμ� ���� ������ �̷���ϴ�!',null,null,null,'internationalbubu@naver.com','DR004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','R','559','DR559','[��ĳ��Ʈ]�������� - ���[���� ������] �ι����� �ؼ�','https://www.youtube.com/embed/XJ31Pdw0wdg','�������� ��ĳ��Ʈ http://www.podbbang.com/ch/13964
�������� ��α� https://blog.naver.com/tureedu
�ð����� Ȩ������ http://www.allgaedu.com/',null,null,null,'edutrue@naver.com','DR004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','R','560','DR560','(�ؿܹ���) TvN ȭ����� "���� ������"','https://www.youtube.com/embed/tcr5Xq_Pafw','��û���ּż� �����մϴ�. ����&����&��õ�� ū ���̵˴ϴ�!!',null,null,null,'highlight7373@gmail.com','DR004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','R','561','DR561','��ΰ� ü�� ���� - �����ε� �� �� ������..','https://www.youtube.com/embed/TUr5ieqVSqw','�ȳ��ϼ��� ����쵹 ȫ���Դϴ�.
���� �����̾ ó�� ���� ȥ�� �����θ� ���� ù ��ǰ�ε�
������� �ʹ� ��.�� (����ũ ��õ �� ��Ź �����)
�̹� ���� ���� ����� ''��� ��ΰ� ü��'' �Դϴ�.
������ ��쵵 ���� �˰� �ǰ�, ��簡 ���� ���Ƽ� ��ĥ ����
������ �� �����̶� �����ϴµ� ��û���� �ʹ� �� ���ͼ�
�ƽ��׿�~~~
������ ���� ������ �ǰ� ������, �޴��ϸ鼭 �λ� ����� �ϴ�
��� ��ΰ� ü�� �� �� ������ �غ�����^^',null,null,null,'ajhongmovie@gmail.com','DR005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','R','562','DR562','ȣ��ȣ ���� ������ #��ΰ�ü�� 1,2ȭ ���� ����','https://www.youtube.com/embed/mKjc1iWH24E','���̹��� #��ΰ�ü�� ���� �� ���̳���?
�̹��� ���� �ý��ۻ��� ������ ������ ���� ���� �� ���عٶ��ϴ�. �̹� �ָ��� �� ���� ��ε� ��, ���̹���~
��������TV�� �����ϰ� �� ��մ� ��ȭ&��� ���並 �����������',null,null,null,'highqutv@gmail.com','DR005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','R','563','DR563','[��ΰ� ü��, ����� ����] �ְ� ��û�� 1.8%? ���� �� ��! - ��.��.�� 1ź','https://www.youtube.com/embed/JBVKEwKzjOc','�� �޿� ���� ������ ��� ��� �ٰ� ����� ''��ΰ� ü��''�� ���� ���� ���Ƚ��ϴ�. �׷���... ��û���� 2%�� ���� ���ߴٴ� �Ф�
������ ''��ΰ� ü��''���� ���� ������ ���ϰ� �ִ� ����ũ ��Ŀ ���� ���� ���ƽ��ϴ�!
�� ���� ���ƿ�+������ �׳�~ ��~ �����ּ���!
#�̺��� #�������� #õ���� #����ȫ #������ #�չ��� #������ #Ȳ����',null,null,null,'bitatalk@yahoo.com','DR005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','S','564','DS564','���ο� �༺���� �߰ߵ� ������ü','https://www.youtube.com/embed/wjNI0qGJE7M','������ ��� ''�ν�Ʈ �� �����̽�''�� ���� �˾ƺ��� �մϴ�.',null,null,null,'bman@yahoo.com','DS001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','S','565','DS565','���ø��� �̵� ��õ - �ν�Ʈ �� �����̽� ����1 �����ı� �� ����','https://www.youtube.com/embed/sb2OGF2DKrg','���ø��� �̵� ��õ �ν�Ʈ�� �����̽��� �����ı�� ���� ������ �����մϴ�',null,null,null,'kongtv@daum.net','DS001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','S','566','DS566','���ø���] �ν�Ʈ �� �����̽� ���� 1','https://www.youtube.com/embed/erKvMm2dU0w','�ν�Ʈ �� �����̽� ���� 1 �Դϴ�. ���� 2�� 12�� 24��',null,null,null,'bumti@gmail.com','DS001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','S','567','DS567','�̱��� �����ؼ� 7���� ���� �����ִ� �ܰ� ��ü','https://www.youtube.com/embed/VDx-gLFwQdA','�̱��� �����ؼ� 7���� ���� �����ִ� �ܰ� ��ü',null,null,null,'bman@yahoo.com','DS002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','S','568','DS568','�ܰ��� ���� �з� ���� ����� ��','https://www.youtube.com/embed/9cYDt800ufU','������ sf�ø��� ��� �������� ���� �� ���ҽ��ϴ�
ö���� ų��Ÿ�� �ø���� ��õ ������ �ƴϰ� �Ұ� ���� �� �帳�ϴ�',null,null,null,'netvo@daum.net','DS002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','S','569','DS569','������ ������ UFO ! �� �ܰ� ������ ã�ư��� SF ��庥ó','https://www.youtube.com/embed/LGZmvN2T0IU',null,null,null,null,'reviewman@gmail.com','DS002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','S','570','DS570','���ų������׷��� ������ SF��� ��������','https://www.youtube.com/embed/TwWabiAF1Jo','���ų������׷���ä�ο��� ���ʷ� �����̴� SF��� �ø��� ''�η��� ���ο� ����, ����(Mars)''.
���װ����ֱ����� ���� �������� ȭ������ ������Ʈ�� ������� �� ��ȹ�� �����Ǵ� 2033���� �̾߱⸦ �� 6���� ���Ǽҵ�� �����̴� SF����Դϴ�.',null,null,null,'gongu@yahoo.com','DS003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','S','571','DS571','�¾� ����''�� �߻��ϸ� ȭ������ ���� �� �ִ� �ϵ�','https://www.youtube.com/embed/py4FsejE-ro','���ų������׷��� SF��� ''����(MARS)',null,null,null,'nongovernmental@hotmail.com','DS003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','S','572','DS572','ȭ���� ���� ������ �ΰ������� �������ٸ� ��� �ɱ�?','https://www.youtube.com/embed/00zMQr8-Dyw','ȭ���� �����ڳ� ���󰡸� ���� �� �ƴ϶� ������ ������ ����鵵 ���� �̴ϴ�.
�ᱹ ȭ���� ���� ���� �ΰ� ������ ������ ���̶�� ������ �ֽ��ϴ�.
�η��� ���ݱ��� ��򰡿� ��� �� �� �ΰ� �����ϴٸ� �װ� �����Ϸ� �������ϴ�.
�ϱؿ��� ��û�� ������ ������ ����Ǿ� �ְ�, ���� �� �޷��� ��ġ�� ���� �Ŷ�� �մϴ�.
�׿� ���� ���þ�, �̱�, ĳ����, ����ũ, �븣���� �� ������ ���� �ϱ� ���� ���� ���ұ��� �����ؿ���.
������� �ϱؿ� ���� ������� ��κ� ''� �����Ϸ� ����''��� �̴ϴ�.
ȭ�� ���� ���α׷��� �̷��� ��巯�ÿ� ����� �κ��� ���� �����ϴ�.',null,null,null,'nongovernmental@hotmail.com','DS003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','S','573','DS573','�ΰ��� �γ��� ���� ����� �� ���� ��� ���̷� ������!','https://www.youtube.com/embed/oYxSyBr8x48',null,null,null,null,'muk@gmail.com','DS004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','S','574','DS574','���� ���ָ� ��ġ�� ������ �䱸�� �Ⱬ�� ���','https://www.youtube.com/embed/W-g0VTts5jY',null,null,null,null,'stephanhockingkk@gmail.com','DS004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','S','575','DS575','õ�簡 ����ٰ� ���Ĺ��� ����','https://www.youtube.com/embed/tPFMgCvVCxk',null,null,null,null,'bman@yahoo.com','DS004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','S','576','DS576','�ʴɷ� �ҳ�� �ҳ��, �׸��� ����! ''�⹦�� �̾߱�'' ���� 1 ���� ����','https://www.youtube.com/embed/zqAUED2Aakc','�׸��� ���� 2�� ���� ���� � ���� 1�� �����սô�!!!!',null,null,null,'genius@gmail.com','DS005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','S','577','DS577','�⹦�� �̾߱� ���� 1,2 �ѹ濡 ����(�ι��� ���� ����)','https://www.youtube.com/embed/9lV1UK5qFxw',null,null,null,null,'uppercut@naver.com','DS005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','S','578','DS578','4���� ���迡�� ���� ���̵��� �Ծ������ ����� ����','https://www.youtube.com/embed/xMox0ozJkaU',null,null,null,null,'eyesonme@naver.com','DS005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','579','MA579','����� (2012)','https://www.youtube.com/embed/b1LBr0iGQ6c',null,null,null,null,'3bunoddugi@daum.net','MA001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','580','MA580','The Avengers movie review','https://www.youtube.com/embed/36CftNuJQgQ','Iron Man, Captain America, Thor, The Incredible Hulk, Black Widow, Hawkeye, and Nick Fury assemble to stop Loki in "The Avengers". Jeremy gives you his review!',null,null,null,'jeremyking@yahoo.com','MA001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','581','MA581','The Avengers - Movie Review by Chris Stuckmann','https://www.youtube.com/embed/u5KuJl5qJ2A','Chris Stuckmann reviews The Avengers, starring Robert Downey Jr., Chris Hemsworth, Chris Evans, Jeremy Renner, Mark Ruffalo, Scarlett Johansson, Clark Gregg, Samuel L. Jackson, Cobie Smulders, Tom Hiddleston and Stellan Skarsg?rd. Directed by Joss Whedon.',null,null,null,'chrisstuckshit@hotmail.com','MA001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','582','MA582','�����: ������ ���� ��Ʈ��''�� ���� ����� 1/2','https://www.youtube.com/embed/fpWoxlJZC_g',null,null,null,null,'nofootbird@gmail.com','MA002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','583','MA583','�����: ������ ���� ��Ʈ��''�� ���� ����� 2/2','https://www.youtube.com/embed/eV-Dcfg_T74',null,null,null,null,'nofootbird@gmail.com','MA002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','584','MA584','����� ������ ���� ��Ʈ�� / ��ȭ P����','https://www.youtube.com/embed/aWrmXvvfGrY',null,null,null,null,'moviemonster@yahoo.com','MA002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','585','MA585','�����: ���Ǵ�Ƽ ��'' ����X ����','https://www.youtube.com/embed/8G45KD6M2jc',null,null,null,null,'unjun@naver.com','MA003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','586','MA586','����� ���Ǵ�Ƽ �� _ ��ȭ ���� _ �������','https://www.youtube.com/embed/iECDe1JH0E8','�����Ϸ� ����,NO����,�� ��߸��� �ߺ��� ����',null,null,null,'moviemonster@yahoo.com','MA003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','587','MA587','���Ǵ�Ƽ �� ���� : ������Ƽ �������ε�!?','https://www.youtube.com/embed/jWcbLxSUw14',null,null,null,null,'cottoncandy@naver.com','MA003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','588','MA588','����� ������� �������� ����/ ������� ������ ���� �ϴ� ���� ��ȭ ����','https://www.youtube.com/embed/VRgB8Li6otw','��ȭ ''�����:�������''�� ���� ���� ��, ���� �����ϴ� ���� ��ȭ���� ������ �����Դϴ�.',null,null,null,'bbbbbreview@yahoo.com','MA004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','589','MA589','�ȳ�.. 11�� �� ��� ģ��, �츮���� ������ HERO: �����: ������� ����(4DX)','https://www.youtube.com/embed/L63PKoYFvec','11���� �������� �������ϴ� ������ ����.
������� �⳪�� �̾߱�. ��� ��Ÿũ, ��Ƽ�� ������, �丣�� ������ �ḻ. Ÿ�뽺���� ������ ������ �׸� ����� ��ȭ�翡�� �߿��� ��ġ�� �ִ� ��ǰ. �����: ������� �����Դϴ�.',null,null,null,'liner@hotmail.com','MA004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','590','MA590','�� �̻� ������� �� �������� ���ڽ��ϴ� - �����:�������','https://www.youtube.com/embed/aPv4EHc6XlU','���� �Ϻ��ߴ� ������ ��, ������ ���̶�� �� �̷��� ����� �ž߸� ������ ''�����:�������'' �츮�� �߾� 11�⵵ �Բ� ������ �Ǿ����ϴ�.',null,null,null,'unjun@naver.com','MA004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','591','MA591','��� ���� Ư��������� ������ ���� ���� ���ġ�� ŷ���� : ��ũ�� ������Ʈ (Kingsman: The Secret Service, 2015)','https://www.youtube.com/embed/LaVJ-izcWD8','��ȭ�� �������� ����� ��Ʃ�� ������ ����� �ؼ�',null,null,null,'eeeki@daum.net','MA005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','592','MA592','�ųʰ� ����� ����� [ŷ����: ��ũ�� ������Ʈ]','https://www.youtube.com/embed/UXnQ00t5J0A','��� ���� ����',null,null,null,'moviekok@yahoo.com','MA005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','593','MA593','ŷ���� ��ũ�� ������Ʈ _ ���̵� ���� _ �������','https://www.youtube.com/embed/ooPmNH82Rj4',null,null,null,null,'moviemonster@yahoo.com','MA005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','594','MA594','[��ȭ���ۼ�] 40ȸ - ŷ����: ��� ��Ŭ 1��','https://www.youtube.com/embed/9ytTk6J9-V0',null,null,null,null,'noone@gmail.com','MA006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','595','MA595','[��ȭ���ۼ�] 41ȸ - ŷ����: ��� ��Ŭ 2��','https://www.youtube.com/embed/ttXHY9CKQoQ',null,null,null,null,'noone@gmail.com','MA006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','596','MA596','ŷ���� 2 ��� ��Ŭ _ �ظ��� ��� ��Ƴ���? _ ���̵� ���� _ �������','https://www.youtube.com/embed/Yt6TlXOC_8U','�ظ��� ��� ��Ƴ���?',null,null,null,'moviemonster@yahoo.com','MA006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','597','MA597','����û�ξ����� ���� ���̸� �Ͼ�� �� ���� �����Դϴ�.','https://www.youtube.com/embed/9o4e75soXrs','�׸� �ǵ帮�� ���Ҿ�� �ߴ�',null,null,null,'moviemovie@yahoo.com','MA007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','598','MA598','Child Discipline of Mob Boss','https://www.youtube.com/embed/mwDnhIy1lCw',null,null,null,null,'zipmovie@gmail.com','MA007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','599','MA599','���� ų���� ���� �ǵ帮�� �̷��� �˴ϴ�.','https://www.youtube.com/embed/q9pr5GSngfo',null,null,null,null,'jum@hotmail.com','MA007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','600','MA600','[��ȭ���ۼ�] 18ȸ - �� ��: ���ε�','https://www.youtube.com/embed/5GIzYpC6eow',null,null,null,null,'noone@gmail.com','MA008',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','601','MA601','���ΰ��� ���� ���ߴ� ��ȭ ���� ���ε� ����','https://www.youtube.com/embed/tJssEgcGepo',null,null,null,null,'taco@daum.net','MA008',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','602','MA602','(�뽺��) �� �� 2 ���� ������ ���� �ı� | ������ȭ #2 | By. ��ȣŸ�츣��','https://www.youtube.com/embed/w-yCg0yBnaM','�� ��2�� ���� ���� ���� �����ϰ� ���� �ı�, ���� �մϴ�.',null,null,null,'minho@gmail.com','MA008',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','603','MA603','��ȭ������ �Ⱥ��� ������! ��¼�� �׼��� ���� 3','https://www.youtube.com/embed/7kFgrMEfIWE','���� 3������ ''����� ó�� ���� �׼��� �´�''�� ĳġ��������� �ɾ��µ� �� ���� ����Ʈ���Դϴ�.',null,null,null,'reviewang@gmail.com','MA009',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','604','MA604','�� �� 3: �Ķ󺧷� ���̵� ���� by �߾��»�','https://www.youtube.com/embed/4NMVebATfVs',null,null,null,null,'nofootbird@gmail.com','MA009',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','605','MA605','�� �� 3 ����� ������ top 11','https://www.youtube.com/embed/5uCjH9t6a7Y',null,null,null,null,'bman@yahoo.com','MA009',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','606','MA606','���� ���� ���� ��ġ�ع��ȴ�... | ����ū | �׼� | ųŸ(ų��Ÿ��) | ��ȭ��õ','https://www.youtube.com/embed/KE-S_v1uAO8',null,null,null,null,'killtarian131@yahoo.com','MA010',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','607','MA607','[B tv ��ȭ ��õ/movie Big #50] ����ū1','https://www.youtube.com/embed/-7hpFjADnUI','���� Ư�� ����� ������ų��� �߰��� ���۵ȴ�!',null,null,null,'skmovies@daum.net','MA010',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','608','MA608','���� ������ ��ġ������ �����ϴ� ��ȭ','https://www.youtube.com/embed/COqnj-GV98k','���� ������ ��ġ������ ������ ������ ���� �׼ǿ�ȭ',null,null,null,'jackkongs@hotmail.com','MA010',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','609','MA609','���̽� �� (jason bourne) ������ ��ƺ��� �� ������(1,2,3) ���丮','https://www.youtube.com/embed/U-YrqN0FMS4','�����̵�ƼƼ, ���������ӽ�, ����Ƽ������ �ٰŸ�,���丮 ����� �����Դϴ�.',null,null,null,'2ddudae@gmail.com','MA011',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','610','MA610','[�� �ø��� ����][�� ���̵�ƼƼ/�� �������ӽ�/�� ��Ƽ������]','https://www.youtube.com/embed/k7v8GJCVpck',null,null,null,null,'windandrain@gmail.com','MA011',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','611','MA611','Bourne Trilogy in 5 minutes!','https://www.youtube.com/embed/yojrsh7KBVg',null,null,null,null,'redmonmov@daum.net','MA011',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','612','MA612','���ϵ��� ��ƴ ���� �縷 �߰� �׼ǿ�ȭ [ �������� ��ȭ���� ]','https://www.youtube.com/embed/imVscQ47kTk',null,null,null,null,'hanjan@hotmail.com','MA012',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','613','MA613','���ӹ������ NEW ��ȭ�� ���ٴ�_�ŵ�ƽ�: �г��� ���� (Mad Max: Fury Road, 2015)','https://www.youtube.com/embed/DwFT3ULrBAc',null,null,null,null,'netherlandman@gmail.com','MA012',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','614','MA614','����� ����, �� ���� ���� ���� �⸧�� �����϶�','https://www.youtube.com/embed/HC3lBJIbmn4','����̰� ��õ�ϴ� ������ ��ȭ�Դϴ�.',null,null,null,'mimi@naver.com','MA012',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','615','MA615','�г��� �׼� ����� �常���� ������ ���� ���������丮 �����Դϴ�.','https://www.youtube.com/embed/GlP3acRXb94',null,null,null,null,'moviemovie@yahoo.com','MA013',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','616','MA616','���� ������ ���丮 (1,2) 60�� ���� �׼�','https://www.youtube.com/embed/nN4_GYTqZXs',null,null,null,null,'holemovie98@yahoo.com','MA013',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','617','MA617','3�� ��� / �̼� ���ļ���: ��Ʈ �������� (2011)','https://www.youtube.com/embed/2lMIzATX57o',null,null,null,null,'3bunoddugi@daum.net','MA014',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','618','MA618','���� �ְ��� �������� ������ � ''�̼� ���ļ���: ��Ʈ ��������''','https://www.youtube.com/embed/ve-ladMVWks',null,null,null,null,'extreammovie@naver.com','MA014',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','619','MA619','[2011] ����ī�� ����ī�� 22 �̼� ���ļ��� - ��Ʈ �������� - ������ ����','https://www.youtube.com/embed/oyufJI5etOM','�е����� ������, 5�⸸�� ���ƿ� �̴� ��Ʈ�� IMF������� ������ ���� �� �Ұ����� �̼�',null,null,null,'hyundaicardmovie@gmail.com','MA014',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','620','MA620','�̼� ���ļ��� �α׳��̼� / ��ȭ P����','https://www.youtube.com/embed/5Pl4I996Fjk',null,null,null,null,'moviemonster@yahoo.com','MA015',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','621','MA621','�̼� ���ļ��� : �α� ���̼� ����] ������ �����ΰ�! ��û�� �׼�! ���ƿ� ø����!','https://www.youtube.com/embed/oCXwM8wD0r4',null,null,null,null,'unjun@naver.com','MA015',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','622','MA622','151227 ���! �������� ��ȭ�뿵ȭ �̼����ļ���: �α׳��̼�','https://www.youtube.com/embed/RBSJZZp_9X8',null,null,null,null,'mybody@gmail.com','MA015',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','623','MA623','��츸 �߻��� �� �˾Ҵµ� ��ȭ�� �߻���� - �̼� ���ļ���: ���ƿ� ����','https://www.youtube.com/embed/fyPhxL4fjfA','�� ũ������ �� �� ���� ������ ����!',null,null,null,'liner@hotmail.com','MA016',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','624','MA624','[Nofeetbird] Mission Impossible: Fallout Guide Review','https://www.youtube.com/embed/XMcl9QxjPbM',null,null,null,null,'nofootbird@gmail.com','MA016',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','625','MA625','������ �׼��� ����! ''�̼� ���ļ���: ���ƿ�'' ���ڸ��� ����','https://www.youtube.com/embed/f9N4ii7QCfQ',null,null,null,null,'extreammovie@naver.com','MA016',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','626','MA626','[��ȭ���ۼ�] 14ȸ - ������Ʈ �̺�: �ĸ��� ��','https://www.youtube.com/embed/s72bXF3khQI',null,null,null,null,'noone@gmail.com','MA017',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','627','MA627','Resident Evil: The Final Chapter guide review by Nofeetbird','https://www.youtube.com/embed/wxi4y_Qhck4',null,null,null,null,'nofootbird@gmail.com','MA016',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','628','MA628','������Ʈ�̺� :�ĸ��ǳ� ���̵帮�� (Resident Evil: The Final Chapter)','https://www.youtube.com/embed/5SHq3DT0bTg',null,null,null,null,'duckplayer@daum.net','MA017',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','629','MA629','Review on the Entire ''Resident Evil'' Series! #5 Resident Evil: Retribution','https://www.youtube.com/embed/6qPWP4efulY',null,null,null,null,'9bul@gmail.com','MA018',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','630','MA630','��ȭ ''������Ʈ �̺�5'' [�����&�̸�����~] ����� ��� ȣ�� �׼�','https://www.youtube.com/embed/7AiCJjfQcyo',null,null,null,null,'movieus@yahoo.com','MA018',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','631','MA631','������Ʈ�̺�5 [�ٸ��� VS ���̴� ��]','https://www.youtube.com/embed/tGZs4ZQHu88','�ж� �亸��ġ! �׼� ���� 4�� ���� 2��. �ٸ��� VS ���̴� ��',null,null,null,'sonypictures@daum.net','MA018',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','632','MA632','���� 5 ���� - ���� �� ��Ⱑ ���Ҵ� ''��Ʈ ��''','https://www.youtube.com/embed/Bv8Llyp5kiA','80��� �׼� ��ȭ���� ''�Ƴ��'' ���԰� ������̾��� ''�Ǻ����� ���ŷ�'' ������ ������ �߾�, ''���� 5'' �Դϴ�.',null,null,null,'ajhongmovie@gmail.com','MA019',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','633','MA633','ȣ�� ��ȭ���� ������ ���� - ���� : ��Ʈ ��','https://www.youtube.com/embed/1SDSlJlTg6I','Ʈ���� ����ɰ� ������ ĥ�� �Ҿƹ����� ������ ���� �׼�',null,null,null,'unjun@naver.com','MA019',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','634','MA634','�ں���� ������ ó���ϴ� [����: ��Ʈ ��]','https://www.youtube.com/embed/ubyuJ-Nqoss','��ȭ�� ����',null,null,null,'moviekok@yahoo.com','MA019',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','635','MA635','���������� �˾Ҵµ� �������̶� ��¦ ��� ��ȭ ����Ƹ�','https://www.youtube.com/embed/sJ5uOcWlGV0',null,null,null,null,'reviewang@gmail.com','MA020',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','636','MA636','������ �Ұ����� DC�� �����: ����� �� ����','https://www.youtube.com/embed/-9j4YSKt_QE','�ٸ� ��ǰ�� �ƴϰ� ����� ���� �� ������ ������ ���̾�?',null,null,null,'liner@hotmail.com','MA020',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','637','MA637','��ȭ������ ����Ƹ�','https://www.youtube.com/embed/8-NwuRyE9rs',null,null,null,null,'teller@hotmail.com','MA020',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','638','MC638','���Ի������ ��ô �ߴٰ� ��� �и� �����','https://www.youtube.com/embed/3BB4knAVb1c','#���庸���ǿ��� #10��2�ϰ���',null,null,null,'gomong@gmail.com','MC001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','639','MC639','���� �θǽ�[���� ������ ����]','https://www.youtube.com/embed/a3bPLFvOIKc','#koreantv #koreanmovie #koreandrama #2019 #���庸���ǿ���',null,null,null,'dbstjdqls@hotmail.com','MC001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','640','MC640','���迵ȭ '' ���� ������ ���� '' 1�� �����ϸ� �Ϳ����(�跡��,��ȿ��)','https://www.youtube.com/embed/YlfgyVODB3Y','��ȭ ''���� ������ ����'' ����� ���� ���̶���Ʈ ���� crazy romance, 2019 �跡�� ��ȿ�� �ֿ�',null,null,null,'chicken@daum.net','MC001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','641','MC641','����鿡�� �°� �̻��� ���� ��Ű�� ����','https://www.youtube.com/embed/ZRmmnhbOByY?list=PLQW4-k--AOA1ruJ-M8Ru1BkSmLO_6cY6Y','�̹��� �Ұ��� �帱 ��ȭ�� #�¸�׿��긮�� #�޺����� #�ڹ̵�',null,null,null,'moonlightmuse@gmail.com','MC002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','642','MC642','������������ ���� �� ���ڰ� ���⸦ �غ��ϴ� ��� / ��ȭ����','https://www.youtube.com/embed/CF5508f1i8w','* �� ������ �����Ϸ��� ���ԵǾ� �ֽ��ϴ� * �ȳ��ϼ���. ���� ������ ��ǰ�� ''�¸�� ���긮�� (Morning Glory, 2010)''�Դϴ�',null,null,null,'ddorol@hotmail.com','MC002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','643','MC643','[ �¸�� ���긮�� ] �з��� �ƴ� �Ƿ����� ������ ������ ������ �̾߱�','https://www.youtube.com/embed/g2Sj0FCm-CA','�¸�� ���긮�� (Morning Glory - 2010) ���� - ���� ��ÿ �⿬ - ����ÿ �ƾƴ��� (��Ű Ǯ��) �ظ��� ����(����ũ ���ӷ���) ���̾� Űư(�ݸ� ��)',null,null,null,'murmicine@yahoo.com','MC002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','644','MC644','���� ������ȭ�� ���縦 ���ξ��� ��ȭ : ''��������''����','https://www.youtube.com/embed/jFd1X9j_9Os','* �� ������ �����Ϸ��� �ټ� ���ԵǾ� �ֽ��ϴ� * ��ȭ ''����''�� ���� ��հ� �� ���ν��, ����� �� �ۿ� ���� ��ǰ�̾����ϴ�. �׸��� ��ȭ������ ���� �԰�, ����� ''����''�̾���. ������ ���ؼ�, �ѱ��� �ڹ̵𿡼� �̺��� ������ŭ �ڽ��� ö���� Ȯ���� �̴� ���ٰ� �����մϴ�. ����߰�, �ǵ��� ��Ȯ�� �ڹ̵� ���� �������� ������ �޾ҽ��ϴ�. ��� ������ �� �������� �ǰ��Դϴ�.',null,null,null,'aloneman@daum.net','MC003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','645','MC645','ġŲ ��� ��ڳ� ����� ������� �������� �ڹ̵�: �������� ����','https://www.youtube.com/embed/PwefBCv1sp8','����� ������� ġŲ���� ���ȴµ� ����� ���ٴ� �ܼ��� ���̵��� ������ ������ �ڹ̵� ��ȭ. ������ ������������ �� �̻��� ���������� ���� �ƽ��� ��ǰ. �������� �����Դϴ�.',null,null,null,'liner@hotmail.com','MC003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','646','MC646','�������� ġŲ�� �����ٰ� �������� �ҹ����� �������� ��..','https://www.youtube.com/embed/aI5wejCDXtg','��ȭ ������������, ���� 1��23�� �����մϴ�. #������ #��ȭ #��������',null,null,null,'gmovie@hotmail.com','MC003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','647','MC647','���ð��� Ŭ���� ����� �Ͼ�� ��','https://www.youtube.com/embed/QVPiNA7I_64','�̹��� �Ұ��� �帱 ��ȭ�� #���� �̿��� #�޺����� #�ڹ̵�ȭ',null,null,null,'moonlightmuse@gmail.com','MC004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','648','MC648','Ŭ������ ��ȥ�κ� �������� �̻� ���鼭 ����� ��','https://www.youtube.com/embed/x9SwxsC2HIg','#���� �̿���#��ȭ�Ұ�#��ȭ���� ��ȭ ���� �̿���(2014) ���� ���ݶ� ���緯 �⿬ ���� �ΰ�, ���� ��, �� ������ ��ȭ "���� �̿���" �Դϴ�. ��̰� ���� �Ͻð� ��հ� ���̴ٸ� ���� & ���ƿ� & ��� ��Ź�帳�ϴ�. �����մϴ�',null,null,null,'choice@hotmail.com','MC004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','649','MC649','�Ʊ⿡�� �ܵ� ���� ���ų��� ���� ���','https://www.youtube.com/embed/NCijbmH4AIs','��ȭ�Ӱ� ����ִ� �ư� �̸� �κ� ������ �� �� �׵��� �л��� �̻���ԵǸ� ��� �ϻ��� �������� �������µ� ����ְ� ���̴ٸ� ����, ���ƿ� ��Ź�帮�ڽ��ϴ�!',null,null,null,'suenim@hotmail.com','MC004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','650','MC650','õ��� �̸��� �Ƴ��� ��ȥ�Ϸ��� ����','https://www.youtube.com/embed/DMFw7ghTHu4','��ȭ: �� �Ƴ��� ��� �� �ѱ� ��ȭ �� �̷��� �ڹ��԰� �������� ������ �� ���� ��ȭ�� �� ������ ���� ������ ���������� ��ô �����ϴ� ��ȭ�Դϴ�. ��ȭ ���� ũ������ �ö󰡴� �߿��� ������ ��ġ�� ����� ������ ���� �ڹ̵��� ������ ����� �κ��� �⸳ �ڼ��� ġ�� ���� ���������ϴ�. �̷� �����̵� ��ȭ�� ������ �� �ôٸ� ��Ÿ��� ���Դϴ�. ���������� ��õ�մϴ�.',null,null,null,'captainrami@gmail.com','MC005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','651','MC651','������ ī���ٰ� ���ڸ� ��Ȥ�ϴ� ���','https://www.youtube.com/embed/I2l-u0K5EDE','�� �Ƴ��� ��� ��',null,null,null,'dreamteller@daum.net','MC005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','652','MC652','��Ź �Ʒ����� ó�� ���� �� ����ó�� �� ��ȭ *�� �Ƴ��� ��� ��* �Թ��� �ǹ�','https://www.youtube.com/embed/XTk8G6lnXbE','#���Ƴ��Ǹ��� #�Ӽ��� #�̼��� #���·� #��ȭ�ǽ�Ź #��ȭ�ӸԹ� *��Ź �Ʒ����� ó�� ���� �� ����ó��? �� �ǹ̴� �����ϱ��? *����! �̹� ���󿡴� �̷������� ��ȭ�� �ḻ�� ���ԵǾ� �ֽ��ϴ�.',null,null,null,'tablemovie@hotmail.com','MC005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','653','MC653','������� �����̼�','https://www.youtube.com/embed/UsPN_oavve0','���弾 Movie Database ��ȭ�Ұ�,��õ Excerpt from:���� �������, ��� ��������. �ߤ�����������Ƥ���������. The largest Korea movie database. Reviews, interviews, previews and behind the scene footage of movie production',null,null,null,'ysamo@yahoo.com','MC006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','654','MC654','���ٰ� ���� �߸��ǹ������� �ִ� ��ȭ','https://www.youtube.com/embed/_kzarY7rq-4','������̹����̼�',null,null,null,'whereiam@gmail.com','MC006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','655','MC655','�� 10��, �� ��ȭ�� ���µ� ���� �ʿ� ����!','https://www.youtube.com/embed/Z8u4Xmm7Cmc','�̹��� �Ұ��� �帱 ��ȭ�� #�ѷ��ڽ��� #�޺����� #�ڹ̵�',null,null,null,'moonlightmuse@gmail.com','MC007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','656','MC656','[��ȭ���� �ḻ����] �����차���� B�ް��� ��ȭ ���� ���ٰ� �� ������','https://www.youtube.com/embed/4cN1Cu8OdSs','2013�� ������ "�ѷ��ڽ���"�Դϴ� ��ȭ�� �پ��� �������� ����� �ֽ��ϴ� :-)',null,null,null,'heytv@gmail.com','MC007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','657','MC657','[��ȭ BEST] ������ ���� ������, �� ����� ���� �̻��ϴ�!','https://www.youtube.com/embed/Bxb-9S-J3w0','��� "������"�� ������ �þҴ�!! ��ȭ ���� ������ ���ι��ڿ� ����� ǥ���� ���� �������� ����! ĳ���� ���� ���̴� Ȯ���� ����! B�� ������ �ڱ��ϴ� ��ȭ',null,null,null,'ajbros8080@yahoo.com','MC007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','658','MC658','��� ���ذ����� ��̿� ���� ���� ��ȭ����','https://www.youtube.com/embed/UUSbwzP1OYg','����� �丣 �ֿ� ũ���� �ܽ������� �����ִ� ���� ���� ��ȭ �����̼�(2015) �ȳ��ϼ���! ''���ƿ�''�ߵ��� ĸƾ����Դϴ٤��� �� ��ȭ���� �پ��� ī�޿��� �⿬ ������, �������� ������ ������ �ְ����ϴ�. ���� ������ �� ����� ������ ����!!���� ����� ��Ʈ�ǰ� �۽��ȸ��� �þ, ������ ī�޿��� �� �˾ƺ� �̴ϴ�.',null,null,null,'captainrami@gmail.com','MC008',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','659','MC659','�� ��ȭ�� ���� ���� �ʴ´ٸ� ������ �帳�ϴ�.','https://www.youtube.com/embed/UQZWUm_ZdbU','��û���ּż� �����մϴ�^_^',null,null,null,'yangyang@naver.com','MC008',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','660','MC660','��ȭ �����̼� vacation 2015 ���� ���� 19�� �ܱ� �ڹ̵�','https://www.youtube.com/embed/VQf-GxRWYzI','�����̼� vacation 2015 10�⵿�� �ų� �Ȱ��� ���� �ް��� ���� ����Ƽ�� ���� �ð��� �귯 �̼Ҹ� �Ҿ�� �Ƴ��� ���� �� ����Ƽ�� �̱����� ���� �α� �ִ� ���̰��� ������ ���塯�� ���� �̴��Ⱦ�� ������ �����մϴ�. 4000Ű�θ� Ⱦ���ϱ����� ��÷�� ������ ���� ���̰������� ���! ������ ����ְ� ��ź�� ������ �Ǹ���� ���ʹ� �޸� ��� ��� ������ ���ϴ�. ���� �׸����õ� ������ �����̾�Ƽ�� ������ ��ġ�� ������ ���ƿ� �� �������? [ȭ��ƮĢ��]���� ��¥ ���� �ڹ̵� ��ȭ�� ã���Ŵٸ� ��õ!',null,null,null,'helpyourself@hotmail.com','MC008',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','661','MC661','1700����� �� �� �ȿ� �� ����ϴ� ����� �������� | �ḻ����','https://www.youtube.com/embed/GFbHyJsMewY','#��ȭ���� #�ḻ���� ��ȫ�ü��� (2018, Hello Mr. Billionaire, ������ݣ, ��ȫ���� ����)',null,null,null,'daymovie@hotmail.com','MC009',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','662','MC662','�� �޾ȿ� 1,700�� ���� ����ϴ� ���ڰ� �ִ�?! [10�п�ȭ]','https://www.youtube.com/embed/5IT5_Grf0Ao','* �� ������ �����Ϸ��� ����ֽ��ϴ�. * ��ȫ�ü��� (Hello Mr. Billionaire). 2018',null,null,null,'postshare85@daum.net','MC009',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','663','MC663','(��ȭ����/�ḻ����) �Ѵ޾ȿ� 1700���� ���� ���� 5���� ��ӹ޴´�!? ��ȫ�ü���','https://www.youtube.com/embed/mTprvfMJ4Iw','#��ȫ�ü��� �ḻ #��ȭ���� #�ḻ���� #�ڹ̵�ȭ',null,null,null,'endmovie@daum.net','MC009',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','664','MC664','[�������۸���] ���ٰ� ��� ����� ��ȭ���� ������!','https://www.youtube.com/embed/4AFVTL8nCUg','������ ������õ����: 9.5/10 �������: 8/10 ������: 7/10 ������: ���ٰ� ��� ���ٰ� ��� �ϴ� ��ȭ. �峭���� ��ȭ���� ��ī�ο� �۰��� ����� �ִ�. ���� ��Ұ� ������ �츮�� �� ��ȭ�� ���� ���� �����̴� ������ �����ϱ�?',null,null,null,'9bul@gmail.com','MC010',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','665','MC665','������ õ�簡 �б���Ȱ �ϴ� ���','https://www.youtube.com/embed/i5u2POOeMdk','������ õ�簡 �б���Ȱ �ϴ� ����� �����ִ� ��ȭ �������Դϴ�. ���̹� ������ 9.34 (25,563�� ��)���� ���� ������� �����ϴ� �ε� ��ȭ�Դϴ�.',null,null,null,'storyroom@daum.net','MC010',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','666','MC666','[�� ����] ��� ������ ģ���� ã�Ҵ�','https://www.youtube.com/embed/vCB3b-IbA94','��� ������ ģ���� ã�Ҵ� (+There''s English Subtitle. You can enjoy by using that.) ���������ƿ䡤����������� ���� �˴ϴ�. ������ ���� �������� �����ϰڽ��ϴ�. ����ȭ���� ����: �� ���� ����: �������� ����� �⿬: �ƹ̸� ĭ, �����Ϲ�, �Ÿ� ����',null,null,null,'codemovie@daum.net','MC010',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','667','MC667','[��ȭ���� �ḻ����]�������� ������ û�Ṱ! ���� ���ٰ� �� ������ (�ѱ� �ڹ� ��ȭ)','https://www.youtube.com/embed/rt0knPnfkqg','2015�� ������ "����" �Դϴ� �� ��ȭ�� ��޻�� ���ǰ� �Ǿ����ϴ�. ������TV�� ��� ��ȭ�� �ִ��� ������ �ؼ� �����ϱ� ������ ��� ������� ���� ���� �� ���� �������� �������ֽø� �����ϰڽ��ϴ� ��ȭ ���䰡 ��վ��ٸ� full �������ε� ������ ���ô� ���� ��õ�帳�ϴ�~! �׻� ������TV ��û�� �ּż� �����մϴ� ��ť!',null,null,null,'heytv@gmail.com','MC011',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','668','MC668','���ϴ� ���� �� ���� �̷��ٰ�? | ��ȭ ���� | ��ȭ���� | 32��° �� | ���ϴ� | ���� | ��ȣ | ��ȿ�� | ���ҹ� | ������','https://www.youtube.com/embed/dmtOF1oUkp0','���ϴ��� ���ΰ� ���� ����� ĳ���ͷ� ��ȭ ������ �����硯�� �̾Ҵٴ�����? ��,, ���ϴ� ���� �� �� �̷��ٰ�?��������������',null,null,null,'dingo@daum.net','MC011',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','669','MC669','���� (Twenty, 2014) ����, ������, ��ȿ��','https://www.youtube.com/embed/dXduysupkT0','����. ����.',null,null,null,'benhahnfeld@yahoo.com','MC011',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','670','MC670','[B tv ��ȭ ��õ/movie Big #14] ������(Spy, 2015)','https://www.youtube.com/embed/7T5cKRnshRQ','�ѽõ� ���� �� �� ���� ����ϰ� ������ �׼� ��! ������ ��ġ�� ��ȭ �� �׼� ��鸸 ���⽺�� �Ұ�',null,null,null,'skmovies@daum.net','MC012',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','671','MC671','X'' �ϳ��� �̼��� Ŭ���� �ϴ� 1�� ������ [�ḻ����]','https://www.youtube.com/embed/Y_ELu-LM1_8','���غ� ���� ��������! 2015�⿡ ������ ��ȭ ''������'' �Դϴ�',null,null,null,'drikdrik@gmail.com','MC012',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','672','MC672','(��ȭ���� �ḻ����) ���迡�� ���� ������ ������','https://www.youtube.com/embed/y9kxQc0oIhw','�ȳ��ϼ���! �������Դϴ� �׵��� 1������ ������ ������ ���� ���� ���ε尡 �ʾ������ϴ�. �׵��� �츮 �����ںе� ���� ���� �;����ϴ�! �����ε� ���������� �����е鲲 �ḻ���� ��ȭ����ν� ���� ��ȭ�� ���ε� ���״� �ߺ�Ź�帮�ڽ��ϴ�!!',null,null,null,'drikdrik@gmail.com','MC012',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','673','MC673','[��������] ����, ���� ����޶�µ���? �ýǸ� 2km','https://www.youtube.com/embed/tOGOhELR_ug','������õ����: 5.5/10 �������:7/10 ������:2/10 ������: �ô븦 �ռ� ���Դ� ������ȭ. �ƽ��� �������� Ȳ���� ���������� ��̸鿡���� ������! ��â���� �ڹͿ��⸦ 100%���� �� �ִ� ��ȭ.',null,null,null,'spoilerman99@hotmail.com','MC013',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','674','MC674','�ϰ� �׷� 94��?�������� (��ȭ �ýǸ� 2km) Sicily 2km scenery','https://www.youtube.com/embed/UgIPdIUuJ_s',null,null,null,null,'9bul@gmail.com','MC013',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','675','MC675','��ȭ - ������ �ð��� ����� (�ýǸ� 2km vs �⹦�� ����)','https://www.youtube.com/embed/XGAExkmw1ko',null,null,null,null,'tvshowshow@hotmail.com','MC013',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','676','MC676','[����Ʈ] ������ �� �� �� ������','https://www.youtube.com/embed/gofu_qz2EkI','#����Ʈ #7��_31��_IMAX_���� �� ������ ���۱��� ���ۻ翡 �ֽ��ϴ�.',null,null,null,'makemovie@daum.net','MC014',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','677','MC677','����Ʈ�� ���μŹ��� ���� �糭 ��ȭ�� 9���� Ŭ����','https://www.youtube.com/embed/QnCP8TrTxag','#����Ʈ,#������,#���� ��ȭ ����Ʈ���� �μŹ��� 9���� Ŭ���θ� �̾߱� �غ��ڽ��ϴ�',null,null,null,'uppercut@naver.com','MC014',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','678','MC678','������� �糭�� ����ΰ� �Ǵ� ��¼�� ���','https://www.youtube.com/embed/GJsFPd4z2vY','#����Ʈ ��հ� ����� ��ȭ ��ȭ ���۱� ����� ���۹�޻��� �㰡�� �޾ҽ��ϴ�',null,null,null,'gomong@gmail.com','MC014',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','679','MC679','��������� 300������ �䱸�ϴ� ������ ����','https://www.youtube.com/embed/SJvXjJpasm0','* �� ������ ��޻���� ���Ǹ� ��ġ�� ���ε� �Ǿ����ϴ�. * ������ �簡�� �� ������� ���մϴ�. ���� ���� �����ϴ� ��ȭ �� �ϳ��Դϴ�. ���ֶ�� �̾߱⸦ ���������� Ǯ��°�, �������� �� ���ΰ��� �ʳ� �� �� ���� ������ ����� ���� �� �����߾��. ���� ��ȭ�� ������ּ���! ���� : ������ �µ�(Very Ordinary Couple (V.O.C.) , 2012 ���� : ��� �⿬ : �����, �̹α�, �ֹ���, ��̶�, �Ͽ���',null,null,null,'aloneman@daum.net','MC015',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','680','MC680','�̺��ϰ� ���� ���� �ȵǴ� ��ȭ�� ����� ���� ���� [������] ������ �µ� | �̹α� | �����','https://www.youtube.com/embed/haeDeiNNCb0','������� ���� ���� �ȵǴ� ��ȭ �� �ϳ� �ٵ� ��� �����������?',null,null,null,'mupmup@hotmail.com','MC015',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','681','MC681','�ľ���� ����� ���� ���� �� ��ȭ *������ �µ�* �Թ��� ���� �ǹ�','https://www.youtube.com/embed/Ltz9O6ikX9w','#�����ǿµ� #����� #�̹α� #��ȭ�ǽ�Ź #��ȭ�ӸԹ� #��ȭ������ *�ľ���� ����� ���� ����? �� �ǹ̴� �����ϱ��?',null,null,null,'tablemovie@hotmail.com','MC015',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','682','MC682','�� ������ �� ������ �����ߴ�. [������] �������� �׳� | ������ ������ | 2000s','https://www.youtube.com/embed/gRtTVxPV_gw','�󶼴� ���̾�~ ��ΰ� ������ �ξҴٱ� �Ф� Ű���� ���� �θ�ƽ �ڹ̵�',null,null,null,'mupmup@hotmail.com','MC016',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','683','MC683','����� ������ ���� �� �Ǵ� ���ٱ��� ��ȭ��Ų ����','https://www.youtube.com/embed/97IAkuPNauw','�ȳ��ϼ��� ��ȭ �������� �׳� �Դϴ�',null,null,null,'lemong@hotmail.com','MC016',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','684','MC684','[�����] ������ ��ȭ �������� �׳�-������ ��������','https://www.youtube.com/embed/xBAF-Nv2lDg','����ǰ�� (Titles) : �������α׳�(My Sassy Girl, 2001) ���⿬ (Cast) : ������, ������ ������ (Director) : ����� ���ٰŸ� (Synopsis) : ������+�������� �������� ����̾߱� �׳���� ������ ����Ʈ�� ���۵ȴ�! 2001�� ����, �¸��� �ǻ������� ��ſ����ϴ�! ''������''. �׳�� ���� ���� ������ �Բ� ��õ�� ����ö�� Ÿ�� �Ǿ��̴�. ���ؼ� ��Ʋ�Ÿ����� �ȴ´ٸ� ���� �ŷ������ ������ �ư�������... Ǫ������! ��¥ Ư���ϴ�! ���� �׳డ ���� ���ؼ� �踦 ���� ���ִ� ����� �Ϳ����� �����Ÿ��� �׳ฦ ��� ���Ѻ��ƾ��̴�. �׷��� ���� �̼��ϰ� �θ��� ���� �׳డ ���� �Ҿ��� ���̴��ϸ� ��ħ�� �������~~~ �����~~ �¸�������~~~ ��, �׷����̴�! �׳డ �տ� �ɾ� �̶� ��Ӹ� ������ �Ӹ� ���� ���İ��� ���� ģ �Žÿ����̴�!! ���� ����ö���� �Ƽ������� �ǰ� ���� ��̴� ��Ȳ�̾���. ��¥ ���� �ű⼭���� ������� ���ƾ��̴�. ������Ʈ�� �ÿ��ϰ� �ϴ� �׳డ �Խ�ġ���� �������� ���� ���� �̷��� �˹̴�! �ڱ��!~ ����~ ���~ �ڱ�~ ��~! ��... �� ���� ���� ������ ��ϴ�. ���� �׷�ġ������ �ǿ��� ������ �ʹ��� ū �� �����̴�. ���� �ҽ��� ������ ��̴�. �� ���� ��𿡼��� �δ��� �ٶ��� �δ� �͵� �����̴�. �׷�, �� ������ ������ �ѹ� ġ���غ���!! ���� ���̰� �ñ��ϸ� �������� �� ������ ���о������ ����! �׷��� ���ž��� �������� ���� ���ؼ� �� ������ �پ���ᵵ �ƴ� ����... �׳��� ����, �󷷶׶� �ʸӰ��� ������� �� ����! �׷��� ������� ������ �����ִ� ���� ����ɰ� �����ָ� �⸷�� ������ �����ᵵ �ƴ� ����! ''�Ĺ���''. ������ �׳డ �� ���� �쾸�̴�. �ظ��� ���� �׳ฦ ���� ������ �� ������ �� ���� �ູ�����̴�. ���ݱ��� ���� ���� �Ǿ��־����� �ڽ��� �����̴�. ���� �׳ฦ �����ذ͵� �׳࿡�� ������ �͵� �� �׳ฦ ġ���� ���� ���� �� �����̴�. ���� �׳� ���� ���� ���� ���� ��������� ���� �����̴�. �׸��� ���� Ÿ��ĸ���� ������ ������ ��� Ÿ�̸Ӹ� 2�� �Ŀ� ���羸�̴�. �� ĸ���� ������ ��! ������ ������ Ȯ���� ���̴�. �׷��� �׳�� ������ڴ� ���� ����߽��̴�. ''������''. ���� ������� ���� ������ ��ó�� �츮�� ���� ������� �и��� �ٽ� ���� ���ӹ̴�. �ٸ� ���ð� ����ó�� ����� �ð��� �ƴ� ��... �Ͻ��̴�.',null,null,null,'playallmovies@hotmail.com','MC016',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','685','MC685','[��ȭ���� �ḻ����] ���� �� ��ȭ ���� �� ���̶� �� ���� ��� �����ϴ�. (�ѱ� �ڹ� ��ȭ)','https://www.youtube.com/embed/beXU8H6f7es','2016�� ������ "������ �ҿ�" �Դϴ� ������TV�� ��� ��ȭ�� �ִ��� ������ �ؼ� �����ϱ� ������ ��� ������� ���� ���� �� ���� �������� �������ֽø� �����ϰڽ��ϴ� ��ȭ ���䰡 ��վ��ٸ� full �������ε� ������ ���ô� ���� ��õ�帳�ϴ�~! �׻� ������TV ��û�� �ּż� �����մϴ� ��ť!',null,null,null,'heytv@gmail.com','MC017',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','686','MC686','ģ���� ù ���� ��븦 ã�� ��Ŵ� ���� ���� ģ����','https://www.youtube.com/embed/FuyOmow_eOQ','�ȳ��ϼ���, �Ϻ��� ���Դϴ�. �̹� ��ȭ�� �������� �ҿ����Դϴ�. ������ ���ƿ並 �����ֽø� ���� ������, �Ͽ��� ����ִ� ��ȭ ����� ã�ƺ˰ڽ��ϴ�. ���並 ����ְ� ���̴ٸ� ������ ���ƿ䵵 �� �����ּ���!',null,null,null,'bukbu@yahoo.com','MC017',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','687','MC687','������ �ǵ帮�� ���Ҿ�� �ߴ�','https://www.youtube.com/embed/OHH9yd7u7rw',null,null,null,null,'egg@naver.com','MC017',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','688','MC688','�����ϴ� �Ҹ� �ϰ��ֳ� ( ������ ) ���丮+�ؼ���','https://www.youtube.com/embed/XVmIqYUJzLc','35��° ��ȭ ���� ������ ( 2014 ) ���丮+�ؼ����Դϴ�. 18�� 38�� ���ķ� �����Ϸ��� ���ԵǾ� ������ �������ּ���. ���ƿ�(��õ) ��ư�� �����ֽø� �� ���� �е��� �����Ͻ� �� �ְ�, ������ �Ͻŵ� ����ư�� �ѹ��� �����ֽø� �˶�������� ���� �� ���ϰ� ���� �� �ֽ��ϴ�. ���� �칮�� �⿬ ����ȫ, Ȳ�¾�, �����, ������, Ȳ�̿�, ��ȣ��, ������, ����ö, �̼���,',null,null,null,'riukun@gmail.com','MC018',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','689','MC689','[��ȭ���� �ḻ����] ���ڵ��� ���� ���� �ͼ� �����ϱ� ���� ���� (�ѱ� �ڹ� ��ȭ)','https://www.youtube.com/embed/0DHBcqC9I7k','������TV�� ��� ��ȭ�� �ִ��� ������ �ؼ� �����ϱ� ������ ��� ������� ���� ���� �� ���� �������� �������ֽø� �����ϰڽ��ϴ� ��ȭ ���䰡 ��վ��ٸ� full �������ε� ������ ���ô� ���� ��õ�帳�ϴ�~! �׻� ������TV ��û�� �ּż� �����մϴ� :-) ���� �� ��վ��� ��糪 ����� �־��ٸ� ��۷� ���� ���� �����ּ���~~ ��ť! 2014�� ������ "������" �Դϴ�',null,null,null,'heytv@gmail.com','MC018',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','690','MC690','���ִ� ���� ���� �����ǽ��� �Ǵ�(�ḻ����)','https://www.youtube.com/embed/Vsc0a04_NwQ','��� ���뿡�� �� ������ ���ΰ� ������ �����ϴ� ���ΰ��� ���л��� �ʶ��� ������� �б��� �����ϱ� �����Ѵ�. �׷��� �б����� ���ڱ�� ������ � ���ڸ� ������ �Ǵµ� ���ΰ��� ���� ��� �ɱ��?? ��ȭ ������ �Դϴ�.',null,null,null,'zto@hotmail.com','MC018',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','691','MC691','�ְ� ������ �ĸ°� ������ �޵� ������ ����� �ο�','https://www.youtube.com/embed/UYy2y7Y5a1U','����''�ϰ� ''�˸�''������ �صθ� ��մ� �ֽ� ������� ���� ���� �� �� �ֽ��ϴ�. ''��õ''�� ������ ���ۿ� ū ���� �˴ϴ�^^',null,null,null,'captainrami@gmail.com','MC019',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','692','MC692','(�ḻ����) �ּ�ġ�� ��Ǫ��ȭ / ��ȭ��õ ���� �Ұ� �������� �ٽú���','https://www.youtube.com/embed/y_NMuy3eBeY','���̵� ��ٸ�����?? �ߵ� �ֹ��̳���?? ��ħ�� ����Ͻø鼭 �ѹ��� ���� �����ּ���~ �� �������� ��ſ� �Ϸ簡 �ǽñ⸦!!! :-)���� �۾��ϴ� ���� ��ſ��� ��ȭ�����ϴ�~~~~~~',null,null,null,'horrrrror@naver.com','MC019',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','693','MC693','�� �߸� �ɷȾ�'' ���� ������� ����?','https://www.youtube.com/embed/KJjcxHo6Jmc',null,null,null,null,'sangung@yahoo.com','MC019',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','694','MC694','60�� ���� �������� �� ���ι� �ܰ��� ������','https://www.youtube.com/embed/suAmZ3m1ilc','#Ȳ���ѿܰ����� #��ȭ��õ #���ι�',null,null,null,'dreamteller@daum.net','MC020',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','695','MC695','���ġ���� ���� �ٴϸ� ������ ��¥ �ܰ���','https://www.youtube.com/embed/8V7M5jv-1T8',null,null,null,null,'fallinfilm@hotmail.com','MC020',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','696','MC696','�ܰ����� ������ �� �� ������ ��','https://www.youtube.com/embed/84KYuGWil-Q','��ȭ Ȳ���� �ܰ��� �� (2011) ���� �����ٶ��ϴ�.',null,null,null,'roleplayman@yahoo.com','MC020',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','697','MH697','35�� ���� ����ܿ� �������� �����/�νô�Ʈ(The Incident, 2016/)�ٰŸ�&�ؼ�/����,������ ��õ','https://www.youtube.com/embed/VGNgwuM5IgI','�����е��� �Ѱ����� �󸶳� �������� ��Ǽ� �����Ű���?
���� 35�⵿�� �Ѱ��� �������� ��������ֽ��ϴ�.
������ �ϱ俣 ������ ��Ҵ� ����������, ��ȭ ������ �巯���� ������ ���⿡ ����Ѱ� �����ϴ�.
*��հ� ���̴ٸ� ���ƿ� ���� ��Ź�帳�ϴ�~!!',null,null,null,'acut@naver.com','MH001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','698','MH698','35�� ���� ����ܿ� ���� ������ ������','https://www.youtube.com/embed/zMk-piFQjZU','��ȭ ''�νô�Ʈ (The Incident, 2014)'' �Ұ� �����Դϴ�.
[�ش� ��ȭ ���� ��ũ]
https://www.youtube.com/embed/SvMT1...
[������ ����]
https://goo.gl/4ETvXY
[������ ���̹�TV]
http://tv.naver.com/gmovie
[�ٸ� ��ȭ �Ұ� �ѷ�����]
https://goo.gl/78TM8K
[���� �ν�Ÿ�׷�]
https://www.instagram.com/awayout1/',null,null,null,'gmovie@hotmail.com','MH001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','699','MH699','������ �ݺ��Ǵ� ���� ''��ȭ �νô�Ʈ'' �ḻ �ؼ�����','https://www.youtube.com/embed/3izaCauotZ0','#ȫ�ó׸� #�νô�Ʈ #�ḻ�ؼ�
��� ���� �� ��ȭ�� ���� �λ��� ��̷Ӱ� ��հ� �� ��ȭ�����ϴ�
���� ������ ������ ���°Ŵ� �����ص� �ʱ׷��� �������ֽŴٸ�
�����ϰڽ��ϴ� ��_��
[��ȭ ���� , �뿩 ��ũ] ��
https://www.youtube.com/embed/SvMT1...
[ȫ�ó׸� ����]��
https://www.youtube.com/channel/UCtwx...
[ȫ��Ÿ�׷�] ��
https://www.instagram.com/hong_cinema/',null,null,null,'hongcinema@gmail.com','MH001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','700','MH700','[��¥��ģ�ḻ�ؼ�] ������ �������� ��ȭ','https://www.youtube.com/embed/_Ix__obpFDw','���� 47����..
���� ��ҷ� 15% �־��� �ð��� �� 20��
���� ��â���� ��������
�׸��� ���� ���λ���
������ ��û�Ϸ��� ������������ ���� 7���� �̻� �Ǹ����� �ö󰡾߸��ϰ�
���Ҹ� �Ǹ����� Ż���� �õ��ߴٰ� ������� �����԰ų�
�ް��� �з����� �����ߵ����� ���Ĺ������ִ�. ���� ����̶�� � ������ �ϰڽ��ϱ�?
������ ������ �ܹڿ� ����� ������ ���� ���� ���������� ���������� ��ȭ �׵��� �� �̷� ����õ���� ������ ����������.
���ݺ��� �� ���� 47������ ���������� �� ���Ǳ��?',null,null,null,'karang@gmail.com','MH002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','701','MH701','������ ���ü���̵ǹ��� �ް�.���λ��� Ż���ϱ� ���ѻ��� (����)','https://www.youtube.com/embed/dIQZshbhEPw','��ȭ: 47���� �Դϴ�.
�� �������� �� ���۱� �������� ���۱� ������ ���� �����Դϴ�.
�ٰŸ�:�߽����� ����� ���ȿ��� Ư���� �ް��� ���� �����硯�� ������Ʈ��.
���� �� ���� �߾��� ����� ���� �ͽ�Ʈ�� �������� ��� ü��(��ũ ������)�� �����Ѵ�.
������ ��ſ� ���, �ڸŰ� �ö� ź �������� �� �� ���� ����
���İ��� ���� 47���ͱ��� �߶��ϰ� ����.
���ù����� ���� ��� ������ �ѷ����� ''��ũ ������'' �ӿ���
��� ��ũ�� ��ƿ �� �ִ� �ð��� �� 20��!',null,null,null,'drunk@hotmail.com','MH002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','702','MH702','��� ������������ �� �׳�鿡�� ������ �� (�ḻ���� / 47����)�ӽ������Ǥӿ�ȭ����Ӱḻ����','https://www.youtube.com/embed/YtTnD5eogYE','�� �� ������ ���۱����� ������ ���� �����Դϴ� ��
�����ϱ� : https://bit.ly/37j0JmR
�ȳ��ϼ��� ���ι����Դϴ�. ������ �� ���� ������ ������ ã�� ���ڽ��ϴ�^^
��û���ֽ� ��� �е� ����帮�� ����ְ� ���̴ٸ�,
������ ���ƿ� �� ��Ź�帮�ڽ��ϴ� �����մϴ�',null,null,null,'9movie@daum.net','MH002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','703','MH703','� �ؼ� : �ֽ� ���� �м��Դϴ� �ؽ������ǡ�','https://www.youtube.com/embed/RpXmN3IL2cU','2016. 7. 8 �� �ϼ��� �����Դϴ�.
ó�� ������ ��ȭ �ؼ� ����� ���ڶ� �Ŷ� �����˴ϴ� ��
�ε� �� ���̶� ��հ� ���ּ����� ���ڳ׿�.
���� �������� ��� �� �κ��� ���������� ���عٶ��ϴ�.',null,null,null,'fatic74@yahoo.com','MH003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','704','MH704','ĭ��ȭ���� ��� ������ ���ۿ� ���� 5���� ���� [�帲�ڷ�]','https://www.youtube.com/embed/mvaSDhFDbMM','�������� ��Ȥ�� �����ϰ� �Ѱ��� �ƴ϶�, ü���ϰ� �Ѱ��Դϴ�. �ذ��� ���� �õ�������� �Ƹ������� �õ�� �ذ������� ������. �̷� Ư¡�� ������ �ǽ����� ������ �츮�� ������ ��� �ֽ��ϴ�. Ư�� ������ ������ ���� ���� ���ϰ� ������ ���� ���� �Ǿ��ִ� ��(����)�� �ذ���(�ǽ�)�� �Ǵ� ����� �����ݴϴ�.
�������ƴ϶� ���밡 ����...���� �������� ���ٺ���...���� �𸣰�
�� �ǰ��Դϴٸ�, ��� �Ƹ��� ������ ������ ������ ������ ��Ʈ���� �츮���� ��Ȥ���ѳ��� ���� ''�Ǹ�''�� ǥ���ϰ� �����鿡�� ��Ȥ�Ǵ� ��Ȳ�� ü���ϰ� �������μ�, ''����''�� ���� �̾߱⸦ �Ϸ��� �� �� �����ϴ�. *�߰��ڿ� ������ ������� ''������''���� �����߽��ϴ�. ����ö�� ��Ƽ��� �� ĳ�����̱��ϳ� ����ö���� �ٸ��ϴ�.*',null,null,null,'dreamteller@daum.net','MH003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','705','MH705','� [�ٰŸ� �˷��� - �ؼ� ��] (���, THE WAILING, 2016)','https://www.youtube.com/embed/nQBERwh89Zk','[�ٰŸ� �˷���-�ؼ���] ��ȭ, �(���)
��ȭ�� ���ؿ� ������ �Ǵ� �ֿ� �ٰŸ��� ĳ���� ����, ����� ���� �˷��帳�ϴ�. ��ȭ�� �̹� �����Ͻźи� ��û�ϼ���. �� �� ������ ��ǰ�� �ֿ� �ٰŸ��� �ḻ, ���� �� ��� �����Ϸ��� �����ϰ� �ֽ��ϴ�.
�� ���� �� ������ �˷��� ���� �ְ��� �ؼ��� �����ϰ� �ֽ��ϴ�. �� ���� ��ǰ�� �� ���� ���� ���� ��� �� �����Ͻñ� �ٶ��ϴ�.
�� �ؼ��� ���� �ñ��Ͻ����� �˷��� ���̽��� ������ ��ۿ��� Ȯ���غ�����. https://www.facebook.com/allyeozum/vi...
�� ���ؿ� ������ �Ǽ����� �˷��� ������ ���� ��Ź�帳�ϴ�.',null,null,null,'youknow@gmail.com','MH003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','706','MH706','�ð��� �带���� �Ǹ����� �������� �ѱ� �𸶻� | �ḻ���� |','https://www.youtube.com/embed/-gi7xIwbkEQ','���� �Ұ��ص帱 ��ȭ�� #���������� �Դϴ�.
�� ���ʵ� �翵 ���� http://bitly.kr/3QlxZ
�� ���� ���� cheerupjaeyoung@gmail.com
�� �ν�Ÿ�׷� https://www.instagram.com/cheerupjaey...
�� ���� ���ƿ並 �����ֽø� ���� ū ���� �˴ϴ�!',null,null,null,'jy@gmail.com','MH004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','707','MH707','���󿡼� ���� �߻��� �𸶻簡 ���ҽý�Ʈ �ϴ� ��ȭ(���������� ����)','https://www.youtube.com/embed/W1r1Gq4jJ-Y','��ȭ [����������] �� �ٰŸ� ��� �� ���俵���Դϴ�. ���� �����Ϸ��� ���ԵǾ������� ��û�Ͻ� �� �������ֽñ� �ٶ��ϴ�.',null,null,null,'lak@hotmail.com','MH004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','708','MH708','�ڼҴ��� �Ǹ����� ������� ������� ��ȭ ����������(����o)','https://www.youtube.com/embed/b3G8k3bNj6s','�ȳ��ϼ���~���ڹ��񸮺��Դϴ�^^
���� �غ��� �������� "����������"�Դϴ�.
2015�� 11���� ������ ��ȭ "����������"�� �� 540������ ���� ���� ����ϸ鼭 ���࿡ �����߽��ϴ�.
��� ���� ��ȭ���� ã�ƺ��� ���� ������ ���ҽ���Ʈ, �� �����ǽ��� ����� �ٷ� ��ȭ�ε���. �׷��� �ż��� ������ ������� �� �˾ƺ� �� �� �մϴ�.
�� �ۿ��� ������ ������, �������ǹ̰� ����� ��ǰ�ε���~� �ǹ̵��� ����ִ��� ������ ���� Ȯ���Ͻ���!',null,null,null,'boxmovie@yahoo.com','MH004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','709','MH709','�ϳ��� ������ �־���. ���� ���縦 �ϴ°�, ���� �ʴ°�: ����� ����','https://www.youtube.com/embed/FP36I35bVD8','���� �������� �ɰ��ϴ� ���ο� �̽��͸�.
������ ������ ����.
������ ��, ����Ʈ ��ȭ�� ���ο� �ô븦 �������� ����.
����� �����Դϴ�.',null,null,null,'liner@hotmail.com','MH005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','710','MH710','�����..16�Ⱓ â�� ���� �ҳ��� ������� �ɷ�','https://www.youtube.com/embed/iqWa27gZzJ8','�������� : CJ�������θ�Ʈ
[������ ä�� ����� ����]
https://goo.gl/LrQJgy
[������ ����] https://goo.gl/4ETvXY
[���� �ν�Ÿ�׷�] https://www.instagram.com/awayout1/
[�ٸ� ��ȭ �Ұ� �ѷ�����]
https://goo.gl/78TM8K
[������ �Ŀ�] https://toon.at/donate/63667153356661...
[������ ���̹�TV]
http://tv.naver.com/gmovie
[������ ���̽���] https://www.facebook.com/pg/Gmoviee
[�̸���] awayout2@naver.com
�������� : CJ�������θ�Ʈ',null,null,null,'gmovie@hotmail.com','MH005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','711','MH711','����''�ϰ� ����� ��ȭ�� �󸶸��ΰ�? : ��ȭ ''�����'' ����','https://www.youtube.com/embed/eSZha-rpqLc','* �� ������ �����Ϸ��� �ټ� ���ԵǾ� �ֽ��ϴ� *
��ȭ�����ν�, �ʹ����� ��ڰ� �������� ��ȭ�Դϴ�.
��ȭ�� ���� ������ ���� �� �ִ� ��ȭ.
��ȭ�� ���ϸ�, ��� �� �� �ִ� ��ȭ.
��ǰ���� ȭ����. �� ���� �䳢�� ��� ���� ��ȭ�Դϴ�.
��� ������ �� �������� �ǰ��Դϴ�.',null,null,null,'aloneman@daum.net','MH005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','712','MH712','1% õ�� �������н� ���θ��� �̿��Ϸ��� ������ ���ϴ� FBI�� ������','https://www.youtube.com/embed/K04hYM7Oqbo','#�����ħ�� #��ȭ�Ұ� #�帲�ڷ�',null,null,null,'dreamteller@daum.net','MH006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','713','MH713','�ΰ��� ���ڱ⸦ ��� �Դ� ���Ű��ǻ�:����� ħ��[�ְ��� ��ȭ����]','https://www.youtube.com/embed/Y3DwaoHEV10','���� �������� ��� ����� ħ�� ������ �������� ������ �����ε� �׷� ������ ���� ����� ħ���� ���źе� ���� �����ź� �е� ��� ��� ������',null,null,null,'about@hotmail.com','MH006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','714','MH714','[J�� �����][��ȭ����][����� ħ��] ������θ��� ������� �� �ٸ� ������θ��� �̿��Ѵٸ�?','https://www.youtube.com/embed/O2BFk2iB0Xk','J�� ����� ,����° ����. ��ȭ ''����� ħ��''�Դϴ�.
10��° ����� �÷ȴ� ''���ͳ� ������''��.. ���۱��� ������ ���� �������� ���ҽ��ϴ�..(R.I.P)
�Ͽ� ������ �� ���� ��û�� ���Ҿ� 10��° �����
���� ������ ��հ� �þ��� ''����� ħ��''�� �����մϴ� :)
ȣ���� ������ ��ȭ�� ������ ���� ��ǰ�̶�� �ҷ��� ���� �������� ���� ������ �������� �����Դϴ�.
�ȼҴ� ȩŲ���� ��ĥ����(...) ���⸦ ��������� ��
������ ��ȭ�� �����Ͻô� �� �� ���� ���� �����̴ٸ� ��õ�帳�ϴ� :)
* �׻� ���� ��� �����ֽô� �������ִ� ����� �����մϴ� :) ��
���ͳ� ������ ������ ���������� �����̴ּ� �����
���� �����ϰ� �����ϰ� �ֽ��ϴ� :D
�� ä���� ��ٱ��̳� ��ٱ�, �ڱ���
�����ϰ� ��ȭ�� ��������� �е��� ���� ä�η� ����������ϴ� :) ������ �κ��� ������ ��̰� ���ֽð�, ������ ���� ��۷� ��Ź�帳�ϴ�. ��ۿ� ������� ��ȭ ���並 �����ֽø�, ���� ���並 ���鶧 ���������� �ݿ��ϰڽ��ϴ� :)
�������� ���ƿ�� ������ ������ ū ���� �˴ϴ�. �����մϴ�! :)',null,null,null,'mootiqj@gmail.com','MH006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','715','MH715','�ͽž��̵� ������ ������ȭ ���Ķ�븻 ��Ƽ��Ƽ��(��ȭ����,�ḻ����)','https://www.youtube.com/embed/nLHwU-V18x0','���� ���� ���� : yb1619@naver.com
��ȭ ''�Ķ�븻 ��Ƽ��Ƽ''�����ϴ�',null,null,null,'baebae@gmail.com','MH007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','716','MH716','�ͽ��� �ϳ��� �ȳ����µ� ������� ������ �е��ϴ� ��ȭ �ӿ�ȭ����Ӱḻ���Ԥӿ�ȭ�Ұ��ӿ�ȭ��õ','https://www.youtube.com/embed/t2AXLglzzME','��ȭ:�Ķ�븻 ��Ƽ��Ƽ 1��',null,null,null,'9movie@daum.net','MH007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','717','MH717','ī�޶�� �ɷ� ������ ������ �� �Ǵ� ���� [��ȭ���� �ḻ ����]','https://www.youtube.com/embed/9W3O_3g99yU','�Ķ�븻 ��Ƽ��Ƽ
��ȭ���� �ḻ ����
���� ��ȭ',null,null,null,'videobang@daum.net','MH007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','718','MH718','������ ������� ���񰡸��٤Ӻλ����(��ȭ����,�ḻ����)','https://www.youtube.com/embed/5B0Pb4Zj1SM','��ȭ ''�λ���'' �̾����ϴ�',null,null,null,'baebae@gmail.com','MH008',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','719','MH719','�ؿܿ��� ������ �λ����� ''������ �ǹ�''','https://www.youtube.com/embed/T0cxC1KpPNE','�λ��� �߸�������. ���� ��ȭġ�� ��ǰ�� �������� ���ƿ�.',null,null,null,'dreamteller@daum.net','MH008',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','720','MH720','�λ��� ���̵� ���� by �߾��»�','https://www.youtube.com/embed/inUoYMG3tYU','�� ���۷� �ḻ���� ������ �����Ϸ��� �����Ͻô� �е��� ��ż� �ݽ��ϴ�. ��ü �� �׷���? -_-;;; �ּ��� ���� �ָ��� ������ �ٽ� ���ڽ��ϴ� ��
�츮���� ���ʷ� ���� �����ϴ� ��Ϲ�������
�λ����� ���� ���� �ӿ��� �����߽��ϴ�.
�� �ѹ��� �õ� �ӿ��� � ����� �������?',null,null,null,'nofootbird@gmail.com','MH008',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','721','MH721','������ ������ ������ ���� (�ḻ����/�װ�)','https://www.youtube.com/embed/fSfYnWgN1eg','�ȳ��ϼ���! ��ȭ�� �о��ִ� ���� ���ϳ��Դϴ�.
��ȭ �װ�1 (2017)�Դϴ�.
9�� 4�Ͽ� �����ϴ� �װ� 2�� ���� ������ ���ε� �Ͽ�����
������� ������ �̹� ���� �Ϸ� �ڰ� �Ǿ��׿�.
�� ��ȭ �ó������� �ʿ� ���� �κ��� ���� �������.
���̰� �ٿ��� 28�� �Ʒ��� �پ������ �ʳ׿�Ф�
�� ���󸶴� ��� ����Ǿ��ְ� �ϳ��� �ڸ��� ��������
������ 28������ �״�� �ø���� �Ͽ����. ���� �׸��� ��ǻ�� ��� ��������, ���� ������ ƨ�ܼ�
�̹� ���� �������ǰ� �� ���ϴ�.
���� �۾����� �� �ð� ���� �ʼ� �� ƨ��� �����߳׿�..
��ǻ�� ��ǰ ��ü�� �ؾ� �� �� �����ϴ�.
�������� ������ ��۷� ���ܳ����Կ�! ���õ� ���ּż� ���� �����մϴ�.',null,null,null,'youngread@daum.net','MH009',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','722','MH722','���� ������ �����ּ���. ������ ������ ���� ��� : �װ�(IT) ���� - ���̳�','https://www.youtube.com/embed/R6B7UiiGGZ0','��Ƽ�� ŷ�� ����, �������� ȣ�� �Ҽ� �װ�(IT).
�������� ''���� �߿���''��� �������� �˷����� ����� ��ȭȭ!
7���� ���̵�, ���� Ŭ���� ���� ��׿��̽��� �����Ѵ�.
���� ��ȭ�� ǥ�������� ����ģ ���� �����ϰ� �ݺ��Ǵ� ������ ���� ��ȭ�μ��� �Է� �̴��� ��ǰ. �㳪 ���� ��󸶷δ� ���� �������ϴ�.
���̳��� ����� �Բ��ϼ���!',null,null,null,'liner@hotmail.com','MH009',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','723','MH723','������ �ϼ����� �Ĵٺ� �� ���� �Ǵ� ��ȭ (�ḻ����, ��������)','https://www.youtube.com/embed/UzxhgMnWWnM','������ ��ȭ����� '' ���� �߿���, �װ� (1990) '' �Դϴ�.
���� ������ �װ�2�� ���� ������ �Ҽ��� �������� �ϰ� ������
�ֱ� ������ ��ȭ�� � ������ ��� �� ������ ���� �׸��� �Ͱ�
�ٸ��� �� ��ȭ�� ���� ������ �׷����� ���� �λ����Դϴ�.
��û���ּż� �����մϴ�!
�װ� 2017 �ٽú���',null,null,null,'pause@daum.net','MH009',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','724','MH724','�ſﺸ�� �Ⱦ����� ��ȭ','https://www.youtube.com/embed/iw8MmUQPKKA','�� ����� ��ȭ�� �������� ���丮�� �ٷ�ϴ�.
��� ��õ�޾Ƽ� ����� �� ����
��ȭ ''��ŧ����'' ����
������� �׺�� ����Ͻó���? �׺��, ī�� ų���� �ֿ� ���ϸ� ���� �׸��� �߻��� ��� �귻ư ���������� ������ �þҴ�,
�̻��Ҷ� �� �ſ��� �츮 ������ �����߸��ٰ�?!
�Ⱦ� ���� �ٲܰž�!
�ſ��� ���� �Ⱦ����� ��ȭ
���ƿ� ����,�ǵ���� ū���� �˴ϴ�',null,null,null,'socheon@daum.net','MH010',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','725','MH725','�ð��� �Ʊ��� ���� �� ���� ������ȭ','https://www.youtube.com/embed/ZvY-Z3bVGs8','�� ���������ƿ䡤�չ��� ��������۷� ���幫�� �������ּ���! ��
�ڡ� ������ ���ε�, �� ���� �������� ã�ƺ˰ڽ��ϴ�!! �ڡ�
�� ���幫�� ä�� ����
https://www.youtube.com/channel/UCU8H...
�� ���幫�� �Ŀ� : https://toon.at/donate/63662086722297...
�Ŀ����ֽ� �ݾ��� �Ϻδ� �����ڴԵ���� ���� ���ӿ� ���Դϴ�.
�� �� ���� ��ȭ����! ���幫�� ���̽��� https://www.facebook.com/rleadmovie/',null,null,null,'read@gmail.com','MH010',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','726','MH726','�ͽ����� �´��� ��û�ؼ� ���и��� ������ȭ[��ȭ�Ұ�][��ȭ����]','https://www.youtube.com/embed/d9qRQ5bPQ4E','�ȳ��ϼ��� ��Ÿ�Դϴ�.
������ ��ȭ�� "��ŧ���� Oculus"�Դϴ�.
�ͽ��� ������ �ſ��� ���ŵ��� ������ ����ġ�� ��ȭ�Դϴ�.
�ε� ����ְ� �������� ���ڳ׿� ������
�׸��� ������ ���ƿ�� ����� ������ ū ���� �˴ϴ� (please)',null,null,null,'sunta@daum.net','MH010',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','727','MH727','�ٸ� ����� �̸����� ��ƿ� ����','https://www.youtube.com/embed/NtxrMQIiEyg','* �� ������ ��޻���� ���Ǹ� ��ġ�� ���ε� �Ǿ����ϴ�.
* ������ �簡�� �� ������� ���մϴ�.
�����ڸ�Ʈ�� ''���� ����''�� ���ƿԽ��ϴ�.
���� ��ȭ �� ���۵��� ��� �����ϰ�,
�����в� ��õ�ص帮���� �ϰڽ��ϴ�!
���� : ȭ�� (2012)
���� : ������',null,null,null,'aloneman@daum.net','MH011',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','728','MH728','���ۺ��� 1000��� �� ���� ��ȭ','https://www.youtube.com/embed/w-W7E55Yq5Y','#�˾��� #ȭ�� #������ #�����
* ���������� ������ ���� ��ȭ���
/ȭ��/ (Helpless, 2012) ���� ������ / ��� �̼��� ����� ������ * ��������
Kevin MacLeod�� Classic Horror 3��(��) Creative Commons Attribution ���̼���(https://creativecommons.org/licenses/... ���� ���̼����� �ο��˴ϴ�.
��ó: http://incompetech.com/music/royalty-...
��Ƽ��Ʈ: http://incompetech.com/
Kevin MacLeod�� Exotics��(��) Creative Commons Attribution ���̼���(https://creativecommons.org/licenses/... ���� ���̼����� �ο��˴ϴ�.
��ó: http://incompetech.com/music/royalty-...
��Ƽ��Ʈ: http://incompetech.com/',null,null,null,'egg@naver.com','MH011',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','729','MH729','�ްԼҿ��� ���ڱ� ����� ���� �ź�','https://www.youtube.com/embed/IQeeGXWZvOk','������� �ŵ鸰 ����!
����Ʈ �ִ� �ʹ� ��������
���尨 �ִ� ������ ����, �Ը������� �ḻ����...
���� ���� �����ϴ� �ѱ� ������ ��ȭ �� �ϳ���
��ȭ ȭ�� �Ұ��Դϴ�
#ȭ�� #��ȭȭ��
*��ȭ ����� ���� - https://youtu.be/lP8tWHZvjGw
��... �������� ��ȭ ���� �����ߴ��� ���� �� ������׿�
���������� ����� ���� ���� �ʴ� �����̼��Դϴ�
������ ����� �� �� �Ű�Ἥ �ϵ��� �ϰڽ��ϴ�
�ʱ׷��� ���� ��Ź�����',null,null,null,'hi@gmail.com','MH011',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','730','MH730','���ι��� ���˷� ������ �ϴ� ��ȣ��! �׷��� ���� ���ƿ´�!!','https://www.youtube.com/embed/sbEE4z_fXyQ','�ȳ��ϼ��� ''��ȭ�� ���ϴ�'' ��ȭ �����Դϴ�.
��ȭ : ���쵥���� (Seven Days, 2007)
���� : ���ſ�
�⿬ : ������, ��̼�, ����� ��
�ѱ� ��ȭ���� ���� ���� ������ ��ȭ�� �����ϴ�.
�߰���, �Ǹ��� ���Ҵ�. Ȳ��, ������ �߾� ���.
���� ���߿����� �� ��ȭ ���쵥��� �ְ��� �������� ���ϰ� �ͽ��ϴ�.
���� ������ �ǰ������� �׸�ŭ �ϼ��� ���� ��ȭ �Դϴ�. : )
�����е� ���ѹ� ���ñ� �ٶ��ϴ�.!',null,null,null,'murf@gmail.com','MH012',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','731','MH731','1000�� �� ������ �̻��� ����� ��ݹ��� �ѱ� ������ ��ȭ','https://www.youtube.com/embed/ARsP3vPfLbQ','���� �� ����Ʈ ddingzal@daum.net
�ν�Ÿ�׷� https://www.instagram.com/ddingzal/
���̽��� http://bitly.kr/xpu725
���� �Ŀ� https://toon.at/donate/63685659262999...
�����е��� ������ �Ŀ����� �� ���� �������� ����µ� �����ڽ��ϴ�
������ó - ��ȭ ''���쵥���� (2007)''
�ٿ�ε帵ũ https://www.youtube.com/embed/7vKwj...
*������ ���۱��� ��ȭ�� ��޻����� �ֽ��ϴ�',null,null,null,'ddingjal@hotmail.com','MH012',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','732','MH732','�� ���� �츮�� ���� 5���� ���ι��� ���˷� Ǯ������. ����� ������?','https://www.youtube.com/embed/dmu_XpEKbc8','#���쵥���� #��ȭ #������
�ȳ��ϼ���. ��ȭ���� �Դϴ�.
�̹��� �Ұ��� ��ȭ�� ''���� ������(Seven Days, 2007)'' �Դϴ�.
��Ʃ�� ���� ��ũ : https://www.youtube.com/embed/7vKwj...
������ ������ ��̴ٸ� ''����''�� ''���ƿ�'' ��Ź �帳�ϴ�.
��û�� �ּż� �������� ���� �帳�ϴ�.',null,null,null,'yap@daum.net','MH012',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','733','MH733','������ȭ�� �ְ���̶� �ҷȴ� ��ȭ','https://www.youtube.com/embed/qclfIfGT_es','��¥ ��ź�� �����Ѱ� �ƴ��� �ҹ��� �����ߴ� ��ȭ ''���ҽý�Ʈ'' �Ұ� �����Դϴ�.
������ ''������ ������Ų'' �Դϴ�.
*�ٿ�ε� ��ũ
https://movie.naver.com/movie/bi/mi/d...
*�� ���� ���� �ڷ� ��ó ǥ��
Georges Biard�� Max von Sydow Cannes 2016.jpg��(��) Creative Commons Attribution ���̼���(https://creativecommons.org/licenses/... ���� ���̼����� �ο��˴ϴ�.
��ó: https://commons.wikimedia.org/wiki/Fi...
Elen Nivrae�� William Friedkin.jpg��(��) Creative Commons Attribution ���̼���(https://creativecommons.org/licenses/... ���� ���̼����� �ο��˴ϴ�.
��ó: https://ko.wikipedia.org/wiki/%ED%8C%...
Kevin MacLeod�� Aftermath - Madness Paranoia��(��) Creative Commons Attribution ���̼���(https://creativecommons.org/licenses/... ���� ���̼����� �ο��˴ϴ�.
��ó: http://incompetech.com/music/royalty-...
��Ƽ��Ʈ: http://incompetech.com/
Kevin MacLeod�� Comfortable Mystery 4 - Film Noire��(��) Creative Commons Attribution ���̼���(https://creativecommons.org/licenses/... ���� ���̼����� �ο��˴ϴ�.
��ó: http://incompetech.com/music/royalty-...
��Ƽ��Ʈ: http://incompetech.com/',null,null,null,'screen@daum.net','MH013',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','734','MH734','�� �� ����� ������ �𸣴� ����� ���� ��ȭ','https://www.youtube.com/embed/-8Mc9DhBpvY','����� ���ڱ� �Ǹ��� �ҳ��� �� ������ ���Եǰ�,
�׷� �Ǹ��� ���Ѵ� ���ҽ����� �����ϴ�
�ź��� ����� ���� ��ȭ ���ҽý�Ʈ1 �Դϴ�.
https://series.naver.com/tvstore/deta...
���� ��ũ�� ��ȭ ���ҽý�Ʈ1�� ���� �� �ֽ��ϴ�.
(������ ���� 5,000�� / �뿩 1,300��)
������ ��������̴ٸ�
���ƿ�� ������ư �ѹ��� ��Ź����� ^^
������ �� ����ִ� �������� ã�ƺ˰ڽ��ϴ�!',null,null,null,'gogomovie@gmail.com','MH013',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','735','MH735','��ȭ���� �������� ���帶��� ����� �ٷ� �� ��ȭ (�ḻ����)','https://www.youtube.com/embed/TVWHvlS40Jw','���� �� ����Ʈ ddingzal@daum.net
�ν�Ÿ�׷� https://www.instagram.com/ddingzal/
���̽��� http://bitly.kr/xpu725
���� �Ŀ� https://toon.at/donate/63685659262999...
�����е��� ������ �Ŀ����� �� ���� �������� ����µ� �����ڽ��ϴ�
������ó - ��ȭ ''���ҽý�Ʈ (1973)''
�ٿ�ε帵ũ http://bitly.kr/3R2m7m
*������ ���۱��� ��ȭ�� ��޻����� �ֽ��ϴ�',null,null,null,'ddingjal@hotmail.com','MH013',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','736','MH736','�˰� �־ �Ӵ� �ְ��� ������ȭ','https://www.youtube.com/embed/vYyYzHMs57g','* �� ������ �����Ϸ��� �ټ� ���ԵǾ� �ֽ��ϴ� *
���ۿ�ȭ ���� �� �뿩 : (���ε峯¥)
#1 : (1,000 ��)
https://nstore.naver.com/movie/detail...
������ �ѹ��� ������ ''�ְ��� �����Ϸ� ����''�� "0000�� �����̴�."
�� �̾߱Ⱑ ����ִ� �ְ��� ���� ��ȭ�� ���� �ֽ��ϴ�!
���� ��ȭ�� ������, ���� ���� ��ȭ�� ���°� �� ��ȭ�̸�
���� ������, �ɸ� ������ �帣�� �����̱⵵ ����!
�� ��ȭ�� ���� �ʰ���, ������ ���ϸ� �ȵȴٴ� ���� �ֽ��ϴ�!
�ְ��� ������ȭ! ����, �� ��ȭ �����?
���並 �ϸ鼭 �ֿ� ���� �ḻ�� �� �������� �� ��ȭ�� ��û�غ��ñ� �ٶ��ϴ�! - ''�����ڸ�Ʈ''�� ��Ʃ�꿡�� ���ε� �˴ϴ�.
��ȭ���� : ���־� ������Ʈ (1995)',null,null,null,'aloneman@daum.net','MH014',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','737','MH737','���������ԡ��� ���� ���� ���� �𸣴� ������� ������ ������ �ƴ� ��ȭ','https://www.youtube.com/embed/O9hraotEZKA','��ȭ : ���־� ������Ʈ (The Usual Suspects , 1995)
�帣 : ����, ������, �̽��͸� �������� ������(SUBSCRIBE)
��https://www.youtube.com/c/����BlackDuc...
#��ȭ#�ḻ����#��������',null,null,null,'duc@daum.net','MH014',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','738','MH738','���� ���� ��ȭ�� ��ž [�ḻ����]','https://www.youtube.com/embed/zht5yGQSKRc','���� : ���־� ������Ʈ (1995�� ��ǰ)',null,null,null,'ezip@daum.net','MH014',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','739','MH739','[��������] �� ������ ������ ���ƸԴ� ��ȭ! 28����','https://www.youtube.com/embed/gAN3Dd9Y5Ic','-������õ������ ������ ������ �������Դϴ�. ������ ���� ���ּ���-
28���� ������õ����: 9/10
�������: 2/10
������: 7/10
������: 28���ĸ� �մ� ���� ����. ���ۿ� ���� �� �� �Ѵ� ���ۺ�� ���Ÿ��� �� ��������. 2���� ��մ°��� ���� �幮�� ���������� 28���İ� ���� �� ��� �ִµ� �ϴ�. 28�����Ĵ� �� ������ �ʴ°��ϱ�?
�̾� 28���ĵ� ����̾�. ���� �������� �� ������ص� ���� 28�� �ĺ��� �����ϵ� Ŀ�� ���������� 28���İ� ���� �� ��վ����. �׸��� ������ ����ž����� 28�����ĸ� �м�����ϱ⿣ ����� ����̾���. �ƴ� 28������ ��´ٴ� �ҹ��� �ְ� �� ����°ž�? �ٵ� ī���ν��� ����� 28������ ������ ��������? ���� �̰ɷ� 700�� �Ѱ� �����ݾ�. �� ������~!! 28�����ĸ� ���źҸ� ��ٸ��� �����̾����ϴ�.',null,null,null,'9bul@gmail.com','MH015',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','740','MH740','�ѳ����� �Ǽ������� �η��� ����ϴ� ��ȭ(�߾ϰ���)','https://www.youtube.com/embed/OXLziUWw-ys','��ȭ 28����(2007) �Դϴ�.
�� �������� �� ���۱� �������� ���۱� ������ �޾ҽ��ϴ�.',null,null,null,'drunk@hotmail.com','MH015',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','741','MH741','28�� �� ���� [��?]','https://www.youtube.com/embed/oMnPKilwka0','���ο� ���� Ŭ���� ��ȭ, 28�� ���� ���� 28�� �� �����Դϴ�.
�ڼ��� ��ȭ �Ұ��� ''�߸�'' ä�ο��� �Բ��ϼ���.
�߸Ǳ��� : https://goo.gl/iNZoB6
�߸� ''28�� ��'' �Ұ� : https://goo.gl/AaSqud
���� - �ľ� ī���ν� ������������
�⿬ - �ι�Ʈ Į����, ���� ��, ������ ����, �طѵ� �丮��, �̵帮�� ����
���� - 28�� ��
������ SNS �ȷο� ���ֽð�, ���ƿ�, ������ ���� ������!!
���� ���̽��� : http://goo.gl/rwzblg
���� �ν�Ÿ�׷� : http://goo.gl/KnPLRC
���� ��í : https://goo.gl/jijXIC
�Կ���� : ��Ʃ��� �ϱ��õ (����Ư���� ���빮�� 37-42 ����1��)
���̽��� : https://www.facebook.com/1vs1000Studio/
���ô±� : https://goo.gl/maps/qij1UiY7npr
.
.
.
.
.
.
.
�� ���ΰ� �ǰ��� �ٸ��ٸ�, ���ظ� ���ϰڴٸ�, ������ ���ϰڴٸ� �ٸ��� �������� ���ϰ� ''�ú�'', ''��Ƴ�'', ''�ΰ� ��''����� �ٽô� �е��� �ֽ��ϴ�.
�г�������ֿ� ���������� ġ�ᰡ ������ �����Դϴ�.
����� ����Ҹ� ã�� ���ͳ��ߵ�ġ�� �� �г��������ġ��, ���Ƿ°������ġ�� � ���� ����� �޾ƺ��ñ� �ٶ��ϴ�.
�������� ������ ���ϴ�.
�� ��ȭ �ǰ� �� �ΰ��� ���ϴ� ������ �� ��Ƽ� ���̹������� �����ϰ� �ֽ��ϴ�.
�����մϴ�.',null,null,null,'unjun@naver.com','MH015',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','742','MH742','[��û��������] ����Ÿ������! ����������! �����Z','https://www.youtube.com/embed/JT3ZdVLPGug','����Ź! ��ȭ������մ� �������� �����Դϴ�. ������ 28�ø�� �����ϸ鼭 �����ϼ̴� ���� �� ������̴ϴ�. �ƴ� ���� ��Ʃ�� ù �������� ����ȭ ���� ������ �߾��µ� �����Z�� 10�� ������ 6�� ��ٰ� ���� ������ �Ծ����.���� �׷��� ���� �����غ��ϱ� �λ��ຸ�� �����Z�� �ξ� ��վ����� ����.. ��ư ����ȭ ������ ������ ������ �� �������� �������� ������� �Ű��. ������ ��û�ںе� �ǰ��� ���� �׿��� �̰� ���� �ٽ� �����ϰ� �ֽ��ϴ�. �ƴ� ��� �� ��⸦ �Ϸ��°� �ƴϾ��µ� �ݴ��� �������� ��û�� �ֽ� �����Z! ���� �����Z
20���⿡�� ���� �ɾ�� ���� �־����� 21���Ⱑ �Ǹ鼭 �ٴ� ����, ���� ���� �����ް� �Ǿ����ϴ�. ������ �䷱�� ó������? ���� Ÿ��ö󰡴� ����! �ű�ٰ� �����ϵ� ���� �����Z �Ѳ��� �ѹ� ������� �ϰڽ��ϴ�.
�� ��ȭ�� ��¥ ��վ��µ� ���ڱ� �������� Ȯ ���� ������ �־�����. ��H���� �������ֽ� ���� ����帳�ϴ�. �� �������� �� ���ƸԾ�������.. ���� ���� ������..
�ٵ� �̷��� ����� ������ �����Z�� 2��޷��� ���۵Ǿ� 5�� 3õ�� �޷��� �������ϴ�. �׷��� 2017�⿡ 2���� �����ϱ�� �߾��µ� ��? �̷����� 2019�� ������������ ���ֳ׿�. �ƴ� ���� ��ȥ �Ҽ����̾�����..! �� ���� ���Ȱ�� �� �𸣰����� ��ȭ�� �� ��������..!
�� �ٵ� �����ΰ� 1���� ���� �������ϱ� 2���� ����� ���ɼ��� ���� ���ۻ� ��ġ�� �Ⱥ��� ���� �� ������ ���ٴ� ��븦 �غ��ϴ�. ���ุ �ȴٸ� 3���۱��� ��ȹ�ϰ� �ִٴ� �����Z �ø���. ����ȭ�� �����ϽŴٸ� ���� �Բ� ���� ���������� ������ �о�� ���� ����? ���� ���� ������Ʈ �̺�ó�� ������ �ʰ���..? ��ư ��û ���Ǵ°� ��ǿ���. ���⿡ �ΰ��ô�~! �̻� ��ȭ���� ��մ� �������� �����̾����ϴ�. ������ �������?!',null,null,null,'9bul@gmail.com','MH016',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','743','MH743','[��ȭ����/�ḻ����] ������� ����� ���� ��ư��� �����','https://www.youtube.com/embed/51IiZdV-ME4','* �� ������ �����Ϸ��� �ḻ�� ���� �Ǿ��ֽ��ϴ� ��ȭ : �����Z (World War Z, 2013)
���� ����ְ� ���̴ٸ� ���� / ���ƿ� / ��� ��Ź�帳�ϴ�!
�� ���� ������ ���� �Ұ��� �����ϰڽ��ϴ� ^^',null,null,null,'mix@gmail.com','MH016',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','744','MH744','�λ��� ���� ��Դ� 10�и��� ���� ''�����Z'' (World War Z, 2013)','https://www.youtube.com/embed/gPEwtJuo31g','���丮 ������ �ڸ����ּ���~ ������� �θ��־� �����Z ���丮�� 7�������� ����� �����Դϴ�. 2017�⿡ �����Z 2 �� ���ÿ����ε� ������ ���� �����ϼ���~',null,null,null,'2ddudae@gmail.com','MH016',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','745','MH745','����� ����Ʈ���� ���� ���´ٸ�? (�ḻ����/R.E.C)','https://www.youtube.com/embed/o_OgOjuvXwc','�ȳ��ϼ���!! ��ȭ�� �о��ִ� ���� ���ϳ��Դϴ�.
R.E.C (2007)�Դϴ�.
���������� ����������, R.E.C 4������ 1,2,4,3 ������ ������ �����Դϴ�.
���õ� ���ּż� �������� �����մϴ�.',null,null,null,'youngread@daum.net','MH017',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','746','MH746','��¼�� 1��Ī ����ȭ (����,�ڸ���)','https://www.youtube.com/embed/D6lZFbYhDl8','���� ����ְԺ� ��ȭ�����ϴ�. ��ȸ�� �ȴٸ� �ļ������ε� ã�ƿ��ڽ��ϴ�!
������,��û�ںе� �׻� ����帳�ϴ�. ����ѹ� ��������^_^',null,null,null,'hongcinema@gmail.com','MH017',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','747','MH747','����� �Բ� ����Ʈ�� �������� ������ | REC | ����,���� | ųŸ(ų��Ÿ��) | ��ȭ��õ','https://www.youtube.com/embed/ajQH8CwhHHc','R.E.C �������� ( ���̹� ��ȭ )
https://nstore.naver.com/movie/detail...
- R.E.C -
���� : 2007 ( ���� 2008 )
�帣 : ����,�����潺,�̽��׸�
���� : �Ͽ�� �߶�Է�,���� �ö���
�⿬ : �������� ������, ��� �����, ���� ��
���ƿ� & ������ ū ���� �˴ϴ�^^
��ȭ,�ִ�,��ȭ,��� ��~���� ������ �Ұ�,����,��õ�� �帮�� ä��! �����е��� �ð��� ������ ����ϰڽ��ϴ�! ųŸ(ų��Ÿ��) ���� ��� ��Ź�帳�ϴ٢�
��Ʈ��,�ƿ�Ʈ�� BGM : Adagio for summer wind',null,null,null,'killtarian131@yahoo.com','MH017',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','748','MH748','�տ� �� ���� ��, ���ư� �� ���� ( ������Ʈ ) ���丮+�ؼ���','https://www.youtube.com/embed/8Uv7hSif9SM','19��° ��ȭ ���� (������Ʈ 2004) ���丮+�ؼ����Դϴ�. 17�� 27�� ���ķ� �����Ϸ��� ���ԵǾ� ������ �������ּ���. ���ƿ�(��õ) ��ư�� �����ֽø� �� ���� �е��� �����Ͻ� �� �ְ�,
������ �Ͻø� �˶�������� ���� �� ���ϰ� ���� �� �ֽ��ϴ�.
��ȭ ������Ʈ�� ���õ� ���� ��û ��������.
�׷��� �̹� ���並 ������Ʈ�� ��Ҵµ�... ��...
�� �̾߱Ⱑ �ʹ� ���Ƽ� ���̰� �ٿ��µ��� �з��� �ʹ� ���ƿ�
���̾߱⸦ ��� ã�ƺ��� ���ϱ�
��ȭ���� ���̾߱Ⱑ �� �볪�⵵ �ϰ� ������
��ư, ���������� �е��� �ѹ��� ���ŵ� ������ ��ȭ �����ϴ�.
p.s ��۷� ���� ��ȭ���� �����û�� �־��µ�,
�׿�ȭ���� �� ����� ����°� �ð��� �Ұ����ϱ⿡.....
�̹��� ���߿��� "gkdl9164 1234"�԰� "������"���� ��õ���ֽ� ��ȭ�� �����߽��ϴ�.',null,null,null,'riukun@gmail.com','MH018',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','749','MH749','������ ���� ���� 9���� ����','https://www.youtube.com/embed/-N_zRQa2bzY','��ȭ ������Ʈ(R-Point) ���� �Դϴ�.
�ȳ��ϼ��� �޸��Դϴ�.
2004�⿡ ���� ��ȭ���� ���ݱ����� �ѱ� ���� ��ȭ���� �������� �ղ�����
��ȭ ������Ʈ ���� �Դϴ�.
���� ������ �κ��� �����ϴ�.
���� ���ø鼭 ����� �κ��̳� �Ž����� �κ�
�������� �ϴ� �κ��� ������ ��۷� �˷��ּ���!
���� ���� ���鶧 �����Ͽ�
�� ���� �������� �����ϰڽ��ϴ�.
��հ� ���ð� ���ƿ�, ����, ��� ��Ź�帳�ϴ�.
�����մϴ�.',null,null,null,'jjummer@hotmail.com','MH018',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','750','MH750','[�� ����Ʈ] �տ� �� ���� ��, ���� ���ư� �� ����','https://www.youtube.com/embed/pbYQZNq6yuo','#�˾��� #������Ʈ #���켺
* ���������� ������ ���� ��ȭ��� /�� ����Ʈ/ (R-Point, 2004) ���� ����â / ��� ���켺, �պ�ȣ, �ڿ���
* �˾��� ��Ʃ�� �����ϱ� https://www.youtube.com/c/rcine
* �˾��� ���̹�TV http://tv.naver.com/rcine * ���� ���̽��� https://www.facebook.com/rcine2017/',null,null,null,'egg@naver.com','MH018',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','751','MH751','���񼼻� �Ϻ��� ������ ���ڤ����񷣵��(��ȭ����,�ḻ����)','https://www.youtube.com/embed/jcK4jxiYMWU','�ҷ��� ����Ư���� ���񷣵�� �������� ����߽��ϴ�
�������� ������ȭ�� �غ����?
���Ǹ��� : yb1619@naver.com
''���񷣵�'' ��ȭ �������� : https://www.youtube.com/embed/e40jR...',null,null,null,'baebae@gmail.com','MH019',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','752','MH752','(�ḻ����) �̱��� ���ι����� ���񰡵Ǿ���� ����..? [���񷣵�/ �����Ѹ���]','https://www.youtube.com/embed/CHMovBPhtUo','�ؿ�������� ���� ����ε��
�̹� ��ȭ�� �纥 �÷��̼Ű����� ��ȭ ''���񷣵�(2009)''�Դϴ�.
�ڹ̵� ��ȭ�̸�, ������̷��� �ӿ��� ��Ƴ��� �����ڵ���
�̾߱⸦ �ٷ� �����Դϴ�.
��󷣵��� ''��������''�� �Ҽȳ�Ʈ��ũ�� ''���� ����������'' �� �⿬�Ͽ� ��ȭ�� ����Ƽ�� �ش�ȭ �����־����ϴ�. ������ ���� �ٸ� 4���� �����ڵ��� ��� ���񷣵�� ���� ��Ƴ�����, ��ȭ�� ���� ���������� :)
�׷� ��ȭ ��հ� ���ñ���, ���� �����Ҵٸ�
���ƿ䢾�����ϱ⢾�˶������� ��Ź�帱�Կ�. ������ ����� �̴ϴ� :)',null,null,null,'realtrue@hotmail.com','MH019',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','753','MH753','���񷣵�� ������Ģ(���񷣵� ����)','https://www.youtube.com/embed/Z4Iarv3ePFE','��ȭ [���񷣵�] �� �ٰŸ� ��� �� ���俵���Դϴ�. ���� �����Ϸ��� ���ԵǾ������� ��û�Ͻ� �� �������ֽñ� �ٶ��ϴ�',null,null,null,'lak@hotmail.com','MH019',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','754','MH754','���񿡰� ������ �� ����(�ḻ����/���������̴�)','https://www.youtube.com/embed/cKJFWkpWA7Y','�ȳ��ϼ���! ��ȭ�� �о��ִ� ���� ���ϳ��Դϴ�.
��ȭ ���������̴�(2007)�Դϴ�
���� ���� �ḻ�� ������ �ḻ�̸�, �Ʒ��� �Ϲ� �ḻ ��ũ�Դϴ�.
https://youtu.be/ADd25gYsHg0 �׻� �������ֽô� �е� ���� ����帳�ϴ�.
#�ḻ���� #��ȭ���� #��ȭ��õ #���ϳ�',null,null,null,'youngread@daum.net','MH020',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','755','MH755','���񼼻󿡼� ������ �� ����','https://www.youtube.com/embed/V6c-LCv3M9E','������ �Ǿ���� �ѳ����� �̾߱�. �� ������ �ǹ̿� ������ ��¡����Ƽ��. ''���� �����̴�''-2007
��ȭ����� ���Ӹ��並 ���� ���Ǽ� �ִ� ä���Դϴ�! ������ ������ �װ��� �����δ�
�ƹ�ŸTV : http://www.avatatv.co.kr/broadcast/ha...
��۽ð� : ȭ,��,�� 10��~12��
��Ʃ�� ī���԰� �Բ� ''��ī''TV�� ��ȭ��ũ� �����մϴ�~ Ʈ��ġ TV : https://www.twitch.tv/hamlet0529',null,null,null,'hamlet_movies@gmail.com','MH020',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','756','MH756','���񿡰� ������ ����� �Ͼ�� ��','https://www.youtube.com/embed/Z2lt9fECA14','-���� �����̴� (I Am Legend, 2007)
��ȭ �Ұ�
�ḻ ����',null,null,null,'dopan@daum.net','MH020',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','757','MR757','���� �����ߴ� ���ڿ� ���� ���ڸ� ��Ͱ� ���� ����','https://www.youtube.com/embed/ibhDnPZWG7w','"������ ���ƿ�'' �� ū ���� �˴ϴ�.
''������ ���''��ȭ�� ������ �ּ���^^
#��ȭ���� #��ȭ�Ұ� #��ȭ��õ #���극�� #ĸƾ���
��â���� �����ߴ� ���л����� ����� ��鵵 �� �ذ� ���� ����.
����: �̿��� ����
��ȭ: ���극��(1995)
Love Letter
��HD�� ��ȭ��1080p��û �ϼ���
���Ŀ��ϱ�: https://goo.gl/Z71XAp
������ �Ǹ���: http://www.gmz.co.kr/
��Ʈ��ġTV: https://goo.gl/SNTYhu
�ڱ����ϱ�: https://goo.gl/pSFlvS
"',null,null,null,'captainrami@gmail.com','MR001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','758','MR758','�ٽ� ���� ���� ���극��','https://www.youtube.com/embed/CnzzLQhe36I','"���� �е��� �ܿ￡ �� ���ø��� ��ȭ �� �ϳ���
���극�Ͱ� �� ���� �� �簳���߽��ϴ�.
���� �� �߷�Ÿ�� ���̳׿�."',null,null,null,'nofootbird@gmail.com','MR001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','759','MR759','[���극��] ''������''���� ������� ���� ����(Love Letter Review)','https://www.youtube.com/embed/Y6GHIPwfebM','��Ʃ�� ���� �� https://goo.gl/iqEvvp ���� ����� �׸����ϸ� �� ����, �׸��� �׿��Լ� �� ����. �̵��� �����ϰ� �ִ� �� ������ � �翬�� �ִ� �ɱ��? �ܿ��̸� �������� ��ȭ ''���극��''! �̹� �ð��� ''���극��''�� ������ ����, ��ȭ�� ���� ��� �̾߱⸦ �غ��ڽ��ϴ�. 1:00 �� REPLAY - ''���극��'' �ٽú��� 3:12 �� Scne by Scne#1 ''�Ϻ� ���''�� ���� 4:20 �� Scne by Scne#2 Ÿ�� ���� 5:53 �� Scne by Scne#3 ''������''���� ������� ���� ���� 6:59 �� Scne by Scne#4 ''���극��''',null,null,null,'senimapia@gmail.com','MR001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','760','MR760','���� ���������ϴ� - ��ȭ�� ����� ��� ǥ���ұ�','https://www.youtube.com/embed/1IozJwzdVNw','��ȭ ����, ���������ϴٸ� ���� ��ȭ�� �� ����� ǥ���ϴ� ����� �˾ƺ��� �����Դϴ�
*�뷡
Kevin MacLeod�� Continue Life��(��) Creative Commons Attribution ���̼���(https://creativecommons.org/licenses/... ���� ���̼����� �ο��˴ϴ�.
��ó: http://incompetech.com/music/royalty-...
��Ƽ��Ʈ: http://incompetech.com/
Audionautix�� 5 Cents Back��(��) Creative Commons Attribution ���̼���(https://creativecommons.org/licenses/... ���� ���̼����� �ο��˴ϴ�.
��Ƽ��Ʈ: http://audionautix.com/
���� ������ ���ϴ� ost - �ð��� �Ѿ
*���� ������ ���ϴ� ����� �ؼ�',null,null,null,'mypopcorntree@yahoo.com','MR002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','761','MR761','1�� �� ���� �Ƴ��� ���ƿ��� �������� ��','https://www.youtube.com/embed/T-elyBDpcBw','"[ ����, ������ ���ϴ� ]
���� : 2005.03.25.(�ѱ� ����)
�帣 : ���/�θǽ�, ���
���� : ���� �������
�⿬ : Ÿī���� �õ�[���̿� Ÿ��� ��], ������ ��ī��[���̿� ������ ��], ���ɿ�ġ ���� [���̿� �̿� ��], ��� : 12�� ������
�����ߴٸ� ���ƿ� & ����!
�����ϼ̴ٸ� �Ⱦ�� & ����� ��! �����ּ���"',null,null,null,'whiteraccoon@hotmail.com','MR002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','762','MR762','[����, ������ ���ϴ�] ���� ������ ���ƿ´ٴ� �׳�(���ޡ�?���˪檭�ު�)','https://www.youtube.com/embed/-3ITJiDNwSY','��Ʃ�� ���� �� https://goo.gl/iqEvvp ���� �ϳ����� ����� ''����, ������ ���ϴ�'' ���� ������ ���ƿ´ٴ� ����� ����� ���� ''�̿�(���ɿ�ġ ����)''���� � ���� �־��� �ɱ��? �׳�� ��, �׸��� ��� ���� ������ ���ƿ´ٴ� �ɱ��?',null,null,null,'senimapia@gmail.com','MR002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','763','MR763','��ٿ� Ÿ�� - �� ��ȭ�� ù����� �̷������ �ʴ� ����','https://www.youtube.com/embed/OVOuf25FQAo','"*����Ʈ�� ä�� �Ŀ�
https://www.patreon.com/popcorntree
��ȭ ��ٿ� Ÿ�� �ؼ� �����Դϴ�.
��ȭ�� ������ �����غ��� ù��� ���԰� ���ΰ��� �̷������ �ʴ� ������ �����غ� �� �ֽ��ϴ�.
"',null,null,null,'mypopcorntree@yahoo.com','MR003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','764','MR764','����� ��� ���� ������ ���� �� ��ȭ ??','https://www.youtube.com/embed/BwPaqTHyITc','"#��ٿ� Ÿ�� #����� #��ȭ��õ
�� ��ȭ, ��ٿ� Ÿ��(2013) ��
����̰� ��õ�ϴ� ������ ��ȭ�Դϴ�.
?���� ��̷ο� ��ȭ�� ������. ?
������ ���ε� �Ǵ� ������ �޾ƺ����� ^.^*"',null,null,null,'mimi@naver.com','MR003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','765','MR765','�ð��� �̵��ϴ� �ʴɷ����� ��','https://www.youtube.com/embed/ixY7k9wQjFU','��ȭ [��ٿ� Ÿ��]�� �ٰŸ� ��� �� ���� �����Դϴ�. �����Ϸ��� ���ԵǾ������� ���� ��Ź�帳�ϴ�. �����մϴ�.',null,null,null,'sogaenam@naver.com','MR003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','766','MR766','�����̰� �̳ฦ ���ôµ� ������ ����','https://www.youtube.com/embed/3tiXE3MfiJU','"��ȭ ''��ٿ� Ÿ��''(2013),
���ϻ��� ���� �ϻ��� �������� ���ϴ� ��ٿ� Ÿ���Դϴ�"',null,null,null,'tunachamchi@yahoo.com','MR003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','767','MR767','����� �𸣰��ִ� ���� "���ͳ� ������"�� ��е�','https://www.youtube.com/embed/HVJRRNEOSYU','"#���ͳ� ������ #��ȭ #��ȭ����
BBC ���� 21���� ���� ������ ��ȭ 6���� ������ ��ȭ ""���ͳ� ������!""
���� ������� �λ� ��ȭ��� �θ��� �� ��ȭ���� ��ü � ����� �������������?
�Բ� �˾ƺ���!
? ����ְ� ���̴ٸ� ���ƿ�� ���� ��Ź�帱�Կ� ?
"',null,null,null,'heatherturning@gmail.com','MR004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','768','MR768','�ΰ��� ����� �����ϴ� ����','https://www.youtube.com/embed/vMz1z9rrMCg','��ȭ [���ͳ� ������] ���丮�ڸ� �����Դϴ�.
�����մϴ�.',null,null,null,'sogaenam@naver.com','MR004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','769','MR769','���ͳ� �����ο��� �� ��ü�� ���ñ�?','https://www.youtube.com/embed/kOLzoecSxT8','���� 10�ֳ��� ������ ���� ������ ����� �޴� ���ͳ� ������. ��ο�ȭ�̸鼭�� �Ӹ� ���� ������ ������ �� ���Ҵ� ��ȭ��. ���� ö���� ��ü���� ������ �ϴϱ��. ������ ��ο�ȭ�� �� ��ü�� ����������? �簳�� ���, �̶�� �������, �������� �����ϰ� ���ͳ� �������� �ٽú��� �غý��ϴ�.',null,null,null,'freeman@gmail.com','MR004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','770','MR770','��󷣵� ���� ���ƽ��ϴ�. ������ ��ȭ�Դϴ� �� ������!','https://www.youtube.com/embed/ygSGTugLB-k','"���÷����� ���̾� ������ ����, ���̾� ����, ���� ������ �Ƹ��ٿ� ������ ��ȭ ��󷣵� �����Դϴ�. ������ ��ȭ�� �Ⱦ��ϴ� ���� �ƴ϶�� �� ������! Ŀ���� �ǰ�ʹٸ� �� ������! ���÷��ÿ� ���� �ٸ� ������ ��ȭ ��󷣵�� ���� ���ƽ��ϴ�. ������̰� ���� ��õ�ϴ� ������ ��ȭ�Դϴ�!
��ȭ ������ ũ�������� ��������� ���� �����ϱ�!
����, ���ƿ�, ���, ������ ������ ���� �˴ϴ�!
������ ������� ä���� ��û���ּż� �����մϴ�!
[������� ä����?]
������̴� ��ȭ ����, ��ȭ��� �̾߱�, ��ȭ �̺�Ʈ�� ��ȭ �ҽ��� �����ϸ� DC �ڹͽ��� ���� �ڹͽ� �� �ڹͽ� ��� ��ȭ �̾߱�� ������ ����� ����ְ� �������ִ� ä���Դϴ�. ��ȭ�� ���ؼ� �ñ��� ���̳� ����ִ� ��ȭ ������, ���̵� �ִٸ� �������� ��Ʃ��� SNS�� ��� �����ּ���!
�������: Owl''s Reviews ��� - �������
"',null,null,null,'reviewang@gmail.com','MR005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','771','MR771','��󷣵� ���̵� ���� by �߾��»�','https://www.youtube.com/embed/PecN-cKUjVA','"��󷣵�� ���÷����� ������ ��̾� ���� ������ �������� ��밡 ���ҽ��ϴ�. ���ÿ� ���� ������ �帣�� ���ߴٰ� �ؼ� ������ �Ǵ� ��ȭ�Դϴ�. ���� �ִ� ¡ũ�� �����̾��µ�, ���� ����� ������?
��������� �Ʒ��� �����ϴ�.
Another Day of Sun
Someone in the Crowd
Planetarium
��� ��󷣵� OST�� �ֽ��ϴ�.
"',null,null,null,'nofootbird@gmail.com','MR005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','772','MR772','��� �������� ���� �Ĵ� �������� ����� �λ� ��ȭ�� �Ҹ��� ����: ��󷣵�','https://www.youtube.com/embed/gHeAg105C7g','���� ������� �λ� ��ǰ. �ް� ������� ���� á�� �׳��� ���. ���̳��� ��ȭ �μ����� �� �� ��° ��ǰ. ������ �ʿ���� ��ȭ. ��󷣵��Դϴ�.',null,null,null,'liner@hotmail.com','MR005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','773','MR773','������ �˷����� ����, ''��󷣵�''�� ���� 6���� ��̷ο� �̾߱� [õ���̽±�]','https://www.youtube.com/embed/meEs5w2D-gc','"���۷κ꿡�� ���� 7�����̶�� ����� ���� ��ȭ
��󷣵�!
��ȭ�� ���� ��̷ο� �̾߱� 6������ �����߽��ϴ�.
������ �̾߱�� ���̵� �ٷ�ô°� ���Ƽ� ������ �� �˷����� ���� ��ǵ�� �غ��߽��ϴ�.
õ���̽±��� �����ϰ� �� ���� ������ ����������!^^"',null,null,null,'genius@gmail.com','MR005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','774','MR774','������ �Ӹ����� ���� �� �ִ� ����','https://www.youtube.com/embed/tLxyYxJcnpM','"#�� ���� ��Ʈ #�帲�ڷ� #��ȭ�Ұ�
"',null,null,null,'dreamteller@daum.net','MR006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','775','MR775','��� ������ �Ӹ����� ���� �� �ִ� ������ ����','https://www.youtube.com/embed/euNhUsofQAM','"��ȭ
��������: ���ø���"',null,null,null,'fallinfilm@hotmail.com','MR006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','776','MR776','������ �Ӹ����� �д� �ʴɷ��� ����� �������� ��','https://www.youtube.com/embed/-gqLDufcDnU','"�ȳ��ϼ���! ��ž�湫���Դϴ�.
�̹��� �Ұ��ص帱 ��ȭ�� ���� ���� ��Ʈ(2000)����� ��ȭ�Դϴ�.
���� ���� ��Ʈ�� ��ȭ��
��������������� ���� �������̶� ���ΰ���
������ �Ӹ����� �д� ������ �ɷ��� ����鼭
�Ͼ�� ��̳� ���Ǽҵ���� �ٷ�� �ֽ��ϴ٤���
�ڽ��� ���� ������ۡ��� ǥ���ΰ� ������
������ ����� �����ϴ� ���̶��,
�� 2�ð�¥�� Ǯ������ ���ñ� ��õ�帳�ϴ�!!
�� 8:09 ���ʹ� ��ȭ�� ���� ���� ª�� ���䰡 ���Ϳ�!
�� 9:24 ���ʹ� ��ž�湫�� ������ ����Ʈ��&��õ���Դϴ�! (���׷� ����)
- ��õ�� : Harry Connick Jr. - Close To You
- ���� : Carpenters - Close To You
- ���� ��� ����ver. : Olivia Ong - Close To You
- ��õ���� : C?dia e Dan - Close To You
https://youtube.com/embed/Lx0PdecHzZw
�� ��Ʃ�꿵ȭ ���� ���� ��Ʈ(2000)�� ��������! https://youtube.com/embed/SHEmofL0uyM
���õ� ���Ͻñ� �ٶ��ϴ٢�?
������ ���ƿ� ��Ź�����?
�����մϴ�!!
#��ȭ #�θǽ��ڹ̵� #�� ���� ��Ʈ"',null,null,null,'tophome@gmail.com','MR006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','777','MR777','����� ����� �ȵǴ� ����. ����ϴ� ����� �ؾ���� �� �ֽ��ϴ�!','https://www.youtube.com/embed/vYjuueP195c','"�ȳ��ϼ��� ""��ȭ ��ȯ��""�Դϴ�.
ó�� ������ �����ؼ� ���� ���������� ������ ���� ������ ������
����Ƽ �ִ� ������ �����ڽ��ϴ�.
���� �Ұ��ϴ� ��ȭ�� �� �Ӹ����� ���찳�Դϴ�.
���� �θǽ� ��ȭ�ϸ� �� ��ȭ���� ���� �������ϴ�.
������ �� Ȥ�ö� ���� ���� ���� �е��� ��ôٸ� �� �� ������
��û�ϱ� ��õ�帳�ϴ�.
������ �� ���� �Ŀ� ������ ���ƿ� ��Ź�帳�ϴ�.
�����մϴ�.
-�� �Ӹ����� ���찳 (2004)
"',null,null,null,'shong@hotmail.com','MR007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','778','MR778','�� �Ӹ� ���� ���찳 (A Moment to Remember) | ��ȭ����','https://www.youtube.com/embed/jE_qDA_UAZc','"�� �Ӹ� ���� ���찳 (A Moment to Remember) | ��ȭ���� | ��ȭ�Ұ� | ��ȭ��õ
�θǽ�/���/���/�ѱ�
(����) ������ (�ֿ�) ���켺, �տ���"',null,null,null,'uxxmovie@daum.net','MR007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','779','MR779','�̰� ���ø� �츮 ��ʹ� �Ŵ�','https://www.youtube.com/embed/M5YFl8ST380','#��𰡼� #��������� #���д� �ȳ��ϼ��� ��ȭ �� �Ӹ� ���� ���찳 �Դϴ�',null,null,null,'lemong@hotmail.com','MR007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','780','MR780','�츮 �� �ʰ� �����ٷ�? [������] �����а��� | ���� | ������ | �Ѱ��� | ���¿� | ù���','https://www.youtube.com/embed/lUzfsEe3vo4','"�� ���� ''ù���''���� �ٽ� ���� �غ� �Ǽ̳���?
"',null,null,null,'mupmup@hotmail.com','MR008',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','781','MR781','������ ���Ի��� �� ���� ���ڸ� �븮�� ������ ����','https://www.youtube.com/embed/P0bjFRTviZQ','"#��ȭ���� #��ȭ�Ұ� #���ʵ��翵
���� �Ұ��ص帱 ��ȭ�� #�����а��� �Դϴ�.
�� ���ʵ� �翵 ���� http://bitly.kr/3QlxZ
�� ���� ���� cheerupjaeyoung@gmail.com
�� �ν�Ÿ�׷� https://www.instagram.com/cheerupjaey...
�� ���� ���ƿ並 �����ֽø� ���� ū ���� �˴ϴ�!"',null,null,null,'jy@gmail.com','MR008',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','782','MR782','���ڰ� �����ϴ� �θǽ� ��ȭ : ���� ��ȥ�� ����','https://www.youtube.com/embed/Nm4tRCmJrUc','* �� ������ �����Ϸ��� �ټ� ���ԵǾ� �ֽ��ϴ� * 8�� 27��, ���� �� ������ ���� �� ��ȭ�Դϴ�. �ѱ��� �θǽ��� �� ����� ������ ������ ���� �ֽ��ϴ�. ������ �������� ������� ��������, �׷��� ���ο� ������� �̾����� ����. �� ��ȭ, ''���� ��ȥ��''�� �׷��鿡�� �� Ī���Ҹ��� ��ȭ�Դϴ�. �������� ��ſ� ����, �Ϻ��� �������� ĳ������ ����. �ٹҾ��� �ḻ�� �� �׷��� ����� ���� ���������� ���ϰ� �ְŵ��. ''�����а���''���� �Ѵܰ� �����ߴ� �ѱ��� �θǽ���, �� ��ȭ ''���� ��ȥ��''���� �� �Ѵܰ� ����� �ö����ϴ�. �� ���󿡴� ��ȭ�� ġ������ �����Ϸ��� ���ԵǾ� ������, ��ȭ ���� ���� ���ô� ���� �������ּ���. ���並 �ϸ鼭 �ֿ� ���� �ḻ�� �� �������� �� ��ȭ�� ��û�غ��ñ� �ٶ��ϴ�! - ''�����ڸ�Ʈ''�� ��Ʃ�꿡�� ���ε� �˴ϴ�. ��ȭ���� : ���� ��ȥ�� (2018) #���� ��ȥ�� #�ں��� #�迵�� #��ȭ��õ #��ȭ���� #��ȭ�ı� #��ȭ��Ʃ�� #��ȭ��Ҹ� #����泲�� #��ȭ�Ұ� #�θǽ���ȭ #���ۿ�ȭ #���۸��� #�����ȭ #��â�����θǽ� #�ִ��� #���̸���',null,null,null,'aloneman@daum.net','MR008',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','783','MR783','�ɰ��� �̱� ����ɿ��� �� ���̸� ��Ÿ�� ��ȭ(�ɰ�?����)','https://www.youtube.com/embed/-ePsZQeJ8SI','"����''�ϰ� ''�˸�''������ �صθ� ��մ� �ֽ� ������� ���� ���� �� �� �ֽ��ϴ�. ''��õ''�� ������ ���ۿ� ū ���� �˴ϴ�^^
#ĸƾ��� #��ȭ�Ұ� #��ȭ����
��ȭ: ���� �����
"',null,null,null,'captainrami@gmail.com','MR009',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','784','MR784','���� �ְ� �Ƿ����� ���ڸ� ���ϸ� �������� ��','https://www.youtube.com/embed/U6baCFHQNyQ','"��ȭ [ ���꿢���] ���丮�ڸ� ���俵���Դϴ�.
�׸��� ��ȭ ���� ����󸮷� ���� �����ϰ� ������ �е��� ���ð��ǵ� �ִٰ� �ϴ�, �Ʒ� ��ũ �����ϼ���! ^^"',null,null,null,'sogaenam@naver.com','MR009',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','785','MR785','�˰� ���� �� ����ִ� ���� ����󸮿� ���� �̾߱�','https://www.youtube.com/embed/uPN1GgrTIio','"2003�� ������
""���� �����"" �Դϴ�.
ũ���������� ���ƿ��� ��ȭ ���� ����󸮿� ���� Ʈ����Ƹ� � ��ƺý��ϴ�!"',null,null,null,'gamemaster88@gmail.com','MR009',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','786','MR786','�� ���ڿ��� ���� �ð� �۾��� �� ����','https://www.youtube.com/embed/qz8w3Zt7pmU','"�� ����� ��ȭ�� �������� ���丮�� �ٷ�ϴ�.
�ð��̶�� ����� ������ �ŷ�������
��ȭ ''�ð��������� �Ƴ�'' ����
���� �ٳ��� � ��, ����ÿ �ƾƴ㽺����.. Ŭ��� �þҽ��ϴ�. �����ϴ�.
����� ������ �ڸ��� ������ Ŭ����, �ڱ⸦ �ƴµ��� �׳� ������ ��Ȳ�ϴ� �, �̵鿡�Դ� ���� �翬�� �ִ� �ɱ��?
�ð��� �ֵѸ��� ����� ��� ���� �ɷ���
���ƿ� ����,�ǵ���� ū���� �˴ϴ�
"',null,null,null,'socheon@daum.net','MR010',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','787','MR787','[�ð� �������� �Ƴ�] ��ȭ �� �ð��� �ǹ�(The Time Travler''s Wife: Meaning of The Time)','https://www.youtube.com/embed/9tRVYvzOtDQ','"�ð� �������� �Ƴ�''���� �ð��� �ǹ̴�?
�����̼��� Janice�� �þ��ּ̳׿�:-)
''�ð� �������� �Ƴ�''�� �簳���߽��ϴ�!
�ð��� �ʿ��� �� ���,
���� �ٳ��� ����ÿ �ƾƴ㽺��
�������� ����� ''�ð�''�� �����ϰ� �Ƹ�����. �̹� �ó� ����Ÿ�ֿ�����
��ȭ �ӿ��� ''�ð�''�� �ǹ��ϴ� ��,
�׸��� ''�ð� �������� �Ƴ�''����
��Ư�� �ð����� ���� �̾߱� �غ��� �մϴ�."',null,null,null,'senimapia@gmail.com','MR010',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','788','MR788','�ð��̵� �ɷ��ڰ� ���ŷ� ���ư� �� ��','https://www.youtube.com/embed/PElcWi9G1to','"��ȭ [�ð��������� �Ƴ�] �Ұ������Դϴ�.
�����Ϸ��� ���ԵǾ������� ��û�ϽǶ� �������ֽñ� �ٶ�ڽ��ϴ�.
�����մϴ�."',null,null,null,'sogaenam@naver.com','MR010',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','789','MR789','������ �������� �ູ(����)�� �ɸ� ������ �λ�/���ڹ� ��ư/�ð��� �Ųٷ� ����/��õ��ȭ','https://www.youtube.com/embed/xjPq_v_vzXA','"��ȭ ''���ڹ� ��ư�� �ð��� �Ųٷ� ����
(The Curious Case Of Benjamin Button, 2008)'' �Դϴ�.
���ΰ��� ������ �Ųٷ� ������, �ð��� �Ųٷ� �� �� ���ٴ� ���� ��ȭ�� ����Ʈ�� �ƴұ� �����մϴ�. �׸��� ���� ���õ��� ����ȿ���� �� ����� �ٲپ� ���� �� �ΰ��� �ϴ�⸦ ����� ��ȭ��� �� �� �ֽ��ϴ�.
���� ��������. ��հ� ���̴ٸ� ���ƿ� ��ư, ��Ź �帳�ϴ�^^
"',null,null,null,'filmcasterian99@hotmail.com','MR011',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','790','MR790','���̸������� �ڲ� ���� �������� ������ �λ�','https://www.youtube.com/embed/fr7CHx68TVw','#��ȭ�Ұ� #��ȭ���� #û���� ���ڹ� ��ư�� �ð��� �Ųٷ� ���� (2008) 1918�� ��1�� ���� ���� �� ���ø�����. 80���� �ܸ� ���� �系 ���̰� �¾��. ���� �̸��� ���ڹ� ��ư. �θ𿡰� ������ ��ο����� ���ε�� �Բ� ������ �״� �ð��� �������� �������ٴ� ���� �˰� �ȴ�. 12���� �Ǿ� 60���� �ܸ� ������ �� �״� ��� �� 6�� �ҳ� �������� ���� �� �׳��� Ǫ�� �����ڸ� ���� ���ϰ� �ȴ�. û���� �Ǿ� �������� ���� ���ڹ��� ���డ �� �������� ���� ������ ������� �ݺ��ϴ� ��μ� ���� ����� ������ �ȴ�. ������ ���ڹ��� ������ �������� �������� ���� �ľ�µ���',null,null,null,'whereiam@gmail.com','MR011',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','791','MR791','���̸� �������� �������� ����','https://www.youtube.com/embed/Ba6QSTWqmbY','���ڹ� ��ư�� ������� ���� �����ϰ� �����ϴ� ��ȭ ���ڹ� ��ư�� �ð��� �Ųٷ� �����Դϴ�.',null,null,null,'dreamteller@daum.net','MR011',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','792','MR792','80�� �������� �¾ �������� ���� [�ḻ����]','https://www.youtube.com/embed/Ybuo7sQ1Z-w','"���� : ���ڹ� ��ư�� �ð��� �Ųٷ� ����
(2008�� ��ǰ)"',null,null,null,'ezip@daum.net','MR011',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','793','MR793','���ڵ鸸�� ���������� ù��� ��Ÿ��: ���� ��ȥ�� ���� - ���̳�','https://www.youtube.com/embed/sUZTAxfBJdA','"�� ���� û��, �ں����� �迵���� �ٽ� ���� ��ǰ.
�������� ������ ���, �θǽ� ��ȭ. ���� ��ȥ�� �����Դϴ�.
���� ������ �Ʒ��� ù����� �߾�. �׸��� ���ֿ� �̺�, ��ȥ.
�� ��� �̾߱⸦ ������� ���� ��𼱰� �� �� ���� ����?
Ŭ���η� ������ �ƽ��� ��ǰ.
���� ��ȥ�� �����Դϴ�.
"',null,null,null,'liner@hotmail.com','MR012',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','794','MR794','���ڰ� �����ϴ� �θǽ� ��ȭ : ���� ��ȥ�� ����','https://www.youtube.com/embed/Nm4tRCmJrUc','"* �� ������ �����Ϸ��� �ټ� ���ԵǾ� �ֽ��ϴ� *
8�� 27��, ���� �� ������ ���� �� ��ȭ�Դϴ�.
�ѱ��� �θǽ��� �� ����� ������ ������ ���� �ֽ��ϴ�. ������ �������� ������� ��������, �׷��� ���ο� ������� �̾����� ����. �� ��ȭ, ''���� ��ȥ��''�� �׷��鿡�� �� Ī���Ҹ��� ��ȭ�Դϴ�.
�������� ��ſ� ����, �Ϻ��� �������� ĳ������ ����. �ٹҾ��� �ḻ�� �� �׷��� ����� ���� ���������� ���ϰ� �ְŵ��.
''�����а���''���� �Ѵܰ� �����ߴ� �ѱ��� �θǽ���, �� ��ȭ ''���� ��ȥ��''���� �� �Ѵܰ� ����� �ö����ϴ�.
�� ���󿡴� ��ȭ�� ġ������ �����Ϸ��� ���ԵǾ� ������, ��ȭ ���� ���� ���ô� ���� �������ּ���.
���並 �ϸ鼭 �ֿ� ���� �ḻ�� �� �������� �� ��ȭ�� ��û�غ��ñ� �ٶ��ϴ�! - ''�����ڸ�Ʈ''�� ��Ʃ�꿡�� ���ε� �˴ϴ�.
��ȭ���� : ���� ��ȥ�� (2018)
#���� ��ȥ�� #�ں��� #�迵��
#��ȭ��õ #��ȭ���� #��ȭ�ı� #��ȭ��Ʃ��
#��ȭ��Ҹ� #����泲�� #��ȭ�Ұ� #�θǽ���ȭ #���ۿ�ȭ #���۸��� #�����ȭ
#��â�����θǽ� #�ִ��� #���̸���
���� BGM
- A_Quiet_Thought
- bensound-sadday
Music by BENSOUND http://www.bensound.com/royalty-free-...
Creative Commons ? Attribution 3.0 Unported? CC BY 3.0 http://creativecommons.org/licenses/b...
Music promoted by Audio Library https://youtube.com/embed/HJdLhIvC3JI"',null,null,null,'aloneman@daum.net','MR012',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','795','MR795','���� ��ȥ�� ���̵� ���� by �߾��»�','https://www.youtube.com/embed/vUvc1xrO3Jg','"���� ������� �ʾҴ� ���� ��ȥ���� ������ �̷� �ѱ���ȭ�� �ִٴ� ����� �ϱ����ֳ׿�. ���װ� ������ ���� ���İ� ��� �󸶵��� ������ ������ �︱ �� �ִٴ� �� �����ִ� ��ȭ�����ϴ�.
by �߾��»�"',null,null,null,'nofootbird@gmail.com','MR012',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','796','MR796','�������� ������ �θǽ� ��ȭ [���� ��ȥ��]','https://www.youtube.com/embed/9kl2U-Rqlcg','"#�ȼǿ��� #���� ��ȥ�� #�ں���
�ȼǿ���, ����� �̾߱�� �������� ����
������ �޾��� ���� ���� �̾߱�. �̺��� �Ⱦ����� �ϴ� ��ġ�� ����. �� ����� �︮�� �߾��� ������ �λ��� ����� ������ �����ִ� ��ȭ [���� ��ȥ��]"',null,null,null,'fictionworld24@hotmail.com','MR012',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','797','MR797','�ڰ� �Ͼ�� ���� �ٲ�� ����ģ��','https://www.youtube.com/embed/zo7Ne3LY_3c','"#��Ƽ �� ���̵� #��ȭ��õ
"',null,null,null,'dreamteller@daum.net','MR013',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','798','MR798','[��Ƽ �λ��̵�] ''��Ƽ �λ��̵�''�� ������ �� ���� ����','https://www.youtube.com/embed/b097S7TFEWM','"��� ''��Ƽ �λ��̵�''�� �濵�� �����߽��ϴ�.
��� ������ ��ȭ�� �־��µ���.
�ó׸��Ǿƿ����� ������ ����� �濵�� �¾�
������ �ٷ�� ������ �������غý��ϴ�.
�����ϰ� ���� ������ ���� ����
''��Ƽ �λ��̵�'' ���� �����մϴ�!"',null,null,null,'senimapia@gmail.com','MR013',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','799','MR799','[��Ƽ �λ��̵�] ����� �𸣴� ������ ���','https://www.youtube.com/embed/E_h27X4dvGE','"�� �ḻ�� ������ ������ ������ �˷��帳�ϴ�.
���� �ν�Ÿ�׷�: https://www.instagram.com/cine.youngmin
���⿡ �ɷ� ������ �����ֽ��ϴ�....
��Ƽ �λ��̵� (The Beauty Inside, 2015)
����: ������
�⿬: ��ȿ��, �̵���, �ڽ���, ������, ������, ������ ��
�� ����
1. Kevin Macleod - In your arms 2. ������Ʈ - �ƺ� ������
�� Reference
DVD �ڸ��͸�, ���ͺ�, ���
#��Ƽ �� ���̵� #��ȿ�� #�����ϴ�"',null,null,null,'youngmin@daum.net','MR013',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','800','MR800','�ְ��� ������ ��п��ָ� �Ѵٸ�?','https://www.youtube.com/embed/HO7doRR8NQA','"* �� ������ �����Ϸ��� �ټ� ���ԵǾ� �ֽ��ϴ� *
���ۿ�ȭ ���� �� �뿩 : #1 : http://nstore.naver.com/tvstore/detai...
���� ���� ����.
�� �������� �� ���ϱ� ��ȸ�Ǵ� ��ȭ, �������Դϴ�.
1999�����̶�� ���� �ϱ��� ���� ��ŭ�� ��̰� ����ֽ��ϴ�.
����� ���ؼ� �� ��⸦ ���� �ϴ°�? ��� ������ ���� �ִ� ��ȭ�Դϴ�.
��! ���ñ� �ٷ���!
���並 �ϸ鼭 �ֿ� ���� �ḻ�� �� �������� �� ��ȭ�� ��û�غ��ñ� �ٶ��ϴ�! - ''�����ڸ�Ʈ''�� ��Ʃ�꿡�� ���ε� �˴ϴ�.
"',null,null,null,'aloneman@daum.net','MR014',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','801','MR801','����� ������ ��ſ���...','https://www.youtube.com/embed/XCawEZ4_DwU','"#�������ͽ� #���г� #��Ʃ���о��ִ³��� #JordanPeterson #������ #�ٸ��Ʒι��� #�ޱ׷�Ʈ
references
Notting Hill (1999, British)
2017 Maps of Meaning 09 Patterns of Symbolic Representation
Julia Roberts & Dermot Mulroney Answer the Web''s Most Searched Questions WIRED
Hugh Grant Breaks Down His Most Iconic Characters GQ
[*��ó - ��������� Sangeo Of Music]
������ Notting Hill OST She Piano cover �ǾƳ� Ŀ��
(https://www.youtube.com/watch?v=evyLK...)
River Flows in You - �̷縶 Yiruma Piano cover �ǾƳ� Ŀ��
(https://www.youtube.com/watch?v=zVu51...)
���� COCO OST : Remember Me | Piano cover �ǾƳ� Ŀ��
(https://www.youtube.com/watch?v=fUYbu...)
�ð��� �Ѿ? - ���� ������ ���ϴ� OST �ǾƳ� Ver"',null,null,null,'youtuberead@daum.net','MR014',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','802','MR802','���� 170�� ���� ����찡 ��� ���� �����ϸ� ���� ����(�ḻ����)','https://www.youtube.com/embed/qK-61CZXM1Y','"1999�� �� ������ �Դϴ�.
�θǽ� ��ȭ�� ����ϴ� ���̶�� �𸣴� ���� ���� �����Դϴ�.
�ռ� ������ ''����� ��� ���̿�'' ��ŭ�̳� �����ϸ�, ������ ��ȭ�Դϴ�.
���ݿ� �ͼ��� �ι��� ���� ���� ��������,
��� ''�Ϳ��� ����''���� ������ �츮�� �ι����� �θǽ���ȭ��
���ݺ��Ƶ� ���� �������� �ʴ� ��ȭ���Դϴ�.
�� �׷�Ʈ ���� ���ݱ����� ���� ����޴� ����Դϴ�.
�� ������ �ʿ����, �ְ��� �θǽ� ��ȭ,
''������''
����ġ�� ������ ��õ�մϴ�"',null,null,null,'moviedochi@yahoo.com','MR014',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','803','MR803','�� �տ��� ���� �׳డ ���ƿ� �� �Ϸ� - ��ȭ [���� �¸�] (if only, 2004)','https://www.youtube.com/embed/2o8wiphuQNc','"*�� ������ �����Ϸ��� �����ϰ� �ֽ��ϴ�!
���� - �� ���� �ֿ� - ������ ��������, �� ���ݽ�
��ȸ�� ������ �Ϸ簡 ���ƿ´ٸ�?
���� �е��� �λ���ȭ�� �� �Ŵ� ��ο�ȭ ���� �¸� �����Դϴ�.
ó�� ������ �����̶� ������ ���� ������ ��̰� ���ּ���~!
"',null,null,null,'everyview@naver.com','MR015',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','804','MR804','��Ƶ��ƿ� �׳ฦ �� �� �ִ� �Ϸ��� �ð��� �־����ٸ� (�ḻ����)','https://www.youtube.com/embed/vRBcDFhcDrM','"���� �¸� (2004)
��Ʃ�꿵ȭ : https://www.youtube.com/results?searc...
���ۿ�ȭ : https://play.google.com/store/search?...
���̹���ȭ : https://series.naver.com/search/searc...
���� ��ȭ ���� �ø��Կ�
������ ���ƿ� ��Ź�帳�ϴ�^^ #��ȭ���� #���� �¸� #�ḻ����"',null,null,null,'noboty@gmail.com','MR015',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','805','MR805','����ϴ� ����� �˷��� ����...�׸��� �� �Ϸ��� �ð�','https://www.youtube.com/embed/oxKI_qreyEo','"����: ���� �¸�, 2004
����: �� ����
�⿬: ������ ���� ����(�縸��), �� ���ݽ�(�̾�)...
�ٰŸ�: ����ϴ� ���ο� ���Ͽ� ǥ���� ���� �� ���ڰ� ���� �׳ฦ �Ұ� �����Ѵ�. �׷��� ������ ��ħ �׳డ ������ ������ �ڰ� �ִµ�...
#���� #��ȭ���� #��ȭ�Ұ� #��ȭ��õ"',null,null,null,'younglove@daum.net','MR015',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','806','MR806','���ڱ� ���Ÿ��� ������ �峭�� ������ �ʴ� ����','https://www.youtube.com/embed/PLc_WOI7ElE','"* �� ������ �����Ϸ��� �ټ� ���ԵǾ� �ֽ��ϴ� *
��õ�� ���� ���ϰ� �� ��ȭ, �� ���� �� �Դϴ�.
2016�������� ���� �ٷ� ��ȭ�߿� ���� �����̳׿�!
������ ���صдٴ� ���ſ� ������
�θǽ���� �Ƹ��ٿ� �̾߱�� Ǯ� ��ȭ�Դϴ�.
���Ӵϴ� ��� ��ȭ������ �ϰ� �� �� �ֳ׿�.
�����մϴ�!! ���ۿ�ȭ�� ��! ��û�Ͻñ� �ٶ��ϴ�.
- ''�����ڸ�Ʈ''�� ��Ʃ�꿡�� ���ε� �˴ϴ�.
"',null,null,null,'aloneman@daum.net','MR016',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','807','MR807','�� ���� �� - ���� ��ȭ�� ��� �� ���� by �߾��»�','https://www.youtube.com/embed/VYX15u7gkpc','"���и��� Ŭ��ũ�� �� Ŭ���ø��� �ֿ��� �� ���� ���� ���� �𿹽��� �Ҽ��� �����Դϴ�. ���� ���� �����̰� ���� �߿��� ���ϴٰ� ����� �� ��ȭ�� ���� �� ������ ���߽��ϴ�.
by �߾��»�"',null,null,null,'nofootbird@gmail.com','MR016',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','808','MR808','���� ����ģ���� �ΰ� ���ڰ� �ȶ��縦 ������ ���� [�̺�����]','https://www.youtube.com/embed/q_HfSiOSDDQ','"#�̺����� #�θ�ƽ��ȭ #���ۼҼ�
���ٰ� ��ٰ�"',null,null,null,'byebye@gmail.com','MR016',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','809','MR809','��� �� �� ���ڸ� ����� ���� (��ȭ ��Ʈ��)','https://www.youtube.com/embed/KvEDW7Dre4k','"* �� ������ �����Ϸ��� �ټ� ���ԵǾ� �ֽ��ϴ� *
�̷������� �����߰�
��Ժ��� ��Ÿ����� ���ϰ��� ���
�׷��� �� ����� �� ������� �ٶ󺸴� ��.
�����ұ��?
�η������ �� �Ϻ��� ����̾߱�
��ȭ ��Ʈ��(2004)�� ���� �����Դϴ�.
���� ��ȭ�� ���ô� ���� ������ ��õ�帳�ϴ�.
���� �غ��ϰ� ������ �ѳ�����
- ''�����ڸ�Ʈ''�� ��Ʃ�꿡�� ���ε� �˴ϴ�.
"',null,null,null,'aloneman@daum.net','MR017',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','810','MR810','���� �λ���ȭ ��õ #2. ��Ʈ��(Notebook) ���� ���� ? �� �̻�Ŀ�� ?','https://www.youtube.com/embed/C9gv2ffzN-k','"���̾� ������ ����ÿ �ƾƴ㽺 �ֿ��� ��ȭ ��Ʈ���� �Ұ��մϴ�. ���� �λ���ȭ ��_�� �ʹ� ���ƿ�! ?Music Days Like These by LAKEY INSPIRED https://soundcloud.com/lakeyinspired Creative Commons ? Attribution-ShareAlike 3.0 Unported ? CC BY-SA 3.0 http://creativecommons.org/licenses/b... Music promoted by Audio Library https://youtube.com/embed/joGCrgfYrP4
?Blog ���� ���� ������ ������ �ö���� �̻�Ŀ���� ��α� http://blog.naver.com/isangcouple
?�̻�Ŀ�� ��������� ���� ��� ������� ���� �����Ѵ١�
���� ������ ã�� �����ϰ� �־��. �Բ� ����ϸ� �����ϴ� �κ��Դϴ٢� [ â�� �� �⿬ ]"',null,null,null,'esangcouple@daum.net','MR017',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','811','MR811','�θǽ� ��õ ��ȭ - ���� ���ۿ� ���� �� ������ �ŷ�(��Ʈ��)','https://www.youtube.com/embed/xJGUdFZvug0','"��ȭ ���� : ��Ʈ�� (The Notebook, 2004) �� �� : ���/�θǽ�, ���
�� �� : �� ī�纣�� �ֿ� ��� : ���̾� ����(Ryan Gosling)
����ÿ �ƾƴ㽺(Rachel McAdams)
���� Ÿ�� : 123��
�� �� : 15�� ������
#��Ʈ�� #��ο�ȭ #�θǽ���ȭ"',null,null,null,'bear@gmail.com','MR017',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','812','MR812','ȣ��ȣ�� Ȯ���մϴ�. �ŷµ� Ȯ���մϴ�. ��ȭ [�峭���� Ű��] ����','https://www.youtube.com/embed/zl6rJ0x0qIY','�� ��ȭ�� [�峭���� Ű��]�� ������ũ��� �ͺ��ٴ� �մ�� ��찡 ���´ٴ� ���� ���� �ָ���� ��ȭ�� �ƴұ� �ͽ��ϴ�. �ű⿡ [���� �ҳ�ô�]�� ����, �븸 �θǽ��� ����� �˸� ����Ű æ ������ ��ǰ�Դϴ�. �׳డ �����ִ� �� ���������� ��� �̾߱Ⱑ �ñ������� ��ǰ�Դϴ�.
���, �� ��ȭ�� ���丮�� ���������� �����غ��� ����� ���������� ��ȭ�Դϴ�. ���� �����ϴ� �������� �ڱ� �濡 ���� ���� �󱼷� ���踦 �س��ٰ� �ϸ� ����? �׷� ���� ��������, ��� ���� ��Ȳ�� �ƴմϴ�. �׷���, �� ��ȭ�� ĳ���ʹ� ����ŷ ���� �ൿ�� �����ݴϴ�. �׷���, �� ��ȭ�� ���� �е��� �ƽð�����, ����� ��Ÿ������ ��ȭ�Դϴ�. ���� �������� �л��� ����ϴ� ����� ���鼭 ���� ����� �Ѵٴ� ���� ���ǿ����� ���� �� �Ǵ� ��Ȳ�Դϴ�. �� ��ȭ�� ����� ���� �ټ��� ������ �ִ� ��ȭ�Դϴ�. ����ĥ �� �ֱ� ������ ȣ��ȣ�� ����� ���� ������ �����˴ϴ�.
�׷����� �� ��ȭ�� ����� �ŷ����� ���� ����Դϴ�. ���� �մ�� ��츦 �����ϴ� ���̰�, �븸 �θǽ� ��ȭ ����� �����մϴ�. Ư��, �л� �θǽ� ��ȭ�� �����մϴ�. ������ ���� �� ��ȭ�� ��հ� �ý��ϴ�. �κ������� �ǹ� ���� �׳� �þ����� �κ��� ���� ���̱� ������, ���� �����ϰ� ������ ��ġ�� ������ ���� ��ȭ�� ���鼭 Ȱ���� ��� ���� �� ���ҽ��ϴ�. �� Ȱ���� ���ϴٰ� ������ �� �ֽ��ϴ�. ���׶��� ��ȭ �� �� ���ô� �е��� ���� ����� ���� �ֽ��ϴ�.
���������δ� �� ��ȭ���� ���� �ָ��ؾ� �� ���� �����ȼ�ģ���� ������ ���� ����Դϴ�. ���鼭, ����� ������ϴ�. �ֱ� [ö������]���� �ϸ��� �̳��� ��찡 ���ſ� ������ �߶��� ĳ���� ���⸦ ��������ϴ�. ĳ���� ��ü�� ����� ������������, ������ �̷� ����� ���� �� ���ٰ� ������ �� ������ ����� ���� ���⸦ ��������ϴ�. [�峭���� Ű��]�� ���� ���� �׿� ���ݰ��� ���⸦ ��������ϴ�. Ư��, �׳��� ���� ���п� ��뿪���� �մ���� ĳ���Ͱ� ���� ��Ƴ����ϴ�. �մ���� ���� ��븦 ������ �� ��ȭ���� �������� ������ ���Խ��ϴ�. ',null,null,null,'ddaddasi@hotmail.com','MR018',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','813','MR813','�ܸ�, �γ� ��� �� �Ϻ��� ���л����� ����� �����','https://www.youtube.com/embed/v8hweopVvZ4','���� ��ó: ��ȭ�� ���� #�峭���� Ű��#�մ��#����',null,null,null,'moviekok@yahoo.com','MR018',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','814','MR814','ȣ��ȣ�� Ȯ���մϴ� �ŷµ� Ȯ���մϴ� ��ȭ �峭���� Ű�� ����','https://www.youtube.com/embed/kBl_aADzxW4','"�� �������� ����
�ڼ��� �˾ƺ���
�뷡
Maimunar
��Ƽ��Ʈ
Iskrata
YouTube ���̼��� ������
MonteMusicRecords(Monte Music ����)
"',null,null,null,'tetris024@gmail.com','MR018',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','815','MR815','���� ���ڸ����� �ͽŰ��� �� ������ �÷��ִ� �̼ҳ� ���л�','https://www.youtube.com/embed/AiR1ByYKOWg','"�ȳ��ϼ���, �̵黷�Դϴ�.
���� ������ ��ǰ�� ''�� ����, �츮�� �����ߴ� �ҳ� (You Are the Apple of My Eye, 2011)'' �Դϴ�.
"',null,null,null,'middle@hotmail.com','MR019',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','816','MR816','ù����� ����1���̸� �Ͼ�� ��','https://www.youtube.com/embed/WbvTjSi8S-8','�ȳ��ϼ��� ��ȭ �� ���� �츮�� �����ߴ� �ҳ� �Դϴ�',null,null,null,'lemong@hotmail.com','MR019',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','817','MR817','������ ���� ���� ù�����ȭ','https://www.youtube.com/embed/bIdKbIUqzn0','"��ȭ [�� ����, �츮�� �����ߴ� �ҳ�]�� �Ұ������Դϴ�.
ū �����Ϸ��� ����, ��� ���� �����մϴ�.
��ε� ��̰� ���ֽñ� �ٶ��ϴ�!"',null,null,null,'sogaenam@naver.com','MR019',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','818','MR818','[��ȭ����/�ḻ����] �� ����, �츮�� ù��� - ������ȭ��ȭ (�� ����, �츮�� �����ߴ� �ҳ�) �븸��ȭ','https://www.youtube.com/embed/1rYM3y3SYyI','"�ȳ��ϼ��� ���� ���� �������Դϴ�^^
������ �츮�� �ɹڼ��� �� �� �÷��ָ� �� ����� �ߴ� ù���~
�� �Ʒ��ϰ� �Ƹ��ٿ� �߾� �� ������ ���ǹ��� �������ϴ�
��ȭ���鼭 � ������ �߾� ������
�ϳ��� ������ �� �ִ� �ð��̾��� �� ���ƿ�
�������� �� ���� �����ߴ�
�츮 ù����� ���÷� �����ϴ�
��ȭ �� ���� �츮�� �����ߴ� �ҳ��Դϴ�
�޴��ϸ鼭�� �Խη��� ���� ���� �� �ִ�
�������� ���������� �� ���Ǳ��~
���� �������̴ٸ� ������ ���ƿ�� ������Ź�帱����
���� ���䵵 ��� ���� ���ּ��� �����մϴ�^^"',null,null,null,'senior@gmail.com','MR019',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','819','MR819','�ǻǸ� 50���̳� �ϴ� ������ ��û ����! ùŰ���� 50��°!','https://www.youtube.com/embed/nip53ckobok','
-������õ������ ������ ������ �������Դϴ�. ������ ���� ���ּ���-
������õ����: 8/10
�������: 7/10
������: 6/10
������: Ŭ���� ���� ������ ������ �Բ� �ִ� ��ȭ. �δ���� ����ϴ� ����� �Բ����� ���� ��ȭ. ����. ��ε� ���� ���� ������ ��ȭ��. �Ⱥôٸ� �� ��õ�帮�� ��ȭ!
����~�˷���~ ��ȭ���� ��մ� �������� �����Դϴ�. �ٵ� �̰� �����̾�? �����̾�?���� ùŰ���� 50��°! 1plusSNR Blog��, Damkyung kim��, �輼���, �ٳ���ŷ��, �غ���, ������ǰǰ��������� ��û���ּ̽��ϴ�. �� ������ �Ӹ���! ��� Ű���� ���ʹ� �ϴ°� ��û�� �� ���־��?�������� ����̰� ��ȭ�� ��մµ� �������� �־�.���� ����� ��õ�ص帱���� ��ȭ��� �����մϴ�. ��ȭ Ŭ���������� ���鷯���� ������, �����̶� �޺� ������µ� �����ε� ���� ���� ��ȭ ����������� ���ڰ��. ���� �� ��ȭ�� ���鼭 �� �������� ���� ���׿�. ����� �Ҵ´ٴ°� ������ ������ ��� ���� �ΰ��� ������ �����̱⶧���� �ູ�ϰ� �� �� ���� �ʳ� ������ ��ϴ�. ������ �ֱ⶧ �߸��Ѱ� �������ϸ� �β������� ��� ��ھ��.����
���� ���ָ� �������� ���� ������ ��κ� ������ ���۶��� ������ ������ ū������ ���� ���ݾƿ�. �׶��� �������� ���ư��ٸ� �ο����� �ְھ��?���� �� ���� �ο�� ���� �־����� ���ھ�. ����..���� ���� �������� ���� ����ϰ� ������ �̷�� ��� �����̵�, �ƴ� ������ �������� ����ϸ� ���� ���е鲲. ���� ó�� ����� ����Ҷ� �׶��� ���̺�����Ʈ�� �����ϰ� ���� �� �ذ� �ٽ� ���ư� ���� ���� ����?
�Ϸ��Ϸ� �Ȱ��� �ϻ�, �Ȱ��� ���, �츮�� �¹������� ���� ��� �� ������ ���� 1�� 1�ʰ� �����п��� �ٽ� �ǵ����� ���� ��ȭ�� ������ ���� �ϴ� Ű���� �ٽô� �� �� ùŰ���Դϴ�. �������� �������� �������� �ؿԴ� ��� Ű���� ��� ùŰ���� ���Դϴ�. ���õ� ������ �Ⱦ��ϴ� Ű���� �Ͻô� ���ۺе��� �������� ��� �ϽǰŸ� ���ø�ŭ�� ùŰ��ó�� �غ��°� ����?
����, ������ Ű���� ���ʹ����̳� �ϴ� ������ȭ, �׷����� �����ϰ� �����в� �� ��õ�帮�¿�ȭ, ùŰ���� ���ʹ�°�����ϴ�.
�����̵�.. �ǻǱ��?!
"',null,null,null,'9bul@gmail.com','MR020',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','820','MR820','�׻� Ű�������� ����ϴ� ����ģ���� ���','https://www.youtube.com/embed/pXrRjPs7LwI','" �θǽ��� �����̶� �Ҹ��� ���� ��ǰ �߿�, ������鼭 ��մ�.
�׸��� �ż������� �ͼ���, ���� ��ǰ�Դϴ�.
�̱� �ڹ̵� ����� ������ ������ �ƴ� ���鷯��, ������ �̸��� ��� ������ �� �� �ִ� ��ȭ!
����, �� ��ȭ �����?
���並 �ϸ鼭 �ֿ� ���� �ḻ�� �� �������� �� ��ȭ�� ��û�غ��ñ� �ٶ��ϴ�! - ''�����ڸ�Ʈ''�� ��Ʃ�꿡�� ���ε� �˴ϴ�.
��ȭ���� : ùŰ���� 50��° (2004)
#�θǽ���ȭ #�θ�ƽ�ڹ̵�
#��ȭ��õ #��ȭ���� #��ȭ�ı� #��ȭ��Ʃ��
#��ȭ��Ҹ� #����泲�� #��ȭ�Ұ� #���ƿ�ȭ
#ùŰ���� 50��° #���������� #ùŰ����ȭ #����� #��￵ȭ
#�ƴ���鷯"',null,null,null,'aloneman@daum.net','MR020',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','821','MR821','�ܱ� ��������� �ɸ� ���ڰ� �����ϴ� ���','https://www.youtube.com/embed/5NFK1-FbeEw','ù Ű���� 50��° (2004) �ֿ� : ��� �������, �ƴ� ���鷯',null,null,null,'jackkongs@hotmail.com','MR020',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','822','MR822','���� ����� �Ҿ������ ���ڿ� ��ٴ°� /ùŰ���� 50��° [�ḻ����|��ȭ�Ұ�]','https://www.youtube.com/embed/y1c-LbjBLFw','�̹��� �Ұ��� ��ȭ�� 2004�⿡ ������ ''ùŰ���� 50��°''�Դϴ�. ���� ���� ����� �Ҿ������ ���� ��Եȴٸ� ��� �׳࿡�� �ٰ����� �������? ����� �Ҿ��ٴ� �������� �������� ���ϰ� �ٸ��ֱ�? �ƴϸ� ��δ� �˷��ְ��� �ڽŸ��� ���� ����ֵ��� �����ֱ� ���� ��� � ������ �ϰԵɱ�� ��ȭ���� ä���� ���� �ݿ��� ����6�ÿ� ������ ���ε��� �����Դϴ�. ��ȭ�Ұ��� �����Ҵٸ� ���ƿ� ���� ��� �����ֽø� ���� �����մϴ�. ������ ���� ���ֽ� �е� ��� ��������',null,null,null,'otaku@daum.net','MR020',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','823','MS823','�ᱹ, ���ڵ��� ������ ���������� ��������� ����޾ƾ� �ߴ�','https://www.youtube.com/embed/307sKZV7kcE',null,null,null,null,'mimi@naver.com','MS001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','824','MS824','2154��, �κ��� ���� �����Ǵ� �̷� ����(�ḻ����)','https://www.youtube.com/embed/voJPvpn5MsY',null,null,null,null,'girl@hotmail.com','MS001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','825','MS825','(��ȭ���� �ḻ����)�ḻ���� ��û�� ���� ���Ҵ� ��ȭ','https://www.youtube.com/embed/2eGJWLKSgGI','�ǷẸ���� �߿伺',null,null,null,'spoilerman99@hotmail.com','MS001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','826','MS826','[��ȭ�� ���ϰ��� �ߴ� ��][SF���ߺм�#15](�����Ϸ�)','https://www.youtube.com/embed/Iz6p0PnrA2o',null,null,null,null,'spoilerman99@hotmail.com','MS002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','827','MS827','���ͽ��ڶ�','https://www.youtube.com/embed/IGXpRtfKaL0',null,null,null,null,'lookmun@daum.net','MS002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','828','MS828','���ͽ��ڶ� ��ȭ ���� (Film Interstellar Review)','https://www.youtube.com/embed/yshbEWiY3Ww',null,null,null,null,'core@yahoo.com','MS002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','829','MS829','�ر�vs������','https://www.youtube.com/embed/izLc-P40vRk',null,null,null,null,'baebae@gmail.com','MS003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','830','MS830','��� ��, �ٴ� �Ѱ�� �ܰ� �������� ������ �����Ѵ�.','https://www.youtube.com/embed/cHtyagerwl4',null,null,null,null,'freeticket@yahoo.com','MS003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','831','MS831','�η��� �ʴ븦 �ް� ������ �� �ܰ����� ����','https://www.youtube.com/embed/6dEm9RQff1I','�ʴ��Ҷ� ������..',null,null,null,'freeticket@yahoo.com','MS003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','832','MS832','�� �ְ��� ������ �߾�����! ���� �׸� ������ ��ȭ: ���� �÷��̾� ��','https://www.youtube.com/embed/e2TEztQPCuA','������ ���߹�ȭ ���ĵ��� ���� �߾����� �Ѹ���.',null,null,null,'liner@hotmail.com','MS004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','833','MS833','�ѷ��� ������ŭ �Ѱ赵 ��Ȯ�� ������ �÷��̾� ���� ����','https://www.youtube.com/embed/sbMQfekVpDg','ª�� �� : ���ʹ����̱⿡ �� �ǹ��־��� ���߹�ȭ�� ���� ������, ������ ���ʹ��ױ⿡ ''���� ��''�� �ٶ�� �� ���� ����ϱ�?',null,null,null,'duna@daum.net','MS004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','834','MS834','���� �÷��̾� ��, ��ȭ�� ����','https://www.youtube.com/embed/vXTamvu9Lds','��ȭ�� ����(180505), 1+1, ���� �÷��̾� ��',null,null,null,'movieworld@yahoo.com','MS004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','835','MS835','���鿡�� ��� �ΰ��� ����ģ ������ ��� �η�','https://www.youtube.com/embed/POazQcWqW30','�ܰ����� ������ �������� ź���� �ΰ��� , â������ �ܰ����� ã�Ƴ��� �η� ����� ����� ������...',null,null,null,'filmcasterian99@hotmail.com','MS005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','836','MS836','�ΰ��� ����� �ܰ����̶��?(���θ��׿콺','https://www.youtube.com/embed/LM9hLqk-4d0','-���θ��׿콺 (Prometheus, 2012)',null,null,null,'dopan@daum.net','MS005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','837','MS837','��ȭ [���θ��׿콺]�� ������� �޼���(��������)','https://www.youtube.com/embed/Oxjh34nmeAQ',null,null,null,null,'sogaenam@naver.com','MS005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','838','MS838','�� 10�� ���� ���ϱⰡ ã�ƿ� ���� | ����ο� | �糭 | ųŸ(ų��Ÿ��) | ��ȭ��õ','https://www.youtube.com/embed/waoMEeFuqzs','- ����ο� - ���� : 2004 �帣 : ���, SF, ������ ���� : �ѷ��� ���Ӹ��� �⿬ : ���Ͻ� ���̵�, ����ũ ������, �̾� Ȩ, ���� �μ�',null,null,null,'killtarian131@yahoo.com','MS006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','839','MS839','���ϱ�� ���ư� ���� [�ḻ����]','https://www.youtube.com/embed/HZkETfxZh-A','����Ư�� ��ȭ ''����ο�(2004)'' �Դϴ�',null,null,null,'10movie@gmail.com','MS006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','840','MS840','������ ������Ų ���ϱⰡ �ٽ� ã�ƿ� ������ ����','https://www.youtube.com/embed/5jRuEaJxuGM',null,null,null,null,'shong@hotmail.com','MS006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','841','MS841','160�� �׾�� �ϴ� ����?','https://www.youtube.com/embed/v7MmEPmpI3o',null,null,null,null,'9bul@gmail.com','MS007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','842','MS842','�ܰ����� �Ǹ� ����ϰ� ���� ���ϴ� ����!','https://www.youtube.com/embed/eE8KmXrZU7M','��ȭ : ���� ���� ����ο� (Edge of Tomorrow) ���� : ���� ���̸� ���� : 2014',null,null,null,'murf@gmail.com','MS007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','843','MS843','�ܰ��ΰ� ������ ����','https://www.youtube.com/embed/xfobC9Cm1qI','������ �ȳ��ϼ��� �߸��Դϴ�. ������ ��ȭ ''���� ���� �����ο�''�� ���� ������ �����մϴ�. �ƹ��� ��뵵 ���� �����ߴ� ��ȭ�ε� ���� �� ��̰� ��û���� ���������� �� �������� ��ȭ�� �� Top3 �ȿ��� ��ٰ� �����մϴ�.',null,null,null,'bman@yahoo.com','MS007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','844','MS844','���ӽ� ī�޷е� ���� �ع��ϵ� �Դµ� ������ ���� ����: �͹̳�����: ��ũ����Ʈ ����','https://www.youtube.com/embed/Kx6fSDyHZ-k','�����ϰ� �ø�� ����Ʈ������ ��̿� ������ ���� ���� �߾����̸� ���ҳ�. ���̳ʿ��� �����ϴ� �͹̳�����: ��ũ����Ʈ �����Դϴ�',null,null,null,'liner@hotmail.com','MS008',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','845','MS845','�͹̳����� ��ũ ����Ʈ ���� (���� ģ�� ���� �ǱԾ� �̺�Ʈ, ���� ����)','https://www.youtube.com/embed/j_13slAOO6k','�͹̳����� ���̶�� ��ũ ����Ʈ �ݵ�� �� ������.',null,null,null,'minho@gmail.com','MS008',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','846','MS846','��ȭ [�͹̳����� : ��ũ ����Ʈ] ����','https://www.youtube.com/embed/u207DOczUYM','�͹̳����� : ��ũ ����Ʈ / 2019�� 10�� 30�� ���� : �� �з� ��� : ������ ���̺�, �Ƴ�� �������װ�, ���� �ع���, ��Ż���� ������',null,null,null,'ddaddasi@hotmail.com','MS008',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','847','MS847','�� ������ �Ƹ��ٿ��� ���� �Һ�Ǵ� �ð���: �۽�Ʈ�� ����','https://www.youtube.com/embed/FvC_5e9M2y4','���� �Ѵ� ����, �� �Ͻ�Ʈ��. �η� ���ʷ� �޿� �� �糪��. ���ֿ� ��. �η�. ����. �е����� �̹���, ��ȭ�� �̹����� �����̶�� ��.',null,null,null,'liner@hotmail.com','MS009',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','848','MS848','���� ������ ������ ��ȭ : ''�۽�Ʈ��''����','https://www.youtube.com/embed/4HphZDPvKjM','* �� ������ �����Ϸ��� �ټ� ���ԵǾ� �ֽ��ϴ� *',null,null,null,'aloneman@daum.net','MS009',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','849','MS849','��󷣵� ���� ��ȭ ''�۽�Ʈ��'' ���� ���� �ı�','https://www.youtube.com/embed/_GYi8pkzYLE',null,null,null,null,'minho@gmail.com','MS009',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','850','MS850','�� ������ ���̰� �巯��, ���� ���� ö������ SF ��ȭ: �ֵ� �ƽ�Ʈ�� ����','https://www.youtube.com/embed/TmiAlrenUcc','�귡�� ��Ʈ�� ���� ��ȭ. ���� ���� ö������ SF ��ȭ. �� �ѹ��� �׷���Ƽ. ���ӽ� �׷��� ������ ��ġ�� ��� ������, ���� ������ �̾߱�.',null,null,null,'liner@hotmail.com','MS010',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','851','MS851','�ֵ� �ƽ�Ʈ�� ���̵� ����','https://www.youtube.com/embed/gZD9gIwbpiw',null,null,null,null,'nofootbird@gmail.com','MS010',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','852','MS852','���� ���� �����ϸ� �������� �� [�ֵ�ƽ�Ʈ�󸮺�]','https://www.youtube.com/embed/3Zo8HbrLL44','���ӽ� �׷��� ����, �귡�� �ǵ� �ֿ��� ���� SF ��ȭ �ֵ�ƽ�Ʈ�� �����Դϴ�.',null,null,null,'reviewang@gmail.com','MS010',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','853','MS853','ȭ���� Ȧ�� ������ ��ü����� ��� ���� | ���� | ����,SF | ųŸ(ų��Ÿ��) | ��ȭ��õ','https://www.youtube.com/embed/EpgPSztcoWE',null,null,null,null,'killtarian131@yahoo.com','MS011',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','854','MS854','õ�� �Ĺ��� �ڻ簡 ȭ���� ȥ�� ��������?','https://www.youtube.com/embed/vHuODKePk00','ȭ������ ��Ƴ���',null,null,null,'dreamteller@daum.net','MS011',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','855','MS855','���̵� ���� - ����','https://www.youtube.com/embed/rTN4Meuzsqk','�������� ������ �����Ͻ� �� �Ǵ� ������ �����Ͻ� �� �����̳��� ������ ������ �մϴ�.',null,null,null,'nofootbird@gmail.com','MS011',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','856','MS856','���� �� ĳ���͸� ���� ������ �ִٸ�?','https://www.youtube.com/embed/EDB9TS-mbBE','��ȭ ����: �ȼ�',null,null,null,'fallinfilm@hotmail.com','MS012',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','857','MS857','���������� ����ȭ�Ǹ� �������� ��','https://www.youtube.com/embed/9yymmq4OWe0',null,null,null,null,'popcorncake@yahoo.com','MS012',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','858','MS858','�ȼ� / ��ȭ P����','https://www.youtube.com/embed/PZP5h3c9Opc',null,null,null,null,'moviemonster@yahoo.com','MS012',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','859','MS859','���� ���� ���� �κ��� ź��','https://www.youtube.com/embed/B0DWUjcok1I','���� ����� ����� �ǻ����, �ֱٿ� �ٽ� �ý��ϴ�. ���ô� ���ô�����! 2004�� ���̶�� ������ ���� ���� ��ŭ ��û�� ��ǰ�̾����ϴ�. ��ǰ �ӿ� ��� �ִ� �ΰ����ɿ� ���� ������ �ǰ��� ���� ��̷ο����! �ű�ٰ�, �����̽��� ������ ������� ����̴� ���� ���ҽ��ϴ�! ���並 �ϸ鼭 �ֿ� ���� �ḻ�� �� �������� �� ��ȭ�� ��û�غ��ñ� �ٶ��ϴ�!',null,null,null,'aloneman@daum.net','MS013',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','860','MS860','2035��, �η��� �����ϴ� �κ� [�ḻ����]','https://www.youtube.com/embed/fE-z-VWGg-M','���� : ����, �κ� (2004�� ��ǰ)',null,null,null,'ezip@daum.net','MS013',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','861','MS861','�κ��� ��ȭ�� ���� �ΰ��� �����Ѵٸ�?! | ���̷κ� | SF | ųŸ(ų��Ÿ��) | ��ȭ��õ','https://www.youtube.com/embed/lZAjmNQLwGM','- ���̷κ� - ���� : 2004 �帣 : SF,�׼�,���� ���� : �˷��� ���ξ߽� �⿬ : �� ���̽�, �긮�� ���̳���, ��罺 �׸����',null,null,null,'killtarian131@yahoo.com','MS013',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','862','MS862','���� �������� Ŀ�Ǹ� ��� �̷�','https://www.youtube.com/embed/WDObEuXMGrA',null,null,null,null,'dreamteller@daum.net','MS014',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','863','MS863','�ΰ��� ������ ����� �� �ְ� �Ǿ����� ���ڵ��� ��','https://www.youtube.com/embed/TufdhfNgl00',null,null,null,null,'please@naver.com','MS014',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','864','MS864','����Ÿ�� ��ȭ���䡻 ���ڵ��� ������� �����ϴ� ���','https://www.youtube.com/embed/Rv55AQNC15Q','��ȭ: ��Ÿ��(2011) ����: �ص�� ���� �⿬: �Ƹ��� ����������,����ƾ ��������ũ',null,null,null,'boyboy@gmail.com','MS014',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','865','MS865','Ȥ��Ż�� �ø��� ������','https://www.youtube.com/embed/Xm8raayuDMI','���� �������� ����Ʈ ��ȭ���� ���� �������� SF��ȭ, Ȥ��Ż�� �ø���. ��ܿ��� �������� ����� 3�� ''Ȥ��Ż��: ���� ����''�� 8�� 15�� ������ �յΰ� �ֽ��ϴ�. 1,2���� �ֿ� �ٰŸ��� Ȥ��Ż�� �ø����� �ٽ��̶� �� �� �ִ� ���ĸ��, ������ ������ �ص� ��Ű���� ���� �˾ƺ��ϴ�.',null,null,null,'gongu@yahoo.com','MS015',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','866','MS866','Ȥ��Ż�� �ø��� ��������','https://www.youtube.com/embed/WlGGTqTFMaM','Ȥ��Ż���� ��� ���� �˾ƺ���! (�Ҽ�, �������� �ø���, �� ��ư ������ Ȥ��Ż��, ����Ʈ �ø���)',null,null,null,'hipparachi@yahoo.com','MS015',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','867','MS867','Ȥ��Ż�� ���� ���� ���� : ����� ������ ǰ�� �ִ� ���� - ���̳�','https://www.youtube.com/embed/LHrBJzZyNCU','Ȥ��Ż�� ������� ���������� Ȥ��Ż�� ���� ������ �����߽��ϴ�. ��ġ ���� SF ��Ϲ����ͷμ� �������� �������� �س� ���� ����. ���̳ʿ� �Բ� �� ��ȭ�� ��ġ�� ������ ���캸����.',null,null,null,'liner@hotmail.com','MS015',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','868','MS868','[2001 �����̽� ������] ���丮','https://www.youtube.com/embed/4yC7GJ4ZSXc',null,null,null,null,'contentplayer00@yahoo.com','MS016',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','869','MS869','[2001 �����̽� ������] ���丮 & ����Ʈ ���� (2��)','https://www.youtube.com/embed/-ZaTr7zXX2s',null,null,null,null,'contentplayer00@yahoo.com','MS016',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','870','MS870','[2001 �����̽� ������] ���丮&����Ʈ ���� (3��)','https://www.youtube.com/embed/dvz8SQFAKuA',null,null,null,null,'contentplayer00@yahoo.com','MS016',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','871','MS871','������ �������. �׸��� �ٽ� �Ͼ, �ɾ��: �׷���Ƽ ����','https://www.youtube.com/embed/J9vrphPj2XY','�簳�� ������� 8�� ���� �÷ȴ� �׷���Ƽ �����Դϴ�.
�ְ��� ���� ��ȭ.
�� �̻��� �ڼ��� ������ �����մϴ�.',null,null,null,'liner@hotmail.com','MS017',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','872','MS872','���� �ְ��� ���ֿ�ȭ','https://www.youtube.com/embed/sFmtwSOYLNQ','��ܰ� ������ ��� ������Ų 21���� �ְ��� ���ֿ�ȭ, �׷���Ƽ�� ���� �����ε带 �˾ƺ��ϴ�.',null,null,null,'gongu@yahoo.com','MS017',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','873','MS873','�׷���Ƽ : �������Ƿ� Ǯ��� ��ȭ�� ���� "�߷�"�� �ǹ� [����Ʈ��]','https://www.youtube.com/embed/vnP9U2qWKuA','�������ǿ� �ΰ��� ���� �˾ƺ���
��ȭ �׷���Ƽ�� �ǹ̸� �������Ƿ� Ǯ��� �����Դϴ�.',null,null,null,'mypopcorntree@yahoo.com','MS017',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','874','MS874','���� ����ȭ ���ǿ�','https://www.youtube.com/embed/Hmzn71U8hms',null,null,null,null,'gongu@yahoo.com','MS018',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','875','MS875','[�����] �ε���������� - �������� ����','https://www.youtube.com/embed/0RBtlfciTtA',null,null,null,null,'jayque@daum.net','MS018',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','876','MS876','2016 �ε����������2:�������� ���� �Դϴ�. Independence Day: Resurgence REVIEW','https://www.youtube.com/embed/zh5Ww26zgXk',null,null,null,null,'suspect@gmail.com','MS018',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','877','MS877','�̷��� �η��� �ϴ� ������ ��� ����','https://www.youtube.com/embed/ccQi_KU8vn8',null,null,null,null,'mimi@naver.com','MS019',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','878','MS878','������ 60�� ������ ����','https://www.youtube.com/embed/1TFO0am6RPU','������ ��ȭ ''�������''�� ���ؼ� �˾ƺ����� �մϴ�. 2013�� ���������� ������ �ܰ����ü vs �ΰ��� ������ ���� ������, Ư���� �븳������ ���� �ְ�, �ű⿡ �������� �������� �׷����� ���� ��ȭ�� �߿��� ���� �Ƹ���ٰ� �ص� ������ �ƴ� �� �����ϴ�. ������ ����, �޼��� �׸��� �ϼ������� ��� ���� ��ȭ�Դϴ�. �� �ѹ� ã�ƺ��ñ� �ٶ��ϴ�.',null,null,null,'bman@yahoo.com','MS019',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','879','MS879','������ ���� �ܰ������κ��� ������ ��Ű�� �� ����','https://www.youtube.com/embed/wofMniEuMSc','�� ũ����,��������� �ֿ��� 2013 ������� �Դϴ�.',null,null,null,'jum@hotmail.com','MS019',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','880','MS880','��Ȱ�� ���� �ӿ� �� ȥ�� ���� �ȴٸ� ������ �ұ�','https://www.youtube.com/embed/FlsfG2kVtuo',null,null,null,null,'ddubuni@hotmail.com','MS020',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','881','MS881','���ڴ� �̳ฦ 90�� ���� ����� ����� ��![��ȭ����]','https://www.youtube.com/embed/pTCawW51tlM',null,null,null,null,'suspect@gmail.com','MS020',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','882','MS882','���ֿ� �� ȥ�� ����ٸ� ��ȭ �н�����','https://www.youtube.com/embed/S2lwjijNaRs',null,null,null,null,'314@gmail.com','MS020',to_date('20/02/19','RR/MM/DD'));
REM INSERTING into RETULIX.MEMBER
SET DEFINE OFF;
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('admin@admin.com','123','admin','99',100,null,'noicon.png','nochimg.png',99);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('10000lv@naver.com','123','��������','34',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('ownerdd@google.com','123','�嵶����','41',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('moza@daum.net','123','�׻�','22',8000,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('zenokion@naver.com','123','����Ű��','46',450,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('gindi@google.com','123','ĥ���','33',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('mirror@daum.net','123','�̷�','43',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('kanghwa@naver.com','123','��ȭ������','37',4500,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('cityborn@google.com','123','��Ƽ��','24',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('merky@naver.com','123','�ַϿո�Ű','37',5200,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('gamegood@google.com','123','���ڷ�','27',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('qhdrlf1@gmail.com','123','����','45',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('vpdgk90@gmail.com','123','���̾�Ʈ ���','45',100000,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('rlarPfks@gmail.com','123','������ ������','34',30000,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('Qnd123@gmail.com','123','�׻���','20',500,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('qjsrovkdnj@gmail.com','123','������','32',450,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('dnrkdnrk@gmail.com','123','�˷� ����','40',2000,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('dmscjdma@gmail.com','123','�Ź�ŴTV','19',50,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('dkdldb123@gmail.com','123','IU','21',90000,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('ahWlvlcl@gmail.com','123','������ġ','18',50000,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('zmfltmxkf@gmail.com','123','�Ŀ��Ը���','29',1500,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('mnbvcxz@hotmail.com','123','������','30',100000,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('ny@gmail.com','123','����','27',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('jy123@gmail.com','123','����','41',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('mm@gmail.com','123','���','49',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('sn@gmail.com','123','�糪','33',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('jh@gmail.com','123','��ȿ','22',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('mn@gmail.com','123','�̳�','25',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('dh@gmail.com','123','����','27',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('cy@gmail.com','123','ä��','48',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('ct@gmail.com','123','����','22',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('pang@gmail.com','123','���̿�','49',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('shin@gmail.com','123','������','30',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('word@gmail.com','123','���ڳ�','45',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('taktak@gmail.com','123','��Ź��','22',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('hos@gmail.com','123','�ε鷡','31',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('carman@gmail.com','123','ī��','38',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('danuk@gmail.com','123','����','30',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('kimSky@gmail.com','123','���ϴ�','47',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('Rynha@gmail.com','123','Rynah','49',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('icly@gmail.com','123','��Ŭ���Ǿ�','44',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('ggojong@gmail.com','123','������','19',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('trashmovie@gmail.com','123','�����Ǻ���','38',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('johncancook@gmail.com','123','��ĵ��','30',4000,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('gogomimimi@gmail.com','123','���̹̹�','32',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('straightline@gmail.com','123','������','27',2000,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('icemint@gmail.com','123','���̽���Ʈ','25',300,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('mechatok@gmail.com','123','��ī��ũ','47',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('arcmak@gmail.com','123','��ũ��','46',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('pigeonfly@gmail.com','123','��ѱ�Ǫ���','46',1600,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('shamanism@gmail.com','123','���粨�׿�','19',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('10movie@gmail.com','123','10����','27',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('314@gmail.com','123','3.14ä��','32',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('9bul@gmail.com','123','9bul','49',8000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('noone@gmail.com','123','���Ǿ���','35',450,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('2ddudae@gmail.com','123','������ �̶Ѵ�','32',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('gogomovie@gmail.com','123','�����','26',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('gomong@gmail.com','123','���','18',4500,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('edutrue@naver.com','123','��������','29',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('internationalbubu@naver.com','123','�����κ�','45',5200,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('horrrrror@naver.com','123','�Ⱬ����','34',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('eyesonme@naver.com','123','��ü�','32',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('extreammovie@naver.com','123','����ö�� �ͽ�Ʈ������','49',100000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('mimi@naver.com','123','�����','47',30000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('9movie@daum.net','123','���ι���','18',500,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('netvo@daum.net','123','�ݺ�','20',450,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('iconictv@daum.net','123','��ǥ TV','47',2000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('duc@daum.net','123','������','45',50,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('dopan@daum.net','123','����','44',90000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('videobang@daum.net','123','���׺�����','37',50000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('3bunoddugi@daum.net','123','�ξ�ô� 3�п��','27',1500,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('duna@daum.net','123','�೪','35',100000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('dreamteller@daum.net','123','�帲�ڷ�','28',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('dingo@daum.net','123','���� ����','40',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('ddaddasi@hotmail.com','123','������','44',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('ddubuni@hotmail.com','123','������','23',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('ddorol@hotmail.com','123','�Ƿѹ���','28',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('ddingjal@hotmail.com','123','����','31',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('liner@hotmail.com','123','���̳�','45',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('lak@hotmail.com','123','��ũ����','20',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('lemong@hotmail.com','123','����','49',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('read@gmail.com','123','���幫��','20',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('reviewman@gmail.com','123','�����','35',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('reviewang@gmail.com','123','�������','28',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('riukun@gmail.com','123','���챺�� �ٶ���','26',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('jy@gmail.com','123','���ʵ� �翵','39',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('murf@gmail.com','123','����','28',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('muk@gmail.com','123','�޹й�����','32',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('senior@gmail.com','123','������','36',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('freeticket@yahoo.com','123','�����̿�','40',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('murmicine@yahoo.com','123','�����̾���','29',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('moviedochi@yahoo.com','123','����ġ','22',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('moviemonster@yahoo.com','123','�������','25',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('moviemovie@yahoo.com','123','���񹫺�','23',4000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('movieus@yahoo.com','123','����콺','37',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('movieworld@yahoo.com','123','�������','50',2000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('moviekok@yahoo.com','123','��������','42',300,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('taco@daum.net','123','����Ÿ��','32',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('teller@hotmail.com','123','�����ڷ�','29',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('trip@hotmail.com','123','����Ʈ��','30',1600,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('hanjan@hotmail.com','123','��������','22',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('choice@hotmail.com','123','�����̽�','36',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('mupmup@hotmail.com','123','����','33',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('middle@hotmail.com','123','�̵黷','47',8000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('mix@gmail.com','123','�ͽ�����','29',450,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('minho@gmail.com','123','��ȣŸ�츣��','24',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('byebye@gmail.com','123','�ٹٹ���','29',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('nofootbird@gmail.com','123','�߾��»�','34',4500,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('baebae@gmail.com','123','���','36',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('freeman@gmail.com','123','������','33',5200,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('bumti@gmail.com','123','��Ƽ','24',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('bear@gmail.com','123','�����','31',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('incheon@yahoo.com','123','����ó׸�','49',100000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('bukbu@yahoo.com','123','�Ϻ��� ��','49',30000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('bitatalk@yahoo.com','123','��Ÿ ��ũ','37',500,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('gongu@yahoo.com','123','����������','17',450,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('bman@yahoo.com','123','�߸�','33',2000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('sangung@yahoo.com','123','���','26',50,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('boxmovie@yahoo.com','123','���ڹ��񸮺�','46',90000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('bbbbbreview@yahoo.com','123','���߻��� ��ȭ����','45',50000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('serin@naver.com','123','����','23',1500,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('sogaenam@naver.com','123','�Ұ���','32',10000000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('please@naver.com','123','�Ұ����־�','48',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('soso@naver.com','123','�Ҽ�Ƽ��','17',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('cottoncandy@naver.com','123','�ػ���','47',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('shortcut@daum.net','123','���Ƹ���','45',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('chicken@daum.net','123','���迵ȭ','34',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('sunta@daum.net','123','��Ÿ','42',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('screen@daum.net','123','��ũ������','37',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('heytv@gmail.com','123','������TV','36',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('senimapia@gmail.com','123','�ó׸��Ǿ�','32',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('react@gmail.com','123','�ɽ�Ǯ�� ����ä��','22',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('hi@gmail.com','123','�ȿ�','26',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('youknow@gmail.com','123','�˷���','47',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('egg@naver.com','123','�˾���','38',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('yangyang@naver.com','123','�������','24',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('uppercut@naver.com','123','������','24',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('unjun@naver.com','123','����','23',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('everyview@naver.com','123','���긮��','34',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('acut@naver.com','123','������ Ƽ��','45',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('ans@daum.net','123','����','36',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('younglove@daum.net','123','����','25',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('youngmin@daum.net','123','�����ϴ�','35',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('youngbotv@daum.net','123','����TV','33',4000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('youngread@daum.net','123','���ϳ�','25',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('pause@daum.net','123','�����','48',2000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('makemovie@daum.net','123','��ȭ���ۼ�','19',300,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('endmovie@daum.net','123','��ȭ������','30',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('otaku@daum.net','123','��ȭ����','43',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('yap@daum.net','123','��ȭ����','26',1600,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('girl@hotmail.com','123','��ȭ�ҳ�','44',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('shong@hotmail.com','123','��ȭ��ȯ��','28',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('about@hotmail.com','123','��ȭ�� ���Ͽ�','46',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('drunk@hotmail.com','123','��ȭ�����Ѵ�','42',8000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('tvshowshow@hotmail.com','123','��ȭ����TV','36',450,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('tablemovie@hotmail.com','123','��ȭ�� ��Ź','48',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('jjummer@hotmail.com','123','��ȭä�� �޸�','48',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('drikdrik@gmail.com','123','���õ� �帯�帯','27',4500,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('tophome@gmail.com','123','��ž�湫��','34',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('suspect@gmail.com','123','������','37',5200,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('youtuberead@daum.net','123','��Ʃ���о��ִ³���','50',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('eeeki@daum.net','123','�̳����� ���� ��ȭ �ؼ�','47',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('esangcouple@daum.net','123','�̻�Ŀ�����̻����ζ�����','38',100000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('storyroom@daum.net','123','�̾߱��','34',30000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('ezip@daum.net','123','������ȭ������','20',500,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('aloneman@daum.net','123','����泲��','26',450,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('socheon@daum.net','123','���õ','21',2000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('jackkongs@hotmail.com','123','����''s ��ȭ����','22',50,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('jum@hotmail.com','123','����','46',90000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('daymovie@hotmail.com','123','�ָ��� ��ȭ','37',50000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('suenim@hotmail.com','123','�߻���','41',1500,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('gmovie@hotmail.com','123','������','22',10000000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('zto@hotmail.com','123','����TV','43',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('realtrue@hotmail.com','123','�����Ѹ���','35',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('zipmovie@gmail.com','123','������','31',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('windandrain@gmail.com','123','ä����ǳ','32',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('genius@gmail.com','123','õ���̽±�','20',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('boyboy@gmail.com','123','ö������ȭ','44',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('whereiam@gmail.com','123','û����','29',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('noboty@gmail.com','123','ģ���ѳ�ٵ�','23',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('karang@gmail.com','123','ī��','46',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('captainrami@gmail.com','123','ĸƾ���','40',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('cabletv@yahoo.com','123','���̺�TV VOD','39',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('core@yahoo.com','123','�ھ�','33',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('contentplayer00@yahoo.com','123','�������÷���','45',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('killtarian131@yahoo.com','123','ųŸ','34',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('tunachamchi@yahoo.com','123','Ʃ��','46',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('holemovie98@yahoo.com','123','ƴ����ȭ','23',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('popcorncake@yahoo.com','123','��������','41',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('mypopcorntree@yahoo.com','123','����Ʈ��','40',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('postshare85@daum.net','123','����Ʈ����','36',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('spoilerman99@hotmail.com','123','������_�ḻ����','35',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('fictionworld24@hotmail.com','123','�ȼǿ���','46',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('fallinfilm@hotmail.com','123','�ʸ���������','43',4000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('filmcasterian99@hotmail.com','123','�ʸ�ĳ����','50',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('helpyourself@hotmail.com','123','�ϰ�����Ŵ���','47',2000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('whiteraccoon@hotmail.com','123','�Ͼ�ʱ���','33',300,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('highlight7373@gmail.com','123','���̶���Ʈ','48',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('stephanhockingkk@gmail.com','123','��ŷ','33',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('kimchiman123@gmail.com','123','�������±�ġ�','29',1600,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('hamlet_movies@gmail.com','123','�ܸ�','39',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('heatherturning@gmail.com','123','������ʹ�������','29',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('hyundaicardmovie@gmail.com','123','����ī��','22',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('ajhongmovie@gmail.com','123','ȫ��ž�����','22',8000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('hongcinema@gmail.com','123','ȫ�ó׸�','35',450,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('fatic74@yahoo.com','123','ȭƽ','47',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('hipparachi@yahoo.com','123','���Ķ�ġ','29',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('ajbros8080@yahoo.com','123','AJBrothers','41',4500,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('benhahnfeld@yahoo.com','123','Benjamin Hahnfeld','20',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('chvideochannel@yahoo.com','123','CH.��������','36',5200,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('chrisstuckshit@hotmail.com','123','Chris Stuckmann','43',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('moonlightmuse@gmail.com','123','DALBITMUSE','31',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('falconcaptain@gmail.com','123','Falcon Review','29',100000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('fkvlogs24@gmail.com','123','FKVlogs','31',30000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('gamemaster88@gmail.com','123','GM.STORY','28',500,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('highqutv@gmail.com','123','HIGHCUTV','46',450,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('netherlandman@gmail.com','123','Hollander Jo','29',2000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('mootiqj@gmail.com','123','J�� ��Ƽ��','35',50,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('tetris024@gmail.com','123','Jerald Podkowka','43',90000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('jeremyking@yahoo.com','123','Jeremy Jahns','24',50000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('jayque@daum.net','123','JQ','39',1500,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('rkdwns@daum.net','123','Jun Kang','47',10000000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('kbs_antena@daum.net','123','KBS ���׳�','28',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('lookmun@daum.net','123','Lookmun','22',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('redmonmov@daum.net','123','Movie RedMonster','36',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('codemovie@daum.net','123','MovieCode','37',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('nongovernmental@hotmail.com','123','NGO','47',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('dbstjdqls@hotmail.com','123','pelix Yoon','34',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('playallmovies@hotmail.com','123','PLAYYMOVIE','43',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('redc@hotmail.com','123','REDC','49',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('reviewtns@gmail.com','123','Reviews','27',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('roleplayman@yahoo.com','123','Role Play','46',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('skmovies@daum.net','123','SK B tv','47',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('sonypictures@daum.net','123','sonypictureskr','31',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('duckplayer@daum.net','123','TV����','38',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('kongtv@daum.net','123','TV��','33',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('uxxmovie@daum.net','123','Uxx','29',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('mybody@gmail.com','123','wembodyt','29',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('ysamo@yahoo.com','123','Ysamo Quind','20',100,null,'noicon.png','nochimg.png',1);
REM INSERTING into RETULIX.NOTICE
SET DEFINE OFF;
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (1,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (2,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (3,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (4,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (5,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (6,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (7,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (8,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (9,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (10,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (11,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (12,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (13,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (14,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (15,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (16,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (17,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (18,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (19,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (20,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (21,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (22,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (23,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (24,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (25,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (26,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (27,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (28,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (29,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (30,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (31,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (32,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (33,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (34,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (35,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (36,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (37,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (38,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (39,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (40,'�׽�Ʈ','�������� �׽�Ʈ',to_date('20/02/19','RR/MM/DD'),0,'admin');
REM INSERTING into RETULIX.GOOD_REVIEW
SET DEFINE OFF;
REM INSERTING into RETULIX.HISTORY
SET DEFINE OFF;
REM INSERTING into RETULIX.SUBS
SET DEFINE OFF;
REM INSERTING into RETULIX.ZZIM_TRAILER
SET DEFINE OFF;

--------------------------------------------------------
--  파일이 생성됨 - 수요일-2월-19-2020   
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
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','A','001','DA001',null,'https://www.youtube.com/embed/EpQVbvJ3TFo','폴라',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','A','002','DA002',null,'https://www.youtube.com/embed/gyzcOT6OqPE','퍼니셔',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','A','003','DA003',null,'https://www.youtube.com/embed/VknygXeeGnc','제시카 존스',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','A','004','DA004',null,'https://www.youtube.com/embed/I7jl4T2crGE','애로우',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','A','005','DA005',null,'https://www.youtube.com/embed/JGhAJuxl_nU','배가본드',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','A','006','DA006',null,'https://www.youtube.com/embed/Z-TxS18HHns','태양의 후예',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','C','001','DC001',null,'https://www.youtube.com/embed/_y5UbAs6j-k','사랑의 불시착',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','C','002','DC002',null,'https://www.youtube.com/embed/gEDuUBkv-qc','싸이코패스 다이어리',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','C','003','DC003',null,'https://www.youtube.com/embed/JZbjJZWggSM','데이브레이크',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','C','004','DC004',null,'https://www.youtube.com/embed/W1y0RNDnpJQ','으라차차 와이키키',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','C','005','DC005',null,'https://www.youtube.com/embed/UWTuGvLIW2E','검사내전',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','C','006','DC006',null,'https://www.youtube.com/embed/EXJdwEtqaSs','굿 걸스',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','C','007','DC007',null,'https://www.youtube.com/embed/RfBgT5djaQw','굿 플레이스',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','H','001','DH001',null,'https://www.youtube.com/embed/Sx9bjEfzV_s','한니발',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','H','002','DH002',null,'https://www.youtube.com/embed/x-YJTJsVQ_0','킹덤',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','H','003','DH003',null,'https://www.youtube.com/embed/AZR9143LSoo','기묘한 이야기',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','H','004','DH004',null,'https://www.youtube.com/embed/Cd79LUQE7-0','마인드헌터',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','H','005','DH005',null,'https://www.youtube.com/embed/4Afm7QucvQs','힐 하우스의 유령',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','R','001','DR001',null,'https://www.youtube.com/embed/n-zpdgYFRe4','가십걸',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','R','002','DR002',null,'https://www.youtube.com/embed/VwRBeMbf-L0','도깨비',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','R','003','DR003',null,'https://www.youtube.com/embed/pHY8AdAZg4g','미스터 선샤인',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','R','004','DR004',null,'https://www.youtube.com/embed/a5XfzDGQPpw','나의 아저씨',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','R','005','DR005',null,'https://www.youtube.com/embed/cRgyTsy5jp8','멜로가 체질',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','S','001','DS001',null,'https://www.youtube.com/embed/ThGwRfBw6Cs','로스트 인 스페이스',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','S','002','DS002',null,'https://www.youtube.com/embed/5aIgt7d1pT4','어나더 라이프',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','S','003','DS003',null,'https://www.youtube.com/embed/1VQrJsvYxPg','마스',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','S','004','DS004',null,'https://www.youtube.com/embed/aE8tkxjueoE','블랙미러',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('D','S','005','DS005',null,'https://www.youtube.com/embed/AZR9143LSoo','기묘한 이야기',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','001','MA001',null,'https://www.youtube.com/embed/mck3JCl2uwQ','어벤져스',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','002','MA002',null,'https://www.youtube.com/embed/5dRExhvuGnI','어벤져스-에이지 오브 울트론',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','003','MA003',null,'https://www.youtube.com/embed/xUDhdCsLkjU','어벤져스-인피니티 워',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','004','MA004',null,'https://www.youtube.com/embed/PVP5ZJuI57c','어벤져스-엔드게임',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','005','MA005',null,'https://www.youtube.com/embed/SW6EKneLyCI','킹스맨-시크릿 에이전트',25,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','006','MA006',null,'https://www.youtube.com/embed/fuwE3Lvysvs','킹스맨-골든 서클',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','007','MA007',null,'https://www.youtube.com/embed/FMxbzIThWNA','존 윅',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','008','MA008',null,'https://www.youtube.com/embed/ux-kWYfEuZM','존 윅-리로드',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','009','MA009',null,'https://www.youtube.com/embed/cs_takIhPxc','존 윅-파라벨룸',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','010','MA010',null,'https://www.youtube.com/embed/cs_takIhPxc','테이큰',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','011','MA011',null,'https://www.youtube.com/embed/rylE3y_QFLU','본 얼티메이텀',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','012','MA012',null,'https://www.youtube.com/embed/p-fDEhVBnv4','매드맥스-분노의 도로',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','013','MA013',null,'https://www.youtube.com/embed/9VNfau-s6Ys','폴리스 스토리',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','014','MA014',null,'https://www.youtube.com/embed/VLiAEXZK0qY','미션 임파서블-고스트 프로토콜',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','015','MA015',null,'https://www.youtube.com/embed/cdEtgloxhso','미션 임파서블-로그네이션',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','016','MA016',null,'https://www.youtube.com/embed/gNJgMo14XWU','미션 임파서블-폴아웃',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','017','MA017',null,'https://www.youtube.com/embed/a6EOkza6fAA','레지던트 이블-파멸의 날',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','018','MA018',null,'https://www.youtube.com/embed/D5y3bOWc938','레지던트 이블-최후의 심판',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','019','MA019',null,'https://www.youtube.com/embed/cOxYjISc9tI','람보 : 라스트 워',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','A','020','MA020',null,'https://www.youtube.com/embed/N7uu8v34HU8','아쿠아 맨',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','001','MC001',null,'https://www.youtube.com/embed/0uC2FaZ4h1I','가장 보통의 연애',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','002','MC002',null,'https://www.youtube.com/embed/4QyKCokEZXM','굿모닝 에브리원',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','003','MC003',null,'https://www.youtube.com/embed/BaIRaKXrLPk','극한직업',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','004','MC004',null,'https://www.youtube.com/embed/sLZ8PRLWyKs','나쁜 이웃들',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','005','MC005',null,'https://www.youtube.com/embed/fDhYGAIv4V8','내 아내의 모든 것',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','006','MC006',null,'https://www.youtube.com/embed/guug8ToBMwM','런어웨이 버케이션',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','007','MC007',null,'https://www.youtube.com/embed/d6sA47lpfIc','롤러코스터',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','008','MC008',null,'https://www.youtube.com/embed/Ez5Kvs_cnFQ','베케이션',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','009','MC009',null,'https://www.youtube.com/embed/SribMKGqDAk','서홍시수부',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','010','MC010',null,'https://www.youtube.com/embed/1_m4nB7tscA','세 얼간이',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','011','MC011',null,'https://www.youtube.com/embed/jH6-ZBUbg-M','스물',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','012','MC012',null,'https://www.youtube.com/embed/gg4HdbARFTg','스파이',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','013','MC013',null,'https://www.youtube.com/embed/-pkNFb9CVj4','시실리 2km',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','014','MC014',null,'https://www.youtube.com/embed/li4jOV5j7SI','엑시트',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','015','MC015',null,'https://www.youtube.com/embed/8ABOCiwhJI4','연애의 온도',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','016','MC016',null,'https://www.youtube.com/embed/N0mlAk4_DWw','엽기적인 그녀',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','017','MC017',null,'https://www.youtube.com/embed/8d7irFlE4WQ','위대한 소원',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','018','MC018',null,'https://www.youtube.com/embed/2m8Ehtb09vo','족구왕',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','019','MC019',null,'https://www.youtube.com/embed/qT_YhXsEhqg','쿵푸 허슬',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','C','020','MC020',null,'https://www.youtube.com/embed/VgqnQspA29M','황당한 외계인: 폴',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','001','MH001',null,'https://www.youtube.com/embed/tDeiSe0RDWs','인시던트',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','002','MH002',null,'https://www.youtube.com/embed/HeHx0lRvbYE','47 미터',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','003','MH003',null,'https://www.youtube.com/embed/Ej25zrnaTXk','곡성',50,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','004','MH004',null,'https://www.youtube.com/embed/upT8PqyRkNQ','검은 사제들',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','005','MH005',null,'https://www.youtube.com/embed/hx2wUzYh5EE','사바하',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','006','MH006',null,'https://www.youtube.com/embed/x8r2YvJC0Us','양들의 침묵',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','007','MH007',null,'https://www.youtube.com/embed/qecwZJFpO0k','파라노말 액티비티',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','008','MH008',null,'https://www.youtube.com/embed/EDD5p7scmhk','부산행',45,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','009','MH009',null,'https://www.youtube.com/embed/T1hCa35W34M','그것',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','010','MH010',null,'https://www.youtube.com/embed/j8tK11xvs54','오큘러스',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','011','MH011',null,'https://www.youtube.com/embed/Oo1p1yBvMHo','화차',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','012','MH012',null,'https://www.youtube.com/embed/0DXxZwlvjsg','세븐데이즈',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','013','MH013',null,'https://www.youtube.com/embed/cuY_BGtnU9Y','엑소시스트',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','014','MH014',null,'https://www.youtube.com/embed/xG4EEVZy9nE','유주얼 서스펙트',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','015','MH015',null,'https://www.youtube.com/embed/5q-EqZGA03A','28주 후',20,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','016','MH016',null,'https://www.youtube.com/embed/0Ww2LQsG07c','월드워Z',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','017','MH017',null,'https://www.youtube.com/embed/M7UUg2qiJkM','알이씨',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','018','MH018',null,'https://www.youtube.com/embed/fb7_v7FKtng','알포인트',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','019','MH019',null,'https://www.youtube.com/embed/w3NMBvSo7j4','좀비랜드',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','H','020','MH020',null,'https://www.youtube.com/embed/ckSgdhThuys','나는 전설이다',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','001','MR001',null,'https://www.youtube.com/embed/L9y9aJ13oCI','러브레터',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','002','MR002',null,'https://www.youtube.com/embed/J-in1bhVyaY','지금 만나러 갑니다',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','003','MR003',null,'https://www.youtube.com/embed/7OIFdWk83no','어바웃 타임',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','004','MR004',null,'https://www.youtube.com/embed/07-QBnEkgXU','이터널 선샤인',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','005','MR005',null,'https://www.youtube.com/embed/hlUSgRkkgtw','라라랜드',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','006','MR006',null,'https://www.youtube.com/embed/VFwHs7fEUNs','왓 위민 원트',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','007','MR007',null,'https://www.youtube.com/embed/ndtX6dtsQ0A','내 머리 속의 지우개',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','008','MR008',null,'https://www.youtube.com/embed/mUpJ18MRe8s','건축학개론',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','009','MR009',null,'https://www.youtube.com/embed/H9Z3_ifFheQ','러브 액츄얼리',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','010','MR010',null,'https://www.youtube.com/embed/dstjxwURKxU','시간 여행자의 아내',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','011','MR011',null,'https://www.youtube.com/embed/wG9G4zVyAME','벤자민 버튼의 시간은 거꾸로 간다',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','012','MR012',null,'https://www.youtube.com/embed/TkEpOvE24NQ','너의 결혼식',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','013','MR013',null,'https://www.youtube.com/embed/ESPFTY8Y-xM','뷰티 인사이드',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','014','MR014',null,'https://www.youtube.com/embed/gPhXjrDANGk','노팅힐',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','015','MR015',null,'https://www.youtube.com/embed/40Ahmsbae94','이프 온리',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','016','MR016',null,'https://www.youtube.com/embed/NhHbprenFdw','미 비포 유',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','017','MR017',null,'https://www.youtube.com/embed/AF4IzD6aVU4','노트북',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','018','MR018',null,'https://www.youtube.com/embed/f7-7PnEGfwM','장난스런 키스',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','019','MR019',null,'https://www.youtube.com/embed/OVKamFhP4xQ','그 시절, 우리가 좋아했던 소녀',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','R','020','MR020',null,'https://www.youtube.com/embed/nU7QQbCxa5I','첫 키스만 50번째',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','001','MS001',null,'https://www.youtube.com/embed/7Rz-_40Qf_Y','엘리시움',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','002','MS002',null,'https://www.youtube.com/embed/hRhyJPmfoNg','인터스텔라',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','003','MS003',null,'https://www.youtube.com/embed/o_jF3T1DfiY','배틀쉽',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','004','MS004',null,'https://www.youtube.com/embed/LIQrhm2qk-k','레디 플레이어 원',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','005','MS005',null,'https://www.youtube.com/embed/MtWXBWuiwVo','프로메테우스',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','006','MS006',null,'https://www.youtube.com/embed/Ku_IseK3xTc','투모로우',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','007','MS007',null,'https://www.youtube.com/embed/he21BE70f1Y','엣지 오브 투모로우',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','008','MS008',null,'https://www.youtube.com/embed/mNezVsOX9N8','터미네이터 다크 페이트',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','009','MS009',null,'https://www.youtube.com/embed/QVk-PU1xMjQ','퍼스트맨',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','010','MS010',null,'https://www.youtube.com/embed/XNSNti8q_UQ','애드 아스트라',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','011','MS011',null,'https://www.youtube.com/embed/90cqM3_Bfvs','마션',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','012','MS012',null,'https://www.youtube.com/embed/HuA0SChqiBg','픽셀',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','013','MS013',null,'https://www.youtube.com/embed/rL6RRIOZyCM','아이 로봇',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','014','MS014',null,'https://www.youtube.com/embed/w0Cii08vz1w','인타임',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','015','MS015',null,'https://www.youtube.com/embed/yHIZFeKWd1I','혹성탈출 종의 전쟁',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','016','MS016',null,'https://www.youtube.com/embed/efZRXYFkIcA','2001 스페이스 오디세이',5,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','017','MS017',null,'https://www.youtube.com/embed/aYxwHwB6TAw','그래비티',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','018','MS018',null,'https://www.youtube.com/embed/wACNe5jpLGw','인디펜던스 데이 리써전스',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','019','MS019',null,'https://www.youtube.com/embed/a1G9EJU4llA','오블리비언',null,null,null,'admin@admin.com');
Insert into RETULIX.TRAILER (DIV,GENRE,NUM,IDX,API_IDX,URL,TITLE,GOOD,CLICK,ZZIM,EMAIL) values ('M','S','020','MS020',null,'https://www.youtube.com/embed/CBw3tM2CcMM','패신저스',null,null,null,'admin@admin.com');
REM INSERTING into RETULIX.REVIEW
SET DEFINE OFF;
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','500','DA500','천재킬러를 빡치게 만들면 안되는 이유','https://www.youtube.com/embed/wlao9pF9uug',null,null,null,null,'trip@hotmail.com','DA001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','501','DA501','천재 킬러가 유혹에 대응하는 방법','https://www.youtube.com/embed/x0_1dLKt0g4',null,null,null,null,'bman@yahoo.com','DA001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','502','DA502','[영보TV] 은퇴한 킬러의 잔혹한 19금액션!! 넷플릭스 신작영화 폴라리뷰!!','https://www.youtube.com/embed/wWVWJCjalqI',null,null,null,null,'youngbotv@daum.net','DA001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','503','DA503','영웅이라 부르기엔 너무나 폭력적이고 잔혹한 히어로, 퍼니셔 이야기','https://www.youtube.com/embed/DAdlo60ZcqI',null,null,null,null,'genius@gmail.com','DA002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','504','DA504','범죄자는 무조건 죽이는 마블 히어로','https://www.youtube.com/embed/VEdReNQRp4E',null,null,null,null,'reviewang@gmail.com','DA002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','505','DA505','범죄자는 재판없이 사형입니다 [ 퍼니셔 ]','https://www.youtube.com/embed/B7YdJVVmXfM','" 너한테 죄가 있다면 넌 죽는다 "',null,null,null,'incheon@yahoo.com','DA002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','506','DA506','DC드라마가 재밌다고? 활든 깡패 애로우 리뷰','https://www.youtube.com/embed/PyDO_fXlLf0',null,null,null,null,'kimchiman123@gmail.com','DA004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','507','DA507','화살로 세상을 구한 현대판 로빈후드','https://www.youtube.com/embed/sB45ZBcB_yg','낮에는 억만장자 바람둥이지만 밤에는 활을 들고 악당을 물리치는 그린 애로우의 이야기 .',null,null,null,'hamlet_movies@gmail.com','DA004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','508','DA508','활과 화살로 쓰레기들에게 정의구현하는 재벌2세','https://www.youtube.com/embed/BuGtcmwvQfg',null,null,null,null,'shong@hotmail.com','DA004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','509','DA509','Jessica Jones Review ① (Comparison with Dare Devil.. etc) by Nofeetbird','https://www.youtube.com/embed/zFlFqM7EKwQ',null,null,null,null,'nofootbird@gmail.com','DA003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','510','DA510','[리뷰] 제시카 존스 시즌 2 - 돌아온 알콜중독 사립탐정','https://www.youtube.com/embed/lxyXkFT5oqk',null,null,null,null,'rkdwns@daum.net','DA003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','511','DA511','교통사고 이후 깨어났더니 초능력을 얻게 된 미녀히어로','https://www.youtube.com/embed/6Og6g6HZeD8',null,null,null,null,'ans@daum.net','DA003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','512','DA512','배가본드 리뷰 E01-02','https://www.youtube.com/embed/5p7ZYztZIs8',null,null,null,null,'uppercut@naver.com','DA005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','513','DA513','배가본드 리뷰 E03-04','https://www.youtube.com/embed/m2oOXMxveKU',null,null,null,null,'uppercut@naver.com','DA005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','514','DA514','배가본드 리뷰ㅣ첫 장면 해석ㅣ1부','https://www.youtube.com/embed/j32aFtQbRSY','저를 포함한 배가본드를 보시는 분들이 많이 궁금하셔서 준비한 특집. 차달건은 어쩌다 고해리를 저격하게 되었나를 추측해보았습니다',null,null,null,'reviewtns@gmail.com','DA005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','515','DA515','[켠김에 엔딩까지] 태양의 후예','https://www.youtube.com/embed/T2egnXbcJ7U',null,null,null,null,'cabletv@yahoo.com','DA006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','516','DA516','[해외반응] ''태양의 후예'' 미국반응, 영어권 반응. "꼭 봐야만 하는 드라마!"','https://www.youtube.com/embed/9WLwFU3lVCo','미국 동영상 사이트인 DramaFever 에서도 소개 되어, 6,000개 이상의 리뷰가 달리며 큰 인기를 끌고 있습니다.',null,null,null,'react@gmail.com','DA006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','A','517','DA517','[태후앓이♨] 송송커플의 직진고백부터 달달 명대사 모음ZIP','https://www.youtube.com/embed/FMXwmrDTZgk',null,null,null,null,'kbs_antena@daum.net','DA006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','518','DC518','미운 정이 세상 무섭다는 표치수 X 손예진 ♡ 츤츤 케미가 이 세상 급이 아니야 | Crash','https://www.youtube.com/embed/ZHmVA1yqbAU','어느 날 돌풍과 함께 패러글라이딩 사고로 북한에 불시착한 재벌 상속녀 윤세리와 그녀를 숨기고 지키다 사랑하게 되는 특급 장교 리정혁의 절대 극비 러브스토리를 그린 드라마',null,null,null,'netvo@daum.net','DC001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','519','DC519','사랑의 불시착 결방 특집','https://www.youtube.com/embed/5L6_HwRa_5Y','사랑의 불시착 결방 특집 (#crash landing of love#?的迫降#사랑의불시착#현빈#손예진)',null,null,null,'dingo@daum.net','DC001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','520','DC520','[드라마리뷰]사랑의불시착, 해피엔딩이 될 수 있을까?','https://www.youtube.com/embed/4brmHAymqqs','손예진, 현빈 출연인 tvN드라마 ''사랑의 불시착'' 2화까지 보고 만든 리뷰입니다.
북한 배경이라 신기하기도 하면서 많은 부분들이 중국에 있을때 경험해봤던거라 반갑기도 했어요.
앞으로 어떻게 진행될지 궁금한 드라마입니다.',null,null,null,'uppercut@naver.com','DC001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','521','DC521','착하고 순진한 호구에서 싸이코패스로 각성해 버린 남자','https://www.youtube.com/embed/rO63mqUyZlQ','★ 본 영상은 tvN과 협의된 영상입니다.
오늘 소개해 드릴 드라마는
#싸이코패스다이어리
#달빛뮤즈
#드라마',null,null,null,'eyesonme@naver.com','DC002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','522','DC522','조폭과 싸이코패스가 엘리베이터를 탔다!','https://www.youtube.com/embed/OygsMKa1xAg','싸이코 패스 다이어리..! 개인적으로 저는.. 호구가 싸이코패스라고 착각하는데 이게 먹혀.ㅋㅋ 이런 설정들이 재밌었습니다. 근데 이 싸이코패스라는 소재를 통해서 우리 감정중에 화를 다루려고 하는거 같아요. 평소에 화를 못내고 사는 사람들. 참고 사는 사람들, 직장인들이나 학생들에게 대리만족을 시켜줄 수 있는 드라마이지 않을까 생각이 들고요. 반면에 기억 상실증이라든가, 재벌 싸이코패스, 이야기 진행상 현실과는 좀 동떨어진 설정이 있어요. 어떤분들에게는 재미의 요소가 되겠지만 다른 분들에게는 또 유치할 수 있겠다라는 생각이 드는군요. 이런부분들은 드라마 선택하실때 고려해보시고.. 분명 소재는 충분히 흥미롭습니다. 근데 아직 두고봐야죠. 계속 방영중이니까..! 나도 아직 더 봐야될거 같애요.ㅋㅋ',null,null,null,'unjun@naver.com','DC002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','523','DC523','정신과 의사가 싸이코패스 드라마를 본다면 !? [싸패다 ep1 리뷰]','https://www.youtube.com/embed/zFPE5iAidIA','오늘 영상도 즐거우셨나요? 닥프를 구독하시면, 매주 재미있고 건강한 영상이 함께합니다. 구독은 건강입니다♥',null,null,null,'sogaenam@naver.com','DC002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','524','DC524','존재감 없던 내가 멸망한 세계에서 초인기 스트리머가 된다!?','https://www.youtube.com/embed/5IcWFG7abcM','#데이브레이크 #netflix',null,null,null,'sogaenam@naver.com','DC003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','525','DC525','드라마 ‘으라차차 와이키키 2’(1) 리뷰 (공연 읽어주는 기자, 드라마 리뷰 #19) 병맛연기, 병맛코드! 시즌1과 연결이 안 된다? 약일까, 독일까?','https://www.youtube.com/embed/wBNzngP3Myo','공연 읽어주는 기자! 드라마 리뷰 열아홉 번째 시간은 JTBC 월화드라마 ‘으라차차 와이키키 2’ 제1회, 제1화 리뷰 ‘병맛연기, 병맛코드! 시즌1과 연결이 안 된다? 약일까, 독일까?’입니다.',null,null,null,'uppercut@naver.com','DC004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','526','DC526','♨핫클립♨ [HD] 우울할 땐 *이이경* 참다참다 오줌 폭발한 대배우','https://www.youtube.com/embed/-LVzjwlQFEc','☆웃음 지뢰☆ 우울할 땐 이이경
오줌 참다 참다 시원↗하게 다 놓아버린 이이경',null,null,null,'cabletv@yahoo.com','DC004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','527','DC527','[골라봐야지] 믿고 보는 웃음폭탄♨ 배꼽 도둑 ''이이경(Lee Yi kyung)''을 소개합니다 *^^* #으라차차 와이키키2 #JTBC봐야지','https://www.youtube.com/embed/yzaRghKlT30','〈으라차차 와이키키〉의 믿고 보는 웃음 폭탄♨ ''이준기''(이이경)
웃음이 한층 업그레이드된 〈으라차차와이키키2〉 이준기로 컴백',null,null,null,'react@gmail.com','DC004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','528','DC528','[스페셜] 팝콘각↗ ♨이선웅vs차명주♨ 불꽃튀는 티키타카.zip ＜검사내전(Diary of a prosecutor)＞','https://www.youtube.com/embed/6CUGkQgnNUM','팝콘각↗ 10분 동안 싸우는 거 실화?
숨 쉴 틈 없이 만나기만 하면 싸우는 두 사람
감성적인 ''이선웅'' vs 이성적인 ''차명주''',null,null,null,'kbs_antena@daum.net','DC005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','529','DC529','(Po불편wer) 살 떨리는 정려원(Jung Ryeo-won)의 패기에 숨 막히는 ''형사2부'' 검사내전(Diary of a prosecutor) 2회','https://www.youtube.com/embed/5C8llbDHRYs','차명주(정려원) 빼고 아지트 ''물안개''에 모인 형사2부!
"패기가 있는 건지, 버릇이 없는 건지…"
차명주가 불편하기만 한 형사2부
도대체 차명주는 왜 진영에 왔을까?',null,null,null,'uppercut@naver.com','DC005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','530','DC530','주부도둑들의 성장기 《굿 걸스》','https://www.youtube.com/embed/c1Ogv7dXkgw','우연히 마트를 털게 된 평범한 주부들이 마피아를 능가하는 범죄조직으로 거듭나는 파란만장 성장기. 근래들어 가장 즐겁게 정주행한 넷플릭스 오리지널 시리즈 《굿 걸스》를 소개해드립니다. 굿 걸스는 첫번째 시즌, 10개의 에피소드가 공개되어 있으며 시즌2 제작이 확정되어 2019년 방영 예정입니다.',null,null,null,'uppercut@naver.com','DC006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','531','DC531','조직의 돈을 훔쳐버린 간큰 아줌마들','https://www.youtube.com/embed/Nl860euVVts',null,null,null,null,'reviewtns@gmail.com','DC006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','532','DC532','지옥에 가야 되는데 실수로 천국에 와버렸다','https://www.youtube.com/embed/swkbxDKyqcQ','안녕하세요, 미들뻔입니다.
오늘 소개해드릴 작품은 ''굿 플레이스(Good Place)'' 입니다.',null,null,null,'kimchiman123@gmail.com','DC007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','533','DC533','다단계판매원이 운빨로 천국가서 벌어진 일','https://www.youtube.com/embed/m7aD5pFIvLs','드라마 제목 : 굿 플레이스
#영화리뷰 #드라마리뷰 #영화추천',null,null,null,'hamlet_movies@gmail.com','DC007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','534','DC534','신선도100% 독특하고 유쾌한 사후세계. 굿 플레이스 가이드 리뷰','https://www.youtube.com/embed/b33qMSCxXMU','넷플릭스 추천작. 천국이 존재한다면 바로 이 곳일까? 넷플릭스 고평점 추천 드라마 가이드 리뷰: 굿 플레이스 로튼토마토, IMDb, 메타크리틱에서 고평점을 받은 영화와 드라마를 추천합니다.',null,null,null,'shong@hotmail.com','DC007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','C','535','DC535','운빨로 천국을 간 여자','https://www.youtube.com/embed/sq8X0gjAEtg','여러분 안녕하세요 삐맨입니다.
오늘은 넷플릭스의 드라마 ''굿 플레이스''에 대해서 알아보려고 합니다. 죽고나서 ''굿 플레이스'' 관리자의 실수로 인해 천국을 오게된 엘레너의 이야기를 담고 있습니다.',null,null,null,'serin@naver.com','DC007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','H','536','DH536','인간을 요리하는 천재 살인마','https://www.youtube.com/embed/VLiIPiybIf4','넷플릭스 방영 중인 드라마 한니발입니다
*본 영상은 넷플릭스의 지원을 받아 제작되었으며, 유료 광고를 포함하고 있습니다.',null,null,null,'sangung@yahoo.com','DH001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','H','537','DH537','기괴하고 충격적인 방식을 쓰는 싸이코패스','https://www.youtube.com/embed/WwB1GzdD0d4','미드 소개영상입니다
[ CH. 비디오 가게는 각종 해외 영화 드라마 미국드라마 등을 소개해드리고 추천 해드리는 영화 소개 유튜브 채널입니다 ]
[미드추천]
영화추천 드라마추천 영화소개 미드소개 채널
소스출처: 미드 - 한니발ㅣ 음악소스: *Aftermath Madness Paranoia
이 노래를 무료로 사용하고 동영상으로 수익을 창출할 수 있지만 동영상 설명에 다음을 포함해야 합니다.
Kevin MacLeod의 Aftermath - Madness Paranoia은(는) Creative Commons Attribution 라이선스(https://creativecommons.org/licenses/... 따라 라이선스가 부여됩니다.
출처: http://incompetech.com/music/royalty-...
아티스트: http://incompetech.com/
*Back Streets Of Seoul
*Underpass',null,null,null,'chvideochannel@yahoo.com','DH001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','H','538','DH538','넷플릭스 오리지널 드라마 킹덤 리뷰 입니다','https://www.youtube.com/embed/8uHBM3gNVSU','#넷플릭스,#킹덤,#좀비
넷플릭스의 오리지널 드라마 킹덤 리뷰 영상입니다
드라마속 많은 이스터 애그를 나름 분석해서 좀비의 역병이 생긴 원인도 예상해 보았습니다
킹덤 시즌2 얼른나왔으면 ㅠㅠㅠ
재밌게 봐주세요',null,null,null,'uppercut@naver.com','DH002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','H','539','DH539','인간 수육 먹고 바이러스에 감염된 사람들이 더 배고파지면 생기는 일','https://www.youtube.com/embed/bTj2zt9B9xQ','? " 처음오신분들은 구독과 , 좋아요! 알람 꾹 " ?
?킹덤 (2019) / #좀비 #킹덤 #스릴러
?김시선 채널은 넷플릭스 영상 사용을 저작권자로부터 허가받았습니다.
킹덤 보기 : http://bit.ly/kingdom2019
?유튜브 구독하기 : http://bit.ly/siseon
???인스타그램 : http://www.instagram.com/kimsiseon
?페북 : http://www.facebook.com/siseon13
#조선 #넷플릭스 #한국 #갓 #netfilx #god #got #kingdom
#식물 #배두나 #경찰
#범죄 #고기 #영화유튜브 #김시선
#인기 #영화 #주제 #김은희 #김성훈
#드라마 #사극 #전통 #역사 #권력 #헬조선',null,null,null,'eyesonme@naver.com','DH002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','H','540','DH540','식량 고갈로 망한 한국땅에서 살아남는 생존법','https://www.youtube.com/embed/2S1lq2mvnI8','시하! 영화친구들 오늘은 ''김시선의 정주행각'' 3번째 작품으로 ''킹덤''을 소개했습니다. 제 설명을 끝까지 듣고 나면 이 작품이 얼마나 괜찮은 작품인지 어느 정도 동의하게 되실 거예요. 오늘도 끝까지 재밌게 봐주시고 다음 주엔 더 재밌는 작품 들고 옵니다. 일단 아직도 킹덤 안보신 분들은 시즌2 나오기 전에 정주행ㄱㄱ~
드라마 제목 : 킹덤 시즌1 (넷플릭스에서 보실 수 있음!)
?김시선 채널은 영상 사용을 저작권자로부터 모두 허가받았습니다.
#넷플릭스 #인기 #영화리뷰 #드라마소개',null,null,null,'eyesonme@naver.com','DH002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','H','541','DH541','기묘한 이야기 시즌2 요약 및 리뷰','https://www.youtube.com/embed/Yu1sZkz_vT8','오늘은 기묘한 이야기 시즌2를 리뷰해 보았습니다
넘나 재밌습니다 꼭 보세요 두번 보세요 안녕하세요 초보 리뷰어 넷보남입니다
넷플릭스 오리지날 컨텐츠를 전문으로 리뷰해 보려 합니다
실력도 모자라고 발음도 안좋지만 최소한 단순히 줄거리를 나열하기만 하는 양산형 리뷰어는 되지 않겠습니다
물론 어느정도 다른 리뷰어와 비슷한 내용이 있겠지만(소재가 같으니)
그 중에서도 한가지라도 새로운 관점 새로운 평론을 보여드리겠습니다
그럼 초보 딱지 떼는 그 날 까지 ! 넷보남과 함께 해 주십시요',null,null,null,'netvo@daum.net','DH003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','H','542','DH542','[10분요약] 기묘한 이야기 시즌 완벽정리 | 시즌3 보기 전 필수 | 넷플릭스 | 딩고무비','https://www.youtube.com/embed/49UXkyf0SuI','기묘한 이야기3를 보고 싶은데 시즌 1,2가 가물가물하다면…? (응…내 얘기)
이거 보고 바로 기묘한 이야기 시즌3 정주행 ㄱㄱ
#딩고무비 #dingomovie
#기묘한이야기 #StrangerThings #10분요약
?딩고무비 구독하기
http://bit.ly/dingo_movie
“영화에 관한 모든것이 궁금하다면 지금 바로 딩고무비 구독하기!”
?딩고무비 링크
Facebook: https://www.facebook.com/dingo.movie.kr
Instagram: https://www.instagram.com/dingo_movie/
네이버TV: https://tv.naver.com/dingomovie',null,null,null,'dingo@daum.net','DH003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','H','543','DH543','(스포주의) 기묘한 이야기 시즌3 이스터 에그 해석 및 리뷰','https://www.youtube.com/embed/r1XKvk_Jd90','#기묘한이야기,#넷플릭스,#시묘한이야기시즌3
기묘한 이야기 시즌3 이스터 에그 해석과
스포일러 리뷰입니다',null,null,null,'uppercut@naver.com','DH003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','H','544','DH544','범죄심리학의 교과서 《마인드 헌터》, 넷플릭스 필관람작!','https://www.youtube.com/embed/NTAI7i4VovI','여기는 영화의 미학을 재미로 풀어내는 곳, 김시선 영화채널입니다.
* 이 영상에 소개된 넷플릭스 올리지널 드라마는 마인드 헌터(시즌1)입니다.
* 이 영상은 ''넷플릭스'' 제작 지원으로 만든 열네 번째 영상입니다. 그렇게 할 수 있게 도와준 구독자 영화 친구들에게 감사드립니다.
영화,일드,미드,중드,등등 영상 콘텐츠 문의 : kim@siseon.kr
영화 마인드 헌터 보기 : http://www.netflix.com/title/80114855
영화 덕후를 위한 또 다른 코너! 영화의발견 시리즈 감상 : http://goo.gl/LvB1dj
김시선X넷플릭스 시리즈 영상들 : https://goo.gl/3fdvij
김시선 일상이 적힌 페이스북 팔로우! : http://www.facebook.com/siseon13',null,null,null,'eyesonme@naver.com','DH004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','H','545','DH545','싸이코패스들의 정신상태가 궁금하다면? - 마인드헌터','https://www.youtube.com/embed/PWz0UzaDv2g','넷플릭스 + 데이빗 핀쳐 = 믿고 보는 드라마라는 공식을 다시 한 번 증명한 ''마인드헌터'' 리뷰입니다. 시즌2까지 19편이 나왔지만, 몰입도가 정말 뛰어난 드라마입니다. 강추!
#마인드헌터 #드라마리뷰 #엉준 #넷플릭스
정기후원하기 : https://fanding.kr/user/ungjune
망작영화제 후원 : https://fanding.kr/user/ungjune
감독 - 데이빗 핀쳐, 칼 프랭클린, 앤드류 더글라스, 아시프 카파디아, 토비아스 린홈, 앤드류 도미닉
출연 - 조나단 그로프, 홀트 맥칼리니, 안나 토브, 소니 발리센티, 스테이시 로카, 한나 그로스, 조 터틀, 재커리 스콧 로스, 코터 스미스, 알버트 존스, 로렌 글래지어
제목 - 마인드헌터
영상에서 못 다한 이야기는 페이스북에서 : https://bit.ly/2I092rE
그냥 엉준의 일상 인스타그램 : https://bit.ly/2KG1XhK
가끔 별점 매기는 엉준의 왓챠 : https://bit.ly/2rpvQtL
엉준이 사용하는 장비 : https://kit.com/ungjune
비즈니스문의 : ungjune@gmail.com
엉준의 SNS 팔로우 해주시고, 좋아요, 구독도 잊지 마세요!!',null,null,null,'unjun@naver.com','DH004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','H','546','DH546','싸이코패스들이 좋아하는 사람에게 하는 몇 가지 행동들.. 오싹','https://www.youtube.com/embed/upcurif5VOg','넷플릭스 드라마 [마인드헌터] 스토리텔링 및 리뷰영상입니다.
이 드라마는 넷플릭스에서 현재 시즌2까지 보실 수 있습니다.
아무튼 오늘도 찾아와주셔서 감사하다는 말씀 남기며 저는 20000..
즐거운 불금 불주말 보내세요!!!
p.s 인코딩 한 다음 유튜브 업로드하고 발견한 아웃트로 음량조절실패..',null,null,null,'sogaenam@naver.com','DH004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','H','547','DH547','흉가에 함부로 살면 안되는 이유','https://www.youtube.com/embed/80n_dtbd71U','넷플릭스 미드 ''힐하우스의 유령'' 스토리텔링 및 리뷰영상입니다.
감사합니다.',null,null,null,'sogaenam@naver.com','DH005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','H','548','DH548','넷플릭스 오리지널 드라마 힐하우스의 유령 리뷰 The Haunting of Hill House','https://www.youtube.com/embed/A1a24WIaAr8','#넷플릭스,#미드,#힐하우스의유령
넷플릭스 오리지널 드라마 힐하우스의 유령 리뷰입니다
강력한 호러 장르의 드라마입니다
공포 영화 좋아하시는 분들! 꼭 보세요
정말 재미있습니다',null,null,null,'uppercut@naver.com','DH005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','R','549','DR549','[미드][하이틴] 미국 10대 상류층들의 복잡한 애정관계','https://www.youtube.com/embed/dbV9k0JHycI','#미드#가십걸#시즌1',null,null,null,'soso@naver.com','DR001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','R','550','DR550','Gossip Girl Complete Series 1-6 Review','https://www.youtube.com/embed/HCRuVnE--Hg','Sharing my thoughts on one of my favourite shows, I love this show so much I hope i''ll continue to love it as I keep rewatching it. Let me know if you have seen it and anything you''d like to share about what you think of it, Favourite Season? Favourite Character? Favourite Moment? I do have one other favourite moment that I didn''t include because it would be a big spoiler Don''t forget to go ahead and subscribe here to keep up to date with all new videos : https://www.youtube.com/subscription_...
For business inquiries: fkvlogsofficial@gmail.com',null,null,null,'fkvlogs24@gmail.com','DR001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','R','551','DR551','Gossip Girl - Season 1 Review','https://www.youtube.com/embed/jQbQucmLxFU','A review of the first season of the TV show "Gossip Girl" by TheFalconReview.',null,null,null,'falconcaptain@gmail.com','DR001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','R','552','DR552','[드라마퀵리뷰] ''도깨비'' 편','https://www.youtube.com/embed/p_6kvtueve4','[드라마퀵리뷰]드.디.어. 퀵리뷰로 ''도깨비''가!
도알못(''도깨비''를 알지 못하는) 이들을 위해, 4분 안에 풀어드려요. 넘나 심쿵하는 것..꼭 봐 두번봐!!
#도깨비 #케이블TVVOD #드라마 #VOD #공유',null,null,null,'cabletv@yahoo.com','DR002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','R','553','DR553','[깨알깨작 #1] 도깨비 :: 혜미와 함께하는 한국드라마 본격 리뷰!! (도깨비 리뷰)','https://www.youtube.com/embed/I9CrKI9_u1A','혜미와 함께하는 한국드라마 본격 리뷰!!
제작 : [REDC] 방솔램, 박혜미, 박정인, 이지혜',null,null,null,'redc@hotmail.com','DR002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','R','554','DR554','비열한 리뷰 - 도깨비 장단점 분석','https://www.youtube.com/embed/lIYyFoCe0U8','도깨비 분석 리뷰입니다.
사용된 무료 음원 -
이 노래를 무료로 사용하고 동영상으로 수익을 창출할 수 있지만 동영상 설명에 다음을 포함해야 합니다.
Audionautix의 One Fine Day은(는) Creative Commons Attribution 라이선스(https://creativecommons.org/licenses/... 따라 라이선스가 부여됩니다.
아티스트: http://audionautix.com/',null,null,null,'tunachamchi@yahoo.com','DR002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','R','555','DR555','도깨비, 태양의 후예를 뛰어넘을 tvN 신작 드라마 [미스터 선샤인] 파헤치기','https://www.youtube.com/embed/mjZm-HhuwlQ','"아아, 이것은 스타작가 김은숙 작가의 드라마라는 것이다."
7월 7일 첫방송되는 김은숙 작가, 이병헌/김태리 주연의 미스터 선샤인!
이번 파헤치기 프롤로그를 시작으로 매주 리뷰가 업로드 됩니다.
저희랑 매주 함께 보시죠!',null,null,null,'shortcut@daum.net','DR003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','R','556','DR556','[드꼬보남] ep.05 드라마 미스터션샤인 1,2화 리뷰 | 화제의 400억 대작이 드디어 베일을 벗었다','https://www.youtube.com/embed/ygBDYPxQyuI','드꼬보남에서 새로 리뷰할 드라마 ''미스터 션샤인''
400억 제작비가 투입 된 시대극,
''태양의 후예''와 ''도깨비''의 제작진,
이병헌의 9년 만의 드라마 복귀작,
화제가 되지 않을 수 없다.',null,null,null,'iconictv@daum.net','DR003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','R','557','DR557','[ENG][한글자막]미스터션샤인을 본 영국남자친구의 리뷰! ※스포주의 Mr.Sunshine Review with my British boyfriend l Serin 세린','https://www.youtube.com/embed/5PjzUlQMAkA','안녕하세요 여러분! 그동안 일이 많아 영상 업로드를 못 하다가 드디어!!! 편집을 끝나고 영상을 올려요! 이번 영상은 아마 제가 편집한 영상 중에 가장 긴 영상이 되지 않을까 싶어요! 남자친구와 얼마 전에 ''미스터 션샤인''이라는 드라마를 보게 되었어요. 저 개인적으로는 굉장히 오랜만에 본 한국드라마였고 남자친구는 태어나서 처음으로 본 한국드라마였어요. 그래서 그런지 서로 드라마를 보고 어떻게 느꼈는지 영상으로 남기면 좋을 것 같아서 리뷰 영상을 만들어봤어요:) 역사 고증이 부족하다, 미스캐스팅이었다 라는 말들을 익히 들어왔던 터라 볼 때도 그 점을 감안하고 드라마를 봤어요. 제 개인적으로는 그런 단점들에도 불구하고 꽤 잘 만들어진 드라마라는 생각을 해요. 역사 드라마 작가는 역사 인식을 가지는 게 맞는 일이긴 하지만 어디까지나 픽션이기 때문에 완벽할 수는 없는 일이라고 생각했구요. 역사 드라마 고증을 잘 하는 일도 물론 중요하지만 그 전에 학교에서 올바른 역사를 먼저 배울 수 있도록 해서 역사 드라마를 접하는 아이들이 헷갈리는 일이 없도록 하면 좋겠다 라는 생각을 했구요. 역사 드라마는 드라마일 뿐이지 교과서가 아니니까요! 그런 점을 감안하고 볼 때 꽤 잘 만들어진, 즐겨볼 만한 드라마라고 생각합니다:) 말이 길었지만 어쨌든 저는 재밌게 봤어요!! 추천합니다!
Hi guys:) I just uploaded a review video with Jamie about a Korean drama ''Mr.Sunshine.'' It was Jamie''s first ever Korean drama and he absolutely loved it. I got recommendation of this drama from lots of students that I''m teaching Korean now and we thought we should try! We had a very honest and clear review of this drama so it you''re interested in it, watch our video and also this video has fair amount of spoilers so be aware of it!!',null,null,null,'serin@naver.com','DR003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','R','558','DR558','나의 아저씨 분석, 둘은 서로 사랑했을까?','https://www.youtube.com/embed/gyPmRiH9d7I','#나의 아저씨 #아이유 #iu
나의 아저씨의 결말은 무슨 의미일까? 둘은 서로 사랑했을까? 작가로서, 한국 드라마 매니아로서 저의 생각은 이렇답니다!',null,null,null,'internationalbubu@naver.com','DR004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','R','559','DR559','[팟캐스트]독서평전 - 드라마[나의 아저씨] 인문학적 해석','https://www.youtube.com/embed/XJ31Pdw0wdg','교육진담 팟캐스트 http://www.podbbang.com/ch/13964
교육진담 블로그 https://blog.naver.com/tureedu
올가교육 홈페이지 http://www.allgaedu.com/',null,null,null,'edutrue@naver.com','DR004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','R','560','DR560','(해외반응) TvN 화제드라마 "나의 아저씨"','https://www.youtube.com/embed/tcr5Xq_Pafw','시청해주셔서 감사합니다. 구독&공감&추천은 큰 힘이됩니다!!',null,null,null,'highlight7373@gmail.com','DR004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','R','561','DR561','멜로가 체질 리뷰 - 띵작인데 왜 안 떴을까..','https://www.youtube.com/embed/TUr5ieqVSqw','안녕하세요 좌충우돌 홍블러입니다.
드디어 프리미어를 처음 배우고 혼자 힘으로만 만든 첫 작품인데
오디오가 너무 ㅠ.ㅠ (마이크 추천 좀 부탁 드려요)
이번 팩폭 신작 리뷰는 ''드라마 멜로가 체질'' 입니다.
몰랐던 배우도 많이 알게 되고, 대사가 워낙 많아서 지칠 수도
있지만 전 띵작이라 생각하는데 시청률이 너무 안 나와서
아쉽네요~~~
여러분 이제 가을도 되고 했으니, 달달하면서 인생 고민케 하는
드라마 멜로가 체질 한 번 정주행 해보세요^^',null,null,null,'ajhongmovie@gmail.com','DR005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','R','562','DR562','호불호 완전 갈리는 #멜로가체질 1,2화 전격 리뷰','https://www.youtube.com/embed/mKjc1iWH24E','하이무비 #멜로가체질 리뷰 잘 보셨나요?
이번편 음향 시스템상의 문제로 음질이 고르지 못한 점 양해바랍니다. 이번 주말에 뭐 볼지 고민될 땐, 하이무비~
★하이컷TV를 구독하고 더 재밌는 영화&드라마 리뷰를 만나보세요★',null,null,null,'highqutv@gmail.com','DR005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','R','563','DR563','[멜로가 체질, 명장면 리뷰] 최고 시청률 1.8%? 인정 못 해! - 여.수.다 1탄','https://www.youtube.com/embed/JBVKEwKzjOc','두 달여 동안 가슴을 콩닥 콩닥 뛰게 만들던 ''멜로가 체질''이 드디어 막을 내렸습니다. 그런데... 시청률이 2%를 넘지 못했다니 ㅠㅜ
아직도 ''멜로가 체질''에서 빠져 나오지 못하고 있는 마스크 토커 여성 셋이 뭉쳤습니다!
♥ 영상 좋아요+구독을 그냥~ 꾹~ 눌러주세요!
#이병헌 #극한직업 #천우희 #안재홍 #임진주 #손범수 #이은정 #황한주',null,null,null,'bitatalk@yahoo.com','DR005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','S','564','DS564','새로운 행성에서 발견된 괴생명체','https://www.youtube.com/embed/wjNI0qGJE7M','오늘은 드라마 ''로스트 인 스페이스''에 대해 알아보려 합니다.',null,null,null,'bman@yahoo.com','DS001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','S','565','DS565','넷플릭스 미드 추천 - 로스트 인 스페이스 시즌1 간단후기 및 영상','https://www.youtube.com/embed/sb2OGF2DKrg','넷플릭스 미드 추천 로스트인 스페이스의 간단후기와 정보 영상을 공개합니다',null,null,null,'kongtv@daum.net','DS001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','S','566','DS566','넷플릭스] 로스트 인 스페이스 시즌 1','https://www.youtube.com/embed/erKvMm2dU0w','로스트 인 스페이스 시즌 1 입니다. 시즌 2는 12월 24일',null,null,null,'bumti@gmail.com','DS001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','S','567','DS567','미국에 착륙해서 7개월 동안 굳어있는 외계 물체','https://www.youtube.com/embed/VDx-gLFwQdA','미국에 착륙해서 7개월 동안 굳어있는 외계 물체',null,null,null,'bman@yahoo.com','DS002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','S','568','DS568','외계인 본진 털러 가며 생기는 일','https://www.youtube.com/embed/9cYDt800ufU','오늘은 sf시리즈 어나더 라이프를 리뷰 해 보았습니다
철저한 킬링타임 시리즈로 추천 까지는 아니고 소개 정도 해 드립니다',null,null,null,'netvo@daum.net','DS002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','S','569','DS569','지구에 정박한 UFO ! 그 외계 문명을 찾아가는 SF 어드벤처','https://www.youtube.com/embed/LGZmvN2T0IU',null,null,null,null,'reviewman@gmail.com','DS002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','S','570','DS570','내셔널지오그래픽 최초의 SF드라마 《마스》','https://www.youtube.com/embed/TwWabiAF1Jo','내셔널지오그래픽채널에서 최초로 선보이는 SF드라마 시리즈 ''인류의 새로운 시작, 마스(Mars)''.
미항공우주국에서 실제 진행중인 화성거주 프로젝트를 기반으로 이 계획이 실현되는 2033년의 이야기를 총 6편의 에피소드로 선보이는 SF드라마입니다.',null,null,null,'gongu@yahoo.com','DS003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','S','571','DS571','태양 폭발''이 발생하면 화성에서 생길 수 있는 일들','https://www.youtube.com/embed/py4FsejE-ro','내셔널지오그래픽 SF드라마 ''마스(MARS)',null,null,null,'nongovernmental@hotmail.com','DS003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','S','572','DS572','화성이 돈을 벌려는 민간기업들로 가득찬다면 어떻게 될까?','https://www.youtube.com/embed/00zMQr8-Dyw','화성엔 과학자나 몽상가만 가는 게 아니라 이윤을 내려는 사람들도 있을 겁니다.
결국 화성은 수백 개의 민간 기업들로 가득할 것이라는 전망이 있습니다.
인류는 지금까지 어딘가에 상상도 못 할 부가 가득하다면 그걸 차지하러 떠났습니다.
북극에는 엄청난 석유와 가스가 저장되어 있고, 수십 조 달러의 가치가 있을 거라고 합니다.
그에 따라 러시아, 미국, 캐나다, 덴마크, 노르웨이 등 수많은 나라가 북극 땅에 대한 관할권을 주장해왔죠.
기업들의 북극에 대한 사고방식은 대부분 ''어서 차지하러 가자''라는 겁니다.
화성 정착 프로그램은 이러한 골드러시와 비슷한 부분이 아주 많습니다.',null,null,null,'nongovernmental@hotmail.com','DS003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','S','573','DS573','인간의 두뇌로 절대 상상할 수 없는 드라마 블랙미러 총정리!','https://www.youtube.com/embed/oYxSyBr8x48',null,null,null,null,'muk@gmail.com','DS004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','S','574','DS574','영국 공주를 납치한 범인이 요구한 기괴한 명령','https://www.youtube.com/embed/W-g0VTts5jY',null,null,null,null,'stephanhockingkk@gmail.com','DS004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','S','575','DS575','천재가 만들다가 미쳐버린 게임','https://www.youtube.com/embed/tPFMgCvVCxk',null,null,null,null,'bman@yahoo.com','DS004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','S','576','DS576','초능력 소녀와 소년들, 그리고 괴물! ''기묘한 이야기'' 시즌 1 내용 정리','https://www.youtube.com/embed/zqAUED2Aakc','그리고 시즌 2를 보기 전에 어서 시즌 1을 복습합시다!!!!',null,null,null,'genius@gmail.com','DS005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','S','577','DS577','기묘한 이야기 시즌 1,2 한방에 정리(인물별 떡밥 정리)','https://www.youtube.com/embed/9lV1UK5qFxw',null,null,null,null,'uppercut@naver.com','DS005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('D','S','578','DS578','4차원 세계에서 나와 아이들을 먹어버리는 역대급 괴물','https://www.youtube.com/embed/xMox0ozJkaU',null,null,null,null,'eyesonme@naver.com','DS005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','579','MA579','어벤져스 (2012)','https://www.youtube.com/embed/b1LBr0iGQ6c',null,null,null,null,'3bunoddugi@daum.net','MA001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','580','MA580','The Avengers movie review','https://www.youtube.com/embed/36CftNuJQgQ','Iron Man, Captain America, Thor, The Incredible Hulk, Black Widow, Hawkeye, and Nick Fury assemble to stop Loki in "The Avengers". Jeremy gives you his review!',null,null,null,'jeremyking@yahoo.com','MA001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','581','MA581','The Avengers - Movie Review by Chris Stuckmann','https://www.youtube.com/embed/u5KuJl5qJ2A','Chris Stuckmann reviews The Avengers, starring Robert Downey Jr., Chris Hemsworth, Chris Evans, Jeremy Renner, Mark Ruffalo, Scarlett Johansson, Clark Gregg, Samuel L. Jackson, Cobie Smulders, Tom Hiddleston and Stellan Skarsg?rd. Directed by Joss Whedon.',null,null,null,'chrisstuckshit@hotmail.com','MA001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','582','MA582','어벤져스: 에이지 오브 울트론''이 남긴 떡밥들 1/2','https://www.youtube.com/embed/fpWoxlJZC_g',null,null,null,null,'nofootbird@gmail.com','MA002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','583','MA583','어벤져스: 에이지 오브 울트론''이 남긴 떡밥들 2/2','https://www.youtube.com/embed/eV-Dcfg_T74',null,null,null,null,'nofootbird@gmail.com','MA002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','584','MA584','어벤져스 에이지 오브 울트론 / 영화 P리뷰','https://www.youtube.com/embed/aWrmXvvfGrY',null,null,null,null,'moviemonster@yahoo.com','MA002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','585','MA585','어벤져스: 인피니티 워'' 스포X 리뷰','https://www.youtube.com/embed/8G45KD6M2jc',null,null,null,null,'unjun@naver.com','MA003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','586','MA586','어벤져스 인피니티 워 _ 영화 리뷰 _ 무비몬스터','https://www.youtube.com/embed/iECDe1JH0E8','스포일러 있음,NO편집,다 까발리는 발빠른 리뷰',null,null,null,'moviemonster@yahoo.com','MA003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','587','MA587','인피니티 워 리뷰 : 고퀄리티 예고편인데!?','https://www.youtube.com/embed/jWcbLxSUw14',null,null,null,null,'cottoncandy@naver.com','MA003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','588','MA588','어벤져스 엔드게임 스포없는 리뷰/ 엔드게임 보기전 봐야 하는 관련 영화 정리','https://www.youtube.com/embed/VRgB8Li6otw','영화 ''어벤져스:엔드게임''을 보러 가기 전, 보고 가야하는 관련 영화들을 정리한 영상입니다.',null,null,null,'bbbbbreview@yahoo.com','MA004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','589','MA589','안녕.. 11년 간 사귄 친구, 우리들의 영원한 HERO: 어벤져스: 엔드게임 리뷰(4DX)','https://www.youtube.com/embed/L63PKoYFvec','11년의 대장정을 마무리하는 최후의 전투.
어벤져스의 기나긴 이야기. 토니 스타크, 스티브 로저스, 토르의 각자의 결말. 타노스와의 마지막 결전을 그린 히어로 영화사에서 중요한 위치에 있는 작품. 어벤져스: 엔드게임 리뷰입니다.',null,null,null,'liner@hotmail.com','MA004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','590','MA590','더 이상 어벤져스는 안 나왔으면 좋겠습니다 - 어벤져스:엔드게임','https://www.youtube.com/embed/aPv4EHc6XlU','가장 완벽했던 마지막 편, 마지막 편이라는 건 이렇게 만드는 거야를 보여준 ''어벤져스:엔드게임'' 우리의 추억 11년도 함께 마무리 되었습니다.',null,null,null,'unjun@naver.com','MA004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','591','MA591','비밀 슈퍼 특수요원으로 제안을 받은 동네 양아치ㅣ 킹스맨 : 시크릿 에이전트 (Kingsman: The Secret Service, 2015)','https://www.youtube.com/embed/LaVJ-izcWD8','영화를 명작으로 만드는 매튜본 감독의 연출력 해석',null,null,null,'eeeki@daum.net','MA005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','592','MA592','매너가 사람을 만든다 [킹스맨: 시크릿 에이전트]','https://www.youtube.com/embed/UXnQ00t5J0A','출발 비디오 여행',null,null,null,'moviekok@yahoo.com','MA005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','593','MA593','킹스맨 시크릿 에이전트 _ 가이드 리뷰 _ 무비몬스터','https://www.youtube.com/embed/ooPmNH82Rj4',null,null,null,null,'moviemonster@yahoo.com','MA005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','594','MA594','[영화걸작선] 40회 - 킹스맨: 골든 서클 1편','https://www.youtube.com/embed/9ytTk6J9-V0',null,null,null,null,'noone@gmail.com','MA006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','595','MA595','[영화걸작선] 41회 - 킹스맨: 골든 서클 2편','https://www.youtube.com/embed/ttXHY9CKQoQ',null,null,null,null,'noone@gmail.com','MA006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','596','MA596','킹스맨 2 골든 서클 _ 해리는 어떻게 살아났나? _ 가이드 리뷰 _ 무비몬스터','https://www.youtube.com/embed/Yt6TlXOC_8U','해리는 어떻게 살아났나?',null,null,null,'moviemonster@yahoo.com','MA006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','597','MA597','살인청부업자의 개를 죽이면 일어나는 일 존윅 리뷰입니다.','https://www.youtube.com/embed/9o4e75soXrs','그를 건드리지 말았어야 했다',null,null,null,'moviemovie@yahoo.com','MA007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','598','MA598','Child Discipline of Mob Boss','https://www.youtube.com/embed/mwDnhIy1lCw',null,null,null,null,'zipmovie@gmail.com','MA007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','599','MA599','전직 킬러의 개를 건드리면 이렇게 됩니다.','https://www.youtube.com/embed/q9pr5GSngfo',null,null,null,null,'jum@hotmail.com','MA007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','600','MA600','[영화걸작선] 18회 - 존 윅: 리로드','https://www.youtube.com/embed/5GIzYpC6eow',null,null,null,null,'noone@gmail.com','MA008',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','601','MA601','주인공이 힘을 감추는 영화 존윅 리로드 리뷰','https://www.youtube.com/embed/tJssEgcGepo',null,null,null,null,'taco@daum.net','MA008',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','602','MA602','(노스포) 존 윅 2 정말 솔직한 감상 후기 | 조조영화 #2 | By. 민호타우르스','https://www.youtube.com/embed/w-yCg0yBnaM','존 윅2를 직접 보고 정말 솔직하게 감상 후기, 리뷰 합니다.',null,null,null,'minho@gmail.com','MA008',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','603','MA603','영화관에서 안보면 개손해! 개쩌는 액션의 존윅 3','https://www.youtube.com/embed/7kFgrMEfIWE','존윅 3에서는 ''당신이 처음 보는 액션이 온다''를 캐치프래이즈로 걸었는데 그 말은 레알트루입니다.',null,null,null,'reviewang@gmail.com','MA009',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','604','MA604','존 윅 3: 파라벨룸 가이드 리뷰 by 발없는새','https://www.youtube.com/embed/4NMVebATfVs',null,null,null,null,'nofootbird@gmail.com','MA009',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','605','MA605','존 윅 3 명장면 총정리 top 11','https://www.youtube.com/embed/5uCjH9t6a7Y',null,null,null,null,'bman@yahoo.com','MA009',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','606','MA606','하필 그의 딸을 납치해버렸다... | 테이큰 | 액션 | 킬타(킬링타임) | 영화추천','https://www.youtube.com/embed/KE-S_v1uAO8',null,null,null,null,'killtarian131@yahoo.com','MA010',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','607','MA607','[B tv 영화 추천/movie Big #50] 테이큰1','https://www.youtube.com/embed/-7hpFjADnUI','전직 특수 요원의 프로페셔널한 추격이 시작된다!',null,null,null,'skmovies@daum.net','MA010',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','608','MA608','딸을 유괴한 납치범에게 복수하는 영화','https://www.youtube.com/embed/COqnj-GV98k','딸을 유괴한 납치범에게 통쾌한 복수를 날린 액션영화',null,null,null,'jackkongs@hotmail.com','MA010',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','609','MA609','제이슨 본 (jason bourne) 보기전 모아보는 본 씨리즈(1,2,3) 스토리','https://www.youtube.com/embed/U-YrqN0FMS4','본아이덴티티, 본슈프리머시, 본얼티메이텀 줄거리,스토리 요약한 영상입니다.',null,null,null,'2ddudae@gmail.com','MA011',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','610','MA610','[본 시리즈 정리][본 아이덴티티/본 슈프리머시/본 얼티메이텀]','https://www.youtube.com/embed/k7v8GJCVpck',null,null,null,null,'windandrain@gmail.com','MA011',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','611','MA611','Bourne Trilogy in 5 minutes!','https://www.youtube.com/embed/yojrsh7KBVg',null,null,null,null,'redmonmov@daum.net','MA011',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','612','MA612','톰하디의 쉴틈 없는 사막 추격 액션영화 [ 무비한잔 영화리뷰 ]','https://www.youtube.com/embed/imVscQ47kTk',null,null,null,null,'hanjan@hotmail.com','MA012',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','613','MA613','접속무비월드 NEW 영화는 수다다_매드맥스: 분노의 도로 (Mad Max: Fury Road, 2015)','https://www.youtube.com/embed/DwFT3ULrBAc',null,null,null,null,'netherlandman@gmail.com','MA012',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','614','MA614','멸망한 지구, 얼마 남지 않은 물과 기름을 쟁취하라','https://www.youtube.com/embed/HC3lBJIbmn4','김흥미가 추천하는 오늘의 영화입니다.',null,null,null,'mimi@naver.com','MA012',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','615','MA615','분노의 액션 성룡과 장만옥의 전설의 시작 폴리스스토리 리뷰입니다.','https://www.youtube.com/embed/GlP3acRXb94',null,null,null,null,'moviemovie@yahoo.com','MA013',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','616','MA616','성룡 폴리스 스토리 (1,2) 60초 논스톱 액션','https://www.youtube.com/embed/nN4_GYTqZXs',null,null,null,null,'holemovie98@yahoo.com','MA013',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','617','MA617','3분 요약 / 미션 임파서블: 고스트 프로토콜 (2011)','https://www.youtube.com/embed/2lMIzATX57o',null,null,null,null,'3bunoddugi@daum.net','MA014',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','618','MA618','세계 최고층 빌딩에서 아찔한 곡예 ''미션 임파서블: 고스트 프로토콜''','https://www.youtube.com/embed/ve-ladMVWks',null,null,null,null,'extreammovie@naver.com','MA014',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','619','MA619','[2011] 현대카드 레드카펫 22 미션 임파서블 - 고스트 프로토콜 - 예고편 공개','https://www.youtube.com/embed/oyufJI5etOM','압도적인 스케일, 5년만에 돌아온 이단 헌트와 IMF동료들의 조직의 명예를 건 불가능한 미션',null,null,null,'hyundaicardmovie@gmail.com','MA014',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','620','MA620','미션 임파서블 로그네이션 / 영화 P리뷰','https://www.youtube.com/embed/5Pl4I996Fjk',null,null,null,null,'moviemonster@yahoo.com','MA015',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','621','MA621','미션 임파서블 : 로그 네이션 리뷰] 섹시한 여주인공! 엄청난 액션! 돌아온 첩보뮬!','https://www.youtube.com/embed/oCXwM8wD0r4',null,null,null,null,'unjun@naver.com','MA015',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','622','MA622','151227 출발! 비디오여행 영화대영화 미션임파서블: 로그네이션','https://www.youtube.com/embed/RBSJZZp_9X8',null,null,null,null,'mybody@gmail.com','MA015',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','623','MA623','배우만 잘생긴 줄 알았는데 영화도 잘생겼네 - 미션 임파서블: 폴아웃 리뷰','https://www.youtube.com/embed/fyPhxL4fjfA','톰 크루즈의 또 한 번의 역작이 등장!',null,null,null,'liner@hotmail.com','MA016',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','624','MA624','[Nofeetbird] Mission Impossible: Fallout Guide Review','https://www.youtube.com/embed/XMcl9QxjPbM',null,null,null,null,'nofootbird@gmail.com','MA016',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','625','MA625','스파이 액션의 절정! ''미션 임파서블: 폴아웃'' 보자마자 리뷰','https://www.youtube.com/embed/f9N4ii7QCfQ',null,null,null,null,'extreammovie@naver.com','MA016',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','626','MA626','[영화걸작선] 14회 - 레지던트 이블: 파멸의 날','https://www.youtube.com/embed/s72bXF3khQI',null,null,null,null,'noone@gmail.com','MA017',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','627','MA627','Resident Evil: The Final Chapter guide review by Nofeetbird','https://www.youtube.com/embed/wxi4y_Qhck4',null,null,null,null,'nofootbird@gmail.com','MA016',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','628','MA628','레지던트이블 :파멸의날 가이드리뷰 (Resident Evil: The Final Chapter)','https://www.youtube.com/embed/5SHq3DT0bTg',null,null,null,null,'duckplayer@daum.net','MA017',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','629','MA629','Review on the Entire ''Resident Evil'' Series! #5 Resident Evil: Retribution','https://www.youtube.com/embed/6qPWP4efulY',null,null,null,null,'9bul@gmail.com','MA018',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','630','MA630','영화 ''레지던트 이블5'' [명장면&미리보기~] 역대급 충격 호러 액션','https://www.youtube.com/embed/7AiCJjfQcyo',null,null,null,null,'movieus@yahoo.com','MA018',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','631','MA631','레지던트이블5 [앨리스 VS 에이다 웡]','https://www.youtube.com/embed/tGZs4ZQHu88','밀라 요보비치! 액션 종결 4종 영상 2편. 앨리스 VS 에이다 웡',null,null,null,'sonypictures@daum.net','MA018',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','632','MA632','람보 5 리뷰 - 아직 할 얘기가 남았던 ''라스트 워''','https://www.youtube.com/embed/Bv8Llyp5kiA','80년대 액션 영화에서 ''아놀드'' 형님과 양대산맥이었던 ''실베스터 스탤론'' 형님의 최후의 발악, ''람보 5'' 입니다.',null,null,null,'ajhongmovie@gmail.com','MA019',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','633','MA633','호러 영화보다 잔인한 람보 - 람보 : 라스트 워','https://www.youtube.com/embed/1SDSlJlTg6I','트럼프 대통령과 동갑인 칠순 할아버지의 마지막 람보 액션',null,null,null,'unjun@naver.com','MA019',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','634','MA634','자비없이 적들을 처단하는 [람보: 라스트 워]','https://www.youtube.com/embed/ubyuJ-Nqoss','영화가 좋다',null,null,null,'moviekok@yahoo.com','MA019',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','635','MA635','개망작인줄 알았는데 개꿀잼이라서 깜짝 놀란 영화 아쿠아맨','https://www.youtube.com/embed/sJ5uOcWlGV0',null,null,null,null,'reviewang@gmail.com','MA020',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','636','MA636','예측이 불가능한 DC의 뜬금포: 아쿠아 맨 리뷰','https://www.youtube.com/embed/-9j4YSKt_QE','다른 작품도 아니고 아쿠아 맨이 이 정도를 보여줄 줄이야?',null,null,null,'liner@hotmail.com','MA020',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','A','637','MA637','영화가좋다 아쿠아맨','https://www.youtube.com/embed/8-NwuRyE9rs',null,null,null,null,'teller@hotmail.com','MA020',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','638','MC638','신입사원한테 쎈척 했다가 쎄게 털린 선배들','https://www.youtube.com/embed/3BB4knAVb1c','#가장보통의연애 #10월2일개봉',null,null,null,'gomong@gmail.com','MC001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','639','MC639','현실 로맨스[가장 보통의 연애]','https://www.youtube.com/embed/a3bPLFvOIKc','#koreantv #koreanmovie #koreandrama #2019 #가장보통의연애',null,null,null,'dbstjdqls@hotmail.com','MC001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','640','MC640','순삭영화 '' 가장 보통의 연애 '' 1부 술취하면 귀여운남자(김래원,공효진)','https://www.youtube.com/embed/YlfgyVODB3Y','영화 ''가장 보통의 연애'' 명장면 명대사 하이라이트 영상 crazy romance, 2019 김래원 공효진 주연',null,null,null,'chicken@daum.net','MC001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','641','MC641','사람들에게 온갖 이상한 짓을 시키는 여자','https://www.youtube.com/embed/ZRmmnhbOByY?list=PLQW4-k--AOA1ruJ-M8Ru1BkSmLO_6cY6Y','이번에 소개해 드릴 영화는 #굿모닝에브리원 #달빛뮤즈 #코미디',null,null,null,'moonlightmuse@gmail.com','MC002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','642','MC642','긍정에너지로 가득 찬 여자가 위기를 극복하는 방법 / 영화리뷰','https://www.youtube.com/embed/CF5508f1i8w','* 본 영상은 스포일러가 포함되어 있습니다 * 안녕하세요. 오늘 리뷰할 작품은 ''굿모닝 에브리원 (Morning Glory, 2010)''입니다',null,null,null,'ddorol@hotmail.com','MC002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','643','MC643','[ 굿모닝 에브리원 ] 학력이 아닌 실력으로 정상을 차지한 여자의 이야기','https://www.youtube.com/embed/g2Sj0FCm-CA','굿모닝 에브리원 (Morning Glory - 2010) 감독 - 로저 미첼 출연 - 레이첼 맥아덤즈 (베키 풀러) 해리슨 포드(마이크 포머로이) 다이안 키튼(콜린 펙)',null,null,null,'murmicine@yahoo.com','MC002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','644','MC644','명절 개봉영화의 역사를 새로쓰는 영화 : ''극한직업''리뷰','https://www.youtube.com/embed/jFd1X9j_9Os','* 본 영상은 스포일러가 다수 포함되어 있습니다 * 영화 ''스물''을 정말 재밌게 본 저로써는, 기대할 수 밖에 없는 작품이었습니다. 그리고 영화관에서 보고 왔고, 결과는 ''성공''이었죠. 솔직히 말해서, 한국형 코미디에서 이병헌 감독만큼 자신의 철학이 확고한 이는 없다고 생각합니다. 깔끔했고, 의도가 명확한 코미디에 아주 긍정적인 느낌을 받았습니다. 모든 내용은 제 개인적인 의견입니다.',null,null,null,'aloneman@daum.net','MC003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','645','MC645','치킨 장사 대박난 마약반 형사들의 어정쩡한 코미디: 극한직업 리뷰','https://www.youtube.com/embed/PwefBCv1sp8','마약반 형사들이 치킨집을 차렸는데 대박이 났다는 단순한 아이디어에서 시작한 가벼운 코미디 영화. 웃음은 성공적이지만 그 이상을 가져가지는 못한 아쉬운 작품. 극한직업 리뷰입니다.',null,null,null,'liner@hotmail.com','MC003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','646','MC646','위장수사로 치킨집 열었다가 맛집으로 소문나면 벌어지는 일..','https://www.youtube.com/embed/aI5wejCDXtg','영화 ‘극한직업’, 오는 1월23일 개봉합니다. #지무비 #영화 #극한직업',null,null,null,'gmovie@hotmail.com','MC003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','647','MC647','주택가에 클럽이 생기면 일어나는 일','https://www.youtube.com/embed/QVPiNA7I_64','이번에 소개해 드릴 영화는 #나쁜 이웃들 #달빛뮤즈 #코미디영화',null,null,null,'moonlightmuse@gmail.com','MC004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','648','MC648','클러버가 신혼부부 옆집으로 이사 오면서 생기는 일','https://www.youtube.com/embed/x9SwxsC2HIg','#나쁜 이웃들#영화소개#영화리뷰 영화 나쁜 이웃들(2014) 감독 니콜라스 스톨러 출연 세스 로건, 로즈 번, 잭 에프론 영화 "나쁜 이웃들" 입니다. 즐겁게 감상 하시고 재밌게 보셨다면 구독 & 좋아요 & 댓글 부탁드립니다. 감사합니다',null,null,null,'choice@hotmail.com','MC004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','649','MC649','아기에게 콘돔 물린 정신나간 옆집 놈들','https://www.youtube.com/embed/NCijbmH4AIs','평화롭게 살고있는 맥과 켈리 부부 하지만 옆 집 테디라는 학생이 이사오게되며 모든 일상을 엉망으로 만들어놓는데 재미있게 보셨다면 구독, 좋아요 부탁드리겠습니다!',null,null,null,'suenim@hotmail.com','MC004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','650','MC650','천상계 미모의 아내와 이혼하려는 남자','https://www.youtube.com/embed/DMFw7ghTHu4','영화: 내 아내의 모든 것 한국 영화 중 이렇게 코믹함과 섹시함의 균형을 잘 갖춘 영화가 또 있을까 싶을 정도로 개인적으로 무척 애정하는 영화입니다. 영화 엔딩 크레딧이 올라가는 중에도 열연을 펼치는 배우들과 끝까지 섹시 코미디라는 컨셉에 충실한 부분은 기립 박수를 치고 싶을 정도였습니다. 이런 웰메이드 영화를 아직도 못 봤다면 안타까운 일입니다. 적극적으로 추천합니다.',null,null,null,'captainrami@gmail.com','MC005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','651','MC651','전설의 카사노바가 여자를 유혹하는 방법','https://www.youtube.com/embed/I2l-u0K5EDE','내 아내의 모든 것',null,null,null,'dreamteller@daum.net','MC005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','652','MC652','식탁 아래에서 처음 만난 그 순간처럼 ㅣ 영화 *내 아내의 모든 것* 먹방의 의미','https://www.youtube.com/embed/XTk8G6lnXbE','#내아내의모든것 #임수정 #이선균 #류승룡 #영화의식탁 #영화속먹방 *식탁 아래에서 처음 만난 그 순간처럼? 그 의미는 무엇일까요? *주의! 이번 영상에는 이례적으로 영화의 결말이 포함되어 있습니다.',null,null,null,'tablemovie@hotmail.com','MC005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','653','MC653','런어웨이 버케이션','https://www.youtube.com/embed/UsPN_oavve0','미장센 Movie Database 영화소개,추천 Excerpt from:접속 무비월드, 출발 비디오여행. 야ㅑㅑㅑ쉑끼들아ㅏㅏㅏㅏㅏ. The largest Korea movie database. Reviews, interviews, previews and behind the scene footage of movie production',null,null,null,'ysamo@yahoo.com','MC006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','654','MC654','웃다가 뇌가 잘못되버릴수도 있는 영화','https://www.youtube.com/embed/_kzarY7rq-4','런어웨이버케이션',null,null,null,'whereiam@gmail.com','MC006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','655','MC655','단 10분, 이 영화를 보는데 뇌는 필요 없다!','https://www.youtube.com/embed/Z8u4Xmm7Cmc','이번에 소개해 드릴 영화는 #롤러코스터 #달빛뮤즈 #코미디',null,null,null,'moonlightmuse@gmail.com','MC007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','656','MC656','[영화리뷰 결말포함] 하정우감독의 B급감성 영화 진심 웃다가 배 찢어짐','https://www.youtube.com/embed/4cN1Cu8OdSs','2013년 개봉작 "롤러코스터"입니다 영화로 다양한 콘텐츠를 만들고 있습니다 :-)',null,null,null,'heytv@gmail.com','MC007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','657','MC657','[영화 BEST] 하정우 감독 데뷔작, 이 비행기 뭔가 이상하다!','https://www.youtube.com/embed/Bxb-9S-J3w0','배우 "하정우"가 감독을 맡았다!! 영화 도중 터지는 육두문자와 과장된 표현을 통한 원초적인 개그! 캐릭터 마다 보이는 확실한 개성! B급 감성을 자극하는 영화',null,null,null,'ajbros8080@yahoo.com','MC007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','658','MC658','어른만 이해가능한 어른이용 가족 병맛 영화ㅋㅋ','https://www.youtube.com/embed/UUSbwzP1OYg','어벤져스 토르 주연 크리스 햄스워스도 웃겨주는 병맛 가족 영화 베케이션(2015) 안녕하세요! ''좋아요''중독자 캡틴라미입니다ㅋㅋ 이 영화에는 다양한 카메오가 출연 하지만, 무엇보다 운전의 달인이 최고였습니다. 리뷰 끝까지 본 사람은 무조건 공감!!ㅋㅋ 참고로 앤트맨과 퍼시픽림만 봤어도, 웬만한 카메오는 다 알아볼 겁니다.',null,null,null,'captainrami@gmail.com','MC008',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','659','MC659','이 영화를 보고도 웃지 않는다면 선물을 드립니다.','https://www.youtube.com/embed/UQZWUm_ZdbU','시청해주셔서 감사합니다^_^',null,null,null,'yangyang@naver.com','MC008',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','660','MC660','영화 베케이션 vacation 2015 막장 병맛 19금 외국 코미디','https://www.youtube.com/embed/VQf-GxRWYzI','베케이션 vacation 2015 10년동안 매년 똑같은 여름 휴가를 갔던 러스티네 가족 시간이 흘러 미소를 잃어가는 아내의 얼굴을 본 러스티는 미국에서 가장 인기 있는 놀이공원 ‘월리 월드’로 가는 미대륙횡단 여행을 제안합니다. 4000키로를 횡단하기위해 최첨단 차까지 빌려 놀이공원으로 출발! 하지만 재미있고 순탄한 여행이 되리라는 기대와는 달리 사건 사고가 터지고 맙니다. 과연 그리스올드 가족은 버라이어티한 여행을 마치고 무사히 돌아올 수 있을까요? [화이트칙스]같은 진짜 웃긴 코미디 영화를 찾으신다면 추천!',null,null,null,'helpyourself@hotmail.com','MC008',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','661','MC661','1700억원을 한 달 안에 다 써야하는 대륙의 극한직업 | 결말포함','https://www.youtube.com/embed/GFbHyJsMewY','#영화리뷰 #결말포함 서홍시수부 (2018, Hello Mr. Billionaire, 西虹市首富, 서홍시의 갑부)',null,null,null,'daymovie@hotmail.com','MC009',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','662','MC662','한 달안에 1,700억 원을 써야하는 남자가 있다?! [10분영화]','https://www.youtube.com/embed/5IT5_Grf0Ao','* 이 영상은 스포일러를 담고있습니다. * 서홍시수부 (Hello Mr. Billionaire). 2018',null,null,null,'postshare85@daum.net','MC009',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','663','MC663','(영화리뷰/결말포함) 한달안에 1700억을 쓰면 무려 5조를 상속받는다!? 서홍시수부','https://www.youtube.com/embed/mTprvfMJ4Iw','#서홍시수부 결말 #영화리뷰 #결말포함 #코미디영화',null,null,null,'endmovie@daum.net','MC009',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','664','MC664','[병맛명작리뷰] 웃다가 울게 만드는 영화ㅋㅋ 세얼간이!','https://www.youtube.com/embed/4AFVTL8nCUg','세얼간이 구불추천지수: 9.5/10 병맛요소: 8/10 참신함: 7/10 한줄평: 웃다가 울고 웃다가 울고 하는 영화. 장난같은 영화지만 날카로운 송곳을 숨기고 있다. 병맛 요소가 많지만 우리가 이 영화를 보고 고개를 끄덕이는 이유는 무엇일까?',null,null,null,'9bul@gmail.com','MC010',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','665','MC665','유쾌한 천재가 학교생활 하는 방법','https://www.youtube.com/embed/i5u2POOeMdk','유쾌한 천재가 학교생활 하는 방법을 보여주는 영화 세얼간이입니다. 네이버 평점이 9.34 (25,563명 평가)으로 많은 사람들이 좋아하는 인도 영화입니다.',null,null,null,'storyroom@daum.net','MC010',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','666','MC666','[세 얼간이] 잠수 탔었던 친구를 찾았다','https://www.youtube.com/embed/vCB3b-IbA94','잠수 탔었던 친구를 찾았다 (+There''s English Subtitle. You can enjoy by using that.) 구독·좋아요·공유·댓글은 힘이 됩니다. 꾸준히 좋은 영상으로 보답하겠습니다. ▷영화정보 제목: 세 얼간이 감독: 라지쿠마르 히라니 출연: 아미르 칸, 마드하반, 셔먼 조쉬',null,null,null,'codemovie@daum.net','MC010',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','667','MC667','[영화리뷰 결말포함]극한직업 감독의 청춘물! 진심 웃다가 배 찢어짐 (한국 코믹 영화)','https://www.youtube.com/embed/rt0knPnfkqg','2015년 개봉작 "스물" 입니다 본 영화는 배급사와 협의가 되었습니다. 승헤이TV의 모든 영화는 최대한 압축을 해서 편집하기 때문에 모든 명장면을 담지 못한 점 넓은 마음으로 이해해주시면 감사하겠습니다 영화 리뷰가 재밌었다면 full 영상으로도 감상해 보시는 것을 추천드립니다~! 항상 승헤이TV 시청해 주셔서 감사합니다 땡큐!',null,null,null,'heytv@gmail.com','MC011',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','668','MC668','강하늘 스무 살 적에 이랬다고? | 영화 스물 | 영화리뷰 | 32번째 밤 | 강하늘 | 김우빈 | 준호 | 민효린 | 정소민 | 이유비','https://www.youtube.com/embed/dmtOF1oUkp0','강하늘이 본인과 제일 비슷한 캐릭터로 영화 스물의 ‘경재’를 뽑았다던데…? 헐,, 강하늘 스무 살 때 이랬다고?ㅋㅋㅋㅋㅋㅋㅋ',null,null,null,'dingo@daum.net','MC011',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','669','MC669','스물 (Twenty, 2014) 김우빈, 이유비, 민효린','https://www.youtube.com/embed/dXduysupkT0','김우빈. 김우빈.',null,null,null,'benhahnfeld@yahoo.com','MC011',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','670','MC670','[B tv 영화 추천/movie Big #14] 스파이(Spy, 2015)','https://www.youtube.com/embed/7T5cKRnshRQ','한시도 눈을 뗄 수 없는 긴박하고 강렬한 액션 씬! 박진감 넘치는 영화 속 액션 장면만 엑기스로 소개',null,null,null,'skmovies@daum.net','MC012',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','671','MC671','X'' 하나로 미션을 클리어 하는 1급 스파이 [결말포함]','https://www.youtube.com/embed/Y_ELu-LM1_8','새해복 많이 받으세요! 2015년에 개봉한 영화 ''스파이'' 입니다',null,null,null,'drikdrik@gmail.com','MC012',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','672','MC672','(영화리뷰 결말포함) 세계에서 가장 섹시한 스파이','https://www.youtube.com/embed/y9kxQc0oIhw','안녕하세요! 프리뷰입니다 그동안 1달정도 가정을 돌보는 일이 생겨 업로드가 늦어졌습니다. 그동안 우리 구독자분들 많이 보고 싶었습니다! 앞으로도 지속적으로 여러분들께 결말포함 영화리뷰로써 많은 영화를 업로드 할테니 잘부탁드리겠습니다!!',null,null,null,'drikdrik@gmail.com','MC012',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','673','MC673','[병맛리뷰] 형님, 벽이 살려달라는데요? 시실리 2km','https://www.youtube.com/embed/tOGOhELR_ug','구불추천지수: 5.5/10 병맛요소:7/10 참신함:2/10 한줄평: 시대를 앞서 나왔던 병맛영화. 아쉬운 마무리와 황당한 내용이지만 재미면에서는 괜찮다! 임창정의 코믹연기를 100%느낄 수 있는 영화.',null,null,null,'spoilerman99@hotmail.com','MC013',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','674','MC674','니가 그럼 94야?ㅋㅋㅋㄱ (영화 시실리 2km) Sicily 2km scenery','https://www.youtube.com/embed/UgIPdIUuJ_s',null,null,null,null,'9bul@gmail.com','MC013',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','675','MC675','영화 - 수상한 시골마을 사람들 (시실리 2km vs 기묘한 가족)','https://www.youtube.com/embed/XGAExkmw1ko',null,null,null,null,'tvshowshow@hotmail.com','MC013',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','676','MC676','[엑시트] 따따따 따 따 따 따따따','https://www.youtube.com/embed/gofu_qz2EkI','#엑시트 #7월_31일_IMAX_개봉 이 영상의 저작권은 제작사에 있습니다.',null,null,null,'makemovie@daum.net','MC014',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','677','MC677','엑시트가 깨부셔버린 기존 재난 영화의 9가지 클리셰','https://www.youtube.com/embed/QnCP8TrTxag','#엑시트,#조정석,#윤아 영화 엑시트에서 부셔버린 9가지 클리셰를 이야기 해보겠습니다',null,null,null,'uppercut@naver.com','MC014',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','678','MC678','찐따남이 재난시 히어로가 되는 개쩌는 방법','https://www.youtube.com/embed/GJsFPd4z2vY','#엑시트 재밌고 웃기는 영화 영화 저작권 사용은 제작배급사의 허가를 받았습니다',null,null,null,'gomong@gmail.com','MC014',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','679','MC679','헤어졌더니 300만원을 요구하는 찌질한 여자','https://www.youtube.com/embed/SJvXjJpasm0','* 본 영상은 배급사와의 협의를 마치고 업로드 되었습니다. * 영상의 재가공 및 재배포를 금합니다. 제가 가장 좋아하는 영화 중 하나입니다. 연애라는 이야기를 현실적으로 풀어냈고, 무엇보다 두 주인공이 너나 할 것 없이 찌질한 모습을 아주 잘 연기했어요. 다음 영화도 기대해주세요! 제목 : 연애의 온도(Very Ordinary Couple (V.O.C.) , 2012 감독 : 노덕 출연 : 김민희, 이민기, 최무성, 라미란, 하연수',null,null,null,'aloneman@daum.net','MC015',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','680','MC680','이별하고 보면 절대 안되는 영화의 명장면 명대사 모음 [뭅뭅픽] 연애의 온도 | 이민기 | 김민희','https://www.youtube.com/embed/haeDeiNNCb0','헤어지고 나서 보면 안되는 영화 중 하나 다들 어떻게 헤어졌었나요?',null,null,null,'mupmup@hotmail.com','MC015',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','681','MC681','식어버린 사랑은 맛이 없다 ㅣ 영화 *연애의 온도* 먹방의 숨은 의미','https://www.youtube.com/embed/Ltz9O6ikX9w','#연애의온도 #김민희 #이민기 #영화의식탁 #영화속먹방 #영화속음식 *식어버린 사랑은 맛이 없다? 그 의미는 무엇일까요?',null,null,null,'tablemovie@hotmail.com','MC015',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','682','MC682','내 동년배들 다 전지현 좋아했다. [뭅뭅픽] 엽기적인 그녀 | 전지현 차태현 | 2000s','https://www.youtube.com/embed/gRtTVxPV_gw','라떼는 말이야~ 모두가 전젼을 앓았다구 ㅠㅠ 키스신 없는 로맨틱 코미디',null,null,null,'mupmup@hotmail.com','MC016',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','683','MC683','사랑의 아픔을 말도 안 되는 깡다구로 승화시킨 여자','https://www.youtube.com/embed/97IAkuPNauw','안녕하세요 영화 엽기적인 그녀 입니다',null,null,null,'lemong@hotmail.com','MC016',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','684','MC684','[명장면] 레전드 영화 엽기적인 그녀-전지현 예쁨주의','https://www.youtube.com/embed/xBAF-Nv2lDg','▶작품명 (Titles) : 엽기적인그녀(My Sassy Girl, 2001) ▶출연 (Cast) : 전지현, 차태현 ▶감독 (Director) : 곽재용 ▶줄거리 (Synopsis) : 전지현+차태현의 절라유쾌 사랑이야기 그녀와의 무서운 데이트가 시작된다! 2001년 여름, 온몸이 뽀사지도록 즐거워집니다! ''전반전''. 그녀와 저는 같은 문으로 함께 인천행 지하철을 타게 되씀미다. 취해서 비틀거리지만 안는다면 정말 매력저기고 갠차는 아가씨여쪄... 푸하하핫! 진짜 특이하다! 저는 그녀가 술에 취해서 배를 기대고 서있는 모습이 귀여워서 힐끔거리며 그녀를 계속 지켜보아씀미다. 그런데 몸을 미세하게 부르르 떨던 그녀가 왠지 불안해 보이더니만 마침내 우웨에엑~~~ 우웨엑~~ 좌르르르르~~~ 네, 그러씀미다! 그녀가 앞에 앉아 이떤 대머리 아저씨 머리 위에 순식간에 일을 친 거시여씀미다!! 순간 지하철안은 아수라장이 되고 절라 재미는 상황이었져. 진짜 일은 거기서부터 터지고야 말아씀미다. 오바이트를 시원하게 하던 그녀가 게슴치레한 눈빛으로 저를 보며 이러는 검미다! 자기야!~ 어어억~ 우욱~ 자기~ 웩~! 쿵... 이 여자 좋은 느낌이 듬니다. 원래 그러치안은데 실연의 아픔이 너무나 큰 것 가씀미다. 괜히 불쌍한 마음이 듬미다. 제 마음 어디에선가 싸늘한 바람이 부는 것도 가씀미다. 그래, 이 여자의 아픔을 한번 치료해보자!! 강물 깊이가 궁금하면 가차업시 물 속으로 떠밀어버리는 여자! 그러나 정신업시 허우적대는 저를 위해서 물 속으로 뛰어들쭐도 아는 여자... 그녀의 생일, 얼렁뚱땅 너머가면 살해할찌도 모를 여자! 그러나 일촉즉발 인질로 잡혀있던 나를 목숨걸고 구해주며 기막힌 감동을 먹일쭐도 아는 여자! ''후반전''. 요즘은 그녀가 참 많이 우씀미다. 해맑게 웃는 그녀를 보고 있으면 제 마음도 한 없이 행복해짐미다. 지금까지 제가 힘이 되어주었는지 자신이 업씀미다. 제가 그녀를 감싸준것도 그녀에게 보여준 것도 또 그녀를 치료한 적도 없는 것 가씀미다. 이제 그녀 곁을 떠날 때가 점점 가까워지는 것을 느낌미다. 그리고 오늘 타임캡슐에 서로의 마음을 담고 타이머를 2년 후에 맞춰씀미다. 이 캡슐이 열리는 날! 서로의 마음을 확인할 껌미다. 그렇게 그녀는 헤어지자는 말을 대신했슴미다. ''연장전''. 오늘 헤어지고 내일 만나는 것처럼 우리는 지금 헤어지고 분명히 다시 만날 것임미다. 다만 오늘과 내일처럼 가까운 시간이 아닐 뿐... 믿슴미다.',null,null,null,'playallmovies@hotmail.com','MC016',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','685','MC685','[영화리뷰 결말포함] 진심 이 영화 보고 한 번이라도 안 웃는 사람 없습니다. (한국 코믹 영화)','https://www.youtube.com/embed/beXU8H6f7es','2016년 개봉작 "위대한 소원" 입니다 승헤이TV의 모든 영화는 최대한 압축을 해서 편집하기 때문에 모든 명장면을 담지 못한 점 넓은 마음으로 이해해주시면 감사하겠습니다 영화 리뷰가 재밌었다면 full 영상으로도 감상해 보시는 것을 추천드립니다~! 항상 승헤이TV 시청해 주셔서 감사합니다 땡큐!',null,null,null,'heytv@gmail.com','MC017',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','686','MC686','친구의 첫 경험 상대를 찾아 헤매는 우정 만랩 친구들','https://www.youtube.com/embed/FuyOmow_eOQ','안녕하세요, 북부의 왕입니다. 이번 영화는 ‘위대한 소원’입니다. 구독과 좋아요를 눌러주시면 매주 수요일, 일요일 재미있는 영화 리뷰로 찾아뵙겠습니다. 리뷰를 재미있게 보셨다면 구독과 좋아요도 꼭 눌러주세요!',null,null,null,'bukbu@yahoo.com','MC017',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','687','MC687','가족은 건드리지 말았어야 했다','https://www.youtube.com/embed/OHH9yd7u7rw',null,null,null,null,'egg@naver.com','MC017',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','688','MC688','족구하는 소리 하고있네 ( 족구왕 ) 스토리+해석편','https://www.youtube.com/embed/XVmIqYUJzLc','35번째 영화 리뷰 족구왕 ( 2014 ) 스토리+해석편입니다. 18분 38초 이후론 스포일러가 포함되어 있으니 주의해주세요. 좋아요(추천) 버튼을 눌러주시면 더 많은 분들이 감상하실 수 있고, 구독을 하신뒤 종버튼을 한번더 눌러주시면 알람기능으로 인해 더 편하게 보실 수 있습니다. 감독 우문기 출연 안재홍, 황승언, 정우식, 강봉성, 황미영, 박호산, 조혜린, 진태철, 이세랑,',null,null,null,'riukun@gmail.com','MC018',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','689','MC689','[영화리뷰 결말포함] 남자들이 군대 갔다 와서 적응하기 힘든 이유 (한국 코믹 영화)','https://www.youtube.com/embed/0DHBcqC9I7k','승헤이TV의 모든 영화는 최대한 압축을 해서 편집하기 때문에 모든 명장면을 담지 못한 점 넓은 마음으로 이해해주시면 감사하겠습니다 영화 리뷰가 재밌었다면 full 영상으로도 감상해 보시는 것을 추천드립니다~! 항상 승헤이TV 시청해 주셔서 감사합니다 :-) 영상 중 재밌었던 대사나 장면이 있었다면 댓글로 많이 많이 남겨주세요~~ 땡큐! 2014년 개봉작 "족구왕" 입니다',null,null,null,'heytv@gmail.com','MC018',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','690','MC690','멋있는 남자 정봉 족구의신이 되다(결말포함)','https://www.youtube.com/embed/Vsc0a04_NwQ','방금 군대에서 막 전역한 주인공 족구를 좋아하던 주인공은 복학생의 초라한 행색으로 학교를 전전하기 시작한다. 그러다 학교에서 예쁘기로 유명한 어떤 여자를 만나게 되는데 주인공은 과연 어떻게 될까요?? 영화 족구왕 입니다.',null,null,null,'zto@hotmail.com','MC018',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','691','MC691','최강 무술로 쳐맞고도 마사지 받듯 느긋한 고수들 싸움','https://www.youtube.com/embed/UYy2y7Y5a1U','구독''하고 ''알림''설정을 해두면 재밌는 최신 영상들을 가장 빨리 볼 수 있습니다. ''추천''은 컨텐츠 제작에 큰 힘이 됩니다^^',null,null,null,'captainrami@gmail.com','MC019',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','692','MC692','(결말포함) 주성치의 쿵푸영화 / 영화추천 리뷰 소개 스포주의 다시보기','https://www.youtube.com/embed/y_NMuy3eBeY','많이들 기다리셨죠?? 잘들 주무셨나요?? 아침에 출근하시면서 한번씩 보고 웃어주세요~ 이 영상으로 즐거운 하루가 되시기를!!! :-)♥♡ 작업하는 내내 즐거웠던 영화였습니다~~~~~~',null,null,null,'horrrrror@naver.com','MC019',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','693','MC693','너 잘못 걸렸어'' 숨은 무림고수 등장?','https://www.youtube.com/embed/KJjcxHo6Jmc',null,null,null,null,'sangung@yahoo.com','MC019',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','694','MC694','60년 동안 지구에서 산 고인물 외계인 ㅋㅋㅋ','https://www.youtube.com/embed/suAmZ3m1ilc','#황당한외계인폴 #영화추천 #고인물',null,null,null,'dreamteller@daum.net','MC020',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','695','MC695','사고뭉치지만 같이 다니면 꿀잼인 괴짜 외계인','https://www.youtube.com/embed/8V7M5jv-1T8',null,null,null,null,'fallinfilm@hotmail.com','MC020',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','C','696','MC696','외계인을 만나고 난 후 벌어진 일','https://www.youtube.com/embed/84KYuGWil-Q','영화 황당한 외계인 폴 (2011) 많은 응원바랍니다.',null,null,null,'roleplayman@yahoo.com','MC020',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','697','MH697','35년 동안 비상계단에 갇혀버린 사람들/인시던트(The Incident, 2016/)줄거리&해설/공포,스릴러 추천','https://www.youtube.com/embed/VGNgwuM5IgI','여러분들은 한공간에 얼마나 오래동안 계실수 있으신가요?
여기 35년동안 한곳에 갇혀버린 사람들이있습니다.
공포라 하긴엔 무서운 요소는 부족하지만, 영화 마지막 드러나는 진실은 놀라기에 충분한것 같습니다.
*재밌게 보셨다면 좋아요 구독 부탁드립니다~!!',null,null,null,'acut@naver.com','MH001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','698','MH698','35년 동안 비상계단에 갇힌 남자의 생존법','https://www.youtube.com/embed/zMk-piFQjZU','영화 ''인시던트 (The Incident, 2014)'' 소개 영상입니다.
[해당 영화 구매 링크]
https://www.youtube.com/embed/SvMT1...
[지무비 구독]
https://goo.gl/4ETvXY
[지무비 네이버TV]
http://tv.naver.com/gmovie
[다른 영화 소개 둘러보기]
https://goo.gl/78TM8K
[개인 인스타그램]
https://www.instagram.com/awayout1/',null,null,null,'gmovie@hotmail.com','MH001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','699','MH699','영원히 반복되는 지옥 ''영화 인시던트'' 결말 해석영상','https://www.youtube.com/embed/3izaCauotZ0','#홍시네마 #인시던트 #결말해석
몇년 사이 본 영화중 가장 인상깊고 흥미롭고 재밌게 본 영화였습니다
저의 생각을 주저리 떠는거니 부족해도 너그러이 이해해주신다면
감사하겠습니다 ㅠ_ㅠ
[영화 구매 , 대여 링크] ↓
https://www.youtube.com/embed/SvMT1...
[홍시네마 구독]↓
https://www.youtube.com/channel/UCtwx...
[홍스타그램] ↓
https://www.instagram.com/hong_cinema/',null,null,null,'hongcinema@gmail.com','MH001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','700','MH700','[진짜미친결말해석] 이제껏 본적없는 상어영화','https://www.youtube.com/embed/_Ix__obpFDw','심해 47미터..
남은 산소량 15% 주어진 시간은 단 20분
낡은 쇠창살의 케이지안
그리고 밖은 식인상어떼들
무전을 요청하려면 케이지밖으로 나가 7미터 이상 맨몸으로 올라가야만하고
섣불리 맨몸으로 탈출을 시도했다가 상어한테 잡혀먹거나
급격한 압력차의 질소중독으로 미쳐버릴수있다. 만약 당신이라면 어떤 선택을 하겠습니까?
무더운 여름밤 단박에 당신을 차가운 저밑 해저 깊은곳으로 던져버리는 영화 그들은 왜 이런 위험천만한 모험을 시작했을까.
지금부터 그 수심 47미터의 공포속으로 들어가 보실까요?',null,null,null,'karang@gmail.com','MH002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','701','MH701','죽음의 상어체험이되버린 휴가.식인상어에게 탈출하기 위한사투 (반전)','https://www.youtube.com/embed/dIQZshbhEPw','영화: 47미터 입니다.
이 동영상은 원 저작권 소유자의 저작권 승인을 받은 영상입니다.
줄거리:멕시코의 태평양 연안에서 특별한 휴가를 맞은 ‘리사’와 ‘케이트’.
잊을 수 없는 추억을 만들기 위해 익스트림 스포츠인 상어 체험(샤크 케이지)에 도전한다.
하지만 즐거움도 잠시, 자매가 올라 탄 케이지는 알 수 없는 사고로
순식간에 심해 47미터까지 추락하고 만다.
무시무시한 식인 상어 무리에 둘러싸인 ''샤크 케이지'' 속에서
산소 탱크로 버틸 수 있는 시간은 단 20분!',null,null,null,'drunk@hotmail.com','MH002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','702','MH702','상어 위험지역까지 들어간 그녀들에게 벌어진 일 (결말포함 / 47미터)ㅣ스포주의ㅣ영화리뷰ㅣ결말포함','https://www.youtube.com/embed/YtTnD5eogYE','● 이 영상은 저작권자의 승인을 받은 영상입니다 ●
구독하기 : https://bit.ly/37j0JmR
안녕하세요 나인무비입니다. 앞으로 더 좋은 영상을 가지고 찾아 오겠습니다^^
시청해주신 모든 분들 감사드리고 재미있게 보셨다면,
구독과 좋아요 꼭 부탁드리겠습니다 감사합니다',null,null,null,'9movie@daum.net','MH002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','703','MH703','곡성 해석 : 최신 종합 분석입니다 ※스포주의※','https://www.youtube.com/embed/RpXmN3IL2cU','2016. 7. 8 일 완성된 리뷰입니다.
처음 제작한 영화 해석 리뷰라 모자랄 거라 생각됩니다 ㅠ
부디 한 분이라도 재밌게 봐주셨으면 좋겠네요.
성경 구절같은 경우 몇 부분은 생략했으니 양해바랍니다.',null,null,null,'fatic74@yahoo.com','MH003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','704','MH704','칸영화제도 곡성을 인정할 수밖에 없는 5가지 이유 [드림텔러]','https://www.youtube.com/embed/mvaSDhFDbMM','관객에게 현혹을 관찰하게 한것이 아니라, 체험하게 한것입니다. 해골모양 꽃은 시들기전에는 아름답지만 시들면 해골모양으로 변하죠. 이런 특징은 믿음과 의심으로 나뉘는 우리의 마음과 닮아 있습니다. 특히 종구가 무명의 말을 믿지 못하고 집으로 들어가는 순간 피어있던 꽃(믿음)이 해골모양(의심)이 되는 모습을 보여줍니다.
절때가아니라 절대가 맞죠...제가 사투리를 쓰다보니...저도 모르게
제 의견입니다만, 곡성은 아마도 무엇이 선인지 무엇이 악인지 흐트려서 우리들을 현혹시켜놓는 것을 ''악마''로 표현하고 관객들에게 현혹되는 상황을 체험하게 만듬으로서, ''믿음''에 대한 이야기를 하려고 한 것 같습니다. *추격자에 나오는 하정우는 ''지영민''역을 연기했습니다. 유영철을 모티브로 한 캐릭터이긴하나 유영철과는 다릅니다.*',null,null,null,'dreamteller@daum.net','MH003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','705','MH705','곡성 [줄거리 알려줌 - 해설 편] (哭聲, THE WAILING, 2016)','https://www.youtube.com/embed/nQBERwh89Zk','[줄거리 알려줌-해설편] 영화, 곡성(哭聲)
영화의 이해에 도움이 되는 주요 줄거리와 캐릭터 설정, 세계관 등을 알려드립니다. 영화를 이미 관람하신분만 시청하세요. ※ 이 영상은 작품의 주요 줄거리와 결말, 반전 등 모든 스포일러를 포함하고 있습니다.
※ 또한 이 영상은 알려줌 팀의 주관적 해석을 포함하고 있습니다. ※ 아직 작품을 안 보신 분은 영상 재생 시 주의하시기 바랍니다.
※ 해석에 대해 궁금하신점은 알려줌 페이스북 페이지 댓글에서 확인해보세요. https://www.facebook.com/allyeozum/vi...
※ 이해에 도움이 되셨으면 알려줌 페이지 구독 부탁드립니다.',null,null,null,'youknow@gmail.com','MH003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','706','MH706','시간이 흐를수록 악마에게 먹혀가는 한국 퇴마사 | 결말포함 |','https://www.youtube.com/embed/-gi7xIwbkEQ','오늘 소개해드릴 영화는 #검은사제들 입니다.
◈ 리필드 재영 구독 http://bitly.kr/3QlxZ
◈ 메일 문의 cheerupjaeyoung@gmail.com
◈ 인스타그램 https://www.instagram.com/cheerupjaey...
★ 영상에 좋아요를 눌러주시면 정말 큰 힘이 됩니다!',null,null,null,'jy@gmail.com','MH004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','707','MH707','세상에서 가장 잘생긴 퇴마사가 엑소시스트 하는 영화(검은사제들 리뷰)','https://www.youtube.com/embed/W1r1Gq4jJ-Y','영화 [검은사제들] 의 줄거리 요약 및 리뷰영상입니다. 영상에 스포일러가 포함되어있으니 시청하실 때 주의해주시길 바랍니다.',null,null,null,'lak@hotmail.com','MH004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','708','MH708','박소담이 악마에게 기생당한 충격적인 영화 검은사제들(스포o)','https://www.youtube.com/embed/b3G8k3bNj6s','안녕하세요~상자무비리뷰입니다^^
오늘 준비한 컨텐츠는 "검은사제들"입니다.
2015년 11월에 개봉한 영화 "검은사제들"은 약 540만명의 관객 수를 기록하면서 흥행에 성공했습니다.
당시 국내 영화에선 찾아보기 힘든 소재인 엑소스시트, 즉 구마의식을 소재로 다룬 영화인데요. 그러한 신선한 도전을 사람들이 잘 알아봐 준 듯 합니다.
그 밖에도 수많은 문학적, 종교적의미가 담겨진 작품인데요~어떤 의미들이 담겨있는지 영상을 통해 확인하시죵!',null,null,null,'boxmovie@yahoo.com','MH004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','709','MH709','하나의 질문이 있었다. 신의 존재를 믿는가, 믿지 않는가: 사바하 리뷰','https://www.youtube.com/embed/FP36I35bVD8','검은 사제들을 능가하는 새로운 미스터리.
장재현 감독의 신작.
종교와 신, 오컬트 영화의 새로운 시대를 열어젖힌 수작.
사바하 리뷰입니다.',null,null,null,'liner@hotmail.com','MH005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','710','MH710','사바하..16년간 창고에 갇힌 소녀의 충격적인 능력','https://www.youtube.com/embed/iqWa27gZzJ8','제작지원 : CJ엔터테인먼트
[지무비 채널 멤버십 가입]
https://goo.gl/LrQJgy
[지무비 구독] https://goo.gl/4ETvXY
[개인 인스타그램] https://www.instagram.com/awayout1/
[다른 영화 소개 둘러보기]
https://goo.gl/78TM8K
[지무비 후원] https://toon.at/donate/63667153356661...
[지무비 네이버TV]
http://tv.naver.com/gmovie
[지무비 페이스북] https://www.facebook.com/pg/Gmoviee
[이메일] awayout2@naver.com
제작지원 : CJ엔터테인먼트',null,null,null,'gmovie@hotmail.com','MH005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','711','MH711','생각''하게 만드는 영화가 얼마만인가? : 영화 ''사바하'' 리뷰','https://www.youtube.com/embed/eSZha-rpqLc','* 본 영상은 스포일러가 다수 포함되어 있습니다 *
영화팬으로써, 너무나도 기쁘고 감동적인 영화입니다.
영화를 보고 생각을 나눌 수 있는 영화.
영화를 말하며, 토론 할 수 있는 영화.
작품성과 화제성. 두 마리 토끼를 모두 잡은 영화입니다.
모든 내용은 제 개인적인 의견입니다.',null,null,null,'aloneman@daum.net','MH005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','712','MH712','1% 천재 싸이코패스 살인마를 이용하려다 역관광 당하는 FBI와 경찰들','https://www.youtube.com/embed/K04hYM7Oqbo','#양들의침묵 #영화소개 #드림텔러',null,null,null,'dreamteller@daum.net','MH006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','713','MH713','인간의 살코기를 즐겨 먹던 정신과의사:양들의 침묵[주관적 영화리뷰]','https://www.youtube.com/embed/Y3DwaoHEV10','범죄 스릴러의 대부 양들의 침묵 아직도 잊혀지지 않으며 앞으로도 그럴 예정인 명작 양들의 침묵을 보신분들 보지 않으신분 분들 모두 모두 오세요',null,null,null,'about@hotmail.com','MH006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','714','MH714','[J의 무띠끄][영화리뷰][양들의 침묵] 연쇄살인마를 잡기위해 또 다른 연쇄살인마를 이용한다면?','https://www.youtube.com/embed/O2BFk2iB0Xk','J의 무띠끄 ,열번째 리뷰. 영화 ''양들의 침묵''입니다.
10번째 리뷰로 올렸던 ''이터널 선샤인''이.. 저작권의 문제로 인해 내려지고 말았습니다..(R.I.P)
하여 구독자 한 분의 요청에 더불어 10번째 리뷰로
저도 굉장히 재밌게 봤었던 ''양들의 침묵''을 리뷰합니다 :)
호러와 스릴러 영화의 교과서 적인 작품이라고 불려도 전혀 무방하지 않을 정도로 명작중의 명작입니다.
안소니 홉킨스의 미칠듯한(...) 연기를 보고싶으신 분
스릴러 영화를 좋아하시는 분 중 아직 보지 않으셨다면 추천드립니다 :)
* 항상 좋은 댓글 남겨주시는 아이템주는 사람님 감사합니다 :) ♥
이터널 선샤인 영상이 내려갔지만 남겨주셨던 댓글은
제가 소중하게 보관하고 있습니다 :D
제 채널은 출근길이나 퇴근길, 자기전
간단하게 영화를 보고싶으신 분들을 위한 채널로 만들어졌습니다 :) 부족한 부분이 많더라도 즐겁게 봐주시고, 부족한 점은 댓글로 부탁드립니다. 댓글에 보고싶은 영화 리뷰를 남겨주시면, 다음 리뷰를 만들때 적극적으로 반영하겠습니다 :)
여러분의 좋아요와 구독은 저에게 큰 힘이 됩니다. 감사합니다! :)',null,null,null,'mootiqj@gmail.com','MH006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','715','MH715','귀신없이도 무서운 공포영화 ㅣ파라노말 액티비티ㅣ(영화리뷰,결말포함)','https://www.youtube.com/embed/nLHwU-V18x0','각종 문의 메일 : yb1619@naver.com
영화 ''파라노말 액티비티''였습니다',null,null,null,'baebae@gmail.com','MH007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','716','MH716','귀신은 하나도 안나오는데 분위기로 관객을 압도하는 영화 ㅣ영화리뷰ㅣ결말포함ㅣ영화소개ㅣ영화추천','https://www.youtube.com/embed/t2AXLglzzME','영화:파라노말 액티비티 1편',null,null,null,'9movie@daum.net','MH007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','717','MH717','카메라로 심령 영상을 찍으면 안 되는 이유 [영화리뷰 결말 포함]','https://www.youtube.com/embed/9W3O_3g99yU','파라노말 액티비티
영화리뷰 결말 포함
공포 영화',null,null,null,'videobang@daum.net','MH007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','718','MH718','기차에 사람보다 좀비가많다ㅣ부산행ㅣ(영화리뷰,결말포함)','https://www.youtube.com/embed/5B0Pb4Zj1SM','영화 ''부산행'' 이었습니다',null,null,null,'baebae@gmail.com','MH008',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','719','MH719','해외에서 인정한 부산행의 ''숨겨진 의미''','https://www.youtube.com/embed/T0cxC1KpPNE','부산행 잘만들었어요. 좀비 영화치고 작품성 괜찮은거 같아요.',null,null,null,'dreamteller@daum.net','MH008',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','720','MH720','부산행 가이드 리뷰 by 발없는새','https://www.youtube.com/embed/inUoYMG3tYU','★ 덧글로 결말까지 포함한 스포일러를 남발하시는 분들이 계셔서 닫습니다. 대체 왜 그래요? -_-;;; 최소한 금주 주말이 지나면 다시 열겠습니다 ★
우리나라 최초로 좀비가 등장하는 블록버스터인
부산행이 많은 관심 속에서 개봉했습니다.
또 한번의 시도 속에서 어떤 결과를 냈을까요?',null,null,null,'nofootbird@gmail.com','MH008',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','721','MH721','마을에 숨어사는 광대의 저주 (결말포함/그것)','https://www.youtube.com/embed/fSfYnWgN1eg','안녕하세요! 영화를 읽어주는 남자 영일남입니다.
영화 그것1 (2017)입니다.
9월 4일에 개봉하는 그것 2에 맞춰 예전에 업로드 하였으나
노란딱지 문제로 이미 개봉 하루 뒤가 되었네요.
본 영화 시나리오상 필요 없는 부분이 거의 없었어요.
줄이고 줄여도 28분 아래로 줄어들지가 않네요ㅠㅠ
각 영상마다 모두 연결되어있고 하나를 자르면 개연성이
끊어져 28분으로 그대로 올리기로 하였어요. 아참 그리고 컴퓨터 사양 문제인지, 많이 느리고 튕겨서
이번 편은 깜놀주의가 안 들어갑니다.
동일 작업에서 한 시간 내내 십수 번 튕기고 포기했네요..
컴퓨터 부품 교체를 해야 할 것 같습니다.
깜놀주의 구간은 댓글로 남겨놓을게요! 오늘도 봐주셔서 정말 감사합니다.',null,null,null,'youngread@daum.net','MH009',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','722','MH722','광대 혐오를 멈춰주세요. 공포가 실종된 성장 드라마 : 그것(IT) 리뷰 - 라이너','https://www.youtube.com/embed/R6B7UiiGGZ0','스티븐 킹의 역작, 역사적인 호러 소설 그것(IT).
국내에도 ''피의 삐에로''라는 제목으로 알려졌던 드라마의 영화화!
7명의 아이들, 루저 클럽이 광대 페네와이스에 대항한다.
공포 영화를 표방했지만 지나친 점프 스케일과 반복되는 구도로 공포 영화로서는 함량 미달의 작품. 허나 성장 드라마로는 제법 괜찮습니다.
라이너의 리뷰와 함께하세요!',null,null,null,'liner@hotmail.com','MH009',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','723','MH723','보고나면 하수구를 쳐다볼 수 없게 되는 영화 (결말포함, 스포주의)','https://www.youtube.com/embed/UzxhgMnWWnM','오늘의 영화리뷰는 '' 피의 삐에로, 그것 (1990) '' 입니다.
오늘 개봉된 그것2와 같은 동명의 소설을 원작으로 하고 있으며
최근 개봉된 영화는 어린 시절과 어른이 된 시절을 따로 그리는 것과
다르게 이 영화는 서로 교차해 그려내는 점이 인상적입니다.
시청해주셔서 감사합니다!
그것 2017 다시보기',null,null,null,'pause@daum.net','MH009',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','724','MH724','거울보기 싫어지는 영화','https://www.youtube.com/embed/iw8MmUQPKKA','본 리뷰는 영화의 전반적인 스토리를 다룹니다.
댓글 추천받아서 만들게 된 리뷰
영화 ''오큘러스'' 리뷰
어벤져스에 네블라를 기억하시나요? 네블라, 카렌 킬런이 주연 케일리 역을 그리고 잘생긴 배우 브렌튼 스웨이츠가 팀역을 맡았다,
이사할때 산 거울이 우리 가정을 망가뜨린다고?!
싫어 내가 바꿀거야!
거울이 보기 싫어지는 영화
좋아요 구독,피드백은 큰힘이 됩니다',null,null,null,'socheon@daum.net','MH010',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','725','MH725','시간이 아깝지 않은 잘 만든 공포영화','https://www.youtube.com/embed/ZvY-Z3bVGs8','★ 구독·좋아요·합법적 공유·댓글로 리드무비를 응원해주세요! ★
★★ 꾸준한 업로드, 더 좋은 영상으로 찾아뵙겠습니다!! ★★
◎ 리드무비 채널 구독
https://www.youtube.com/channel/UCU8H...
◎ 리드무비 후원 : https://toon.at/donate/63662086722297...
후원해주신 금액의 일부는 구독자님들과의 오프 모임에 쓰입니다.
◎ 더 많은 영화정보! 리드무비 페이스북 https://www.facebook.com/rleadmovie/',null,null,null,'read@gmail.com','MH010',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','726','MH726','귀신한테 맞다이 신청해서 개털리는 공포영화[영화소개][영화리뷰]','https://www.youtube.com/embed/d9qRQ5bPQ4E','안녕하세요 순타입니다.
오늘의 영화는 "오큘러스 Oculus"입니다.
귀신이 씌어진 거울을 남매들이 진실을 파헤치는 영화입니다.
부디 재미있게 보셨으면 좋겠네요 ㅎㅅㅎ
그리고 구독과 좋아요와 댓글은 저에게 큰 힘이 됩니다 (please)',null,null,null,'sunta@daum.net','MH010',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','727','MH727','다른 사람의 이름으로 살아온 여자','https://www.youtube.com/embed/NtxrMQIiEyg','* 본 영상은 배급사와의 협의를 마치고 업로드 되었습니다.
* 영상의 재가공 및 재배포를 금합니다.
무비코멘트가 ''구작 리뷰''로 돌아왔습니다.
구작 영화 중 명작들을 골라서 리뷰하고,
여러분께 추천해드리도록 하겠습니다!
제목 : 화차 (2012)
감독 : 변영주',null,null,null,'aloneman@daum.net','MH011',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','728','MH728','원작보다 1000배는 더 좋은 영화','https://www.youtube.com/embed/w-W7E55Yq5Y','#알씨네 #화차 #변영주 #김민희
* 영상편집에 도움을 받은 영화목록
/화차/ (Helpless, 2012) 감독 변영주 / 배우 이선균 김민희 조성하 * 음악정보
Kevin MacLeod의 Classic Horror 3은(는) Creative Commons Attribution 라이선스(https://creativecommons.org/licenses/... 따라 라이선스가 부여됩니다.
출처: http://incompetech.com/music/royalty-...
아티스트: http://incompetech.com/
Kevin MacLeod의 Exotics은(는) Creative Commons Attribution 라이선스(https://creativecommons.org/licenses/... 따라 라이선스가 부여됩니다.
출처: http://incompetech.com/music/royalty-...
아티스트: http://incompetech.com/',null,null,null,'egg@naver.com','MH011',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','729','MH729','휴게소에서 갑자기 사라진 예비 신부','https://www.youtube.com/embed/IQeeGXWZvOk','김민희의 신들린 연기!
임팩트 있는 초반 전개부터
긴장감 있는 분위기 조성, 먹먹해지는 결말까지...
제가 가장 좋아하는 한국 스릴러 영화 중 하나인
영화 화차 소개입니다
#화차 #영화화차
*영화 제대로 보기 - https://youtu.be/lP8tWHZvjGw
후... 오랜만에 영화 리뷰 녹음했더니 감이 다 사라졌네요
개인적으로 상당히 맘에 들지 않는 나레이션입니다
다음번 리뷰는 좀 더 신경써서 하도록 하겠습니다
너그러이 양해 부탁드려요',null,null,null,'hi@gmail.com','MH011',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','730','MH730','살인범을 무죄로 만들어야 하는 변호사! 그래야 딸이 돌아온다!!','https://www.youtube.com/embed/sbEE4z_fXyQ','안녕하세요 ''영화를 말하다'' 영화 리뷰입니다.
영화 : 세븐데이즈 (Seven Days, 2007)
감독 : 원신연
출연 : 김윤진, 김미숙, 박희순 등
한국 영화에는 유독 좋은 스릴러 영화가 많습니다.
추격자, 악마를 보았다. 황해, 살인의 추억 등등.
저는 그중에서도 이 영화 세븐데이즈를 최고의 스릴러라 말하고 싶습니다.
물론 개인적 의견이지만 그만큼 완성도 높은 영화 입니다. : )
여러분도 꼭한번 보시기 바랍니다.!',null,null,null,'murf@gmail.com','MH012',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','731','MH731','1000만 못 넘은게 이상한 역대급 충격반전 한국 스릴러 영화','https://www.youtube.com/embed/ARsP3vPfLbQ','문의 및 컨택트 ddingzal@daum.net
인스타그램 https://www.instagram.com/ddingzal/
페이스북 http://bitly.kr/xpu725
띵잘 후원 https://toon.at/donate/63685659262999...
여러분들의 소중한 후원으로 더 좋은 컨텐츠를 만드는데 힘쓰겠습니다
영상출처 - 영화 ''세븐데이즈 (2007)''
다운로드링크 https://www.youtube.com/embed/7vKwj...
*영상의 저작권은 영화의 배급사측에 있습니다',null,null,null,'ddingjal@hotmail.com','MH012',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','732','MH732','내 딸을 살리면 전과 5범의 살인범이 무죄로 풀려난다. 당신의 선택은?','https://www.youtube.com/embed/dmu_XpEKbc8','#세븐데이즈 #영화 #스릴러
안녕하세요. 영화도전 입니다.
이번에 소개할 영화는 ''세븐 데이즈(Seven Days, 2007)'' 입니다.
유튜브 구매 링크 : https://www.youtube.com/embed/7vKwj...
영상이 마음에 드셨다면 ''구독''과 ''좋아요'' 부탁 드립니다.
시청해 주셔서 진심으로 감사 드립니다.',null,null,null,'yap@daum.net','MH012',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','733','MH733','공포영화의 최고봉이라 불렸던 영화','https://www.youtube.com/embed/qclfIfGT_es','진짜 사탄이 개입한게 아닌지 소문이 자자했던 영화 ''엑소시스트'' 소개 영상입니다.
감독은 ''윌리엄 프리드킨'' 입니다.
*다운로드 링크
https://movie.naver.com/movie/bi/mi/d...
*이 영상에 사용된 자료 출처 표기
Georges Biard의 Max von Sydow Cannes 2016.jpg은(는) Creative Commons Attribution 라이선스(https://creativecommons.org/licenses/... 따라 라이선스가 부여됩니다.
출처: https://commons.wikimedia.org/wiki/Fi...
Elen Nivrae의 William Friedkin.jpg은(는) Creative Commons Attribution 라이선스(https://creativecommons.org/licenses/... 따라 라이선스가 부여됩니다.
출처: https://ko.wikipedia.org/wiki/%ED%8C%...
Kevin MacLeod의 Aftermath - Madness Paranoia은(는) Creative Commons Attribution 라이선스(https://creativecommons.org/licenses/... 따라 라이선스가 부여됩니다.
출처: http://incompetech.com/music/royalty-...
아티스트: http://incompetech.com/
Kevin MacLeod의 Comfortable Mystery 4 - Film Noire은(는) Creative Commons Attribution 라이선스(https://creativecommons.org/licenses/... 따라 라이선스가 부여됩니다.
출처: http://incompetech.com/music/royalty-...
아티스트: http://incompetech.com/',null,null,null,'screen@daum.net','MH013',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','734','MH734','안 본 사람은 있지만 모르는 사람은 없을 영화','https://www.youtube.com/embed/-8Mc9DhBpvY','어느날 갑자기 악마가 소녀의 몸 속으로 들어가게되고,
그런 악마를 내쫓는 엑소시즘을 진행하는
신부의 모습을 담은 영화 엑소시스트1 입니다.
https://series.naver.com/tvstore/deta...
위의 링크로 영화 엑소시스트1을 보실 수 있습니다.
(가격은 구매 5,000원 / 대여 1,300원)
영상이 재미있으셨다면
좋아요와 구독버튼 한번씩 부탁드려요 ^^
다음엔 더 재미있는 영상으로 찾아뵙겠습니다!',null,null,null,'gogomovie@gmail.com','MH013',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','735','MH735','영화보던 관객들이 심장마비로 사망한 바로 그 영화 (결말포함)','https://www.youtube.com/embed/TVWHvlS40Jw','문의 및 컨택트 ddingzal@daum.net
인스타그램 https://www.instagram.com/ddingzal/
페이스북 http://bitly.kr/xpu725
띵잘 후원 https://toon.at/donate/63685659262999...
여러분들의 소중한 후원으로 더 좋은 컨텐츠를 만드는데 힘쓰겠습니다
영상출처 - 영화 ''엑소시스트 (1973)''
다운로드링크 http://bitly.kr/3R2m7m
*영상의 저작권은 영화의 배급사측에 있습니다',null,null,null,'ddingjal@hotmail.com','MH013',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','736','MH736','알고 있어도 속는 최고의 반전영화','https://www.youtube.com/embed/vYyYzHMs57g','* 본 영상은 스포일러가 다수 포함되어 있습니다 *
원작영화 구매 및 대여 : (업로드날짜)
#1 : (1,000 원)
https://nstore.naver.com/movie/detail...
누군가 한번쯤 들어봤을 ''최고의 스포일러 문장''인 "0000이 범인이다."
그 이야기가 들어있는 최고의 반전 영화가 여기 있습니다!
반전 영화의 교과서, 현대 반전 영화의 모태가 된 영화이며
범죄 스릴러, 심리 스릴러 장르의 명작이기도 하죠!
이 영화를 보지 않고서는, 반전을 논하면 안된다는 말도 있습니다!
최고의 반전영화! 오늘, 이 영화 어떠세요?
리뷰를 하면서 주요 장면및 결말을 빼 놓았으니 꼭 영화를 시청해보시길 바랍니다! - ''무비코멘트''는 유튜브에만 업로드 됩니다.
영화제목 : 유주얼 서스펙트 (1995)',null,null,null,'aloneman@daum.net','MH014',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','737','MH737','【반전포함】본 적도 없고 제목도 모르는 사람마저 범인이 누군지 아는 영화','https://www.youtube.com/embed/O9hraotEZKA','영화 : 유주얼 서스펙트 (The Usual Suspects , 1995)
장르 : 범죄, 스릴러, 미스터리 【덕무비 구독】(SUBSCRIBE)
▶https://www.youtube.com/c/블랙덕BlackDuc...
#영화#결말포함#절름발이',null,null,null,'duc@daum.net','MH014',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','738','MH738','반전 스포 영화의 원탑 [결말포함]','https://www.youtube.com/embed/zht5yGQSKRc','제목 : 유주얼 서스펙트 (1995년 작품)',null,null,null,'ezip@daum.net','MH014',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','739','MH739','[병맛리뷰] 한 가족이 유럽을 말아먹는 영화! 28주후','https://www.youtube.com/embed/gAN3Dd9Y5Ic','-구불추천지수는 지극히 개인적 감상평입니다. 가볍게 참고만 해주세용-
28주후 구불추천지수: 9/10
병맛요소: 2/10
참신함: 7/10
한줄평: 28일후를 잇는 좀비 명작. 전작에 비해 두 배 넘는 제작비로 볼거리가 더 많아졌다. 2편이 재밌는경우는 극히 드문데 개인적으로 28주후가 조금 더 재미 있는듯 하다. 28개월후는 왜 나오지 않는것일까?
이야 28주후도 대박이야. 돈의 가족들이 개 민폐긴해도 저는 28일 후보다 스케일도 커서 개인적으로 28주후가 조금 더 재밌었어요. 그리고 마지막 에펠탑장면은 28개월후를 학수고대하기엔 충분한 장면이었죠. 아니 28개월후 찍는다는 소문만 있고 왜 안찍는거야? 근데 카를로스형 대니형 28개월후 찍으면 떼돈번다? 형들 이걸로 700억 넘게 벌었잖아. 좀 찍어줘용~!! 28개월후를 오매불망 기다리는 구불이었습니다.',null,null,null,'9bul@gmail.com','MH015',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','740','MH740','한남자의 실수로인해 인류가 멸망하는 영화(발암가족)','https://www.youtube.com/embed/OXLziUWw-ys','영화 28주후(2007) 입니다.
이 동영상은 원 저작권 소유자의 저작권 승인을 받았습니다.',null,null,null,'drunk@hotmail.com','MH015',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','741','MH741','28주 후 리뷰 [망?]','https://www.youtube.com/embed/oMnPKilwka0','새로운 좀비 클래식 영화, 28일 후의 속편 28주 후 리뷰입니다.
자세한 영화 소개는 ''삐맨'' 채널에서 함께하세요.
삐맨구독 : https://goo.gl/iNZoB6
삐맨 ''28주 후'' 소개 : https://goo.gl/AaSqud
감독 - 후안 카를로스 프레스나딜로
출연 - 로버트 칼라일, 로즈 번, 제레미 레너, 해롤드 페리뉴, 이드리스 엘바
제목 - 28주 후
엉준의 SNS 팔로우 해주시고, 좋아요, 구독도 잊지 마세요!!
엉준 페이스북 : http://goo.gl/rwzblg
엉준 인스타그램 : http://goo.gl/KnPLRC
엉준 왓챠 : https://goo.gl/jijXIC
촬영장소 : 스튜디오 일기당천 (서울특별시 서대문구 37-42 지하1층)
페이스북 : https://www.facebook.com/1vs1000Studio/
오시는길 : https://goo.gl/maps/qij1UiY7npr
.
.
.
.
.
.
.
※ 본인과 의견이 다르다며, 이해를 못하겠다며, 공감을 못하겠다며 다름을 인정하지 못하고 ''시비'', ''비아냥'', ''인격 모독''댓글을 다시는 분들이 있습니다.
분노조절장애와 애정결핍은 치료가 가능한 질병입니다.
가까운 진료소를 찾아 인터넷중독치료 및 분노조절장애치료, 주의력결핍장애치료 등에 관해 상담을 받아보시길 바랍니다.
여러분의 쾌유를 빕니다.
※ 영화 의견 외 인격을 모독하는 악플은 잘 모아서 사이버수사대로 접수하고 있습니다.
감사합니다.',null,null,null,'unjun@naver.com','MH015',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','742','MH742','[요청병맛리뷰] 벽을타는좀비! 눈물젖은빵! 월드워Z','https://www.youtube.com/embed/JT3ZdVLPGug','구텐탁! 영화보다재밌는 병맛리뷰 구불입니다. 저번에 28시리즈를 리뷰하면서 서운하셨던 분이 또 계셨을겁니다. 아니 제가 유튜브 첫 영상으로 좀비영화 평점 정리를 했었는데 월드워Z를 10점 만점에 6점 줬다가 욕을 오지게 먹었어요.ㅎㅎ 그래요 지금 생각해보니까 부산행보다 월드워Z가 훨씬 재밌었던거 같애.. 여튼 좀비영화 총정리 영상은 백프로 제 개인적인 취향으로 만들었던 거고요. 지금은 시청자분들 의견이 많이 쌓여서 이걸 토대로 다시 정리하고 있습니다. 아니 잠깐 이 얘기를 하려는게 아니었는데 반누리 원석님이 요청해 주신 월드워Z! 음음 월드워Z
20세기에는 기어가고 걸어가는 좀비가 있었으나 21세기가 되면서 뛰는 좀비, 변형 좀비가 각광받게 되었습니다. 하지만 요런건 처음이죠? 벽을 타고올라가는 좀비! 거기다가 스케일도 어마어마한 월드워Z 뚜껑을 한번 열어보도록 하겠습니다.
아 영화가 진짜 재밌었는데 갑자기 마무리가 확 죽은 이유가 있었군요. 김H수님 제보해주신 정보 감사드립니다. 난 마지막에 왜 말아먹었나했지.. 역시 돈이 없었어..
근데 이렇게 힘들게 개봉한 월드워Z가 2억달러로 제작되어 5억 3천만 달러를 벌었습니다. 그래서 2017년에 2편을 개봉하기로 했었는데 응? 미뤄져서 2019년 개봉예정으로 돼있네요. 아니 빵형 이혼 소송중이었구나..! 그 형의 사생활은 잘 모르겠지만 영화만 좀 잘찍어줘용..!
아 근데 다행인게 1편에서 돈을 벌었으니까 2편이 무산될 가능성도 적고 제작사 눈치를 안보고 찍을 수 있을거 같다는 기대를 해봅니다. 흥행만 된다면 3부작까지 계획하고 있다는 월드워Z 시리즈. 좀비영화를 좋아하신다면 저와 함께 내년 개봉전까지 원작을 읽어보는 것은 어떨까요? 에이 설마 레지던트 이블처럼 되지는 않겠지..? 여튼 엄청 기대되는건 사실에요. 내년에 두고봅시다~! 이상 영화보다 재밌는 병맛리뷰 구불이었습니다. 여러분 구구까까?!',null,null,null,'9bul@gmail.com','MH016',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','743','MH743','[영화리뷰/결말포함] 좀비들이 들끓는 세상에 살아가는 사람들','https://www.youtube.com/embed/51IiZdV-ME4','* 본 영상은 스포일러와 결말이 포함 되어있습니다 영화 : 월드워Z (World War Z, 2013)
영상 재미있게 보셨다면 구독 / 좋아요 / 댓글 부탁드립니다!
더 좋은 편집과 영상 소개로 보답하겠습니다 ^^',null,null,null,'mix@gmail.com','MH016',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','744','MH744','부산행 보다 재밋는 10분만에 보는 ''월드워Z'' (World War Z, 2013)','https://www.youtube.com/embed/gPEwtJuo31g','스토리 보기전 자막켜주세요~ 좀비계의 부르주아 월드워Z 스토리를 7분정도로 요약한 영상입니다. 2017년에 월드워Z 2 가 나올예정인데 그전에 보고 복습하세요~',null,null,null,'2ddudae@gmail.com','MH016',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','745','MH745','봉쇄된 아파트에서 좀비가 나온다면? (결말포함/R.E.C)','https://www.youtube.com/embed/o_OgOjuvXwc','안녕하세요!! 영화를 읽어주는 남자 영일남입니다.
R.E.C (2007)입니다.
마지막에도 설명드렸지만, R.E.C 4부작은 1,2,4,3 순으로 진행할 예정입니다.
오늘도 봐주셔서 진심으로 감사합니다.',null,null,null,'youngread@daum.net','MH017',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','746','MH746','개쩌는 1인칭 좀비영화 (스포,자막有)','https://www.youtube.com/embed/D6lZFbYhDl8','아주 재미있게본 영화였습니다. 기회가 된다면 후속작으로도 찾아오겠습니다!
구독자,시청자분들 항상 감사드립니다. 편안한밤 보내세요^_^',null,null,null,'hongcinema@gmail.com','MH017',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','747','MH747','좀비와 함께 아파트에 갇혀버린 리포터 | REC | 공포,좀비 | 킬타(킬링타임) | 영화추천','https://www.youtube.com/embed/ajQH8CwhHHc','R.E.C 보러가기 ( 네이버 영화 )
https://nstore.naver.com/movie/detail...
- R.E.C -
개봉 : 2007 ( 국내 2008 )
장르 : 공포,서스펜스,미스테리
감독 : 하우메 발라게로,파코 플라자
출연 : 마누엘라 벨라스코, 페란 떼라사, 비센테 힐
좋아요 & 구독은 큰 힘이 됩니다^^
영화,애니,만화,드라마 모~오든 영상을 소개,리뷰,추천을 드리는 채널! 여러분들의 시간을 뺏도록 노력하겠습니다! 킬타(킬링타임) 많은 사랑 부탁드립니다♡
인트로,아웃트로 BGM : Adagio for summer wind',null,null,null,'killtarian131@yahoo.com','MH017',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','748','MH748','손에 피 묻은 자, 돌아갈 수 없다 ( 알포인트 ) 스토리+해석편','https://www.youtube.com/embed/8Uv7hSif9SM','19번째 영화 리뷰 (알포인트 2004) 스토리+해석편입니다. 17분 27초 이후론 스포일러가 포함되어 있으니 주의해주세요. 좋아요(추천) 버튼을 눌러주시면 더 많은 분들이 감상하실 수 있고,
구독을 하시면 알람기능으로 인해 더 편하게 보실 수 있습니다.
영화 알포인트에 관련된 썰이 엄청 많더라고요.
그래서 이번 리뷰를 알포인트로 잡았는데... 와...
할 이야기가 너무 많아서 줄이고 줄였는데도 분량이 너무 많아요
뒷이야기를 계속 찾아보다 보니까
영화보다 뒷이야기가 더 잼나기도 하고 ㅋㅋㅋ
암튼, 관심있으신 분들은 한번쯤 보셔도 괜찮은 영화 같습니다.
p.s 댓글로 여러 영화들의 리뷰신청이 있었는데,
그영화들을 다 리뷰로 만드는건 시간상 불가능하기에.....
이번엔 그중에서 "gkdl9164 1234"님과 "더쿠마쿠"님이 추천해주신 영화를 선택했습니다.',null,null,null,'riukun@gmail.com','MH018',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','749','MH749','죽음의 섬에 갇힌 9명의 군인','https://www.youtube.com/embed/-N_zRQa2bzY','영화 알포인트(R-Point) 리뷰 입니다.
안녕하세요 쭈머입니다.
2004년에 나온 영화지만 지금까지도 한국 공포 영화에서 수작으로 손꼽히는
영화 알포인트 리뷰 입니다.
아직 부족한 부분이 많습니다.
영상 보시면서 어색한 부분이나 거슬리는 부분
고쳤으면 하는 부분이 있으면 댓글로 알려주세요!
다음 영상 만들때 참고하여
더 좋은 영상으로 보답하겠습니다.
재밌게 보시고 좋아요, 구독, 댓글 부탁드립니다.
감사합니다.',null,null,null,'jjummer@hotmail.com','MH018',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','750','MH750','[알 포인트] 손에 피 뭍힌 자, 절대 돌아갈 수 없다','https://www.youtube.com/embed/pbYQZNq6yuo','#알씨네 #알포인트 #감우성
* 영상편집에 도움을 받은 영화목록 /알 포인트/ (R-Point, 2004) 감독 공수창 / 배우 감우성, 손병호, 박원상
* 알씨네 유튜브 구독하기 https://www.youtube.com/c/rcine
* 알씨네 네이버TV http://tv.naver.com/rcine * 공식 페이스북 https://www.facebook.com/rcine2017/',null,null,null,'egg@naver.com','MH018',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','751','MH751','좀비세상에 완벽히 적응한 남자ㅣ좀비랜드ㅣ(영화리뷰,결말포함)','https://www.youtube.com/embed/jcK4jxiYMWU','할로윈 좀비특집은 좀비랜드로 마지막을 장식했습니다
다음에는 무슨영화를 해볼까요?
문의메일 : yb1619@naver.com
''좀비랜드'' 영화 보러가기 : https://www.youtube.com/embed/e40jR...',null,null,null,'baebae@gmail.com','MH019',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','752','MH752','(결말포함) 미국의 국민배우까지 좀비가되어버린 세상..? [좀비랜드/ 진솔한리뷰]','https://www.youtube.com/embed/CHMovBPhtUo','※영상오류로 인한 재업로드※
이번 영화는 루벤 플레이셔감독의 영화 ''좀비랜드(2009)''입니다.
코미디 영화이며, 좀비바이러스 속에서 살아남은 생존자들의
이야기를 다룬 내용입니다.
라라랜드의 ''엠마스톤''과 소셜네트워크의 ''제시 아이젠버그'' 가 출연하여 영화의 퀄리티를 극대화 시켜주었습니다. 성격이 각자 다른 4명의 생존자들이 어떻게 좀비랜드로 부터 살아남을지, 영화를 통해 만나보시죠 :)
그럼 영화 재밌게 보시구요, 영상 괜찮았다면
좋아요♥구독하기♥알람설정♥ 부탁드릴게요. 좋은일 생기실 겁니다 :)',null,null,null,'realtrue@hotmail.com','MH019',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','753','MH753','좀비랜드식 생존규칙(좀비랜드 리뷰)','https://www.youtube.com/embed/Z4Iarv3ePFE','영화 [좀비랜드] 의 줄거리 요약 및 리뷰영상입니다. 영상에 스포일러가 포함되어있으니 시청하실 때 주의해주시길 바랍니다',null,null,null,'lak@hotmail.com','MH019',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','754','MH754','좀비에게 전설이 된 남자(결말포함/나는전설이다)','https://www.youtube.com/embed/cKJFWkpWA7Y','안녕하세요! 영화를 읽어주는 남자 영일남입니다.
영화 나는전설이다(2007)입니다
현재 보신 결말은 감독판 결말이며, 아래는 일반 결말 링크입니다.
https://youtu.be/ADd25gYsHg0 항상 응원해주시는 분들 정말 감사드립니다.
#결말포함 #영화리뷰 #영화추천 #영일남',null,null,null,'youngread@daum.net','MH020',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','755','MH755','좀비세상에서 전설이 된 남자','https://www.youtube.com/embed/V6c-LCv3M9E','전설이 되어버린 한남자의 이야기. 그 전설의 의미와 나비의 상징적모티브. ''나는 전설이다''-2007
영화리뷰와 게임리뷰를 같이 보실수 있는 채널입니다! 보느냐 마느냐 그것이 문제로다
아바타TV : http://www.avatatv.co.kr/broadcast/ha...
방송시간 : 화,목,토 10시~12시
유튜버 카랑님과 함께 ''햄카''TV로 영화토크쇼를 진행합니다~ 트위치 TV : https://www.twitch.tv/hamlet0529',null,null,null,'hamlet_movies@gmail.com','MH020',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','H','756','MH756','좀비에게 지능이 생기면 일어나는 일','https://www.youtube.com/embed/Z2lt9fECA14','-나는 전설이다 (I Am Legend, 2007)
영화 소개
결말 포함',null,null,null,'dopan@daum.net','MH020',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','757','MR757','과거 좋아했던 여자와 닮은 여자를 사귀고 죽은 남자','https://www.youtube.com/embed/ibhDnPZWG7w','"구독과 좋아요'' 는 큰 힘이 됩니다.
''깨끗한 댓글''문화에 동참해 주세요^^
#영화리뷰 #영화소개 #영화추천 #러브레터 #캡틴라미
학창시절 좋아했던 여학생에게 제대로 고백도 못 해고 죽은 남자.
감독: 이와이 슌지
영화: 러브레터(1995)
Love Letter
▶HD급 고화질1080p시청 하세요
▶후원하기: https://goo.gl/Z71XAp
▶감성 건망증: http://www.gmz.co.kr/
★트위치TV: https://goo.gl/SNTYhu
★구독하기: https://goo.gl/pSFlvS
"',null,null,null,'captainrami@gmail.com','MR001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','758','MR758','다신 보지 않을 러브레터','https://www.youtube.com/embed/CnzzLQhe36I','"많은 분들이 겨울에 늘 떠올리실 영화 중 하나인
러브레터가 얼마 전에 또 재개봉했습니다.
이제 곧 발렌타인 데이네요."',null,null,null,'nofootbird@gmail.com','MR001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','759','MR759','[러브레터] ''히로코''에겐 허락되지 않은 공간(Love Letter Review)','https://www.youtube.com/embed/Y6GHIPwfebM','유튜브 구독 ▶ https://goo.gl/iqEvvp 죽은 사람을 그리워하며 쓴 편지, 그리고 그에게서 온 답장. 이들을 연결하고 있는 이 편지엔 어떤 사연이 있는 걸까요? 겨울이면 생각나는 영화 ''러브레터''! 이번 시간엔 ''러브레터''를 간략히 보고, 영화에 관해 몇가지 이야기를 해보겠습니다. 1:00 ▶ REPLAY - ''러브레터'' 다시보기 3:12 ▶ Scne by Scne#1 ''일본 멜로''의 연출 4:20 ▶ Scne by Scne#2 타임 루프 5:53 ▶ Scne by Scne#3 ''히로코''에겐 허락되지 않은 공간 6:59 ▶ Scne by Scne#4 ''러브레터''',null,null,null,'senimapia@gmail.com','MR001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','760','MR760','지금 만나러갑니다 - 영화는 사랑을 어떻게 표현할까','https://www.youtube.com/embed/1IozJwzdVNw','영화 지금, 만나러갑니다를 통해 영화의 언어가 사랑을 표현하는 방법을 알아보는 영상입니다
*노래
Kevin MacLeod의 Continue Life은(는) Creative Commons Attribution 라이선스(https://creativecommons.org/licenses/... 따라 라이선스가 부여됩니다.
출처: http://incompetech.com/music/royalty-...
아티스트: http://incompetech.com/
Audionautix의 5 Cents Back은(는) Creative Commons Attribution 라이선스(https://creativecommons.org/licenses/... 따라 라이선스가 부여됩니다.
아티스트: http://audionautix.com/
지금 만나러 갑니다 ost - 시간을 넘어서
*지금 만나러 갑니다 명장면 해석',null,null,null,'mypopcorntree@yahoo.com','MR002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','761','MR761','1년 전 죽은 아내가 돌아오면 벌어지는 일','https://www.youtube.com/embed/T-elyBDpcBw','"[ 지금, 만나러 갑니다 ]
개봉 : 2005.03.25.(한국 기준)
장르 : 멜로/로맨스, 드라마
감독 : 도이 노부히로
출연 : 타카무라 시도[아이오 타쿠미 역], 다케이 아카시[아이오 유우지 역], 다케우치 유코 [아이오 미오 역], 등급 : 12세 관람가
볼만했다면 좋아요 & 구독!
불편하셨다면 싫어요 & 댓글을 꼭! 남겨주세요"',null,null,null,'whiteraccoon@hotmail.com','MR002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','762','MR762','[지금, 만나러 갑니다] 비의 계절에 돌아온다던 그녀(いま、?いにゆきます)','https://www.youtube.com/embed/-3ITJiDNwSY','유튜브 구독 ▶ https://goo.gl/iqEvvp 세상에 하나뿐인 당신을 ''지금, 만나러 갑니다'' 비의 계절에 돌아온다는 약속을 남기고 떠난 ''미오(다케우치 유코)''에겐 어떤 일이 있었던 걸까요? 그녀는 왜, 그리고 어떻게 물의 계절에 돌아온다는 걸까요?',null,null,null,'senimapia@gmail.com','MR002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','763','MR763','어바웃 타임 - 이 영화의 첫사랑이 이루어지지 않는 이유','https://www.youtube.com/embed/OVOuf25FQAo','"*팝콘트리 채널 후원
https://www.patreon.com/popcorntree
영화 어바웃 타임 해석 영상입니다.
영화의 주제를 생각해보면 첫사랑 샬롯과 주인공이 이루어지지 않는 이유를 추측해볼 수 있습니다.
"',null,null,null,'mypopcorntree@yahoo.com','MR003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','764','MR764','당신의 잠든 연애 세포를 깨워 줄 영화 ??','https://www.youtube.com/embed/BwPaqTHyITc','"#어바웃 타임 #김흥미 #영화추천
★ 영화, 어바웃 타임(2013) ★
김흥미가 추천하는 오늘의 영화입니다.
?세상에 흥미로운 영화를 만나다. ?
꾸준히 업로드 되는 영상을 받아보세요 ^.^*"',null,null,null,'mimi@naver.com','MR003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','765','MR765','시간을 이동하는 초능력자의 삶','https://www.youtube.com/embed/ixY7k9wQjFU','영화 [어바웃 타임]의 줄거리 요약 및 리뷰 영상입니다. 스포일러가 포함되어있으니 참고 부탁드립니다. 감사합니다.',null,null,null,'sogaenam@naver.com','MR003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','766','MR766','찌질이가 미녀를 꼬시는데 성공한 이유','https://www.youtube.com/embed/3tiXE3MfiJU','"영화 ''어바웃 타임''(2013),
비일상을 통해 일상의 소중함을 전하는 어바웃 타임입니다"',null,null,null,'tunachamchi@yahoo.com','MR003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','767','MR767','당신이 모르고있는 명작 "이터널 선샤인"의 비밀들','https://www.youtube.com/embed/HVJRRNEOSYU','"#이터널 선샤인 #영화 #영화리뷰
BBC 선정 21세기 가장 위대한 영화 6위에 선정된 영화 ""이터널 선샤인!""
많은 사람들이 인생 영화라고 부르는 이 영화에는 대체 어떤 비밀이 숨겨져있을까요?
함께 알아봐요!
? 재미있게 보셨다면 좋아요와 구독 부탁드릴게요 ?
"',null,null,null,'heatherturning@gmail.com','MR004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','768','MR768','인간의 기억을 조종하는 조직','https://www.youtube.com/embed/vMz1z9rrMCg','영화 [이터널 선샤인] 스토리텔링 영상입니다.
감사합니다.',null,null,null,'sogaenam@naver.com','MR004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','769','MR769','이터널 선샤인에는 왜 니체가 나올까?','https://www.youtube.com/embed/kOLzoecSxT8','개봉 10주년이 됐지만 역시 꾸준한 사랑을 받는 이터널 선샤인. 멜로영화이면서도 머리 아픈 설정과 연출이 참 많았던 영화죠. 무려 철학자 니체까지 등판을 하니까요. 감독은 멜로영화에 왜 니체를 끌어왔을까요? 재개봉 기념, 이라는 명분으로, 지루함을 감수하고 이터널 선샤인을 다시보기 해봤습니다.',null,null,null,'freeman@gmail.com','MR004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','770','MR770','라라랜드 정말 미쳤습니다. 올해의 영화입니다 꼭 보세요!','https://www.youtube.com/embed/ygSGTugLB-k','"위플래시의 데미안 차젤레 감독, 라이언 고슬링, 엠마 스톤의 아름다운 뮤지컬 영화 라라랜드 리뷰입니다. 뮤지컬 영화를 싫어하는 분이 아니라면 꼭 보세요! 커플이 되고싶다면 꼭 보세요! 위플래시와 전혀 다른 느낌의 영화 라라랜드는 정말 미쳤습니다. 리뷰엉이가 강력 추천하는 올해의 영화입니다!
영화 컨텐츠 크리에이터 리뷰엉이의 영상 전파하기!
구독, 좋아요, 댓글, 공유는 저에게 힘이 됩니다!
언제나 리뷰엉이 채널을 시청해주셔서 감사합니다!
[리뷰엉이 채널은?]
리뷰엉이는 영화 리뷰, 영화배우 이야기, 영화 이벤트와 영화 소식을 전달하며 DC 코믹스와 마블 코믹스 및 코믹스 기반 영화 이야기와 몰랐던 사실을 재미있게 전달해주는 채널입니다. 영화에 대해서 궁금한 점이나 재미있는 영화 컨텐츠, 아이디어가 있다면 언제든지 유튜브와 SNS로 댓글 남겨주세요!
리뷰엉이: Owl''s Reviews 운영자 - 리뷰엉이
"',null,null,null,'reviewang@gmail.com','MR005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','771','MR771','라라랜드 가이드 리뷰 by 발없는새','https://www.youtube.com/embed/PecN-cKUjVA','"라라랜드는 위플래쉬를 연출한 대미언 차젤 감독의 신작으로 기대가 높았습니다. 동시에 하필 뮤지컬 장르를 택했다고 해서 걱정도 컸던 영화입니다. 제게 있던 징크스 때문이었는데, 과연 결과는 어땠을까요?
배경음악은 아래와 같습니다.
Another Day of Sun
Someone in the Crowd
Planetarium
모두 라라랜드 OST에 있습니다.
"',null,null,null,'nofootbird@gmail.com','MR005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','772','MR772','배우 지망생과 동네 식당 연주자의 사랑이 인생 영화로 불리는 이유: 라라랜드','https://www.youtube.com/embed/gHeAg105C7g','많은 사람들의 인생 작품. 꿈과 사랑으로 가득 찼던 그날의 기억. 라이너의 영화 인수분해 그 네 번째 작품. 설명이 필요없는 영화. 라라랜드입니다.',null,null,null,'liner@hotmail.com','MR005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','773','MR773','은근히 알려지지 않은, ''라라랜드''에 관한 6가지 흥미로운 이야기 [천재이승국]','https://www.youtube.com/embed/meEs5w2D-gc','"골든글로브에서 무려 7관왕이라는 기록을 세운 영화
라라랜드!
영화에 관한 흥미로운 이야기 6가지를 정리했습니다.
간단한 이야기는 많이들 다루시는것 같아서 은근히 잘 알려지지 않은 사실들로 준비했습니다.
천재이승국을 구독하고 더 많은 영상을 만나보세요!^^"',null,null,null,'genius@gmail.com','MR005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','774','MR774','여자의 속마음을 들을 수 있는 남자','https://www.youtube.com/embed/tLxyYxJcnpM','"#왓 위민 원트 #드림텔러 #영화소개
"',null,null,null,'dreamteller@daum.net','MR006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','775','MR775','모든 여성의 속마음을 들을 수 있는 유일한 남성','https://www.youtube.com/embed/euNhUsofQAM','"영화
제작지원: 비플릭스"',null,null,null,'fallinfilm@hotmail.com','MR006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','776','MR776','여성의 속마음을 읽는 초능력이 생기면 벌어지는 일','https://www.youtube.com/embed/-gqLDufcDnU','"안녕하세요! 옥탑방무비입니다.
이번에 소개해드릴 영화는 ‘왓 위민 원트(2000)’라는 영화입니다.
‘왓 위민 원트’ 영화는
남성우월주의자인 “닉 마샬’이란 주인공이
여성의 속마음을 읽는 기이한 능력이 생기면서
일어나는 재미난 에피소드들을 다루고 있습니다ㅎㅎ
자신은 정말 “사랑꾼”의 표본인거 같지만
번번이 사랑에 실패하는 분이라면,
꼭 2시간짜리 풀영상을 보시길 추천드립니다!!
□ 8:09 부터는 영화에 대한 저의 짧은 리뷰가 나와요!
□ 9:24 부터는 옥탑방무비가 선정한 베스트씬&추천곡입니다! (고막테러 주의)
- 추천곡 : Harry Connick Jr. - Close To You
- 원곡 : Carpenters - Close To You
- 봄에 듣기 좋은ver. : Olivia Ong - Close To You
- 추천영상 : C?dia e Dan - Close To You
https://youtube.com/embed/Lx0PdecHzZw
□ 유튜브영화 ‘왓 위민 원트(2000)’ 보러가기! https://youtube.com/embed/SHEmofL0uyM
오늘도 즐감하시길 바랍니다♥?
구독과 좋아요 부탁드려요?
감사합니다!!
#영화 #로맨스코미디 #왓 위민 원트"',null,null,null,'tophome@gmail.com','MR006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','777','MR777','기억을 지우면 안되는 이유. 사랑하는 사람을 잊어버릴 수 있습니다!','https://www.youtube.com/embed/vYjuueP195c','"안녕하세요 ""영화 소환사""입니다.
처음 영상을 제작해서 많이 미흡하지만 앞으로 더욱 발전해 나가서
퀄리티 있는 영상을 만들어가겠습니다.
오늘 소개하는 영화는 내 머리속의 지우개입니다.
저는 로맨스 영화하면 이 영화부터 먼저 떠오릅니다.
여러분 중 혹시라도 아직 보지 못한 분들이 계시다면 꼭 한 번쯤은
시청하길 추천드립니다.
영상을 다 보신 후에 구독과 좋아요 부탁드립니다.
감사합니다.
-내 머리속의 지우개 (2004)
"',null,null,null,'shong@hotmail.com','MR007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','778','MR778','내 머리 속의 지우개 (A Moment to Remember) | 영화리뷰','https://www.youtube.com/embed/jE_qDA_UAZc','"내 머리 속의 지우개 (A Moment to Remember) | 영화리뷰 | 영화소개 | 영화추천
로맨스/멜로/드라마/한국
(감독) 이재한 (주연) 정우성, 손예진"',null,null,null,'uxxmovie@daum.net','MR007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','779','MR779','이거 마시면 우리 사귀는 거다','https://www.youtube.com/embed/M5YFl8ST380','#어디가서 #써먹진말자 #참패다 안녕하세요 영화 내 머리 속의 지우개 입니다',null,null,null,'lemong@hotmail.com','MR007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','780','MR780','우리 집 너가 지어줄래? [뭅뭅픽] 건축학개론 | 수지 | 이제훈 | 한가인 | 엄태웅 | 첫사랑','https://www.youtube.com/embed/lUzfsEe3vo4','"그 때의 ''첫사랑''에게 다시 빠질 준비 되셨나요?
"',null,null,null,'mupmup@hotmail.com','MR008',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','781','MR781','새내기 신입생들 중 예쁜 여자만 노리는 쓰레기 선배','https://www.youtube.com/embed/P0bjFRTviZQ','"#영화리뷰 #영화소개 #리필드재영
오늘 소개해드릴 영화는 #건축학개론 입니다.
◈ 리필드 재영 구독 http://bitly.kr/3QlxZ
◈ 메일 문의 cheerupjaeyoung@gmail.com
◈ 인스타그램 https://www.instagram.com/cheerupjaey...
★ 영상에 좋아요를 눌러주시면 정말 큰 힘이 됩니다!"',null,null,null,'jy@gmail.com','MR008',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','782','MR782','남자가 봐야하는 로맨스 영화 : 너의 결혼식 리뷰','https://www.youtube.com/embed/Nm4tRCmJrUc','* 본 영상은 스포일러가 다수 포함되어 있습니다 * 8월 27일, 직접 두 눈으로 보고 온 영화입니다. 한국형 로맨스는 그 명맥을 꾸준히 유지해 오고 있습니다. 예전의 감성에서 벗어난지는 오래지만, 그래도 새로운 방식으로 이어지고 있죠. 이 영화, ''너의 결혼식''은 그런면에서 참 칭찬할만한 영화입니다. 뻔하지만 즐거운 전개, 완벽한 개연성과 캐릭터의 설정. 꾸밈없는 결말과 왜 그렇게 했을까에 대한 곱씹음까지 전하고 있거든요. ''건축학개론''으로 한단계 발전했던 한국형 로맨스는, 이 영화 ''너의 결혼식''으로 또 한단계 계단을 올랐습니다. 본 영상에는 영화의 치명적인 스포일러가 포함되어 있으니, 영화 관람 전에 보시는 것을 주의해주세요. 리뷰를 하면서 주요 장면및 결말을 빼 놓았으니 꼭 영화를 시청해보시길 바랍니다! - ''무비코멘트''는 유튜브에만 업로드 됩니다. 영화제목 : 너의 결혼식 (2018) #너의 결혼식 #박보영 #김영광 #영화추천 #영화리뷰 #영화후기 #영화유튜브 #영화목소리 #자취방남자 #영화소개 #로맨스영화 #신작영화 #신작리뷰 #사랑영화 #학창시절로맨스 #애니콜 #아이리버',null,null,null,'aloneman@daum.net','MR008',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','783','MR783','쪼개는 미국 대통령에게 빅엿 먹이며 썸타는 영화(쪼개?ㅋㅋ)','https://www.youtube.com/embed/-ePsZQeJ8SI','"구독''하고 ''알림''설정을 해두면 재밌는 최신 영상들을 가장 빨리 볼 수 있습니다. ''추천''은 컨텐츠 제작에 큰 힘이 됩니다^^
#캡틴라미 #영화소개 #영화리뷰
영화: 러브 액츄얼리
"',null,null,null,'captainrami@gmail.com','MR009',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','784','MR784','영국 최고 권력자의 여자를 욕하면 벌어지는 일','https://www.youtube.com/embed/U6baCFHQNyQ','"영화 [ 러브엑츄얼리] 스토리텔링 리뷰영상입니다.
그리고 영화 러브 액츄얼리로 영어 공부하고 싶으신 분들은 샘플강의도 있다고 하니, 아래 링크 참고하세요! ^^"',null,null,null,'sogaenam@naver.com','MR009',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','785','MR785','알고 보면 더 재미있는 러브 액츄얼리에 대한 이야기','https://www.youtube.com/embed/uPN1GgrTIio','"2003년 개봉작
""러브 액츄얼리"" 입니다.
크리스마스면 돌아오는 영화 러브 액츄얼리에 대한 트리비아를 몇개 모아봤습니다!"',null,null,null,'gamemaster88@gmail.com','MR009',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','786','MR786','한 여자에게 오랜 시간 작업을 건 남자','https://www.youtube.com/embed/qz8w3Zt7pmU','"본 리뷰는 영화의 전반적인 스토리를 다룹니다.
시간이라는 소재는 언제나 매력적이죠
영화 ''시간여행자의 아내'' 리뷰
에릭 바나가 헨리 역, 레이첼 맥아담스님이.. 클레어를 맡았습니다. 고맙습니다.
어렸을 때부터 핸리를 만나온 클레어, 자기를 아는듯한 그녀 때문에 당황하는 헨리, 이들에게는 무슨 사연이 있는 걸까요?
시간에 휘둘리는 평범한 사람 같은 능력자
좋아요 구독,피드백은 큰힘이 됩니다
"',null,null,null,'socheon@daum.net','MR010',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','787','MR787','[시간 여행자의 아내] 영화 속 시간의 의미(The Time Travler''s Wife: Meaning of The Time)','https://www.youtube.com/embed/9tRVYvzOtDQ','"시간 여행자의 아내''에서 시간의 의미는?
내레이션은 Janice가 맡아주셨네요:-)
''시간 여행자의 아내''가 재개봉했습니다!
시간을 초월한 두 사람,
에릭 바나와 레이첼 맥아담스의
낭만적인 사랑은 ''시간''에 무관하게 아름답죠. 이번 시네 프로타주에서는
영화 속에서 ''시간''이 의미하는 것,
그리고 ''시간 여행자의 아내''만의
독특한 시간관에 관해 이야기 해볼까 합니다."',null,null,null,'senimapia@gmail.com','MR010',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','788','MR788','시간이동 능력자가 과거로 돌아가 한 일','https://www.youtube.com/embed/PElcWi9G1to','"영화 [시간여행자의 아내] 소개영상입니다.
스포일러가 포함되어있으니 시청하실때 주의해주시길 바라겠습니다.
감사합니다."',null,null,null,'sogaenam@naver.com','MR010',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','789','MR789','갈수록 젊어지는 축복(저주)에 걸린 남자의 인생/벤자민 버튼/시간은 거꾸로 간다/추천영화','https://www.youtube.com/embed/xjPq_v_vzXA','"영화 ''벤자민 버튼의 시간은 거꾸로 간다
(The Curious Case Of Benjamin Button, 2008)'' 입니다.
주인공의 젊음은 거꾸로 가지만, 시간은 거꾸로 갈 수 없다는 것이 영화의 포인트가 아닐까 생각합니다. 그리고 작은 선택들의 나비효과가 한 평생을 바꾸어 놓는 한 인간의 일대기를 요약한 영화라고 볼 수 있습니다.
정말 명작이죠. 재밌게 보셨다면 좋아요 버튼, 부탁 드립니다^^
"',null,null,null,'filmcasterian99@hotmail.com','MR011',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','790','MR790','나이먹을수록 자꾸 몸이 젊어지는 남자의 인생','https://www.youtube.com/embed/fr7CHx68TVw','#영화소개 #영화리뷰 #청남동 벤자민 버튼의 시간은 거꾸로 간다 (2008) 1918년 제1차 세계 대전 말 뉴올리언즈. 80세의 외모를 가진 사내 아이가 태어난다. 그의 이름은 벤자민 버튼. 부모에게 버려져 양로원에서 노인들과 함께 지내던 그는 시간이 지날수록 젊어진다는 것을 알게 된다. 12살이 되어 60대의 외모를 가지게 된 그는 어느 날 6살 소녀 데이지를 만난 후 그녀의 푸른 눈동자를 잊지 못하게 된다. 청년이 되어 세상으로 나간 벤자민은 숙녀가 된 데이지와 만나 만남과 헤어짐을 반복하다 비로소 둘은 사랑에 빠지게 된다. 하지만 벤자민은 날마다 젊어지고 데이지는 점점 늙어가는데…',null,null,null,'whereiam@gmail.com','MR011',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','791','MR791','나이를 먹을수록 젊어지는 남자','https://www.youtube.com/embed/Ba6QSTWqmbY','벤자민 버튼의 비극적인 삶을 덤덤하게 조명하는 영화 벤자민 버튼의 시간은 거꾸로 간다입니다.',null,null,null,'dreamteller@daum.net','MR011',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','792','MR792','80세 노인으로 태어나 젊어지는 남자 [결말포함]','https://www.youtube.com/embed/Ybuo7sQ1Z-w','"제목 : 벤자민 버튼의 시간은 거꾸로 간다
(2008년 작품)"',null,null,null,'ezip@daum.net','MR011',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','793','MR793','남자들만의 구질구질한 첫사랑 판타지: 너의 결혼식 리뷰 - 라이너','https://www.youtube.com/embed/sUZTAxfBJdA','"피 끓는 청춘, 박보영과 김영광이 다시 만난 작품.
오랜만에 등장한 멜로, 로맨스 영화. 너의 결혼식 리뷰입니다.
가슴 아프고 아련한 첫사랑의 추억. 그리고 연애와 이별, 결혼.
그 모든 이야기를 담았지만 전부 어디선가 본 것 같은 장면들?
클리셰로 범벅한 아쉬운 작품.
너의 결혼식 리뷰입니다.
"',null,null,null,'liner@hotmail.com','MR012',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','794','MR794','남자가 봐야하는 로맨스 영화 : 너의 결혼식 리뷰','https://www.youtube.com/embed/Nm4tRCmJrUc','"* 본 영상은 스포일러가 다수 포함되어 있습니다 *
8월 27일, 직접 두 눈으로 보고 온 영화입니다.
한국형 로맨스는 그 명맥을 꾸준히 유지해 오고 있습니다. 예전의 감성에서 벗어난지는 오래지만, 그래도 새로운 방식으로 이어지고 있죠. 이 영화, ''너의 결혼식''은 그런면에서 참 칭찬할만한 영화입니다.
뻔하지만 즐거운 전개, 완벽한 개연성과 캐릭터의 설정. 꾸밈없는 결말과 왜 그렇게 했을까에 대한 곱씹음까지 전하고 있거든요.
''건축학개론''으로 한단계 발전했던 한국형 로맨스는, 이 영화 ''너의 결혼식''으로 또 한단계 계단을 올랐습니다.
본 영상에는 영화의 치명적인 스포일러가 포함되어 있으니, 영화 관람 전에 보시는 것을 주의해주세요.
리뷰를 하면서 주요 장면및 결말을 빼 놓았으니 꼭 영화를 시청해보시길 바랍니다! - ''무비코멘트''는 유튜브에만 업로드 됩니다.
영화제목 : 너의 결혼식 (2018)
#너의 결혼식 #박보영 #김영광
#영화추천 #영화리뷰 #영화후기 #영화유튜브
#영화목소리 #자취방남자 #영화소개 #로맨스영화 #신작영화 #신작리뷰 #사랑영화
#학창시절로맨스 #애니콜 #아이리버
사용된 BGM
- A_Quiet_Thought
- bensound-sadday
Music by BENSOUND http://www.bensound.com/royalty-free-...
Creative Commons ? Attribution 3.0 Unported? CC BY 3.0 http://creativecommons.org/licenses/b...
Music promoted by Audio Library https://youtube.com/embed/HJdLhIvC3JI"',null,null,null,'aloneman@daum.net','MR012',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','795','MR795','너의 결혼식 가이드 리뷰 by 발없는새','https://www.youtube.com/embed/vUvc1xrO3Jg','"전혀 기대하지 않았던 너의 결혼식이 가끔은 이런 한국영화도 있다는 사실을 일깨워주네요. 과잉과 억지로 빚는 신파가 없어도 얼마든지 관객의 마음을 울릴 수 있다는 걸 보여주는 영화였습니다.
by 발없는새"',null,null,null,'nofootbird@gmail.com','MR012',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','796','MR796','생각보다 괜찮은 로맨스 영화 [너의 결혼식]','https://www.youtube.com/embed/9kl2U-Rqlcg','"#픽션월드 #너의 결혼식 #박보영
픽션월드, 상상이 이야기로 펼쳐지는 세상
누구나 겪었을 법한 뻔한 이야기. 이불을 걷어차게 하는 유치한 시절. 그 웃기고 울리는 추억의 끝에서 인생과 사랑의 성장을 보여주는 영화 [너의 결혼식]"',null,null,null,'fictionworld24@hotmail.com','MR012',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','797','MR797','자고 일어나면 얼굴이 바뀌는 남자친구','https://www.youtube.com/embed/zo7Ne3LY_3c','"#뷰티 인 사이드 #영화추천
"',null,null,null,'dreamteller@daum.net','MR013',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','798','MR798','[뷰티 인사이드] ''뷰티 인사이드''가 던지는 세 가지 질문','https://www.youtube.com/embed/b097S7TFEWM','"드라마 ''뷰티 인사이드''가 방영을 시작했습니다.
드라마 이전에 영화가 있었는데요.
시네마피아에서는 가을과 드라마의 방영을 맞아
이전에 다뤘던 영상을 재편집해봤습니다.
연애하고 싶은 계절에 보면 좋을
''뷰티 인사이드'' 지금 시작합니다!"',null,null,null,'senimapia@gmail.com','MR013',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','799','MR799','[뷰티 인사이드] 당신이 모르는 숨겨진 비밀','https://www.youtube.com/embed/E_h27X4dvGE','"※ 결말을 포함한 스포가 있음을 알려드립니다.
영민 인스타그램: https://www.instagram.com/cine.youngmin
감기에 걸려 비음이 섞여있습니다....
뷰티 인사이드 (The Beauty Inside, 2015)
감독: 백종열
출연: 한효주, 이동휘, 박신혜, 서강준, 이진욱, 김주혁 등
♪ 음악
1. Kevin Macleod - In your arms 2. 슈베르트 - 아베 마리아
◇ Reference
DVD 코멘터리, 인터뷰, 기사
#뷰티 인 사이드 #한효주 #영민하다"',null,null,null,'youngmin@daum.net','MR013',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','800','MR800','최고의 여배우와 비밀연애를 한다면?','https://www.youtube.com/embed/HO7doRR8NQA','"* 본 영상은 스포일러가 다수 포함되어 있습니다 *
원작영화 구매 및 대여 : #1 : http://nstore.naver.com/tvstore/detai...
명작 중의 명작.
왜 이제서야 본 것일까 후회되는 영화, 노팅힐입니다.
1999년작이라는 것이 믿기지 않을 만큼의 재미가 들어있습니다.
사랑을 위해서 왜 용기를 내야 하는가? 라는 질문에 답을 주는 영화입니다.
꼭! 보시길 바래요!
리뷰를 하면서 주요 장면및 결말을 빼 놓았으니 꼭 영화를 시청해보시길 바랍니다! - ''무비코멘트''는 유튜브에만 업로드 됩니다.
"',null,null,null,'aloneman@daum.net','MR014',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','801','MR801','사랑이 무서운 당신에게...','https://www.youtube.com/embed/XCawEZ4_DwU','"#조던피터슨 #유읽남 #유튜브읽어주는남자 #JordanPeterson #노팅힐 #줄리아로버츠 #휴그랜트
references
Notting Hill (1999, British)
2017 Maps of Meaning 09 Patterns of Symbolic Representation
Julia Roberts & Dermot Mulroney Answer the Web''s Most Searched Questions WIRED
Hugh Grant Breaks Down His Most Iconic Characters GQ
[*출처 - 상어오브뮤직 Sangeo Of Music]
노팅힐 Notting Hill OST She Piano cover 피아노 커버
(https://www.youtube.com/watch?v=evyLK...)
River Flows in You - 이루마 Yiruma Piano cover 피아노 커버
(https://www.youtube.com/watch?v=zVu51...)
코코 COCO OST : Remember Me | Piano cover 피아노 커버
(https://www.youtube.com/watch?v=fUYbu...)
시간을 넘어서? - 지금 만나러 갑니다 OST 피아노 Ver"',null,null,null,'youtuberead@daum.net','MR014',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','802','MR802','한편에 170억 버는 여배우가 모든 것을 포기하며 택한 남자(결말포함)','https://www.youtube.com/embed/qK-61CZXM1Y','"1999년 작 노팅힐 입니다.
로맨스 영화를 사랑하는 분이라면 모르는 분이 없을 명작입니다.
앞서 리뷰한 ''당신이 잠든 사이에'' 만큼이나 따듯하며, 달콤한 영화입니다.
지금에 와서야 인물에 대한 평이 갈리지만,
당시 ''귀여운 여인''부터 시작한 쥴리아 로버츠의 로맨스영화는
지금보아도 결코 부족하지 않는 영화들입니다.
휴 그랜트 또한 지금까지도 많이 사랑받는 배우입니다.
긴 설명이 필요없는, 최고의 로맨스 영화,
''노팅힐''
무비도치가 강력히 추천합니다"',null,null,null,'moviedochi@yahoo.com','MR014',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','803','MR803','눈 앞에서 죽은 그녀가 돌아온 단 하루 - 영화 [이프 온리] (if only, 2004)','https://www.youtube.com/embed/2o8wiphuQNc','"*이 영상은 스포일러를 포함하고 있습니다!
감독 - 길 정거 주연 - 제니퍼 러브휴잇, 폴 니콜스
후회로 가득찬 하루가 돌아온다면?
많은 분들이 인생영화로 손 꼽는 멜로영화 이프 온리 리뷰입니다.
처음 제작한 영상이라 부족한 점이 많더라도 즐겁게 봐주세요~!
"',null,null,null,'everyview@naver.com','MR015',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','804','MR804','살아돌아온 그녀를 볼 수 있는 하루의 시간이 주어진다면 (결말포함)','https://www.youtube.com/embed/vRBcDFhcDrM','"이프 온리 (2004)
유튜브영화 : https://www.youtube.com/results?searc...
구글영화 : https://play.google.com/store/search?...
네이버영화 : https://series.naver.com/search/searc...
좋은 영화 자주 올릴게요
구독과 좋아요 부탁드립니다^^ #영화리뷰 #이프 온리 #결말포함"',null,null,null,'noboty@gmail.com','MR015',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','805','MR805','사랑하는 방법을 알려준 여자...그리고 단 하루의 시간','https://www.youtube.com/embed/oxKI_qreyEo','"제목: 이프 온리, 2004
감독: 길 정거
출연: 제니퍼 러브 휴잇(사만다), 폴 니콜스(이안)...
줄거리: 사랑하는 연인에 대하여 표현에 서툰 한 남자가 사고로 그녀를 잃고 슬퍼한다. 그런데 다음날 아침 그녀가 멀쩡히 옆에서 자고 있는데...
#영럽 #영화리뷰 #영화소개 #영화추천"',null,null,null,'younglove@daum.net','MR015',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','806','MR806','갑자기 전신마비가 됐지만 장난을 멈추지 않는 남자','https://www.youtube.com/embed/PLc_WOI7ElE','"* 본 영상은 스포일러가 다수 포함되어 있습니다 *
추천을 통해 접하게 된 영화, 미 비포 유 입니다.
2016년작으로 제가 다룬 영화중에 비교적 신작이네요!
죽음을 정해둔다는 무거운 주제를
로맨스라는 아름다운 이야기로 풀어낸 영화입니다.
용어머니는 어느 영화에서나 믿고 볼 수 있네요.
감사합니다!! 원작영화를 꼭! 시청하시길 바랍니다.
- ''무비코멘트''는 유튜브에만 업로드 됩니다.
"',null,null,null,'aloneman@daum.net','MR016',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','807','MR807','미 비포 유 - 뻔한 영화에 담긴 두 가지 by 발없는새','https://www.youtube.com/embed/VYX15u7gkpc','"에밀리아 클라크와 샘 클라플린이 주연한 미 비포 유는 조조 모예스의 소설이 원작입니다. 보기 전은 물론이고 보던 중에도 뻔하다고 여겼던 이 영화가 제게 두 가지를 전했습니다.
by 발없는새"',null,null,null,'nofootbird@gmail.com','MR016',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','808','MR808','예쁜 여자친구를 두고 남자가 안락사를 선택한 이유 [미비포유]','https://www.youtube.com/embed/q_HfSiOSDDQ','"#미비포유 #로맨틱영화 #원작소설
웃다가 울다가"',null,null,null,'byebye@gmail.com','MR016',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','809','MR809','평생 단 한 여자만 사랑한 남자 (영화 노트북)','https://www.youtube.com/embed/KvEDW7Dre4k','"* 본 영상은 스포일러가 다수 포함되어 있습니다 *
미련했지만 순수했고
어떻게보면 안타까웠던 열일곱의 사랑
그렇게 한 평생을 한 사람만을 바라보는 일.
가능할까요?
부럽기까지 한 완벽한 사랑이야기
영화 노트북(2004)에 대한 리뷰입니다.
원작 영화를 보시는 것을 강력히 추천드립니다.
휴지 준비하고 보세요 넘나슬픔
- ''무비코멘트''는 유튜브에만 업로드 됩니다.
"',null,null,null,'aloneman@daum.net','MR017',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','810','MR810','저의 인생영화 추천 #2. 노트북(Notebook) 리뷰 영상 ? ｜ 이상커플 ?','https://www.youtube.com/embed/C9gv2ffzN-k','"라이언 고슬링과 레이첼 맥아담스 주연의 영화 노트북을 소개합니다. 저의 인생영화 ㅠ_ㅠ 너무 좋아요! ?Music Days Like These by LAKEY INSPIRED https://soundcloud.com/lakeyinspired Creative Commons ? Attribution-ShareAlike 3.0 Unported ? CC BY-SA 3.0 http://creativecommons.org/licenses/b... Music promoted by Audio Library https://youtube.com/embed/joGCrgfYrP4
?Blog 매일 매일 따끈한 새글이 올라오는 이상커플의 블로그 http://blog.naver.com/isangcouple
?이상커플 “대안적인 삶을 살며 대안적인 삶을 제안한다”
삶의 여유를 찾아 분투하고 있어요. 함께 사업하며 여행하는 부부입니다♥ [ 창민 ♡ 기연 ]"',null,null,null,'esangcouple@daum.net','MR017',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','811','MR811','로맨스 추천 영화 - 빠질 수밖에 없는 이 남자의 매력(노트북)','https://www.youtube.com/embed/xJGUdFZvug0','"영화 제목 : 노트북 (The Notebook, 2004) 장 르 : 멜로/로맨스, 드라마
감 독 : 닉 카사베츠 주연 배우 : 라이언 고슬링(Ryan Gosling)
레이첼 맥아담스(Rachel McAdams)
런닝 타임 : 123분
등 급 : 15세 관람가
#노트북 #멜로영화 #로맨스영화"',null,null,null,'bear@gmail.com','MR017',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','812','MR812','호불호가 확실합니다. 매력도 확실합니다. 영화 [장난스런 키스] 리뷰','https://www.youtube.com/embed/zl6rJ0x0qIY','이 영화는 [장난스런 키스]의 리메이크라는 것보다는 왕대륙 배우가 나온다는 점이 더욱 주목받은 영화가 아닐까 싶습니다. 거기에 [나의 소녀시대]를 통해, 대만 로맨스를 제대로 알린 프랭키 챈 감독의 작품입니다. 그녀가 보여주는 그 간질간질한 사랑 이야기가 궁금해지는 작품입니다.
사실, 이 영화의 스토리를 현실적으로 생각해보면 상당히 비현실적인 영화입니다. 나를 좋아하는 누군가가 자기 방에 온통 나의 얼굴로 도배를 해놨다고 하면 어떨까요? 그럴 일은 없겠지만, 기분 좋은 상황은 아닙니다. 그런데, 이 영화의 캐릭터는 스토킹 같은 행동을 보여줍니다. 그런데, 이 영화를 보신 분들은 아시겠지만, 상당히 판타지적인 영화입니다. 교장 선생님이 학생이 고백하는 장면을 보면서 전교 방송을 한다는 것이 현실에서는 말이 안 되는 상황입니다. 이 영화는 상당히 하이 텐션을 가지고 있는 영화입니다. 지나칠 수 있기 때문에 호불호가 상당히 갈릴 것으로 생각됩니다.
그럼에도 이 영화가 상당히 매력적인 것은 사실입니다. 저도 왕대륙 배우를 좋아하는 편이고, 대만 로맨스 영화 상당히 좋아합니다. 특히, 학생 로맨스 영화를 좋아합니다. 때문에 저는 이 영화를 재밌게 봤습니다. 부분적으로 의미 없이 그냥 늘어지는 부분이 조금 보이긴 하지만, 나름 유쾌하고 에너지 넘치는 연출을 통해 영화를 보면서 활력을 얻고 가는 것 같았습니다. 그 활력이 과하다고 생각할 수 있습니다. 오그라드는 영화 잘 못 보시는 분들은 조금 힘드실 수도 있습니다.
개인적으로는 이 영화에서 가장 주목해야 할 점은 ‘위안샹친’을 연기한 임윤 배우입니다. 보면서, 상당히 놀랐습니다. 최근 [철벽선생]에서 하마베 미나미 배우가 버거울 정도로 발랄한 캐릭터 연기를 보여줬습니다. 캐릭터 자체가 상당히 오버스럽지만, 실제로 이런 사람이 있을 것 같다고 생각이 들 정도로 상당히 좋은 연기를 보여줬습니다. [장난스런 키스]의 임윤 또한 그에 버금가는 연기를 보여줬습니다. 특히, 그녀의 연기 덕분에 상대역할인 왕대륙의 캐릭터가 더욱 살아났습니다. 왕대륙에 대한 기대를 가지고 간 영화에서 임윤에게 빠져서 나왔습니다. ',null,null,null,'ddaddasi@hotmail.com','MR018',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','813','MR813','외모, 두뇌 모든 게 완벽한 남학생에게 고백한 여고생','https://www.youtube.com/embed/v8hweopVvZ4','영상 출처: 영화가 좋다 #장난스런 키스#왕대륙#임윤',null,null,null,'moviekok@yahoo.com','MR018',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','814','MR814','호불호가 확실합니다 매력도 확실합니다 영화 장난스런 키스 리뷰','https://www.youtube.com/embed/kBl_aADzxW4','"이 동영상의 음악
자세히 알아보기
노래
Maimunar
아티스트
Iskrata
YouTube 라이선스 제공자
MonteMusicRecords(Monte Music 대행)
"',null,null,null,'tetris024@gmail.com','MR018',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','815','MR815','교실 뒷자리에서 귀신같이 내 성적을 올려주는 미소녀 여학생','https://www.youtube.com/embed/AiR1ByYKOWg','"안녕하세요, 미들뻔입니다.
오늘 리뷰할 작품은 ''그 시절, 우리가 좋아했던 소녀 (You Are the Apple of My Eye, 2011)'' 입니다.
"',null,null,null,'middle@hotmail.com','MR019',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','816','MR816','첫사랑이 전교1등이면 일어나는 일','https://www.youtube.com/embed/WbvTjSi8S-8','안녕하세요 영화 그 시절 우리가 좋아했던 소녀 입니다',null,null,null,'lemong@hotmail.com','MR019',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','817','MR817','새벽에 보기 좋은 첫사랑영화','https://www.youtube.com/embed/bIdKbIUqzn0','"영화 [그 시절, 우리가 좋아했던 소녀]의 소개영상입니다.
큰 스포일러는 없고, 대사 한줄 스포합니다.
모두들 즐겁게 봐주시길 바랍니다!"',null,null,null,'sogaenam@naver.com','MR019',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','818','MR818','[영화리뷰/결말포함] 그 시절, 우리의 첫사랑 - 감독실화영화 (그 시절, 우리가 좋아했던 소녀) 대만영화','https://www.youtube.com/embed/1rYM3y3SYyI','"안녕하세요 잼잼 꿀잼 명동선배입니다^^
콩닥콩닥 우리의 심박수를 한 껏 올려주며 잠 못들게 했던 첫사랑~
그 아련하고 아름다운 추억 한 조각이 뭉실뭉실 떠오릅니다
영화보면서 어린 시절의 추억 조각을
하나씩 꺼내볼 수 있는 시간이었던 것 같아요
서툴지만 한 없이 순수했던
우리 첫사랑을 떠올려 보게하는
영화 그 시절 우리가 좋아했던 소녀입니다
달달하면서도 쌉싸래한 맛을 느낄 수 있는
영상으로 본격적으로 들어가 보실까요~
영상 괜찮으셨다면 구독과 좋아요로 응원부탁드릴께요
다음 리뷰도 기대 많이 해주세요 감사합니다^^"',null,null,null,'senior@gmail.com','MR019',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','819','MR819','뽀뽀를 50번이나 하는 더러운 요청 리뷰! 첫키스만 50번째!','https://www.youtube.com/embed/nip53ckobok','
-구불추천지수는 지극히 개인적 감상평입니다. 가볍게 참고만 해주세용-
구불추천지수: 8/10
병맛요소: 7/10
참신함: 6/10
한줄평: 클릭과 같이 웃음과 감동이 함께 있는 영화. 부담없이 사랑하는 사람과 함께보면 좋을 영화. 젠장. 쏠로도 봐도 정말 괜찮은 영화다. 안봤다면 꼭 추천드리는 영화!
구텐~알로하~ 영화보다 재밌는 병맛리뷰 구불입니다. 근데 이거 병맛이야? 명작이야?ㅋㅋ 첫키스만 50번째! 1plusSNR Blog님, Damkyung kim님, 김세희님, 바나나킹님, 솜브라님, 정약사의건강나눔님이 요청해주셨습니다. 이 더러운 앙마들! 어떻게 키스를 오십번 하는걸 요청할 수 가있어요?ㅋㅋㅋ아 농담이고 영화가 재밌는데 감동까지 있어.ㅋㅋ 충분히 추천해드릴만한 영화라고 생각합니다. 영화 클릭이전에도 샌들러형이 염소형, 샘형이랑 콤비를 보여줬는데 앞으로도 셋이 좋은 영화 만들어줬으면 좋겠고요. 저는 이 영화를 보면서 또 많은것을 배우고 가네요. 기억을 잃는다는게 안좋은 거지만 어떻게 보면 인간이 망각의 동물이기때문에 행복하게 살 수 있지 않나 생각이 듭니다. 예전에 애기때 잘못한거 평생기억하면 부끄러워서 어떻게 살겠어요.ㅋㅋ
제가 연애를 끊은지가 오래 됐지만 대부분 연애의 시작때는 상대방의 결점이 큰문제가 되지 않잖아요. 그때의 마음으로 돌아간다면 싸울일이 있겠어요?ㅎㅎ 난 제발 싸우는 상대라도 있었으면 좋겠어. 흑흑..ㅋㅋ 지금 누군가와 서로 사랑하고 가정을 이루고 계신 구린이들, 아니 앞으로 누군가와 사랑하며 지낼 모든분들께. 서로 처음 사랑을 고백할때 그때를 세이브포인트로 지정하고 가끔 다 잊고 다시 돌아가 보는 것은 어떨까요?
하루하루 똑같은 일상, 똑같은 상대, 우리는 쳇바퀴도는 삶을 사는 것 같지만 지금 1분 1초가 여러분에게 다시 되돌리지 못할 영화의 새장면고 오늘 하는 키스도 다시는 못 올 첫키스입니다. 인지하지 못했을뿐 여러분이 해왔던 모든 키스는 모두 첫키스란 말입니다. 오늘도 구불이 싫어하는 키스를 하시는 나쁜분들이 많겠지만 기왕 하실거면 오늘만큼은 첫키스처럼 해보는건 어떨까요?
젠장, 더러운 키스를 오십번씩이나 하는 공포영화, 그럼에도 구불하고 여러분께 꼭 추천드리는영화, 첫키스만 오십번째였습니다.
구린이들.. 뽀뽀까까?!
"',null,null,null,'9bul@gmail.com','MR020',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','820','MR820','항상 키스까지만 허락하는 여자친구의 비밀','https://www.youtube.com/embed/pXrRjPs7LwI','" 로맨스의 정석이라 불리는 여러 작품 중에, 가벼우면서 재밌는.
그리고 신선하지만 익숙한, 좋은 작품입니다.
미국 코미디 배우의 전설로 꼽히는 아담 샌들러와, 전성기 미모의 드류 베리모어를 볼 수 있는 영화!
오늘, 이 영화 어떠세요?
리뷰를 하면서 주요 장면및 결말을 빼 놓았으니 꼭 영화를 시청해보시길 바랍니다! - ''무비코멘트''는 유튜브에만 업로드 됩니다.
영화제목 : 첫키스만 50번째 (2004)
#로맨스영화 #로맨틱코미디
#영화추천 #영화리뷰 #영화후기 #영화유튜브
#영화목소리 #자취방남자 #영화소개 #교훈영화
#첫키스만 50번째 #드류베리모어 #첫키스영화 #기억상실 #기억영화
#아담샌들러"',null,null,null,'aloneman@daum.net','MR020',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','821','MR821','단기 기억상실증에 걸린 여자가 연애하는 방법','https://www.youtube.com/embed/5NFK1-FbeEw','첫 키스만 50번째 (2004) 주연 : 드류 베리모어, 아담 샌들러',null,null,null,'jackkongs@hotmail.com','MR020',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','R','822','MR822','매일 기억을 잃어버리는 여자와 산다는건 /첫키스만 50번째 [결말포함|영화소개]','https://www.youtube.com/embed/y1c-LbjBLFw','이번에 소개한 영화는 2004년에 개봉한 ''첫키스만 50번째''입니다. 매일 매일 기억을 잃어버리는 삶을 살게된다면 어떻게 그녀에게 다가갈수 있을까요? 기억을 잃었다는 현실조차 인지하지 못하게 꾸며주기? 아니면 모두다 알려주고나서 자신만의 삶을 살수있도록 도와주기 과연 헨리는 어떤 선택을 하게될까요 영화덕후 채널은 매주 금요일 오후6시에 영상을 업로드할 예정입니다. 영화소개가 괜찮았다면 좋아요 구독 댓글 눌러주시면 정말 감사합니다. 끝까지 영상 봐주신 분들 모두 감사드려요',null,null,null,'otaku@daum.net','MR020',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','823','MS823','결국, 부자들은 세상을 지배했으며 빈민층만이 고통받아야 했다','https://www.youtube.com/embed/307sKZV7kcE',null,null,null,null,'mimi@naver.com','MS001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','824','MS824','2154년, 로봇에 의해 통제되는 미래 지구(결말포함)','https://www.youtube.com/embed/voJPvpn5MsY',null,null,null,null,'girl@hotmail.com','MS001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','825','MS825','(영화리뷰 결말포함)결말포함 요청이 가장 많았던 영화','https://www.youtube.com/embed/2eGJWLKSgGI','의료보험의 중요성',null,null,null,'spoilerman99@hotmail.com','MS001',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','826','MS826','[영화가 전하고자 했던 것][SF집중분석#15](스포일러)','https://www.youtube.com/embed/Iz6p0PnrA2o',null,null,null,null,'spoilerman99@hotmail.com','MS002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','827','MS827','인터스텔라','https://www.youtube.com/embed/IGXpRtfKaL0',null,null,null,null,'lookmun@daum.net','MS002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','828','MS828','인터스텔라 영화 리뷰 (Film Interstellar Review)','https://www.youtube.com/embed/yshbEWiY3Ww',null,null,null,null,'core@yahoo.com','MS002',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','829','MS829','해군vs우주인','https://www.youtube.com/embed/izLc-P40vRk',null,null,null,null,'baebae@gmail.com','MS003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','830','MS830','어느 날, 바다 한가운데 외계 구조물이 지구를 공격한다.','https://www.youtube.com/embed/cHtyagerwl4',null,null,null,null,'freeticket@yahoo.com','MS003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','831','MS831','인류의 초대를 받고 지구로 온 외계인의 최후','https://www.youtube.com/embed/6dEm9RQff1I','초대할땐 언제고..',null,null,null,'freeticket@yahoo.com','MS003',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','832','MS832','대 최고의 덕질과 추억팔이! 꿈을 그린 기적의 영화: 레디 플레이어 원','https://www.youtube.com/embed/e2TEztQPCuA','저급한 대중문화 덕후들을 위한 추억팔이 한마당.',null,null,null,'liner@hotmail.com','MS004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','833','MS833','뚜렷한 장점만큼 한계도 명확한 「레디 플레이어 원」 리뷰','https://www.youtube.com/embed/sbMQfekVpDg','짧은 평 : 스필버그이기에 더 의미있었던 대중문화를 향한 사랑고백, 하지만 스필버그기에 ''조금 더''를 바라는 건 과한 기대일까?',null,null,null,'duna@daum.net','MS004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','834','MS834','레디 플레이어 원, 영화가 좋다','https://www.youtube.com/embed/vXTamvu9Lds','영화가 좋다(180505), 1+1, 레디 플레이어 원',null,null,null,'movieworld@yahoo.com','MS004',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','835','MS835','동면에서 깨어나 인간과 마주친 월등한 고대 인류','https://www.youtube.com/embed/POazQcWqW30','외계인의 유전자 조작으로 탄생한 인간이 , 창조주인 외계인을 찾아나서 인류 기원의 비밀을 밝히는...',null,null,null,'filmcasterian99@hotmail.com','MS005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','836','MS836','인간을 만든게 외계인이라면?(프로메테우스','https://www.youtube.com/embed/LM9hLqk-4d0','-프로메테우스 (Prometheus, 2012)',null,null,null,'dopan@daum.net','MS005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','837','MS837','영화 [프로메테우스]의 충격적인 메세지(스포리뷰)','https://www.youtube.com/embed/Oxjh34nmeAQ',null,null,null,null,'sogaenam@naver.com','MS005',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','838','MS838','단 10일 만에 빙하기가 찾아온 지구 | 투모로우 | 재난 | 킬타(킬링타임) | 영화추천','https://www.youtube.com/embed/waoMEeFuqzs','- 투모로우 - 개봉 : 2004 장르 : 드라마, SF, 스릴러 감독 : 롤랜드 에머리히 출연 : 데니스 퀘이드, 제이크 질렌할, 이안 홈, 에미 로섬',null,null,null,'killtarian131@yahoo.com','MS006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','839','MS839','빙하기로 돌아간 지구 [결말포함]','https://www.youtube.com/embed/HZkETfxZh-A','여름특집 영화 ''투모로우(2004)'' 입니다',null,null,null,'10movie@gmail.com','MS006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','840','MS840','공룡을 멸종시킨 빙하기가 다시 찾아온 지구의 최후','https://www.youtube.com/embed/5jRuEaJxuGM',null,null,null,null,'shong@hotmail.com','MS006',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','841','MS841','160번 죽어야 하는 남자?','https://www.youtube.com/embed/v7MmEPmpI3o',null,null,null,null,'9bul@gmail.com','MS007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','842','MS842','외계인의 피를 흡수하고 죽지 못하는 남자!','https://www.youtube.com/embed/eE8KmXrZU7M','영화 : 엣지 오브 투모로우 (Edge of Tomorrow) 감독 : 더그 라이만 제작 : 2014',null,null,null,'murf@gmail.com','MS007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','843','MS843','외계인과 융합한 남자','https://www.youtube.com/embed/xfobC9Cm1qI','여러분 안녕하세요 삐맨입니다. 오늘은 영화 ''엣지 오브 투마로우''에 대해 정리해 보려합니다. 아무런 기대도 없이 관람했던 영화인데 반해 그 재미가 엄청나서 개인적으로 톰 아저씨의 영화들 중 Top3 안에는 든다고 생각합니다.',null,null,null,'bman@yahoo.com','MS007',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','844','MS844','제임스 카메론도 린다 해밀턴도 왔는데 스릴은 어디로 갔나: 터미네이터: 다크페이트 리뷰','https://www.youtube.com/embed/Kx6fSDyHZ-k','과감하게 시리즈를 리부트했지만 재미와 스릴은 어디로 가고 추억팔이만 남았나. 라이너에서 제공하는 터미네이터: 다크페이트 리뷰입니다',null,null,null,'liner@hotmail.com','MS008',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','845','MS845','터미네이터 다크 페이트 리뷰 (감독 친필 싸인 피규어 이벤트, 스포 포함)','https://www.youtube.com/embed/j_13slAOO6k','터미네이터 팬이라면 다크 페이트 반드시 꼭 보세요.',null,null,null,'minho@gmail.com','MS008',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','846','MS846','영화 [터미네이터 : 다크 페이트] 리뷰','https://www.youtube.com/embed/u207DOczUYM','터미네이터 : 다크 페이트 / 2019년 10월 30일 감독 : 팀 밀러 배우 : 맥켄지 데이비스, 아놀드 슈왈제네거, 린다 해밀턴, 나탈리아 레이즈',null,null,null,'ddaddasi@hotmail.com','MS008',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','847','MS847','한 순간의 아름다움을 위해 소비되는 시간들: 퍼스트맨 리뷰','https://www.youtube.com/embed/FvC_5e9M2y4','꿈을 쫓는 남자, 닐 암스트롱. 인류 최초로 달에 간 사나이. 우주와 달. 인류. 지구. 압도적인 이미지, 영화는 이미지의 예술이라는 것.',null,null,null,'liner@hotmail.com','MS009',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','848','MS848','놀라울 정도로 지루한 영화 : ''퍼스트맨''리뷰','https://www.youtube.com/embed/4HphZDPvKjM','* 본 영상은 스포일러가 다수 포함되어 있습니다 *',null,null,null,'aloneman@daum.net','MS009',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','849','MS849','라라랜드 감독 영화 ''퍼스트맨'' 솔직 감상 후기','https://www.youtube.com/embed/_GYi8pkzYLE',null,null,null,null,'minho@gmail.com','MS009',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','850','MS850','그 남자의 깊이가 드러난, 올해 가장 철학적인 SF 영화: 애드 아스트라 리뷰','https://www.youtube.com/embed/TmiAlrenUcc','브래드 피트의 우주 영화. 올해 가장 철학적인 SF 영화. 또 한번의 그래비티. 제임스 그레이 감독이 펼치는 길고 느리고, 깊은 우주의 이야기.',null,null,null,'liner@hotmail.com','MS010',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','851','MS851','애드 아스트라 가이드 리뷰','https://www.youtube.com/embed/gZD9gIwbpiw',null,null,null,null,'nofootbird@gmail.com','MS010',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','852','MS852','우주 끝에 도달하면 벌어지는 일 [애드아스트라리뷰]','https://www.youtube.com/embed/3Zo8HbrLL44','제임스 그레이 감독, 브래드 피드 주연의 우주 SF 영화 애드아스트라 리뷰입니다.',null,null,null,'reviewang@gmail.com','MS010',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','853','MS853','화성에 홀로 남겨져 삼시세끼를 찍는 남자 | 마션 | 모험,SF | 킬타(킬링타임) | 영화추천','https://www.youtube.com/embed/EpgPSztcoWE',null,null,null,null,'killtarian131@yahoo.com','MS011',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','854','MS854','천재 식물학 박사가 화성에 혼자 떨어지면?','https://www.youtube.com/embed/vHuODKePk00','화성에서 살아남기',null,null,null,'dreamteller@daum.net','MS011',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','855','MS855','가이드 리뷰 - 마션','https://www.youtube.com/embed/rTN4Meuzsqk','여러분이 마션을 관람하실 때 또는 관람을 결정하실 때 조금이나마 도움이 됐으면 합니다.',null,null,null,'nofootbird@gmail.com','MS011',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','856','MS856','게임 속 캐릭터를 직접 만날수 있다면?','https://www.youtube.com/embed/EDB9TS-mbBE','영화 제목: 픽셀',null,null,null,'fallinfilm@hotmail.com','MS012',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','857','MS857','고전게임이 현실화되면 벌어지는 일','https://www.youtube.com/embed/9yymmq4OWe0',null,null,null,null,'popcorncake@yahoo.com','MS012',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','858','MS858','픽셀 / 영화 P리뷰','https://www.youtube.com/embed/PZP5h3c9Opc',null,null,null,null,'moviemonster@yahoo.com','MS012',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','859','MS859','세계 최초 살인 로봇의 탄생','https://www.youtube.com/embed/B0DWUjcok1I','저는 어릴적의 기억을 되살려서, 최근에 다시 봤습니다. 역시는 역시더군요! 2004년 작이라고 생각이 들지 않을 만큼 엄청난 작품이었습니다. 작품 속에 담고 있는 인공지능에 대한 감독의 의견이 아주 흥미로웠어요! 거기다가, 윌스미스의 섹시한 모습까지 곁들이니 정말 좋았습니다! 리뷰를 하면서 주요 장면및 결말을 빼 놓았으니 꼭 영화를 시청해보시길 바랍니다!',null,null,null,'aloneman@daum.net','MS013',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','860','MS860','2035년, 인류를 위협하는 로봇 [결말포함]','https://www.youtube.com/embed/fE-z-VWGg-M','제목 : 아이, 로봇 (2004년 작품)',null,null,null,'ezip@daum.net','MS013',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','861','MS861','로봇이 진화를 거쳐 인간을 지배한다면?! | 아이로봇 | SF | 킬타(킬링타임) | 영화추천','https://www.youtube.com/embed/lZAjmNQLwGM','- 아이로봇 - 개봉 : 2004 장르 : SF,액션,모험 감독 : 알렉스 프로야스 출연 : 윌 스미스, 브리짓 모이나한, 브루스 그린우드',null,null,null,'killtarian131@yahoo.com','MS013',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','862','MS862','남은 수명으로 커피를 사는 미래','https://www.youtube.com/embed/WDObEuXMGrA',null,null,null,null,'dreamteller@daum.net','MS014',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','863','MS863','인간의 수명을 사고팔 수 있게 되었을때 부자들의 삶','https://www.youtube.com/embed/TufdhfNgl00',null,null,null,null,'please@naver.com','MS014',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','864','MS864','『인타임 영화리뷰』 부자들이 사람들을 통제하는 방법','https://www.youtube.com/embed/Rv55AQNC15Q','영화: 인타임(2011) 감독: 앤드류 니콜 출연: 아만다 사이프리드,저스틴 팀버레이크',null,null,null,'boyboy@gmail.com','MS014',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','865','MS865','혹성탈출 시리즈 총정리','https://www.youtube.com/embed/Xm8raayuDMI','가장 성공적인 리부트 영화이자 가장 감성적인 SF영화, 혹성탈출 시리즈. 대단원의 마지막을 장식할 3편 ''혹성탈출: 종의 전쟁''이 8월 15일 개봉을 앞두고 있습니다. 1,2편의 주요 줄거리와 혹성탈출 시리즈의 핵심이라 할 수 있는 모션캡쳐, 시저를 연기한 앤디 서키스에 대해 알아봅니다.',null,null,null,'gongu@yahoo.com','MS015',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','866','MS866','혹성탈출 시리즈 완전정복','https://www.youtube.com/embed/WlGGTqTFMaM','혹성탈출의 모든 것을 알아보자! (소설, 오리지널 시리즈, 팀 버튼 감독의 혹성탈출, 리부트 시리즈)',null,null,null,'hipparachi@yahoo.com','MS015',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','867','MS867','혹성탈출 종의 전쟁 리뷰 : 고귀한 영웅의 품격 있는 퇴장 - 라이너','https://www.youtube.com/embed/LHrBJzZyNCU','혹성탈출 삼부작을 마무리짓는 혹성탈출 종의 전쟁이 개봉했습니다. 흔치 않은 SF 블록버스터로서 성공적인 마무리를 해낸 종의 전쟁. 라이너와 함께 이 영화의 가치와 내용을 살펴보세요.',null,null,null,'liner@hotmail.com','MS015',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','868','MS868','[2001 스페이스 오디세이] 스토리','https://www.youtube.com/embed/4yC7GJ4ZSXc',null,null,null,null,'contentplayer00@yahoo.com','MS016',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','869','MS869','[2001 스페이스 오디세이] 스토리 & 포인트 리뷰 (2부)','https://www.youtube.com/embed/-ZaTr7zXX2s',null,null,null,null,'contentplayer00@yahoo.com','MS016',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','870','MS870','[2001 스페이스 오디세이] 스토리&포인트 리뷰 (3부)','https://www.youtube.com/embed/dvz8SQFAKuA',null,null,null,null,'contentplayer00@yahoo.com','MS016',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','871','MS871','이제는 놓아줘요. 그리고 다시 일어나, 걸어요: 그래비티 리뷰','https://www.youtube.com/embed/J9vrphPj2XY','재개봉 기념으로 8월 말에 올렸던 그래비티 리뷰입니다.
최고의 우주 영화.
더 이상의 자세한 설명은 생략합니다.',null,null,null,'liner@hotmail.com','MS017',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','872','MS872','역대 최고의 우주영화','https://www.youtube.com/embed/sFmtwSOYLNQ','평단과 관객을 모두 만족시킨 21세기 최고의 우주영화, 그래비티의 제작 비하인드를 알아봅니다.',null,null,null,'gongu@yahoo.com','MS017',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','873','MS873','그래비티 : 실존주의로 풀어보는 영화의 제목 "중력"의 의미 [팝콘트리]','https://www.youtube.com/embed/vnP9U2qWKuA','실존주의와 인간에 대해 알아보고
영화 그래비티의 의미를 실존주의로 풀어보는 영상입니다.',null,null,null,'mypopcorntree@yahoo.com','MS017',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','874','MS874','지구 초토화 끝판왕','https://www.youtube.com/embed/Hmzn71U8hms',null,null,null,null,'gongu@yahoo.com','MS018',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','875','MS875','[무비어] 인디펜던스데이 - 리써전스 리뷰','https://www.youtube.com/embed/0RBtlfciTtA',null,null,null,null,'jayque@daum.net','MS018',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','876','MS876','2016 인디펜던스데이2:리써전스 리뷰 입니다. Independence Day: Resurgence REVIEW','https://www.youtube.com/embed/zh5Ww26zgXk',null,null,null,null,'suspect@gmail.com','MS018',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','877','MS877','미래의 인류가 하늘 위에서 사는 이유','https://www.youtube.com/embed/ccQi_KU8vn8',null,null,null,null,'mimi@naver.com','MS019',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','878','MS878','핵전쟁 60년 이후의 지구','https://www.youtube.com/embed/1TFO0am6RPU','오늘은 영화 ''오블리비언''에 대해서 알아보려고 합니다. 2013년 개봉작으로 진부한 외계생물체 vs 인간의 구도를 갖고 있지만, 특이한 대립구조를 갖고 있고, 거기에 언제봐도 예술같은 그래픽은 역대 영화들 중에서 가장 아름답다고 해도 과언이 아닌 것 같습니다. 배우들의 연기, 메세지 그리고 완성도까지 모두 잡은 영화입니다. 꼭 한번 찾아보시기 바랍니다.',null,null,null,'bman@yahoo.com','MS019',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','879','MS879','핵전쟁 이후 외계인으로부터 지구를 지키는 한 남자','https://www.youtube.com/embed/wofMniEuMSc','톰 크루즈,모건프리먼 주연의 2013 오블리비언 입니다.',null,null,null,'jum@hotmail.com','MS019',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','880','MS880','광활한 우주 속에 나 혼자 남게 된다면 무엇을 할까','https://www.youtube.com/embed/FlsfG2kVtuo',null,null,null,null,'ddubuni@hotmail.com','MS020',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','881','MS881','잠자는 미녀를 90년 일찍 깨우면 생기는 일![영화리뷰]','https://www.youtube.com/embed/pTCawW51tlM',null,null,null,null,'suspect@gmail.com','MS020',to_date('20/02/19','RR/MM/DD'));
Insert into RETULIX.REVIEW (DIV,GENRE,NUM,IDX,TITLE,URL,INFO,GOOD,CLICK,ZZIM,EMAIL,T_IDX,WDATE) values ('M','S','882','MS882','우주에 나 혼자 깨어났다면 영화 패신저스','https://www.youtube.com/embed/S2lwjijNaRs',null,null,null,null,'314@gmail.com','MS020',to_date('20/02/19','RR/MM/DD'));
REM INSERTING into RETULIX.MEMBER
SET DEFINE OFF;
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('admin@admin.com','123','admin','99',100,null,'noicon.png','nochimg.png',99);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('10000lv@naver.com','123','만렙스핏','34',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('ownerdd@google.com','123','장독대장','41',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('moza@daum.net','123','그삿갓','22',8000,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('zenokion@naver.com','123','제노키온','46',450,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('gindi@google.com','123','칠곡간디','33',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('mirror@daum.net','123','미러','43',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('kanghwa@naver.com','123','강화도조약','37',4500,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('cityborn@google.com','123','시티본','24',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('merky@naver.com','123','멀록왕머키','37',5200,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('gamegood@google.com','123','겜자래','27',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('qhdrlf1@gmail.com','123','길브로','45',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('vpdgk90@gmail.com','123','자이언트 펭수','45',100000,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('rlarPfks@gmail.com','123','빡빡이 아저씨','34',30000,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('Qnd123@gmail.com','123','뿡뿡이','20',500,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('qjsrovkdnj@gmail.com','123','번개맨','32',450,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('dnrkdnrk@gmail.com','123','알렌 스랄','40',2000,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('dmscjdma@gmail.com','123','매미킴TV','19',50,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('dkdldb123@gmail.com','123','IU','21',90000,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('ahWlvlcl@gmail.com','123','모찌피치','18',50000,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('zmfltmxkf@gmail.com','123','파워게르만','29',1500,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('mnbvcxz@hotmail.com','123','오성규','30',100000,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('ny@gmail.com','123','나연','27',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('jy123@gmail.com','123','정연','41',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('mm@gmail.com','123','모모','49',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('sn@gmail.com','123','사나','33',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('jh@gmail.com','123','지효','22',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('mn@gmail.com','123','미나','25',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('dh@gmail.com','123','다현','27',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('cy@gmail.com','123','채영','48',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('ct@gmail.com','123','쯔위','22',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('pang@gmail.com','123','팡이요','49',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('shin@gmail.com','123','신해조','30',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('word@gmail.com','123','글자네','45',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('taktak@gmail.com','123','종탁이','22',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('hos@gmail.com','123','민들래','31',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('carman@gmail.com','123','카맨','38',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('danuk@gmail.com','123','베나','30',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('kimSky@gmail.com','123','김하늘','47',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('Rynha@gmail.com','123','Rynah','49',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('icly@gmail.com','123','이클리피아','44',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('ggojong@gmail.com','123','꼬종이','19',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('trashmovie@gmail.com','123','망작판별자','38',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('johncancook@gmail.com','123','존캔쿡','30',4000,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('gogomimimi@gmail.com','123','고고미미미','32',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('straightline@gmail.com','123','직선율','27',2000,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('icemint@gmail.com','123','아이스민트','25',300,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('mechatok@gmail.com','123','멕카토크','47',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('arcmak@gmail.com','123','아크막','46',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('pigeonfly@gmail.com','123','비둘기푸드득','46',1600,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('shamanism@gmail.com','123','술사꺼네요','19',100,null,'noicon.png','nochimg.png',0);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('10movie@gmail.com','123','10무비','27',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('314@gmail.com','123','3.14채널','32',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('9bul@gmail.com','123','9bul','49',8000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('noone@gmail.com','123','거의없다','35',450,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('2ddudae@gmail.com','123','게임인 이뚜대','32',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('gogomovie@gmail.com','123','고고무비','26',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('gomong@gmail.com','123','고몽','18',4500,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('edutrue@naver.com','123','교육진담','29',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('internationalbubu@naver.com','123','국제부부','45',5200,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('horrrrror@naver.com','123','기괴무비','34',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('eyesonme@naver.com','123','김시선','32',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('extreammovie@naver.com','123','김종철의 익스트림무비','49',100000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('mimi@naver.com','123','김흥미','47',30000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('9movie@daum.net','123','나인무비','18',500,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('netvo@daum.net','123','넷보','20',450,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('iconictv@daum.net','123','대표 TV','47',2000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('duc@daum.net','123','덕무비','45',50,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('dopan@daum.net','123','도팬','44',90000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('videobang@daum.net','123','동네비디오방','37',50000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('3bunoddugi@daum.net','123','두억시니 3분요약','27',1500,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('duna@daum.net','123','듀나','35',100000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('dreamteller@daum.net','123','드림텔러','28',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('dingo@daum.net','123','딩고 무비','40',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('ddaddasi@hotmail.com','123','따따시','44',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('ddubuni@hotmail.com','123','떠번의','23',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('ddorol@hotmail.com','123','또롤무비','28',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('ddingjal@hotmail.com','123','띵잘','31',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('liner@hotmail.com','123','라이너','45',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('lak@hotmail.com','123','라크무비','20',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('lemong@hotmail.com','123','레몽','49',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('read@gmail.com','123','리드무비','20',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('reviewman@gmail.com','123','리뷰맨','35',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('reviewang@gmail.com','123','리뷰엉이','28',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('riukun@gmail.com','123','리우군의 다락방','26',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('jy@gmail.com','123','리필드 재영','39',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('murf@gmail.com','123','머프','28',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('muk@gmail.com','123','메밀묵도리','32',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('senior@gmail.com','123','명동선배','36',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('freeticket@yahoo.com','123','무료이용','40',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('murmicine@yahoo.com','123','무르미씨네','29',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('moviedochi@yahoo.com','123','무비도치','22',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('moviemonster@yahoo.com','123','무비몬스터','25',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('moviemovie@yahoo.com','123','무비무비','23',4000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('movieus@yahoo.com','123','무비우스','37',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('movieworld@yahoo.com','123','무비월드','50',2000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('moviekok@yahoo.com','123','무비콕콕','42',300,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('taco@daum.net','123','무비타코','32',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('teller@hotmail.com','123','무비텔러','29',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('trip@hotmail.com','123','무비트립','30',1600,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('hanjan@hotmail.com','123','무비한잔','22',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('choice@hotmail.com','123','문초이스','36',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('mupmup@hotmail.com','123','뭅뭅','33',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('middle@hotmail.com','123','미들뻔','47',8000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('mix@gmail.com','123','믹스무비','29',450,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('minho@gmail.com','123','민호타우르스','24',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('byebye@gmail.com','123','바바무비','29',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('nofootbird@gmail.com','123','발없는새','34',4500,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('baebae@gmail.com','123','배배','36',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('freeman@gmail.com','123','백수골방','33',5200,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('bumti@gmail.com','123','범티','24',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('bear@gmail.com','123','베어무비','31',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('incheon@yahoo.com','123','부평시네마','49',100000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('bukbu@yahoo.com','123','북부의 왕','49',30000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('bitatalk@yahoo.com','123','비타 토크','37',500,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('gongu@yahoo.com','123','빨강도깨비','17',450,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('bman@yahoo.com','123','삐맨','33',2000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('sangung@yahoo.com','123','상궁','26',50,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('boxmovie@yahoo.com','123','상자무비리뷰','46',90000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('bbbbbreview@yahoo.com','123','서삐삐의 영화리뷰','45',50000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('serin@naver.com','123','세린','23',1500,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('sogaenam@naver.com','123','소개남','32',10000000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('please@naver.com','123','소개해주어','48',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('soso@naver.com','123','소소티비','17',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('cottoncandy@naver.com','123','솜사탕','47',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('shortcut@daum.net','123','숏컷리뷰','45',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('chicken@daum.net','123','순삭영화','34',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('sunta@daum.net','123','순타','42',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('screen@daum.net','123','스크린대장','37',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('heytv@gmail.com','123','승헤이TV','36',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('senimapia@gmail.com','123','시네마피아','32',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('react@gmail.com','123','심심풀이 반응채널','22',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('hi@gmail.com','123','안용','26',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('youknow@gmail.com','123','알려줌','47',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('egg@naver.com','123','알씨네','38',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('yangyang@naver.com','123','양쟈까의','24',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('uppercut@naver.com','123','어퍼컷','24',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('unjun@naver.com','123','엉준','23',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('everyview@naver.com','123','에브리뷰','34',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('acut@naver.com','123','에이컷 티비','45',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('ans@daum.net','123','엔스','36',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('younglove@daum.net','123','영럽','25',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('youngmin@daum.net','123','영민하다','35',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('youngbotv@daum.net','123','영보TV','33',4000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('youngread@daum.net','123','영일남','25',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('pause@daum.net','123','영잠시','48',2000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('makemovie@daum.net','123','영화공작소','19',300,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('endmovie@daum.net','123','영화끝무렵','30',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('otaku@daum.net','123','영화덕후','43',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('yap@daum.net','123','영화도전','26',1600,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('girl@hotmail.com','123','영화소녀','44',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('shong@hotmail.com','123','영화소환사','28',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('about@hotmail.com','123','영화에 관하여','46',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('drunk@hotmail.com','123','영화에취한다','42',8000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('tvshowshow@hotmail.com','123','영화예능TV','36',450,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('tablemovie@hotmail.com','123','영화의 식탁','48',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('jjummer@hotmail.com','123','영화채널 쭈머','48',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('drikdrik@gmail.com','123','오늘도 드릭드릭','27',4500,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('tophome@gmail.com','123','옥탑방무비','34',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('suspect@gmail.com','123','용의자','37',5200,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('youtuberead@daum.net','123','유튜브읽어주는남자','50',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('eeeki@daum.net','123','이끼맨의 좋은 영화 해석','47',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('esangcouple@daum.net','123','이상커플의이상적인라이프','38',100000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('storyroom@daum.net','123','이야기방','34',30000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('ezip@daum.net','123','이집영화괜찮네','20',500,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('aloneman@daum.net','123','자취방남자','26',450,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('socheon@daum.net','123','장소천','21',2000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('jackkongs@hotmail.com','123','잭콩''s 영화리뷰','22',50,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('jum@hotmail.com','123','점례','46',90000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('daymovie@hotmail.com','123','주말의 띵화','37',50000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('suenim@hotmail.com','123','중생이','41',1500,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('gmovie@hotmail.com','123','지무비','22',10000000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('zto@hotmail.com','123','지토TV','43',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('realtrue@hotmail.com','123','진솔한리뷰','35',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('zipmovie@gmail.com','123','집무비','31',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('windandrain@gmail.com','123','채널폭풍','32',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('genius@gmail.com','123','천재이승국','20',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('boyboy@gmail.com','123','철부지영화','44',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('whereiam@gmail.com','123','청남동','29',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('noboty@gmail.com','123','친절한노바디','23',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('karang@gmail.com','123','카랑','46',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('captainrami@gmail.com','123','캡틴라미','40',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('cabletv@yahoo.com','123','케이블TV VOD','39',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('core@yahoo.com','123','코어','33',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('contentplayer00@yahoo.com','123','콘텐츠플레이','45',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('killtarian131@yahoo.com','123','킬타','34',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('tunachamchi@yahoo.com','123','튜나','46',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('holemovie98@yahoo.com','123','틈새영화','23',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('popcorncake@yahoo.com','123','팝콘케익','41',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('mypopcorntree@yahoo.com','123','팝콘트리','40',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('postshare85@daum.net','123','포스트쉐어','36',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('spoilerman99@hotmail.com','123','프리뷰_결말포함','35',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('fictionworld24@hotmail.com','123','픽션월드','46',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('fallinfilm@hotmail.com','123','필름에빠지다','43',4000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('filmcasterian99@hotmail.com','123','필름캐스터','50',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('helpyourself@hotmail.com','123','하고싶은거다해','47',2000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('whiteraccoon@hotmail.com','123','하얀너구리','33',300,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('highlight7373@gmail.com','123','하이라이트','48',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('stephanhockingkk@gmail.com','123','하킹','33',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('kimchiman123@gmail.com','123','할짓없는김치찌개','29',1600,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('hamlet_movies@gmail.com','123','햄릿','39',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('heatherturning@gmail.com','123','헤더의터닝페이지','29',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('hyundaicardmovie@gmail.com','123','현대카드','22',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('ajhongmovie@gmail.com','123','홍블러탑골극장','22',8000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('hongcinema@gmail.com','123','홍시네마','35',450,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('fatic74@yahoo.com','123','화틱','47',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('hipparachi@yahoo.com','123','히파라치','29',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('ajbros8080@yahoo.com','123','AJBrothers','41',4500,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('benhahnfeld@yahoo.com','123','Benjamin Hahnfeld','20',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('chvideochannel@yahoo.com','123','CH.비디오가게','36',5200,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('chrisstuckshit@hotmail.com','123','Chris Stuckmann','43',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('moonlightmuse@gmail.com','123','DALBITMUSE','31',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('falconcaptain@gmail.com','123','Falcon Review','29',100000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('fkvlogs24@gmail.com','123','FKVlogs','31',30000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('gamemaster88@gmail.com','123','GM.STORY','28',500,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('highqutv@gmail.com','123','HIGHCUTV','46',450,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('netherlandman@gmail.com','123','Hollander Jo','29',2000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('mootiqj@gmail.com','123','J의 무티끄','35',50,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('tetris024@gmail.com','123','Jerald Podkowka','43',90000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('jeremyking@yahoo.com','123','Jeremy Jahns','24',50000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('jayque@daum.net','123','JQ','39',1500,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('rkdwns@daum.net','123','Jun Kang','47',10000000,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('kbs_antena@daum.net','123','KBS 안테나','28',100,null,'noicon.png','nochimg.png',1);
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
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('duckplayer@daum.net','123','TV덕플','38',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('kongtv@daum.net','123','TV콩','33',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('uxxmovie@daum.net','123','Uxx','29',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('mybody@gmail.com','123','wembodyt','29',100,null,'noicon.png','nochimg.png',1);
Insert into RETULIX.MEMBER (EMAIL,PWD,NAME,AGE,POINT,SUBS,ICON,CHIMG,STATE) values ('ysamo@yahoo.com','123','Ysamo Quind','20',100,null,'noicon.png','nochimg.png',1);
REM INSERTING into RETULIX.NOTICE
SET DEFINE OFF;
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (1,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (2,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (3,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (4,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (5,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (6,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (7,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (8,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (9,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (10,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (11,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (12,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (13,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (14,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (15,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (16,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (17,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (18,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (19,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (20,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (21,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (22,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (23,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (24,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (25,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (26,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (27,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (28,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (29,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (30,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (31,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (32,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (33,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (34,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (35,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (36,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (37,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (38,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (39,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
Insert into RETULIX.NOTICE (IDX,TITLE,INFO,WDATE,CLICK,NAME) values (40,'테스트','공지사항 테스트',to_date('20/02/19','RR/MM/DD'),0,'admin');
REM INSERTING into RETULIX.GOOD_REVIEW
SET DEFINE OFF;
REM INSERTING into RETULIX.HISTORY
SET DEFINE OFF;
REM INSERTING into RETULIX.SUBS
SET DEFINE OFF;
REM INSERTING into RETULIX.ZZIM_TRAILER
SET DEFINE OFF;

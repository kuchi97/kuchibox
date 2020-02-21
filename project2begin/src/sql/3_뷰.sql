--------------------------------------------------------
--  파일이 생성됨 - 수요일-2월-19-2020   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for View TRAILER_VIEW
--------------------------------------------------------

  CREATE OR REPLACE FORCE VIEW "RETULIX"."TRAILER_VIEW" ("IDX", "API_IDX", "URL", "TITLE", "GOOD", "CLICK", "ZZIM", "EMAIL") AS 
  (
select div||genre||num as idx, api_idx, url, title, good, click, zzim, email
from trailer);
--------------------------------------------------------
--  DDL for View REVIEW_VIEW
--------------------------------------------------------

  CREATE OR REPLACE FORCE VIEW "RETULIX"."REVIEW_VIEW" ("IDX", "TITLE", "URL", "INFO", "GOOD", "CLICK", "ZZIM", "EMAIL", "WDATE", "T_TITLE", "T_IDX") AS 
  select r.div||r.genre||r.num as idx, r.title as title, r.url as url, r.info as info, r.good as good,
r.click as click, r.zzim as zzim, r.email as email, r.wdate as wdate, t.title as t_title, t.idx as t_idx
from review r join trailer_view t on r.t_idx=t.idx order by wdate desc;
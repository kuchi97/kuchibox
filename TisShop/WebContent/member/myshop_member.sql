drop table member;

create table member(
  idx number(8) constraint member_idx_pk primary key, --ȸ����ȣ
  name varchar2(30) not null,     -- �̸�
  userid varchar2(20) not null,   -- ���̵�
  email varchar2(100),            -- �̸���
  pwd varchar2(20) not null,    --��й�ȣ
  hp1 char(3) not null,     --�ڵ�����ȣ
  hp2 char(4) not null,
  hp3 char(4) not null,
  post char(5) not null,
  addr1 varchar2(100) not null,
  addr2 varchar2(100),
  indate date default sysdate, --������
  mileage number(10) default 1000, --���ϸ���: ȸ�����Խ� 1000�� ����! ��.ī.��. ���ؾ��� ����. ��.��.��.��. ��*��*��
  m_state number(2) default 0,    --ȸ������(0:�Ϲ�ȸ�� -1:����ȸ�� -2:Ż��ȸ��)
  constraint member_userid_uk unique(userid)
);

drop sequence member_seq;

create sequence member_seq
  start with 1
  increment by 1
  nocache
;
create table pizza_user(
	idx number(8) primary key,
	name varchar2(30),
	phone varchar2(15) not null,
	addr varchar2(100) not null
);
create sequence pizza_user_seq
start with 1
increment by 1
nocache;

insert into pizza_user(idx,name,phone,addr)
values(pizza_user_seq.nextval,'������','111-1111',
'���� ������ ������');

insert into pizza_user(idx,name,phone,addr)
values(pizza_user_seq.nextval,'�̻��','222-2222',
'���� ������ ������');
commit;

desc pizza_user;
select * from pizza_user;
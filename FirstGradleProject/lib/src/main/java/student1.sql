create table "public"."student1"(
"rno" numeric,
"sname" varchar(20),
"email" varchar(20),
"phone" numeric
);

insert into student1 values(100,'Abitha','abi16@gmail.com',6789);
insert into student1 values(110,'Anu','anu7@gmail.com',7890);
insert into student1 values(120,'Ishu','ish6@gmail.com',2706);
insert into student1 values(130,'Lynd','lynd28@gmail.com',8901);
insert into student1 values(140,'Vaish','vaish27@gmail.com',9012);
select * from student1;
select rno,sname,email,phone from student1 where rno=111;
select rno,sname,email,phone from student1 where rno>400;
delete from student1;
update student1 set sname='james' where rno=111;
create table "public"."product2"(
"prodid" numeric,
"prodname" varchar(30),
"mfg" Date,
"exp" Date
);

insert into product2 values(101,'lays','6.3.20','5.8.20');
select * from product2;
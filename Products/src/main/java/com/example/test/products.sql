create table "public"."product"(
"pid" numeric,
"Pname" varchar(30),
"pdesc" varchar(30),
"domf" varchar(30),
"doexp" varchar(30),
"supplier" varchar(30),
"qty" numeric
);

select * from product;
insert into product values(101,'lays','chips','2jan','6nov','nestle',5);
insert into product values(102,'milkbikis','biscuit','4jan','7nov','britania',3);
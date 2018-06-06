
create table five_resume
(
	resume_id bigint auto_increment
		primary key,
	biz_id bigint default '0' not null,
	url varchar(256) default '' not null,
	gmt_create datetime default CURRENT_TIMESTAMP not null,
	gmt_modified datetime default CURRENT_TIMESTAMP not null
)
;

create table jeep_city
(
	city_id bigint auto_increment
		primary key,
	city_name varchar(32) default '' not null,
	city_short_name varchar(32) null comment '城市简称',
	city_sort int not null,
	prov_id bigint not null,
	city_index varchar(11) default '' not null,
	status tinyint default '1' null,
	gmt_create datetime default CURRENT_TIMESTAMP not null,
	gmt_modified datetime default CURRENT_TIMESTAMP not null,
	longitude decimal(10,6) default '0.000000' not null comment '经度',
	latitude decimal(10,6) default '0.000000' not null comment '纬度'
)
comment '城市表'
;

create index idx_city_name
	on jeep_city (city_name)
;

create index idx_prov_id
	on jeep_city (prov_id)
;

create table jeep_company
(
	company_id bigint auto_increment comment '主键'
		primary key,
	company_name varchar(32) default '' not null
)
;

create table jeep_province
(
	province_id bigint auto_increment
		primary key,
	province_name varchar(32) default '' not null,
	province_short_name varchar(16) null comment '省份简称，不是单字的简称，类似于“新疆”',
	province_sort int not null,
	province_index varchar(20) not null comment '索引字母',
	remarks varchar(32) null,
	status tinyint default '1' null,
	gmt_create datetime null,
	gmt_modified datetime null
)
;

create table jeep_user
(
	user_id bigint auto_increment
		primary key,
	user_mobile varchar(20) default '' not null,
	user_name varchar(31) default '' not null comment '用户姓名',
	user_age tinyint(3) default '0' not null,
	user_sex tinyint(2) default '0' not null comment '用户姓名 0 男 1 女 2 人妖',
	user_hair varchar(30) default '' not null comment '头发',
	user_face varchar(30) default '' not null comment '脸型',
	user_leg varchar(30) default '' not null comment '腿',
	province varchar(31) default '' not null,
	city varchar(64) default '' not null,
	is_delete tinyint(2) default '0' not null comment '是否删除 0 未删除 1已删除',
	status tinyint(3) default '0' not null comment '用户状态 0 白名单 1 黑名单',
	gmt_create datetime default CURRENT_TIMESTAMP not null,
	gmt_modified datetime default CURRENT_TIMESTAMP not null
)
comment 'jeep用户表'
;


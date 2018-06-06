create table b2b_synonym
(
	synonym_id bigint not null
		primary key,
	data_value varchar(1000) null,
	alias varchar(1000) null,
	ext varchar(1000) null,
	is_deleted tinyint null,
	type varchar(64) null,
	gmt_create datetime null,
	gmt_modified datetime null,
	series_id bigint null,
	standard bigint null
)
;

create table car_msg
(
	msg_id bigint auto_increment
		primary key,
	content text null,
	nick_name varchar(255) null comment '微信昵称',
	series_name varchar(512) default '' not null comment '车系名',
	cell_phone_num varchar(20) null comment '这条消息提取出来的联系方式',
	is_delete tinyint default '0' not null comment '是否删除 0 为删除 1删除',
	gmt_create timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
	gmt_modified timestamp default CURRENT_TIMESTAMP not null comment '修改时间'
)
;

create index idx_cell_phone
	on car_msg (cell_phone_num)
;

create table rim_app_update_content
(
	update_id bigint auto_increment comment '主键'
		primary key,
	update_content varchar(1024) not null comment '更新文案 json字符串',
	update_version varchar(10) default '' not null comment '更新版本',
	platform_type tinyint(2) default '0' not null comment '平台类型',
	is_deleted tinyint(2) default '0' not null comment '是否删除',
	gmt_create datetime default CURRENT_TIMESTAMP not null,
	gmt_modified datetime default CURRENT_TIMESTAMP not null
)
comment '车商圈应用更新内容'
;

create table user
(
	user_id int auto_increment comment '主键'
		primary key,
	user_name varchar(31) default '' not null comment '用户姓名'
)
;


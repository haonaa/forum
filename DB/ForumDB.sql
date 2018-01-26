/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/1/26 16:11:30                           */
/*==============================================================*/


drop table if exists Message;

drop table if exists Post;

drop table if exists Users;

/*==============================================================*/
/* Table: Message                                               */
/*==============================================================*/
create table Message
(
   m_id                 integer(10) not null comment '留言ID',
   m_u_id               integer(6) not null comment '用户ID',
   m_rep_id             integer(10) comment '回复的对象的留言ID',
   m_p_id               integer(6) not null comment '留言所属帖子id',
   m_content            varchar(2000) not null comment '留言内容',
   m_pub_date           datetime not null comment '留言时间',
   primary key (m_id)
);

alter table Message comment '留言表';

/*==============================================================*/
/* Table: Post                                                  */
/*==============================================================*/
create table Post
(
   p_id                 integer(6) not null comment '帖子id',
   p_u_id               integer(6) not null comment '帖子所属用户ID',
   p_content            varcahr(500) not null comment '帖子讨论内容',
   p_pub_date           datetime not null comment '发布时间',
   primary key (p_id)
);

alter table Post comment '帖子表';

/*==============================================================*/
/* Table: Users                                                 */
/*==============================================================*/
create table Users
(
   u_id                 integer(6) not null comment '用户ID',
   u_name               varchar(10) not null comment '用户姓名',
   u_sex                integer(1) not null comment '用户性别',
   u_profile            varchar(500) comment '用户简介',
   u_age                integer(2) not null comment '用户年龄',
   primary key (u_id)
);

alter table Users comment '用户表';

alter table Message add constraint FK_Reference_2 foreign key (m_u_id)
      references Users (u_id) on delete restrict on update restrict;

alter table Message add constraint FK_Reference_3 foreign key (m_rep_id)
      references Message (m_id) on delete restrict on update restrict;

alter table Message add constraint FK_Reference_4 foreign key (m_p_id)
      references Post (p_id) on delete restrict on update restrict;

alter table Post add constraint FK_Reference_1 foreign key (p_u_id)
      references Users (u_id) on delete restrict on update restrict;


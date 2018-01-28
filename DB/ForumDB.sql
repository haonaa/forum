/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/1/28 14:48:50                           */
/*==============================================================*/


drop table if exists forum.message;

drop table if exists forum.post;

drop table if exists forum.users;

/*==============================================================*/
/* Table: Message                                               */
/*==============================================================*/
create table forum.message
(
   m_id                 integer(10) not null,
   m_u_id               integer(6) not null,
   m_rep_id             integer(10),
   m_p_id               integer(6) not null,
   m_content            varchar(2000) not null,
   m_pub_date           datetime not null,
   primary key (m_id)
);

/*==============================================================*/
/* Table: Post                                                  */
/*==============================================================*/
create table forum.post
(
   p_id                 integer(6) not null,
   p_u_id               integer(6) not null,
   p_content            varchar(500) not null,
   p_pub_date           datetime not null,
   primary key (p_id)
);

/*==============================================================*/
/* Table: Users                                                 */
/*==============================================================*/
create table forum.users
(
   u_id                 integer(6) not null,
   u_name               varchar(10) not null,
   u_sex                integer(1) not null,
   u_profile            varchar(500),
   u_age                integer(2) not null,
   primary key (u_id)
);

alter table forum.message add constraint FK_Reference_2 foreign key (m_u_id)
      references forum.users (u_id) on delete restrict on update restrict;

alter table forum.message add constraint FK_Reference_3 foreign key (m_rep_id)
      references forum.message (m_id) on delete restrict on update restrict;

alter table forum.message add constraint FK_Reference_4 foreign key (m_p_id)
      references forum.post (p_id) on delete restrict on update restrict;

alter table forum.post add constraint FK_Reference_1 foreign key (p_u_id)
      references forum.users (u_id) on delete restrict on update restrict;


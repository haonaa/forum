/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/1/28 14:48:50                           */
/*==============================================================*/


drop table if exists forumsys.message;

drop table if exists forumsys.post;

drop table if exists forumsys.users;

/*==============================================================*/
/* Table: Message                                               */
/*==============================================================*/
create table Message
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
create table Post
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
create table Users
(
   u_id                 integer(6) not null,
   u_name               varchar(10) not null,
   u_sex                integer(1) not null,
   u_profile            varchar(500),
   u_age                integer(2) not null,
   primary key (u_id)
);

alter table forumsys.message add constraint FK_Reference_2 foreign key (m_u_id)
      references forumsys.users (u_id) on delete restrict on update restrict;

alter table forumsys.message add constraint FK_Reference_3 foreign key (m_rep_id)
      references forumsys.message (m_id) on delete restrict on update restrict;

alter table forumsys.message add constraint FK_Reference_4 foreign key (m_p_id)
      references forumsys.post (p_id) on delete restrict on update restrict;

alter table forumsys.post add constraint FK_Reference_1 foreign key (p_u_id)
      references forumsys.users (u_id) on delete restrict on update restrict;


create database forumSys;
create user forum_root identified by 'root';
grant all on forumSys.* to forum_root;
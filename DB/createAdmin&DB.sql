create database gamebody;
create user gamebody_root identified by 'gamebody_root';
grant all on gamebody.* to gamebody_root;


drop database forumsys;
drop user forum_root;
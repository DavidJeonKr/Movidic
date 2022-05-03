use movidic;

create table users(
	id int(20) not null primary key,
    email varchar(40) not null,
    name varchar(20) not null,
    profile varchar(200),
    regdate datetime default current_timestamp
);

create table movies(
	mid int(20) not null primary key auto_increment comment '아이디',
    title varchar(100) comment '영화명',
    summary varchar(1000) comment '줄거리',
    actor varchar(150) comment '배우',
    genre varchar(100) comment '장르',
    director varchar(50) comment '감독',
    country varchar(30) comment '제작국가',
    rating int(10) default 0 comment '평점',
    duration varchar(40) comment '상영시간',
    opening_date datetime comment '개봉일',
    viewcnt int default 0 comment '조회수'
);

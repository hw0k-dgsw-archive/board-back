DROP TABLE IF EXISTS posts;
DROP TABLE IF EXISTS users;

CREATE TABLE users (
    id bigint primary key AUTO_INCREMENT,
    account varchar(40) not null unique,
    password varchar(100) not null,
    username varchar(100) not null,
    email varchar(50) not null unique,
    created datetime default CURRENT_TIMESTAMP,
    updated datetime default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP
) default charset utf8mb4 engine = InnoDB;

create table posts (
    id bigint primary key AUTO_INCREMENT,
    user_id bigint,
    title varchar(255),
    content text,
    created datetime default CURRENT_TIMESTAMP,
    updated datetime default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP
) default charset utf8mb4 engine = InnoDB;

INSERT INTO users(account, password, username, email) VALUES
	('user1', '1234', 'test1', 'user1@dgsw.hs.kr'),
    ('user2', '1234', 'test2', 'user2@dgsw.hs.kr'),
    ('user3', '1234', 'test3', 'user3@dgsw.hs.kr');

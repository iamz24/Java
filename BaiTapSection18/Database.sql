CREATE DATABASE quan_ly_dai_hoc char set utf8;
USE quan_ly_dai_hoc;

CREATE TABLE university(
	id int(10) primary key auto_increment,
    ten varchar(50),
    diachi varchar(50)
);

CREATE TABLE student(
	id int(10) primary key auto_increment,
    ten varchar(50),
    tuoi int(10),
    uni int(10),
    CONSTRAINT fk_uni_hs FOREIGN KEY(uni) REFERENCES university(id)
);


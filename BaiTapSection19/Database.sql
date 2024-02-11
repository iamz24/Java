CREATE DATABASE shop_ban_hang char set utf8;

CREATE TABLE category(
	id int(10) primary key auto_increment,
    ten varchar(10)
);

CREATE TABLE product(
	id int(10) primary key auto_increment,
    ten varchar(50),
    soluong int(10),
    dongia int(10),
    categoryid int (10),
    CONSTRAINT fk_category_product FOREIGN KEY(categoryid) REFERENCES category(id)
);

CREATE TABLE khach_hang (
	id int(10) primary key auto_increment,
    ten varchar(50),
    diachi varchar(50)
);

CREATE TABLE bill (
	id int(10) primary key auto_increment,
    soluong int(10),
    dongia int(10),
    buydate date,
	productid int(10),
	userid int(10),
    CONSTRAINT fk_sp_bill FOREIGN KEY(productid) REFERENCES product(id),
	CONSTRAINT fk_kh_bill FOREIGN KEY(userid) REFERENCES khach_hang(id)
);
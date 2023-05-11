CREATE DATABASE question4;
USE question4;

CREATE TABLE Address
(
	address_id int unsigned not null auto_increment,
    zip varchar(10) not null,
    street varchar(100) not null,
    complement varchar(255),
    neighborhood varchar(255),
    city varchar(50) not null,
    state varchar(50) not null,
    country varchar(60) not null,
    PRIMARY KEY (address_id)
);

CREATE TABLE Person
(
	person_id int unsigned not null auto_increment,
    nome varchar(45) not null,
    age tinyint not null,
    phone varchar(21),
    height int not null default '0',
    email varchar(100),
    cpf varchar(14) not null,
    birthday date not null,
    address_id int unsigned default null,
    PRIMARY KEY (person_id),
    CONSTRAINT fk_Person_Address foreign key(address_id) REFERENCES Address (address_id)
);
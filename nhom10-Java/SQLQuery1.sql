create database QLPT
go

use QLPT
go


drop table ACCOUNT

create table ACCOUNT(
	Username varchar(20) not null primary key,
	Password varchar(20) not null,
	Name nvarchar(30),
	Email varchar(30),
	Phonenumber char(10),
	Rol int
)

insert into ACCOUNT values('hoangnhat','admin',N'Hoàng Công Nh?t','abc@gmail.com','1234567890',0)
insert into ACCOUNT values('vanthuy','admin',N'Nguy?n V?n Thùy','abc@gmail.com','1234567890',1)

drop table VEHICLE

create table VEHICLE(
	VehID char(10) not null primary key,
	VehName Nvarchar(30) not null,
	Maker varchar(30) not null,
	VehType nvarchar(20) not null,
	Year int not null,
	Price varchar(20) not null,
	Color Nvarchar(20) not null,
	SeatNum int,
	EngineType Nvarchar(30),
	Watt int,
	Tonn int
)

insert into vehicle values('V01','abc','honda',N'xe máy',2022,100000,N'?en','','',150,'')
insert into vehicle values('V02','abc','yamaha',N'ô tô',2021,200000,N'Tr?ng',4,N'Ki?u ??ng c? 1','','')

select * from VEHICLE
select * from ACCOUNT
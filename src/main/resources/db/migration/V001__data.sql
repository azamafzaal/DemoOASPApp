CREATE TABLE STAFF_MEMBER (
	id BIGINT GENERATED BY DEFAULT AS IDENTITY,
	last_name varchar(255),
	first_name varchar(255),
	login varchar(255)
);

create sequence staffmember_sequence start with 1 increment by 1;

insert into STAFF_MEMBER (last_name, first_name, login) values ('Azam', 'Babar', 'babarazam');
insert into STAFF_MEMBER (last_name, first_name, login) values ('Root', 'Joe', 'joeroot');
insert into STAFF_MEMBER (last_name, first_name, login) values ('Smith', 'Steve', 'stevesmith');
insert into STAFF_MEMBER (last_name, first_name, login) values ('Williamson', 'Kane', 'kanew');
insert into STAFF_MEMBER (last_name, first_name, login) values ('Kohli', 'Virat', 'viratkohli');
insert into STAFF_MEMBER (last_name, first_name, login) values ('Ali', 'Moeen', 'moali');
insert into STAFF_MEMBER (last_name, first_name, login) values ('Dickwella', 'Niroshan', 'niroshand');
insert into STAFF_MEMBER (last_name, first_name, login) values ('Klaasen', 'Heinrich', 'hklaasen');
insert into STAFF_MEMBER (last_name, first_name, login) values ('Khawaja', 'Usman', 'uskhawaja');
insert into STAFF_MEMBER (last_name, first_name, login) values ('Paine', 'Tim', 'tpaine');
create table mysql_university.Students(
		id_Stnumber char(6),
        password int,
        Firstname varchar(25),
        Lastname varchar(25),
        DepartmentName varchar(25),
		Email varchar(25),
        primary key(id_Stnumber) 
        
);
create table mysql_university.Department(
	DepartmentName varchar(25),
    Budget int not null,
    primary key (DepartmentName)
);
create table mysql_university.Proffessors(
	id_Pnumber varchar(8),
    Firstname varchar(25),
    Lastname varchar (25),
    primary key (id_Pnumber)

);

create table mysql_university.Lessons(
	id_Lnumber varchar(8),
    LessonName varchar(60) ,
    id_Pnumber varchar(8),
    primary key(id_Lnumber)
    
);
create table mysql_university.Grades(
	id_Lnumber varchar(8),
	id_Stnumber char(6) ,
    Grade int,
	primary key (id_Lnumber,id_Stnumber)
);


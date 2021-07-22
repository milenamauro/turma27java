create database db_escola;
use db_escola;

create table estudantes (
registro_de_aluno bigInt auto_increment,
nome varchar(50) not null,
unidade varchar(50) not null,
matricula boolean,

primary key(registro_de_aluno)

);  

insert into estudantes (nome, unidade, media_das_notas, matriculado) values ("Ma","Santa Cecilia",8,true);
insert into estudantes (nome, unidade, media_das_notas, matriculado) values ("Fa","Pinheiros",5,false);
insert into estudantes (nome, unidade, media_das_notas, matriculado) values ("Ka,"Ipiranga",6,true);
insert into estudantes (nome, unidade, media_das_notas, matriculado) values ("Ge","Helipa",9,false);
insert into estudantes (nome, unidade, media_das_notas, matriculado) values ("Lu","Santo André",4,true);
insert into estudantes (nome, unidade, media_das_notas, matriculado) values ("Ka","13 de Junho",8.7,true);
insert into estudantes (nome, unidade, media_das_notas, matriculado) values ("Ja","Santa Barbara",8.1,true);
insert into estudantes (nome, unidade, media_das_notas, matriculado) values ("Li","Santa Cecilia",2.6,true);

select nome from estudantes where media_das_notas > 7;
select nome from estudantes where media_das_notas < 7;

update estudantes set media_das_notas = 9 where registro_de_aluno = 8;
 




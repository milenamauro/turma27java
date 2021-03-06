create database db_pizzaria_vegetariana;

use db_pizzaria_vegetariana;

create table tb_categoria(
	id bigint (5) auto_increment,
    tipo varchar (20) not null,
    promocao boolean,    
    primary key (id)
);

create table tb_pizza(
	id bigint (5) auto_increment,
    sabor varchar (20) not null,
    preco decimal (3,2) not null,
    categoria_id bigint not null,
    primary key (id),
    foreign key (categoria_id) references tb_categoria(id)
);

ALTER TABLE tb_pizza MODIFY preco decimal(10,2);

insert into tb_categoria (tipo, promocao) values ("Doce", true);
insert into tb_categoria (tipo, promocao) values ("Salgada", false);

insert into tb_pizza (sabor, preco, categoria_id) values ("Chocolate", 49, 1);
insert into tb_pizza (sabor, preco, categoria_id) values ("Choc e morango", 59.90, 1);
insert into tb_pizza (sabor, preco, categoria_id) values ("Banana", 39.90, 1);
insert into tb_pizza (sabor, preco, categoria_id) values ("brocolis", 45.90, 2);
insert into tb_pizza (sabor, preco, categoria_id) values ("jaca com queijo", 49.90, 2);
insert into tb_pizza (sabor, preco, categoria_id) values ("Especial", 64.90, 2);

select * from tb_pizza where preco > 45.00;
select * from tb_pizza where preco >= 29.00 and preco <= 60.00;
select * from tb_pizza where sabor like "c%";

select * from tb_pizza
inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_id;

select * from tb_pizza
inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_id
where tb_categoria.tipo = "Doce";

DELETE FROM tb_pizza WHERE id = 1
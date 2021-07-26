create database db_cidade_das_frutas; 

use db_cidade_das_frutas; 
create table tb_categoria(
	id bigint auto_increment,
    tipoFruta varchar(50) not null,          
    quantidade int(3) not null,
    
    primary key (id)
    
 

 select * from tb_categoria;
 
 
insert tb_categoria (tipoFruta, quantidade)  values ("vermelha", 6);
insert tb_categoria (tipoFruta, quantidade) values ("branca", 5);
insert tb_categoria (tipoFruta, quantidade) values ("amarela", 4);                         
insert tb_categoria (tipoFruta, quantidade) values ("roxa", 50);
insert tb_categoria (tipoFruta, quantidade) values ("verde", 50) 

select * from tb_categoria

create table tb_produto(
	id bigint auto_increment,
    nome varchar (50),
    preco int (2),               
    peso int(2),
    id_produto bigint,
    
	primary key (id),
    foreign key (id_produto) references tb_categoria (id)
    
)

select * from tb_produto;    
 
insert tb_produto (nome, preco, peso, id_produto) values ("Morango", 5, 250 , 1);
insert tb_produto (nome, preco, peso, id_produto) values("Goiba branca", 95, 2);
insert tb_produto (nome, preco, peso, id_produto) values("Carambola", 5, 220, 3);
insert tb_produto (nome, preco, peso, id_produto) values("Jaca", 30, 400, 5);
insert tb_produto (nome, preco, peso, id_produto) values("Manga", 2, 110, 5);
 
 

select * from tb_produto where preco  like preco > 50;  
select * from tb_produto where preco  like preco <3;  
select * from tb_produto where preco  like preco >60;  
select * from tb_produto where nome like "c%";

select * from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id
where tb_categoria.id = legumes;
 
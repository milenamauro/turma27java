create database bd_ecommerce;
use bd_ecommerce;
create table produtos(
	id bigInt auto_increment,
    modelo VARCHAR(50) NOT NULL,
    preco DECIMAL(10, 2) NOT NULL,
    marca VARCHAR(50) NOT NULL,
    disponivel boolean,
    insert into produtos (modelo, marca, preco, disponivel) values ("Iphone 13","Apple",200000.00,true);
insert into produtos (modelo, marca, preco, disponivel) values ("v3","Motorola",678.00,false);
insert into produtos (modelo, marca, preco, disponivel) values ("Galaxy note","Samsung",2326.00,true);
insert into produtos (modelo, marca, preco, disponivel) values ("Megamente","Acer",471.54,false);
insert into produtos (modelo, marca, preco, disponivel) values ("Acer","INX",212.54,true);
insert into produtos (modelo, marca, preco, disponivel) values ("Marsh16","LG",2116.49,true);
insert into produtos (modelo, marca, preco, disponivel) values ("Redmi 8","Xiaomi",1786.81,true);
insert into produtos (modelo, marca, preco, disponivel) values ("Iphone 15","Multilaser",2600000.00,true);

select modelo from produtos where preco > 500;
select modelo from produtos where preco < 500;

update produtos set marca = "Apple" where id = 8;
    
    primary key (id)
);
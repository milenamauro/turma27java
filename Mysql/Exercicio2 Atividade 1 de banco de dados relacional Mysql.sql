CREATE DATABASE db_generation_game_online;
use db_generation_game_online;

CREATE TABLE tb_classe (
    id_classe INT AUTO_INCREMENT,
    nome_pokemon VARCHAR(20) NOT NULL,
    combat_power VARCHAR(50),
    PRIMARY KEY (id_classe)
);
create table tb_personagem (

	id_pokemon int AUTO_INCREMENT,
	nome_pokemon VARCHAR(50) not null,
    comabte INT not NULL,
    estagio INT NOT NULL,
    classe INT,
    
    PRIMARY KEY (id_personagem),
    FOREIGN KEY (classe) REFERENCES tb_classe (id_classe)
);

INSERT INTO tb_classe 
(tipo_pokemon, combat_power) 
values
 ("Tipo fogo", "Chama"),
("Tipo agua", "Chuva Borrifante"),
("Tipo terra", "Lançamento Vigoroso"),
("Tipo eletrico","Bola elétrica"),
("Tipo ar","Atacar a ferida");


INSERT INTO tb_personagem 
(nome_pokemon, ataque, defesa, classe)
values
("Charmander", 75000, 55650, 1),
("Squirtle", 70000, 155950, 2),
("Primeape", 90000, 54450, 3),
("Pikachu",60000,29540,4),
("Morpeko", 50000, 45000, 3),
("Glastrier", 40000, 13450, 5),
("Mewtwo", 30700, 18500, 5),
("eevee", 30000, 26500, 3);

select nome_pokemon
from 
tb_personagem
where
ataque > 2000;

select nome_pokemon
from 
tb_personagem
where
defesa > 1000 and defesa < 2000;

select * 
from 
tb_personagem
where
nome_pokemon like "%c%";

select tb_personagem.nome_personagem,
tb_classe.nome_pokemon from tb_personagem
inner join
tb_classe on 
tb_classe.id_classe = tb_personagem.classe;

select * FROM tb_personagem
INNER JOIN tb_classe on
tb_classe.id_classe = tb_personagem.classe
where tb_classe.nome_classe = "Tipo fogo";



 
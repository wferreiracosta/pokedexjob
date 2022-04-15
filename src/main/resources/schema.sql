create database pokedex_job;
create database pokedex_data;

use pokedex_data;

CREATE TABLE pokedex_name (
	id int NOT NULL,
	english TEXT,
	french TEXT
);
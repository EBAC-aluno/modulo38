CREATE TABLE tb_user(id INT PRIMARY KEY, name VARCHAR(50) NOT NULL, telephone VARCHAR(16) NOT NULL UNIQUE, type telephone_type);
CREATE SEQUENCE sq_user START 1 INCREMENT 1 OWNED BY tb_user.id;
CREATE TYPE telephone_type AS ENUM('CELLPHONE', 'PUBLIC', 'LANDLINE');



psql -U telephone_list_user db_telephone_list

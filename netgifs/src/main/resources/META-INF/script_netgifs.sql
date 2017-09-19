CREATE TABLE db_netgifs.tb_usuario(
 
	id_usuario INT AUTO_INCREMENT PRIMARY KEY NOT NULL COMMENT 'CÃ“DIGO DO USUÃ�RIO',
	ds_login   VARCHAR(30) NOT NULL COMMENT 'LOGIN DO USUÃ�RIO PARA ACESSO AO SISTEMA',
	ds_senha   VARCHAR(30) NOT NULL COMMENT 'SENHA DO USUÃ�RIO PARA ACESSO AO SISTEMA'   	
 
);

CREATE TABLE db_netgifs.tb_pessoa(
 
    id_pessoa           INT AUTO_INCREMENT PRIMARY KEY NOT NULL COMMENT 'CÃ“DIGO DA PESSOA',
    nm_pessoa           VARCHAR(70)  NOT NULL COMMENT 'NOME DA PESSOA',
    fl_sexo	        CHAR(1)	     NOT NULL COMMENT 'INFORMAR M OU F',
    dt_cadastro         DATETIME     NOT NULL COMMENT 'DATA DE CADASTRO DO REGISTRO',
    ds_email	        VARCHAR(80)  NOT NULL COMMENT 'EMAIL DA PESSOA',
    ds_endereco         VARCHAR(200) NOT NULL COMMENT 'DESCRIÃ‡ÃƒO DO ENDEREÃ‡O',
    fl_origemCadastro   CHAR(1)	     NOT NULL COMMENT 'ORIGEM DO CADASTRO (I) = INPUT OU (X) = XML',	
    id_usuario_cadastro	INT	     NOT NULL COMMENT  'USUÃ�RIO LOGADO QUE CADASTROU A PESSOA'
 
);

 ALTER TABLE db_netgifs.tb_pessoa ADD FOREIGN KEY (id_usuario_cadastro) REFERENCES db_netgifs.tb_usuario(id_usuario);
 
 SHOW FULL COLUMNS FROM db_netgifs.tb_pessoa;
 
 INSERT INTO db_netgifs.tb_usuario (ds_login,ds_senha) VALUES('admin','123456');
 
 
  CREATE TABLE db_netgifs.tb_categoria(
	id_categoria INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    nm_categoria   VARCHAR(70)  NOT NULL
);


insert into db_netgifs.tb_categoria values (1,'Gifs Animados');
insert into db_netgifs.tb_categoria values (2,'Suspense');

 CREATE TABLE db_netgifs.tb_gif(
	id_gif INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    nm_gif           VARCHAR(70)  NOT NULL,
	ds_gif   VARCHAR(1000) NOT NULL,
    ds_genero   VARCHAR(100) NOT NULL,
    ds_classificacao_etaria   VARCHAR(15) NOT NULL,
    ds_idioma   VARCHAR(20) NOT NULL,
	link_gif varchar(500) NOT NULL,
  	id_categoria int NOT NULL
);

insert into db_netgifs.tb_gif values (1,'gif de teste', 'descricao do gif teste', 'https://media.giphy.com/media/PBg4KWciMK6zu/giphy.gif',1) ;
insert into db_netgifs.tb_gif values (2,'gif footbal', 'gif muito da zuera kkkkkkk', 'Comedia','Livre', 'Ingles', 'https://media1.giphy.com/media/xUPGcB5L0TIfLrDH8c/giphy.gif',1) ;
insert into db_netgifs.tb_gif values (3,'gif drink beer', 'tiozinho tomando uma', 'Comedia','Livre', 'Ingles', 'https://media4.giphy.com/media/zbMUQKqHZQ4eY/giphy_s.gif',2) ;


ALTER TABLE db_netgifs.tb_gif ADD FOREIGN KEY (id_categoria) REFERENCES db_netgifs.tb_categoria(id_categoria);

 CREATE TABLE db_netgifs.tb_usuario_favorito(
	id_usuario  int  NOT NULL,
    id_gif INT NOT NULL
);

ALTER TABLE db_netgifs.tb_usuario_favorito ADD FOREIGN KEY (id_usuario) REFERENCES db_netgifs.tb_usuario(id_usuario);
ALTER TABLE db_netgifs.tb_usuario_favorito ADD FOREIGN KEY (id_gif) REFERENCES db_netgifs.tb_gif(id_gif);

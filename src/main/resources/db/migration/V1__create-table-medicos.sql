create table medicos(
    id bigint not null auto_increment,
    nome varchar(100) not null,
    email varchar(100) not null unique,
    especialidade ENUM('CARDIOLOGIA', 'PEDIATRIA', 'ORTOPEDIA'),
    crm varchar(100) not null,
    logradouro varchar(20) not null,
    bairro varchar(100) not null,
    cep varchar(100) not null,
    complemento varchar(100),
    numero varchar(20),
    uf char(2) not null,
    cidade varchar(50) not null,
    primary key(id)
);
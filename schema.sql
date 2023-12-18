create database ecommerce;
use ecommerce;
create table categorias(
    id_categoria int primary key auto_increment,
    nombre varchar(100)
);
create table productos(
    id_producto int primary key auto_increment,
    nombre varchar(100),
    precio decimal(5,2),
    descripcion varchar(100),
    id_categoria int,
    foreign key(id_categoria) references categorias(id_categoria)
);

drop table productos;
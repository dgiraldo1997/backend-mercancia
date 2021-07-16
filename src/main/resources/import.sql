/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  AdminSainc
 * Created: 15/07/2021
 */

insert into cargos (nombre,created_at) values('Administrador','2021-07-15');
insert into cargos (nombre,created_at) values('Analista TI','2021-07-15');
insert into cargos (nombre,created_at) values('Director TI','2021-07-15');
insert into cargos (nombre,created_at) values('Jefe de Infraestructura','2021-07-15');
insert into cargos (nombre,created_at) values('Jefe de Soporte','2021-07-15');
insert into cargos (nombre,created_at) values('Developer Backend','2021-07-15');
insert into cargos (nombre,created_at) values('Developer Frontend','2021-07-15');

/* usuarios*/

insert into usuarios (nombre,apellido,edad,activo,id_cargo,created_at,updated_at) values('Daniel','Giraldo',24,true,1,'2021-07-15','2021-07-15');
insert into usuarios (nombre,apellido,edad,activo,id_cargo,created_at,updated_at) values('Camilo','Giraldo',29,true,2,'2021-07-15','2021-07-15');
insert into usuarios (nombre,apellido,edad,activo,id_cargo,created_at,updated_at) values('Gerardo','Giraldo',60,true,3,'2021-07-15','2021-07-15');
insert into usuarios (nombre,apellido,edad,activo,id_cargo,created_at,updated_at) values('Constanza','Ramirez',50,false,4,'2021-07-15','2021-07-15');


/*mercancia*/

insert into mercancia (nombre,cantidad,activo,usuario_crea,usuario_edita,created_at,updated_at) values('Portatil HP 200',200,true,1,1,'2021-07-15','2021-07-15');
insert into mercancia (nombre,cantidad,activo,usuario_crea,usuario_edita,created_at,updated_at) values('Monitor 800',70,true,1,1,'2021-07-15','2021-07-15');
insert into mercancia (nombre,cantidad,activo,usuario_crea,usuario_edita,created_at,updated_at) values('CPU',900,true,1,1,'2021-07-15','2021-07-15');
insert into mercancia (nombre,cantidad,activo,usuario_crea,usuario_edita,created_at,updated_at) values('Termos',1200,true,1,1,'2021-07-15','2021-07-15');
insert into mercancia (nombre,cantidad,activo,usuario_crea,usuario_edita,created_at,updated_at) values('Cuadernos',20,true,1,1,'2021-07-15','2021-07-15');
insert into mercancia (nombre,cantidad,activo,usuario_crea,usuario_edita,created_at,updated_at) values('Equipo Sonido',25,true,1,1,'2021-07-15','2021-07-15');
insert into mercancia (nombre,cantidad,activo,usuario_crea,usuario_edita,created_at,updated_at) values('Telefono Analogo',63,false,2,2,'2021-06-15','2021-06-15');
insert into mercancia (nombre,cantidad,activo,usuario_crea,usuario_edita,created_at,updated_at) values('Celular NOKIA',7,false,1,1,'2021-07-15','2021-07-15');

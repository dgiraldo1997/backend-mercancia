# Prueba Nexos
## _Back - End_

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

Repositorio del API REST para la prueba de nexos en el cual se pueden gestionar los siguientes modulos:

- Usuarios (crear, editar, listar, eliminar)
- Cargos (crear, editar, listar, eliminar)
- Mercancia (crear, editar, listar, eliminar)
## Tecnologias implementadas

- Spring framework
- Spring boot
- Spring Data
- Spring Web
- REST
- Maven
- Project Lombok
- Junit4


## Importante
Para que hibernate cree las tablas automaticamente por primera vez:
1.Crear la Base de Datos en MySql
2.descomentar la siguiente linea en application.properties

```sh
#spring.jpa.hibernate.ddl-auto=create
```

## Documentacion Swagger
Se implementa el modulo de swagger para poder documentar y testear los endpoints del aplicativo, 
una vez el backend este inicializado vamos a la Url [Swagger] 



## Video de presentación


- [Video] - muestra de la estructura

## License

MIT

**Free Software, Yeah!**

[Video]: <https://drive.google.com/file/d/1u6bGZ2va4X6tjvVddkW5r3OGU8fsBnJm/view?usp=sharing>
[Swagger]: <http://localhost:8080/swagger-ui.html>
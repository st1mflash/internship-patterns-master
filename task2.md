## Задача 2. Builder

### Описание
> В проекте есть сущность кредитной заявки `Application`. 
> 
> У заявки есть обязательные параметры:
> * `name`
> * `client` 
> * `creditAmount`
> * `creditTerm`

### Необходимо:
Применить Builder для создания Application, избежав дополнительных созданий объекта во время "сборки" заявки - все параметры должны проставляться за раз. 
Необязательные строковые параметры по умолчанию пустой строкой.
Не забудьте про обязательные параметры!

> Lombok'ом пользоваться нельзя!

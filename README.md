<details>

  <summary>Урок №4</summary>
  
# Java Core (семинары)
## Урок 4. Обработка исключений
### 1. Доделать задания про интернет-магазин. Обработать исключения, показывать "говорящие" сообщения о том, что пошло не так.
#### Пример обработки исключения NullPointerException
![image](https://github.com/yurkovawika/JavaCoreLesson4/assets/102153972/d3c013c1-387e-45d3-a3d8-2543d985efc8)


### 2. В класс покупателя добавить [перечисление](https://github.com/yurkovawika/JavaCoreLesson4/blob/master/src/Gender.java) с гендерами, добавить в объекты [покупателей](https://github.com/yurkovawika/JavaCoreLesson4/blob/master/src/Shopper.java) свойство «пол» со значением созданного перечисления. Добавить геттеры, сеттеры.

### 3. Добавить перечисление с праздниками (нет праздника, Новый Год, 8 марта, 23 февраля).
### В метод оформления заказа добавить параметр - дата заказа (можно сразу использовать значение из перечисления), при создании заказа проверять значение перечисления и пол покупателя. 
### Делать скидку мужчинам - на 23 февраля, женщинам на 8 марта в размере 15%, всем на Новый год в размере 20%. В заказе указывать общую сумму со скидкой.

#### Пример заказа 23 февраля:
![3](https://github.com/yurkovawika/JavaCoreLesson4/assets/102153972/8b273d5c-b49c-4969-8a6e-585eb48498fb)

#### Пример заказа 31 декабря:
![4](https://github.com/yurkovawika/JavaCoreLesson4/assets/102153972/e4d19e85-2eb3-42f3-8954-6c57aa3a9c3b)
</details>

<details>

  <summary>Урок №5</summary>
# Урок 5. Тонкости работы

## Дописать сохранение объектов магазина в файлы, соответсвующие типам объектов.
### При записи можно
### а) перезаписывать файл полностью
### б) * дописывать новые объекты в тот же файл

#### Создан класс [ExportData](https://github.com/yurkovawika/JavaCoreLesson4/blob/master/src/ExportData.java), который содержит методы, для сохранения данных в файлы.
![1](https://github.com/yurkovawika/JavaCoreLesson4/assets/102153972/5923a8f9-8199-4017-8b76-94d5a241f8fe)

#### Методы созданы для каждого класса отдельно. Каждый метод открывает указываемый файл, и создаёт новый если такого нет.
![2](https://github.com/yurkovawika/JavaCoreLesson4/assets/102153972/d53add1c-b96c-4f46-bb8c-5feb40f13bbc)

#### Напримере списка с продуктами. У нас уже есть некоторый список [products.txt](https://github.com/yurkovawika/JavaCoreLesson4/blob/master/products.txt)
![3](https://github.com/yurkovawika/JavaCoreLesson4/assets/102153972/72da4263-0b7e-4131-a298-0cf838744738)

#### С помощью метода saveProduct() сохраняем два созданных продукта с одинаковым названием.
![5](https://github.com/yurkovawika/JavaCoreLesson4/assets/102153972/7756a27b-9406-4306-9c36-99c5c285fc9f)

#### Метод отрабатывает успешно и добавляет только 1 позицию, так как названия совпадают.
![4](https://github.com/yurkovawika/JavaCoreLesson4/assets/102153972/eb301989-ea22-4ef0-b6ff-1309681bf1e3)

</details>

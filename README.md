Пример из книги Гонсалвес Энтони "Изучаем Java EE"
===
Схема со всеми классами, необходимыми для запуска и точки внедрения: 
![](https://github.com/AlyonaGil/bookstore-JavaEE/blob/master/src/main/jpg/img.png?raw=true)

* Компонент **BookService** имеет метод для создания Java-объектов 
  **Book**;

* Интерфейс **NumberGenerator** имеет две реализации для генерации 
  номеров ISBN и ISSN **(IsbnGenerator и IssnGenerator)** и одну 
  альтернативную реализацию, чтобы генерировать имитационные номера 
  для интеграционных тестов **(MockGenerator)**;
  
* Реализации **NumberGenerator** используют два квалификатора, 
  чтобы избежать неоднозначного внедрения зависимости: 
  **@ThirteenDigits** и **@EightDigits**;
  
* **LoggingProducer** делает возможным внедрение **Logger** 
  благодаря методу-производителю. **LoggingInterceptor** в паре с 
  перехватчиком **Loggable** позволяет компонентам CDI сохранять 
  в журнал записи о методах;
  
* Класс **org.bookstore.App** использует **BookService**, чтобы создать **Book** 
  и сгенерировать номер с помощью **IsbnGenerator**. Интеграционный 
  тест **BookServiceIT** использует альтернативу **MockGenerator** для 
  генерации имитационного номера книги.
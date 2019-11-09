package RunApp;
/**
 * Создание основного класса приложения
 *
 * Этот последний шаг заключается в создании класса конфигурации и запуска приложения.
 * Spring Boot поддерживает новую аннотацию @SpringBootApplication, которая
 * эквивалентна использованию @Configuration, @EnableAutoConfiguration и @ComponentScan с их атрибутами по умолчанию
 * Таким образом, вам просто нужно создать класс, аннотированный с
 * помощью @SpringBootApplication, а Spring Boot включит автоматическую настройку и
 * отсканирует ваши ресурсы в текущем пакете:
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApp {
    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
    }
}

package ifsc.edu.com.concorrente.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private CalculadoraClient calculadoraClient;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) {
        int i = calculadoraClient.somar(10, 2);
        int j = calculadoraClient.subtrair(10, 2);

        System.out.println("i: " + i + ", j: " + j);
    }
}
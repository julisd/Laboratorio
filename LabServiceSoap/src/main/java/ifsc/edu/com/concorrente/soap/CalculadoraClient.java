package ifsc.edu.com.concorrente.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculadoraClient {

    @Autowired
    private CalculatorService calculadoraService;

    public int somar(int a, int b) {
        return calculadoraService.somar(a, b);
    }

    public int subtrair(int a, int b) {
        return calculadoraService.subtrair(a, b);
    }
}


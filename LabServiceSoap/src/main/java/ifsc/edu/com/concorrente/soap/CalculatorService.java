package ifsc.edu.com.concorrente.soap;


import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@Service
@WebService(serviceName = "calculadora")
public class CalculatorService {

    @WebMethod(operationName = "somar")
    public int somar(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        int c = a + b;
        return c;
    }

    @WebMethod(operationName = "subtrair")
    public int subtrair(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        int c = a - b;
        return c;
    }


}

package ifsc.edu.br.rest.LabRest;

import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.UriInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class OlaMundo {

    public static void main(String[] args) {
        SpringApplication.run(OlaMundo.class, args);
    }

    @Context
    private UriInfo context;

    public OlaMundo() {
    }

    @GetMapping("/olamundo")
    public String olaTexto() {
        return "Ola Mundo";
    }

    @GetMapping("/olamundo/{nome}")
    public String olaOutroXML(@PathVariable("nome") String n) {
        return "Olá" + " " + n;
    }

    @PostMapping("/olamundo")
    public String recebeParametroViaFORM(@RequestParam("nome") String nome) {
        return   nome;
    }
}
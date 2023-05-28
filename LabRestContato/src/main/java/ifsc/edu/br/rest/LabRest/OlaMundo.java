package ifsc.edu.br.rest.LabRest;

import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.Response;
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
    public Response olaOutroXML() {
        Contato contato = new Contato("João", "123456789", "joao@example.com");
        return Response.ok(contato).build();
    }

    @PostMapping("/olamundo")
    public Response recebeParametroViaFORM(@RequestParam("nome") String nome) {
        Contato contato = new Contato(nome, "999999999", "contato@example.com");
        return Response.ok(contato).build();
    }
}
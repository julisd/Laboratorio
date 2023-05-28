package ifsc.edu.br.rest.LabRest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ClientRest {
    private final RestTemplate restTemplate = new RestTemplate();
        private final String baseUrl = "http://localhost:8080/";

        public String olaJSON() {
            ResponseEntity<String> response = restTemplate.getForEntity(baseUrl + "olamundo", String.class);
            return response.getBody();
        }

        public String olaTexto() {
            ResponseEntity<String> response = restTemplate.getForEntity(baseUrl + "olamundo", String.class);
            return response.getBody();
        }

        public String olaXML() {
            ResponseEntity<String> response = restTemplate.getForEntity(baseUrl + "olamundo", String.class);
            return response.getBody();
        }

        public String olaOutroXML(String nome) {
            ResponseEntity<String> response = restTemplate.getForEntity(baseUrl + "olamundo/" + nome, String.class);
            return response.getBody();
        }

        public void close() {
            // Fecha recursos ou realiza tarefas de limpeza, se necessário
        }
}

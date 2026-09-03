package siga;

// Agora o GravadorMySQL implementa a interface de repositorio
public class GravadorMySQL implements MatriculaRepositorio {

    @Override
    public void gravar(String dados) {
        // Simulacao de gravacao no banco MySQL
        System.out.println("[MySQL] Gravando: " + dados);
    }
}
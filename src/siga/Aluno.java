package siga;

public class Aluno {

    private String nome;
    private String matricula;
    private String email;
    private double media;
    private boolean bolsista;

    public Aluno(String nome, String matricula, String email, double media, boolean bolsista) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        this.media = media;
        this.bolsista = bolsista;
    }

    public String getNome()      { return nome; }
    public String getMatricula() { return matricula; }
    public String getEmail()     { return email; }
    public double getMedia()     { return media; }
    public boolean isBolsista()  { return bolsista; }
}

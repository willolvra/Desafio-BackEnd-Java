package model;

public class Usuario {

    private Long id;
    private String nome;
    private String email;

    protected Usuario() {
    }

    public Usuario(Long id, String nome, String email) {
        this.id = id;
        this.nome = validarNome(nome);
        this.email = validarEmail(email);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = validarEmail(email);
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = validarNome(nome);
    }

    private String validarNome(String nome){
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("O nome eh obrigatorio");
        } else {
            return nome;
        }
    }

    private String validarEmail(String email){
        if(email == null || email.isBlank()){
            throw new IllegalArgumentException("O email eh obrigatorio");
        } else {
            return email;
        }
    }

}

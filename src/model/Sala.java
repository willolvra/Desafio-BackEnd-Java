package model;

public class Sala {

    private Long id;
    private String nome;
    private Integer capacidade;
    private boolean ativa = true;

    protected Sala() {
    }

    public Sala(Long id, String nome, Integer capacidade) {
        this.id = id;
        this.nome = validarNome(nome);
        this.capacidade = validarCapacidade(capacidade);
    }

    public boolean isAtiva() {
        return ativa;
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

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = validarCapacidade(capacidade);
    }

    private Integer validarCapacidade(Integer capacidade) {
        if (capacidade == null || capacidade <= 0) {
            throw new IllegalArgumentException("A capacidade tem que ser acima de 0");
        } else {
            return capacidade;
        }
    }

    private String validarNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome nao pode estar vazio");
        } else {
            return nome;
        }
    }

    public void desativar() {
        ativa = false;
    }

    public void ativar() {
        ativa = true;
    }

}

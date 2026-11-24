package model;

import java.time.LocalDateTime;

public class Reserva {

    private Long id;
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private StatusReserva statusReserva;
    private Usuario usuario;
    private Sala sala;

    protected Reserva() {
    }

    public Reserva(Long id, LocalDateTime inicio, LocalDateTime fim, Usuario usuario, Sala sala) {
        this.id = id;
        if (inicio.isAfter(fim) || inicio.isEqual(fim)) {
            throw new IllegalArgumentException("A data de inicio nao pode ser depois do fim e nem igual");
        } else {
            this.inicio = inicio;
            this.fim = fim;
        }
        this.usuario = usuario;
        if (!sala.isAtiva()){
            throw new IllegalStateException("A sala esta inativa");
        }else{
            this.sala = sala;
        }
        statusReserva = StatusReserva.ATIVA;
    }

    public StatusReserva getStatusReserva() {
        return statusReserva;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Sala getSala() {
        return sala;
    }

}

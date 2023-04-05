package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.Objects;

public class Mentoria extends Conteudo{

    private LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.data = data;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public Double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                " Titulo = " + getTitulo() + '\'' +
                ", Descricao = " + getDescricao() + '\'' +
                "Data = " + getData() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mentoria mentoria = (Mentoria) o;
        return  Objects.equals(getTitulo(), mentoria.getTitulo()) && Objects.equals(getDescricao(), mentoria.getDescricao()) && Objects.equals(data, mentoria.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitulo(), getTitulo(), data);
    }
}

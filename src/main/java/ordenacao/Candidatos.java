/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenacao;
import java.time.LocalDate;
/**
 *

 */
public class Candidatos implements Comparable<Candidatos> {
    
    private int id; 
    private String nome; 
    private LocalDate dataNas;
    private Integer nota; 

    public Candidatos(int id, String nome, LocalDate dataNas, Integer nota) {
        this.id = id;
        this.nome = nome;
        this.dataNas = dataNas;
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNas() {
        return dataNas;
    }

    public void setDataNas(LocalDate dataNas) {
        this.dataNas = dataNas;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Candidatos{" + "nota =" + nota  + ", nome=" + nome + ", id=" + id + '}';
    }
    
    @Override
    public int compareTo(Candidatos candidatos) {
        int comparaNota = this.nota.compareTo(candidatos.getNota());
        if (comparaNota == 0) {
            return candidatos.getDataNas().compareTo(this.dataNas);
        }
        return comparaNota;
    }
    
    
}

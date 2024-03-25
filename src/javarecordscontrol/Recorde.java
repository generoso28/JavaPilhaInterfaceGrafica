package javarecordscontrol;
import java.time.LocalDate;

public class Recorde {
    private LocalDate data;
    private String nome;
    private double tempo;
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getTempo() {
        return tempo;
    }
    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    @Override
    public String toString(){
        return "\nNome: " + getNome() +"\nData: " + getData() +  "\nTempo: " + getTempo();
    }
}

package Aula15b;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    

    @Override
    public String toString() {
        return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
    }
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistindo(this.espectador.getTotAssistindo()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }
    public Gafanhoto getEspectador() {
        return espectador;
    }
    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }
    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }

    
}
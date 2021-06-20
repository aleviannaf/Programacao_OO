package Aula15b;

public class Video implements AcoesVideo {

    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    
    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao =1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(Boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    

    @Override
    public void play() {
        this.reproduzindo = true;
        
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
        
    }

    @Override
    public void like() {
       this.curtidas ++;
    }

    @Override
    public String toString() {
        return "Video \n Avaliacao = " + avaliacao + ",\n Curtidas = " + curtidas + ",\n Reproduzindo = " + reproduzindo
                + ", \n Titulo = " + titulo + ", \n Views = " + views + "";
    }
    
    
}

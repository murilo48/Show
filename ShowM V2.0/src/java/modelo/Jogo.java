
package modelo;

import dao.PerguntaDAO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Jogo {
    private List<Pergunta> perguntas;
    private Integer pontuacao;
    private Integer pulos;
    
    public Jogo(){
        this.pulos = 3;
        this.pontuacao = 0;
    }

    public List<Pergunta> getPerguntas() {
        return perguntas;
    }

    public void setPerguntas(List<Pergunta> perguntas) {
        this.perguntas = perguntas;
    }

    public Integer getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Integer pontuacao) {    
        this.pontuacao = pontuacao;
    }

    public Integer getPulos() {
        return pulos;
    }

    public void setPulos(Integer pulos) {
        this.pulos = pulos;
    }
    public void Pulos(Integer pulos){
        
    }
    public void Pontuacao(Integer pontuacao){
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
    }
    public void execPulo(){
        this.pulos=pulos-1;
    }
    
    public Integer AcertouP(){
        return pontuacao * 2;
    }
    public Integer ErrouP(){
        return pontuacao / 3;
    }
    public Integer ParouP(){
        return pontuacao;
    }
    public void iniciar(){
        try {
            PerguntaDAO dao = new PerguntaDAO();
            this.setPerguntas(dao.listar());
        } catch (Exception ex) {
            Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public boolean confirmar(String opcaomarcada){
        if(opcaomarcada.equals(this.getPerguntas().get(0).getCerta()))
        {
            this.getPerguntas().remove(0);
            this.setPontuacao(this.AcertouP());
            return true;
        }
        else{
            return false;
        }
    }
    public boolean pular(Integer pulos){
        if(this.getPulos()!=null){
            this.pulos--;
            return true;
        }
        else{
            return false;
        }
    }
}
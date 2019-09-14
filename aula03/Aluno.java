public class Aluno {

    private String nome;
    private String sobreNome;
    private double nota;

    public void  setNome(String nome){
        if (nome.trim().length() < 3){
            throw new IllegalArgumentException("Nome deve ter no minimo 3 caracteris");
        }
        if (nome == null) {
            throw new IllegalArgumentException("Nome ñ pode ser nula");
        }
        if(nome .trim().length()>20){
            throw new IllegalArgumentException("Nome deve ter no maximo 20 caracteris");
        }
        if(nome.trim().equals("")){
            throw new IllegalArgumentException("Nome deve ser preenchido");
        }
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setSobrenome(String sobreNome){
           if (sobreNome == null) {
            throw new IllegalArgumentException("Sobre Nome ñ pode ser nula");
        }    
        
        if (sobreNome.trim().length() < 5){
            throw new IllegalArgumentException("sobre Nome deve ter no minimo 5 caracteris");
        }
 
        if(sobreNome .trim().length()>50){
            throw new IllegalArgumentException("Sobre Nome deve ter no maximo 50 caracteris");
        }
        if(sobreNome.trim().equals("")){
            throw new IllegalArgumentException("Sobre Nome deve ser preenchido");
        }
        this.sobreNome = sobreNome;
    }
    public String getSobreNome(){
        return sobreNome;
    }
    public void setNota(double nota){
        if(nota < 0){
            throw new IllegalArgumentException(" nota deve ser maior que 0 ");
        }
        if(nota > 10){
            throw new IllegalArgumentException("nota deve ser menor que");
        }
        this.nota = nota;
    }
    public double getNota(){
        return nota;
    }
    
}
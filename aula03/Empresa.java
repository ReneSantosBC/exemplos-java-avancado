
public class Empresa {

    private String razaoSocial;
    private String cnpj;
    private double faturamento;

    public void setFaturamento(double faturamento){
        if(faturamento < 0){
            throw new IllegalArgumentException("Faturamento deve ser igual ou maior a 0");
        }
        this.faturamento = faturamento;
    }
    public double getFaturamento(){
        return faturamento;
    }
    public void setRazaoSocial(String razaoSocial) {
        if (razaoSocial == null) {
            throw new IllegalArgumentException("Razão social ñ pode ser nula");
        }
        if (razaoSocial.trim().equals("")) {
            throw new IllegalArgumentException("Razão social deve ser preenchida");
        }
        if (razaoSocial.trim().length() < 3) {
            throw new IllegalArgumentException("Razão Social deve conter no mínimo 3 caracteris");
        }
        if (razaoSocial.trim().length() > 60) {
            throw new IllegalArgumentException("Razão social deve conter no maximo 60 caracteris");
        }

        this.razaoSocial = razaoSocial;
    }
    public String getRazaoSocial() {

        return razaoSocial;
    }
    public void setCNPJ(String cnpj) {
        if (cnpj == null) {
            throw new IllegalArgumentException("CNPJ ñ pode ser nula");
        }

        if (cnpj.trim().length() < 18) {
            throw new IllegalArgumentException("CNPJ deve conter no mínimo 18 caracteris");
        }
        if (cnpj.trim().length() > 18) {
            throw new IllegalArgumentException("CNPJ deve conter no maximo 18 caracteris");
        }
        this.cnpj = cnpj;
    }
    public String getCNPJ() {

        return cnpj;
    }

}
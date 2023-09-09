package locate.car.ADA.models.Pessoas;

public abstract class Pessoa {

    protected String endereco;
    protected String contato;
    protected String identificador;

    public Pessoa(String endereco, String contato, String identificador) {
        this.endereco = endereco;
        this.contato = contato;
        this.identificador = identificador;

        BaseClientes baseClientes = BaseClientes.getInstancia();
        baseClientes.adicionarCliente(this);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public abstract String getNome();
}

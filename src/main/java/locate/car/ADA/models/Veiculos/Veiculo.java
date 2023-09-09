package locate.car.ADA.models.Veiculos;

import java.util.HashSet;
import java.util.Set;

public abstract class Veiculo {

    private static final Set<String> placasUnicas = new HashSet<String>();

    protected String placa;
    protected String marca;
    protected String modelo;
    protected String ano;
    protected String cor;
    protected TipoVeiculo tipoVeiculo;

    public Veiculo(String placa, String marca, String modelo, String ano, String cor, TipoVeiculo tipoVeiculo) {

        if (placasUnicas.contains(placa)) {
            throw new IllegalArgumentException("Veículo já cadastrado");
        }

        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.tipoVeiculo = tipoVeiculo;

        placasUnicas.add(this.placa);

        Frota frota = Frota.getInstancia();
        frota.adicionarVeiculo(this);
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano='" + ano + '\'' +
                ", cor='" + cor + '\'' +
                ", tipoVeiculo=" + tipoVeiculo +
                '}';
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        placasUnicas.remove(this.placa);

        if (placasUnicas.contains(placa)) {
            throw new IllegalArgumentException("Veículo já cadastrado");
        }

        this.placa = placa;
        placasUnicas.add(placa);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

}

class Carro {
    private String marca;
    private String motor;
    private String cor;
    private int ano;
    private boolean automatico;
    private int portas;
    private boolean tetoSolar;

    private Carro(CarroBuilder builder) {
        this.marca = builder.marca;
        this.motor = builder.motor;
        this.cor = builder.cor;
        this.ano = builder.ano;
        this.automatico = builder.automatico;
        this.portas = builder.portas;
        this.tetoSolar = builder.tetoSolar;
    }

    @Override
    public String toString() {
        return "Carro: " + marca + ", Motor: " + motor + ", Cor: " + cor + ", Ano: " + ano + ", Automático: " + automatico + ", Portas: " + portas + ", Teto Solar: " + tetoSolar;
    }

    public static class CarroBuilder {
        private String marca;
        private String motor;
        private String cor;
        private int ano;
        private boolean automatico;
        private int portas;
        private boolean tetoSolar;

        public CarroBuilder setMarca(String marca) {
            this.marca = marca;
            return this;
        }

        public CarroBuilder setMotor(String motor) {
            this.motor = motor;
            return this;
        }

        public CarroBuilder setCor(String cor) {
            this.cor = cor;
            return this;
        }

        public CarroBuilder setAno(int ano) {
            this.ano = ano;
            return this;
        }

        public CarroBuilder setAutomatico(boolean automatico) {
            this.automatico = automatico;
            return this;
        }

        public CarroBuilder setPortas(int portas) {
            this.portas = portas;
            return this;
        }

        public CarroBuilder setTetoSolar(boolean tetoSolar) {
            this.tetoSolar = tetoSolar;
            return this;
        }

        public Carro build() {
            return new Carro(this);
        }
    }
}

class Diretor {
    public Carro construirCarroEsportivo() {
        return new Carro.CarroBuilder()
                .setMarca("Ferrari")
                .setMotor("V8 Turbo")
                .setCor("Vermelho")
                .setAno(2024)
                .setAutomatico(true)
                .setPortas(2)
                .setTetoSolar(true)
                .build();
    }

    public Carro construirCarroPopular() {
        return new Carro.CarroBuilder()
                .setMarca("Fiat")
                .setMotor("1.0 Flex")
                .setCor("Branco")
                .setAno(2023)
                .setAutomatico(false)
                .setPortas(4)
                .setTetoSolar(false)
                .build();
    }
}

public class Main {
    public static void main(String[] args) {
        Diretor diretor = new Diretor();
        Carro esportivo = diretor.construirCarroEsportivo();
        Carro popular = diretor.construirCarroPopular();

        System.out.println(esportivo);
        System.out.println(popular);
    }
}
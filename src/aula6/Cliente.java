package aula6;

    public class Cliente {
        public String nome;
        public String cpf;
        public Float saldo;

        public Cliente() {
        }

        public Cliente(String nome, String cpf, Float saldo) {
            this.nome = nome;
            this.cpf = cpf;
            this.saldo = saldo;
        }

        @Override
        public String toString() {
            return "Cliente{" +
                    "nome='" + nome + '\'' +
                    ", cpf='" + cpf + '\'' +
                    ", saldo=" + saldo +
                    '}';
        }

        public String getNome() {
            return nome;
        }

        public String getCpf() {
            return cpf;
        }

        public Float getSaldo() {
            return saldo;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public void setSaldo(Float saldo) {
            this.saldo = saldo;
        }
    }

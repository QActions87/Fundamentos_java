package exercicios;

import java.util.Arrays;

public class Curriculo {
        public String nome = "Tiago Mota";
        public Integer idade = 38;
        public String[] competencias = { "QA Java" };
        public String[] experiencias = { "Técnico de redes", "QA" };

        public String sobreMim() {
            return "Olá, eu sou " + nome + ", tenho " + idade + " anos, trabalho com " + Arrays.toString(competencias) + ", e minhas experiências foram " + Arrays.toString(experiencias);
        }
    }
}
package Model;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Emprestimo {

    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo() {
    }

    public Emprestimo(LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        if (dataEmprestimo == null || dataDevolucao == null) {
            throw new IllegalArgumentException("As datas de empréstimo e devolução não podem ser nulas.");
        }
        if (dataDevolucao.isBefore(dataEmprestimo)) {
            throw new IllegalArgumentException("A data de devolução não pode ser anterior à data de empréstimo.");
        }
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public long calcularDiasEmprestimo() {
        return ChronoUnit.DAYS.between(dataEmprestimo, dataDevolucao);
    }

    public double calcularValorDevido() {
        long diasEmprestimo = calcularDiasEmprestimo();

        if (diasEmprestimo <= 7) {
            return 5.0;
        } else {
            long diasExtras = diasEmprestimo - 7;
            return 5.0 + (diasExtras * 1.0);
        }
    }
}
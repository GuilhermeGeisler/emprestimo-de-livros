/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class EmprestimoTest {
    
    @Test
    public void calcularValorDevidoCincoDias(){
        Emprestimo emprestimo = new Emprestimo(LocalDate.of(2024, 12, 01),LocalDate.of(2024, 12, 05));
        assertEquals(5, emprestimo.calcularValorDevido(), 0.00);
    }
    
    @Test
    public void calcularValorDevidoDezDias() {
        Emprestimo emprestimo = new Emprestimo(LocalDate.of(2024, 12, 01), LocalDate.of(2024, 12, 10));
        assertEquals(7, emprestimo.calcularValorDevido(), 0.00);
    }
    
    @Test
    public void calcularDiasEmprestimo() {
        Emprestimo emprestimo = new Emprestimo(LocalDate.of(2024, 12, 01), LocalDate.of(2024, 12, 10));
        assertEquals(9, emprestimo.calcularDiasEmprestimo(), 0.00);
    }
}

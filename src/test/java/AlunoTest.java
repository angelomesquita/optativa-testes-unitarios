
import org.junit.Test;
import static org.junit.Assert.*;
import personal.optativatestesunitarios.Aluno;


public class AlunoTest {
    
    @Test
    public void testQuandoONomedoAlunoEhSetado() {
        
        Aluno aluno = new Aluno();
        
        aluno.setNome("Caio");
        
        assertEquals("Caio", aluno.getNome());    
    }
    
    @Test
    public void testQuandoORAdoAlunoEhSetado() {
        Aluno aluno = new Aluno();
        
        aluno.setRa("2020100003");
        
        assertEquals("2020100003", aluno.getRa());    
    }
    
}



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class AlumnoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AlumnoTest
{
    private ClaseDam claseDam1;
    private Alumno alumno1;
    private Alumno alumno2;
    private Alumno alumno3;
    private Alumno alumno4;
    private Alumno alumno5;

    
    
    
    
    
    

    /**
     * Default constructor for test class AlumnoTest
     */
    public AlumnoTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        claseDam1 = new ClaseDam(25);
        claseDam1.getNumeroDeAlumnos();
        alumno1 = new Alumno("Javier Garcia", "4567", 21);
        alumno2 = new Alumno("Laura Gómez", "2238", 19);
        alumno3 = new Alumno("Estefanía Sáenz", "9987", 22);
        alumno4 = new Alumno("Rodrigo Cifuentes", "2290", 19);
        alumno5 = new Alumno("Mauro López", "3387", 20);
        claseDam1.getNumeroDeAlumnos();
        claseDam1.imprimeDetalles();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}

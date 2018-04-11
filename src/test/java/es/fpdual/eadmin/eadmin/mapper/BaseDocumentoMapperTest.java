package es.fpdual.eadmin.eadmin.mapper;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import es.fpdual.eadmin.eadmin.modelo.Documento;
import es.fpdual.eadmin.eadmin.modelo.EstadoDocumento;

public abstract class BaseDocumentoMapperTest {
	
	private Documento documento;
	
	@Autowired
	private DocumentoMapper maper;
	
	@Before
	public void inicializarEnCadaTest() {
		
		Date FECHA = new Date();
		this.documento = new Documento(1, "documento1", FECHA, FECHA, true, EstadoDocumento.ACTIVO);
	}
	
	@Test
	public void deberiaInsertarUnDocumento() throws Exception {
				
		maper.insertarDocumento(documento);
		
		final int resultado = this.maper.insertarDocumento(documento);
		
		assertThat(resultado, is(1));
		
	}

}
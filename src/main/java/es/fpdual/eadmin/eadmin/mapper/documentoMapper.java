package es.fpdual.eadmin.eadmin.mapper;

import org.apache.ibatis.annotations.Param;
import es.fpdual.eadmin.eadmin.modelo.Documento;

public interface documentoMapper {
	
	void insertarDocumento (@Param("documento") Documento documento);
	
	//es/fpdual/eadmin/eadmin/mapper
}

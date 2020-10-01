package com.mx.org.bbb.concentradora.servicio.transacciones.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.mx.org.bbb.concentradora.servicio.transacciones.models.entity.TransaccionOut;

@RepositoryRestResource(path = "transacciones-salida")
public interface TransaccionOutRepository extends PagingAndSortingRepository<TransaccionOut, Long> {

	@RestResource(path = "buscar-folio")
	public TransaccionOut findByFolio(@Param("folio") String folio);

}

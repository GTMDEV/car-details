package com.packt.cardatabase.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

//@RepositoryRestResource(path="vehicles")
public interface CarRepository extends CrudRepository<Car, Long> {

	// by brand

	List<Car> findByBrand(@Param("brand") String brand);

	// by color
	List<Car> findByColor(@Param("color") String color);

	// by manufacture year
	List<Car> findByManufactureYear(int manufactureYear);

	// by brand and model
	List<Car> findByBrandAndModel(String brand, String model);

	// by brand or color
	List<Car> findByBrandOrColor(String brand, String color);

	// by brand and sort by year

	List<Car> findByBrandOrderByManufactureYearAsc(String brand);

	// by brand using sql

	@Query("select c from Car c where c.brand like %?1")
	List<Car> findByBrandEndsWith(String brand);

}

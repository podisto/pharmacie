package net.atos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import net.atos.domain.BaseEntity;

@NoRepositoryBean
public interface BaseDAO<T extends BaseEntity> extends JpaRepository<T, Integer> {
	
}

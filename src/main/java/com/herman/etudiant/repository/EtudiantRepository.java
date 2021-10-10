package com.herman.etudiant.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.herman.etudiant.Entity.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
  public List<Etudiant> findByNom(String n);
  public Page<Etudiant> findByNom(String n ,Pageable pageable);
  @Query("select e from Etudiant e where e.nom like :x")
  public Page<Etudiant> chercherEtudiant(@Param("x") String n ,Pageable pageable);
  @Query("select e from Etudiant e where e.dateDeNaissance > :x and e.dateDeNaissance < :y")
  public List<Etudiant> chercherEtudiant(@Param("x") Date t1 , @Param("y") Date t2);

}

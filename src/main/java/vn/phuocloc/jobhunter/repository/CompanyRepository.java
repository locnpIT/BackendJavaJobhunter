package vn.phuocloc.jobhunter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import vn.phuocloc.jobhunter.domain.Company;
import java.util.Optional;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long>,
        JpaSpecificationExecutor<Company> {

    public Company save(Company c);

    public Optional<Company> findById(long id);
}

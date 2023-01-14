package group.gyl.bancospring.repository;

import group.gyl.bancospring.models.DebitCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DebitCardRepository extends JpaRepository<DebitCard, Long> {
}

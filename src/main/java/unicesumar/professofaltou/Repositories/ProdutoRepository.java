package unicesumar.professofaltou.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import unicesumar.professofaltou.Models.ProdutoModel;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
}

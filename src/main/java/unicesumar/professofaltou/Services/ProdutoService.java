package unicesumar.professofaltou.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unicesumar.professofaltou.Models.ProdutoModel;
import unicesumar.professofaltou.Repositories.ProdutoRepository;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public ProdutoModel cadastrarProduto(ProdutoModel produtoModel) {
        return produtoRepository.save(produtoModel);
    }

    public List<ProdutoModel> listarProdutos() {
        return produtoRepository.findAll();
    }

    public ProdutoModel atualizarProduto(Long id, ProdutoModel produtoModel) {
        ProdutoModel newProduto = produtoRepository.findById(id).get();

        newProduto.setNome(produtoModel.getNome());
        newProduto.setPreco(produtoModel.getPreco());
        newProduto.setQuantidadeEmEstoque(produtoModel.getQuantidadeEmEstoque());
        return produtoRepository.save(newProduto);
    }

    public void removerProduto(Long id) {
        produtoRepository.deleteById(id);
    }
}

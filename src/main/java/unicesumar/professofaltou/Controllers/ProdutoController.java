package unicesumar.professofaltou.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import unicesumar.professofaltou.Models.ProdutoModel;
import unicesumar.professofaltou.Services.ProdutoService;

import java.util.List;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    private List<ProdutoModel> listarProdutos(){
        return produtoService.listarProdutos();
    }

    @PostMapping
    private ProdutoModel cadastrarProduto(@RequestBody ProdutoModel produto){
        return produtoService.cadastrarProduto(produto);
    }

    @PutMapping("/{id}")
    private ProdutoModel atualizarProduto(@PathVariable Long id, @RequestBody ProdutoModel produto){
        return produtoService.atualizarProduto(id, produto);
    }

    @DeleteMapping("/{id}")
    private void removerProduto(@PathVariable Long id){
        produtoService.removerProduto(id);
    }

}

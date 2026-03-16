import java.util.Optional;

/* * ARQUIVO DE ESTUDO: INVERSÃO DE RESPONSABILIDADE
 * Localização: docs/nivel-1/boas-praticas/
 * Nota: Os erros de import do Spring ocorrem porque esta pasta não é um projeto Maven/Spring.
 */

// --- ABORDAGEM 1: COMO ESTÁ HOJE (Lógica no Controller) ---

class ProdutoControllerAntes {
    private final ProdutoServiceAntes service;

    public ProdutoControllerAntes(ProdutoServiceAntes service) {
        this.service = service;
    }

    public Object getById(String id) {
        Optional<String> produto = service.buscar(id);
        
        if (produto.isPresent()) {
            return "Retorna 200 OK com " + produto.get();
        } else {
            return "Retorna 404 NOT FOUND";
        }
    }
}

class ProdutoServiceAntes {
    public Optional<String> buscar(String id) {
        return Optional.empty(); 
    }
}

// --- ABORDAGEM 2: COMO DEVE SER (Lógica no Service) ---

class ProdutoControllerDepois {
    private final ProdutoServiceDepois service;

    public ProdutoControllerDepois(ProdutoServiceDepois service) {
        this.service = service;
    }

    public Object getById(String id) {
        // O Controller apenas chama. A lógica de erro está protegida no Service.
        return service.buscarOuFalhar(id);
    }
}

class ProdutoServiceDepois {
    public String buscarOuFalhar(String id) {
        boolean existe = false; 
        
        if (!existe) {
            // Aqui o Service assume a responsabilidade do erro
            throw new RuntimeException("Produto não encontrado: " + id);
        }
        return "Produto Exemplo";
    }
}

public class refatoracao {
    public static void main(String[] args) {
        System.out.println("Exemplo de estudo carregado.");
    }
}
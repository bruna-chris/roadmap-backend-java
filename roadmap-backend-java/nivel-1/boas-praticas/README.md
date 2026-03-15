# 🛠️ Boas Práticas de Programação em Java

Nesta seção, documento meu aprendizado sobre como escrever código limpo, legível e de fácil manutenção. O foco aqui não é apenas fazer o código "funcionar", mas sim torná-lo profissional.

## 📖 Conceitos Chave

### 1. Clean Code (Código Limpo)
- **Nomes Significativos:** Variáveis e métodos devem revelar sua intenção (ex: `int diasAteVencimento` em vez de `int d`).
- **Funções Pequenas:** Cada método deve fazer apenas uma coisa e fazê-la bem.
- **Comentários:** Devem ser usados apenas quando o código não consegue ser autoexplicativo.

### 2. Princípios SOLID (Início)
- **SRP (Responsabilidade Única):** Uma classe deve ter apenas um motivo para mudar.

---

## 🏋️ Exercícios Práticos

### Exercício 1: Refatoração de Nomes
**Objetivo:** Pegar um código antigo seu e renomear todas as variáveis e métodos seguindo o padrão *camelCase* e usando nomes que descrevam exatamente o que o dado representa.

### Exercício 2: O Desafio do Método Único
**Cenário:** Crie uma classe `ProcessadorPedido`.
- Em vez de ter um método gigante `processar()`, divida-o em:
  - `validarEstoque()`
  - `calcularFrete()`
  - `gerarNotaFiscal()`
- **Regra:** Nenhum método pode ter mais de 10 linhas.

### Exercício 3: Praticando o DRY (Don't Repeat Yourself)
- Identifique um trecho de código que você repetiu em dois lugares diferentes e crie um método utilitário para centralizar essa lógica.

---

## Relacionamento entre classes:

2) Has-Many (tem vários): é uma relação ao qual uma classe A possui várias referências a uma classe B.

Exemplo: Em uma loja on-line, vende-se produtos de tecnologia, escritório ou alimentícios. Um cliente da loja possui um carrinho de compras com os produtos desejados. Todo produto possui nome, tipo e preço. O carrinho pode listar os produtos, calcular o total a pagar, calcular o total a pagar por tipo, inserir, buscar e remover produto.

# Carrinho <<class>>
-Produto[] produto
+void inserir()
+void remover()
+void listar()
+void buscar(String nome)
+double calcularTotal()
+double calcularPorTipo()

# Produto <<class>>
-String nome
-double preço
-TipoDeProduto tipo
+void mostrar()
+double getPreço()
+boolean verificarTipo()

# TipoDeProduto <<enum>>
+Tecnologia
+Escritório
+Alimento

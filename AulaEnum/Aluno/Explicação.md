# Enumeração

 São tipos de dados que restringem seus valores a um número finito de opções.

# Atributos

 a) Leitura: é quando usamos um atributo em uma expressão.
      int x = obj.atributo+5;
      System.out.println(obj.atributo);

 b) Escrita: é quando usamos o atributo ao lado esquerdo da atribuição.
      obj.atributo = 7;
    Leitura + Escrita? Sim
    obj.atributo = obj.atributo+1;

 Método
 c) Chamada: é quando invocamos um método
      Obj.metodo();

# Modificadores de Acesso

 public: libera acesso de um membro p/ toda classe

 default (no modifier): libera acesso p/ classes no mesmo pacote (mesma pasta);

 private: libera acesso apenas para a própria classe apenas;

 protected: herança (subclasse) e pacote

# OBS:

Maioria dos casos:
Método/construtor -> public
Atributo -> private

# Métodos Getter e Setter

Getter: Libera acesso de leitura
Setter: Libera acesso de escrita


 
# Modelagem inicial
-----------------------------------------------------

[caixa]
Recibo v
	//* Lista<Produto>
	* CarrinhoDeCompra //Voltei para o carrinho porque assim consigo usar o método que retorna uma produto não modificável.
	* FormaDePagamento
	* Cliente	
	:: Recibo(FormaDePagamento, CarrinhoDeCompra, Cliente)
	:: void imprimeRecibo() //Imprime os atributos.
Checkout
	* Recibo recibo
	:: checkout(FormaDePagamento, Lista<Produto>, Cliente){
		recibo = new Recibo(FormaDePagamento, Lista<Produto>, Cliente)
	}
	:: Recibo getRecibo

CarrinhoDeCompra
	* Set<Produto>
	:: void adicionaProduto(Produto)
	:: Set<Produto> getProdutos() //retorna set não modificável
		
[pagamento]
FormaDePagamento
	Boleto
	Cartao
		AVista
		Parcelado
		
	BBPay
PagamentoDao
	* Lista<FormaDePagamento> formasDePagamento <- {news...}
	:: Lista<FormaDePagamento> getFormasDePagamento() //Cria todos os tipos

[produtos]
produto v
	* String nome
	* BigDecimal preco
	* CategoriaProduto
		
produtoDao v
	* Lista<Produto> produtos <- {news...}
	:: Lista<Produto> getProdutos()
[clientes]
Cliente v
	* nome

Sessão v
	* Lista<Produto> carrinho <- {}
	* Cliente <- clt
	* Lista<Produto> estoque <- produtoDao.getProdutos()

	:: sessao(Cliente clt)
	:: lista<Produto> getProdutos
	:: adicionaProdutoNoCarrinho(Produto)
	:: removerProdutoDoCarrinho(Produto)
	:: lista<FormaDePagamento> getFormaDePagamento()
	:: Recibo realizaCheckout(FormaDePagamento){
		Checkout checkout = new Checkout(FormaDePagamento, Lista<Produto>, Cliente)
		return getRecibo()
	}
 	


-------------------------------------------------------
#Author: jonathan.marin@sophossolutions.com


Feature: Compra de articulo en la pagina Inkafarma de Peru
  Como usuario web
  Yo quiero comprar un articulo en la pagina Inkafarma de Peru
  Para verificar el articulo en el carrito de compras

  @tag1
  Scenario Outline: Compra de articulo en Pagina Web  
    Given que Jonathan esta en la Pagina Inkafarma de Peru
    When el quiere buscar el "<Articulo>" y comprarlo en la pagina 
    Then deberia de ver el "<Articulo>" en carrito de compras
   
   
   Examples:   
   		|  Articulo  |
   		|  Antitranspirante Dermoaclarant en Spray Dove 48 horas\nDesodorante(Frasco 150ml) |
   
   
   

    
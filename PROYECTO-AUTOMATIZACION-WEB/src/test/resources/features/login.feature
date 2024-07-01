
@testfeature
Feature: Prueba de pagina Juntoz
  Yo, como usuario de Juntoz
  Quiero, seleccionar productos
  Para poder agregarlos al carrito de compras

  @test1
  Scenario: Agregar producto a carrito
    Given que me encuentro en la página  de Juntoz "https://juntoz.com/"
    When voy a la seccion de login inicio sesión con las credenciales usuario: "nicol.09ar@gmail.com" y contraseña: "juntoznicol13A"
    Then valido que me he autenticado correctamente
    And ingreso la categoría "Envio Gratis" y selecciono el primer producto
    And lo gregago al carrito
    And Validar que se haya agregado exitosamente al Carrito

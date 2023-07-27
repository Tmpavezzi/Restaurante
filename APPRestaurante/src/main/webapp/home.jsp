<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <!DOCTYPE html>
  <html>

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="home.css">
    <link rel="stylesheet" type="text/css" href="header.css">
    <title>Página Home</title>

    <script>
      document.addEventListener("DOMContentLoaded", function () {
        const bannerImages = document.querySelectorAll(".banner img");
        let currentImageIndex = 0;

        function showNextImage() {
          bannerImages[currentImageIndex].classList.remove("active");
          currentImageIndex = (currentImageIndex + 1) % bannerImages.length;
          bannerImages[currentImageIndex].classList.add("active");
        }
        setInterval(showNextImage, 3000);
      });
    </script>
  </head>

  <body>
    <header>
      <div class="logo">
        <img src="restaurante.png" width="85px" alt="Logo da empresa">
      </div>
      <nav>
        <ul>
          <li><span class="underline"><a href="home.jsp">Home</a></span></li>
          <li><span class="underline"><a href="#">Cardápio</a></span></li>
          <li><span class="underline"><a href="sobre.jsp">Sobre Nós</a></span></li>
        </ul>
      </nav>
      <div class="user">
        <span class="underline"><a href="login.jsp">Entrar</a></span>
        <span class="underline"><a href="cadastroCliente.jsp">Cadastrar-se</a></span>
      </div>
      </div>
    </header>

    <div class="banner">
      <img src="prato1.jpg" alt="Imagem 1" class="active">
      <img src="prato2.jpg" alt="Imagem 2">
      <img src="prato3.jpg" alt="Imagem 3">
    </div>

    <div class="content">
      <h2>Prato em Destaque</h2>
      <div class="featured-dish">
        <img src="prato4.jpg" alt="Prato em Destaque">
        <div>
          <h3>Delicioso Prato Famoso e Especial (Virado a Paulista)</h3>
          <p>Experimente nosso prato especial do dia, preparado com ingredientes de qualidade e deliciosos.</p>
          <a href="#">Ver Mais</a>
        </div>
      </div>

      <h2>Nosso Cardápio</h2>
      <p>Aqui você encontra uma variedade de pratos deliciosos, desde entradas até sobremesas.</p>
      <a href="#">Veja o Cardápio Completo</a>
    </div>

    <div class="footer">
      <p>&copy; 2023 Restaurante Pavezzi. Todos os direitos reservados.</p>
    </div>
  </body>

  </html>
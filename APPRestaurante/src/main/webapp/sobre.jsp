<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="sobre.css">
        <title>Sobre nosso Restaurante</title>
        <script>
            document.addEventListener("DOMContentLoaded", function () {
                var img = document.querySelector(".restaurant-img");
                img.addEventListener("click", function () {
                    alert("Bem-vindo ao Restaurante Pavezzi!");
                });
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
                    <li><span class="underline"><a href="cardapio.html">Cardápio</a></span></li>
                    <li><span class="underline"><a href="sobre.jsp">Sobre Nós</a></span></li>
                </ul>
            </nav>
        </header>

        <div class="container">
            <img src="sobre.jpg" alt="Restaurante Pavezzi" class="restaurant-img">
            <div class="restaurant-info">
                <h2>Restaurante Pavezzi</h2>
                <p>Fundado em 2020 na Grande São Paulo</p>
            </div>
            <p class="description">
                O Restaurante Pavezzi é um lugar especial onde você pode saborear os melhores pratos da culinária
                Brasileira. Nossos chefs talentosos combinam ingredientes frescos e sabores únicos para proporcionar uma
                experiência gastronômica inesquecível.
            </p>
            <p class="description">
                Em 2022 fomos considerados um dos melhores restaurantes gastronomicos no Brasil pela grande satisfação
                de
                nossos clientes e admirada pelos nossos consumidores brasileiros e também estrangeiros.
            </p>
            <p class="description">
                Nosso Restaurante está localizado em um dos bairros mais conhecidos de São Paulo por ter sedes
                corporativas
                e vida noturna agitada, o famoso bairro Itaim Bibi, próximo ao famoso Shopping de luxo JK Iguatemi.
            </p>
        </div>
        <iframe
            src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d14626.258415632326!2d-46.69140705688992!3d-23.58407594500396!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x94ce5742bc832a29%3A0xa9323f13433864db!2sItaim%20Bibi%2C%20S%C3%A3o%20Paulo%20-%20SP!5e0!3m2!1spt-BR!2sbr!4v1690421015387!5m2!1spt-BR!2sbr"
            width="600" height="450" style="border:0;" allowfullscreen="" loading="lazy"
            referrerpolicy="no-referrer-when-downgrade"></iframe>

        <div class="footer">
            <p>&copy; 2023 Restaurante Pavezzi. Todos os direitos reservados.</p>
        </div>
    </body>

    </html>
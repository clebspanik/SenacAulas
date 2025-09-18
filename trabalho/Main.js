"use strict";

async function loadGallery() {
  const gallery = document.getElementById("gallery");
  const url = "https://api.thecatapi.com/v1/images/search?limit=10";

  try {
    const response = await fetch(url);
    const cats = await response.json();

    cats.forEach((cat) => {
      const img = document.createElement("img");
      img.src = cat.url;
      gallery.appendChild(img);
    });

    console.log(cats);
  } catch (error) {
    console.error("Erro ao carregar a galeria:", error);
  }
}

loadGallery();

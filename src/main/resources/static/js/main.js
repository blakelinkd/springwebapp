let poster = document.getElementById('poster');
let title = document.getElementById('title');
let plot = document.getElementById('plot');
let searchButton = document.getElementById('searchButton');
let searchInput = document.getElementById('searchInput');


searchButton.addEventListener('click', (event) => {
    findMoive(searchInput.value);
});


const findMoive = async (query) => {
    const response = await fetch(`/movie/${query}`);
    const json = await response.json();
    console.log(json.Title);
    poster.setAttribute('src', json.Poster);
    title.innerText = json.Title;
    plot.innerText = json.Plot;
    
}





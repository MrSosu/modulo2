# Esercizio Film

Si vuole realizzare un'applicazione che permetta di guardare dei film in streaming.
Vorremmo dunque realizzare una classe Film. Di ogni film ci interessa conoscere il titolo, l'anno di uscita, il genere (si supponga ogni film abbia un solo genere), il nome del regista. Poiché inoltre ogni film può essere temporaneamente rimosso dalla piattaforma, vogliamo un campo che indichi che il film sia disponibile o meno, e un campo che indica che il film sta per essere visionato.
La classe deve avere i seguenti metodi:
1) visionaFilm() che permette di visionare un film (se è disponibile).
2) terminaVisione() che permette di terminare la visione di un film in riproduzione.
3) infoFilm() che stampa le informazioni riguardanti quel film

Inoltre realizzare una classe Main nella quale inserire il metodo main. In esso bisogna creare un array contenente 8 film e la classe deve avere i seguenti metodi:
1) infoPerGenere(arr_film, genere) che prende in input l'array dei film e ritorna le informazioni sui film di quel genere
2) infoPerRegista(arr_film, regista) che prende in input l'array dei film e ritorna le informazioni sui film diretti da quel regista
3) palinsesto(arr_film) che stampa tutti i film disponibili alla visione dell'array 

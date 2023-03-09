# 🤖 Challenge Ubots

![GitHub repo size](https://img.shields.io/github/repo-size/joabehenrique/challenge-ubots?style=flat)
![GitHub language count](https://img.shields.io/github/languages/count/joabehenrique/challenge-ubots?style=flat)
![GitHub forks](https://img.shields.io/github/forks/joabehenrique/challenge-ubots?style=flat)
![Bitbucket open issues](https://img.shields.io/bitbucket/issues/joabehenrique/challenge-ubots?style=flat)
![Bitbucket open pull requests](https://img.shields.io/bitbucket/pr-raw/joabehenrique/challenge-ubots?style=flat)

> Project with the intention of evaluating films and indicating films not yet evaluated.

## 💻 Requirements

Before you begin, make sure you have met the following requirements:

- You need the version `17` of `Java/JDK`, `PostgreSQL` on your machine.
  If you need installation instructions, click here.

If you need installation instructions, [click here](https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiJ7Ieqxs39AhUwppUCHWvFBVoQFnoECAkQAQ&url=https%3A%2F%2Fjava.tutorials24x7.com%2Fblog%2Fhow-to-install-java-17-on-windows&usg=AOvVaw0NRBuZwgs0vrM5_YVqmD20).

## 🚀 Installing API-Movie

To install API-Movie, follow these steps:

1º Start your Postgre database server and configure 

2º Run the project on your intellij just build and run

## ☕ Using API-Movie

To use API-Movie, follow these steps:

```
The API-Movie project is a challenge from Ubots in order to evaluate 
your technical knowledge with a certain technology and framework.

The API has some functionalities and the following is its 
body for submission in each type of request.
```
Getting a movie
```
(GET) api/v1/movies/{id}
```
Getting all movies and its current evaluation
```
(GET) api/v1/movies
```
Deleting a movie
```
(DELETE) api/v1/movies/{id}
```
Creating a movie
```
(POST) api/v1/movies

{
    "id": 23,
    "title": "A Teoria de Tudo",
    "score": 0.0,
    "count": 0,
    "image": "https://www.themoviedb.org/GHE6U.jpg"
}
```
Changing a Movie
```
(PUT) api/v1/movies/{id}

{
    "title": "A Teoria do Mundo",
    "image": "https://www.themoviedb.org/HRU78.jpg"
}
```
Evaluate a movie
```
(POST) api/v1/scores/{id}

{
    "movieId": 12,
    "email": "joaquim@gmail.com",
    "score": 4.5
}
```

## 📫 Contributing to API-Movie

To contribute to API-Movie, follow these steps:

1. Fork this repository.
2. Create a branch: `git checkout -b <nome_branch>`.
3. Make your changes and commit them: `git commit -m '<commit_message>'`
4. Send to the original branch: `git push origin API-Movie / <local>`
5. Create the pull request.

Alternatively, see the GitHub documentation at [how to create a pull request](https://help.github.com/en/github/collaborating-with-issues-and-pull-requests/creating-a-pull-request)..

## 🤝 Author and Contributors

We thank the following people who contributed to this project:

<table>
  <tr>
    <td align="center">
      <a href="https://github.com/joabehenrique">
        <img src="https://avatars3.githubusercontent.com/u/64988299" width="100px" style="border-radius: 90px" alt="Foto do Joabe Henrique no GitHub"/><br>
        <sub>
          <b>Joabe Henrique [Author]</b>
        </sub>
      </a>
    </td>
  </tr>
</table>

## 😄 Be one of the contributors<br>

Do you want to be part of this project? Click [here](https://github.com/joabehenrique/challenge-ubotsr/blob/master/CONTRIBUTING.md) and read how to contribute.

## 📝 License

This project is under license. See the [license](https://github.com/joabehenrique/challenge-ubots/blob/master/LICENSE.md) file for more details.

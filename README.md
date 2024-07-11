### Exemplo de Diagrama UML (Mermaid)
```mermaid
classDiagram
    class PlayerDeMusica {
        - tocar() void
        - pausar() void
        - selecionarMusica(String musica) void
    }

    class Telefone {
        - ligar(String numero) void
        - atender() void
        - iniciarCorreioVoz() void
    }

    class NavegadorInternet {
        - exibirPagina(String url) void
        - adicionarNovaAba() void
        - atualizarPagina() void
    }

    class iPhone {
    }

    iPhone --> PlayerDeMusica
    iPhone --> Telefone
    iPhone --> NavegadorInternet
```
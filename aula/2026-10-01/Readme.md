```mermaid
classDiagram
    direction LR
    
    class Robo{
        - bateria : int
        - tamMapa : Coordenada
        - localAtual : Coordenada
        + Robo(bateria: int, tm : Coordenada, la : Coordenada)
        + deslocar(unidades : int, direcao : String) Coordenada
    }

    class Coordenada {
        - x : int
        - y : int
        + Coordenada(x : int, y : int)
    }

    Robo *-- Coordenada
    
```
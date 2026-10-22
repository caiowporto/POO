```mermaid
classDiagram

class Obra{
- titulo : String
}

class Periodico{

    }

class Livro{

    }

class Gibi{

    }

class Revista{

    }

class Jornal {

    }

Obra <|-- Livro
Obra <|-- Periodico
Periodico <|-- Revista
Periodico <|-- Gibi
Periodico <|-- Jornal

```
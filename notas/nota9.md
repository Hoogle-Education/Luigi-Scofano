# Oriented Object Programming

## Motivador

```py
identifiers = [1]
holders = ['john titor']
balances = [0]

identifiers.append(2)
holders.append('martha jr')
balances.append(0)
```

## Trocando Elementos

```py
a = 2
b = 3

aux = a
a = b
b = aux
```

### jeito Python

```py
a, b = 2, 3
a, b = b, a
```

## Resolvendo com POO

**Classe:**

- São moldes para seus objetos
- São tipos personalizados de variável
- São classificações

**Objetos**

- São variáveis formadas a partir de uma classe
- São frutos do molde

**Atributos(tem)**

- O que alguem deste tipo teria
- ex.: Pessoa: nome, idade, altura
- ex.: Carro: ano de lançamento, cor, dono, ...

**Metodo(faz)**

- Sao funções que pertencem a classe
- Funcionalidades que algum objeto teria

```py
class Person:
  # constructor
  def __init__(self, name, age, height):
    self.name = name # colocando atributos
    self.age = age
    self.height = height

  def birthday(self):
    self.age += 1

# criacao de uma pessoa
pedro = Person('Pedro da Silva', 23, 1.8)
maria = Person('Maria da Silva', 25, 1.8)

pedro.birthday()

print(pedro.name)
print(pedro.age)
```

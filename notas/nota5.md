## Função/Método

- matemática
- f(x) = x + 3
- entrada/saída
- utilidade/responsabilidade
- processo
- algo que depende de outra

soma(2, 3) = 2 + 3
soma(float x, float y) = x + y
mmc(12, 9)

> Função é um conjunto bem definido de regras, pode ter entradas e pode ter saídas.

```py
def media(a, b):
  return (a + b) / 2

resultado = media(6, 8)
print(resultado)
```

```py
media = (a + b) / 2
print(media)
```

## Motivação

- Organização
- Legibilidade
- Reuso

## Sintaxe

```py
def soma(a, b):
  return a + b

def dizer_oi():
  print('oi')

# range(1, 5) = [1, 2, 3, 4]
def is_prime(number):
  for value in range(2, number):
    if number % value == 0:
      return False

  return True
```

## Ideia

> {quero} = {tudo} - {não quero}

A = {1, 2, 3, 4, 5, 6, 7, 8}

P(A) pelo menos 2 elementos

n(P(A)) = 2^8
não quero = n(0) + n(1) = 1 + 8 = 9

quero = 128 - 9 = 119

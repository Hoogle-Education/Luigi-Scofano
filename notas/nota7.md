# Matrizes 2

## Ler matrizes

```python
l = int(input('linhas: '))
c = int(input('colunas: '))
```

```python
def ler_matriz(lines, columns):
  matriz = []

  for _ in range(lines):
    vetor = list(map(int, input().split()))
    matriz.append(vetor)

  return matriz
```

## Imprimir matrizes

```python
def print(matriz):

```

## Matriz origem x destino

Isto sera estudado futuramente como matriz de adjcencia.

```python
  X R S F
  R 0 2 9
  S 4 0 7
  F 8 6 0
```

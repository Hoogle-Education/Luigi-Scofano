# Repetição

- inicialização
- verificação
- atualização

## While (enquanto)

```py
while estoque != 0:
```

```py
contador = 1

while contador > 10:
  print(contador)
  contador += 1
```

## For (para)

### for...range()

entendendo o **range**:

```py
# range(stop)
# range(start, stop)
range(start = 0, stop, step = 1)
range(5) = [0, 1, 2, 3, 4]
range(2, 7) = [2, 3, 4, 5, 6]
range(4, 9, 2) = [4, 6, 8]
range(10, 5, -2) = [10, 8, 6]
```

```py
for x in range():
```

```py
vetor = [11, 22, 33, 44]

for i in range(1, 6):
  print(i) # 1, 2, 3, 4, 5

for i in range(1, 6, 2):
  print(i) # 1, 3, 5

tamanho = len(vetor)
for pos in range(tamanho):
  print(vetor[pos])
```

### For...in...

- Perdemos acesso a posição
- Em alguns casos deixa a sintaxe mais limpa e direta

```py
word = 'abacaxi'
array = [1, 1, 2, 3, 5, 8, 13, 25, 34]

for char in word:
  print(char)

for element in array:
  print(element)
```

## Proxima

- demonstrar que a loja sempre funciona
- fazer "sequencial" (1000 ao 1021) o que achar necessário
- fazer seleção - (1035, 1037, 1040, 1042, 1044)

# Linguagens

## Compilação

- Linguagem
- traduzida para binário
- executável

## Interpretada

- tradução linha a linha
- faceis de aprender
- lenta

## Pré-compilada

falamos depois

## Tipos de variáveis

- inteiro: `int`
- virgula: `float`
- texto: `str`
- Verdadeiro ou falso: `bool`

## Input

```py
a = int(input('digite o seu numero: '))
b = int(input('digite outro numero: '))

print(a + b)
```

```py
a = input('digite o seu numero: ')
b = input('digite outro numero: ')

a = int(a)
b = int(b)

print(a + b)
```

## Booleanos

```py
esta_chovendo = True

print( est )
```

## Seleção

```py
tem_agua = True

if tem_agua:
  beber_agua()
  guardar_agua()

print('hello world')
```

> ⚠️ Cuidado com escopo de variáveis

```py
nota = 8.5
status = None

if nota >= 7.0:
  status = 'aprovado'
else:
  status = 'reprovado'

print(status)
```

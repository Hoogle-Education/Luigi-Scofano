# 19 22 34 75 51 86 75 18 59 51
linha = input('sequencia').split()
alvo = int(input('alvo: '))

numeros = []
for num in linha:
    numeros.append(int(num))

tamanho = len(numeros)
encontrou = []

for pos in range(tamanho):
    valor = numeros[pos]
    if valor == alvo:
        encontrou.append(pos)

print(encontrou)

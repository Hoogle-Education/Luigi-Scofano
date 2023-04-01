linha = input('sequencia').split()

numeros = []
for num in linha:
    numeros.append(int(num))

menor = numeros[0]

for atual in numeros:
    if atual < menor:
        menor = atual

print(menor)

def descobre_primeiro(inicio, fim):
    for numero in range(inicio, fim+1):
        if numero % 13 == 0:
            return numero


x = int(input())
y = int(input())

maior = max(x, y)
menor = min(x, y)

primeiro = descobre_primeiro()

quantidade = maior - menor + 1
total = (menor + maior)(quantidade) / 2
nao_quero = 0

for numero in range(primeiro, maior+1, 13):
    nao_quero += 13

print(total - nao_quero)

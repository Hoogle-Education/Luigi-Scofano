# -------------------------------------------
# Hugo Rafael 2018
# problema:
# -------------------------------------------

def imprime(matriz):
    for linha in matriz:
        for elemento in linha:
            print(f'{elemento} ', end='')
        print()

# -------------------------------------------


def transpor(tam, matriz):
    transposta = matriz.copy()
    imprime(transposta)

    for i in range(tam):
        for j in range(tam):
            transposta[i][j] = matriz[j][i]

    return transposta

# -------------------------------------------


def soma_diag_principal(tam, matriz):
    soma = 0
    for i in range(tam):
        soma += matriz[i][i]

    return soma

# -------------------------------------------


def soma_diag_sec(tam, matriz):
    soma = 0
    for i in range(tam):
        soma += matriz[i][n-i-1]

    return soma

# -------------------------------------------


def soma_vetor(tam, vetor):
    soma = 0

    for elemento in vetor:
        soma += elemento

    return soma

# -------------------------------------------


def eh_valida_diag_sec(tam, matriz, objetivo):
    if soma_diag_sec(tam, matriz) != objetivo:
        return False

    return True

# -------------------------------------------


def eh_valida_linhas(tam, matriz, objetivo):
    for linha in matriz:
        if soma_vetor(tam, linha) != objetivo:
            return False

    return True

# -------------------------------------------


def eh_valida_colunas(tam, matriz, objetivo):
    transposta = transpor(tam, matriz)

    for coluna in transposta:
        if soma_vetor(tam, coluna) != objetivo:
            return False

    return True

# -------------------------------------------


n = int(input())
quadrado = []

for _ in range(n):
    vetor = list(map(int, input().split()))
    quadrado.append(vetor)

imprime(transpor(n, quadrado))
objetivo = soma_diag_principal(n, quadrado)

if not eh_valida_diag_sec(n, quadrado, objetivo):
    print(-1)
    exit(0)

if not eh_valida_linhas(n, quadrado, objetivo):
    print(-1)
    exit(0)

if not eh_valida_colunas(n, quadrado, objetivo):
    print(-1)
    exit(0)

print(objetivo)
# valida_objetivo_linhas(n, quadrado)
# valida_objetivo_colunas()

# imprime(matriz)

# 00 01 02
# 10 11 12
# 20 21 22

# [i][i]
# [i][j]
# i + j = n - 1
# j = n - i - 1

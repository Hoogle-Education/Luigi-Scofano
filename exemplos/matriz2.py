
def sep():
    print('---------------------------')


def ler_matriz(number_of_lines, number_of_columns):
    matriz = []

    for _ in range(number_of_lines):
        vetor = list(map(int, input().split()))
        matriz.append(vetor)

    return matriz


def print_matriz(matriz, number_of_lines, number_of_columns):
    for i in range(number_of_lines):
        for j in range(number_of_columns):
            print(matriz[i][j], end=' ')

        print()


def print_matriz_transposta(matriz, number_of_lines, number_of_columns):
    for i in range(number_of_lines):
        for j in range(number_of_columns):
            print(matriz[j][i], end=' ')

        print()


def print_diag_principal(matriz,  number_of_lines, number_of_columns):
    for i in range(number_of_lines):
        print(matriz[i][i], end=' ')

    print()


def print_diag_secundaria(matriz,  number_of_lines, number_of_columns):
    for i in range(number_of_lines):
        print(matriz[i][number_of_lines-i-1], end=' ')

    print()


l = int(input('linhas: '))
c = int(input('colunas: '))

matriz = ler_matriz(l, c)
sep()
print_matriz(matriz, l, c)
sep()
print_matriz_transposta(matriz, l, c)
sep()
print_diag_principal(matriz, l, c)
sep()
print_diag_secundaria(matriz, l, c)
sep()

# [0, 0] [0, 1] [0, 2]
# [1, 0] [1, 1] [1, 2]
# [2, 0] [2, 1] [2, 2]

# transposta = [j][i]
# diag principal = [i][i]
# diag sec = [i][n-i-1]

# [i][j]
# i + j = n - 1
# j = n - i -1

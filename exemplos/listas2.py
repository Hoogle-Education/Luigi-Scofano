def ler_lista_na_linha():
    linha = input('digite sua lista com os elementos separados por espaço: ')
    lista = linha.split()

    for i in range(len(lista)):
        lista[i] = int(lista[i])


def ler_lista_por_elemento():
    lista = []

    quantidade = int(input('quantidade de elementos: '))
    for _ in range(quantidade):  # repete 'quantidade' vezes
        numero = int(input('novo numero: '))
        lista.append(numero)

    return lista


def criar_lista():
    opcao = int(input('''
    1 - Digitar a quantidade e o valores um abaixo do outro
    2 - Digitar todos os valores na mesma linha
    Escolha uma opcao: '''))

    if opcao == 1:
        return ler_lista_por_elemento()
    elif opcao == 2:
        return ler_lista_na_linha()
    else:
        print('fim', 'do', 'programa', sep='...', end=' ;-)\n')
        exit()


# CRUD: Create Read/Retrieve Update Delete
lista = criar_lista()
print(f'lista: {lista}')

while True:

    opcao = input('''Escolha uma opcao abaixo:
    C - para recriar a lista
    R - para ler a lista armazenada
    U - para atualizar um elemento
    D - para deletar um elemento
    0 - para sair do programa''')

    if (opcao == '0'):
        break

    if (opcao == 'C'):
        lista = criar_lista()

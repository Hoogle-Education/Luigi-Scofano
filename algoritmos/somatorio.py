linha = input('sequencia: ').split()

numeros = []
for num in linha:
    numeros.append(int(num))

# for num in numeros:
#     print(type(num))

soma = 0
for num in numeros:
    soma += num  # soma = soma + num

print(soma)

# n*log_2(n) = n * (log_10(n) / log_10(2) )
# limite para ser aprovado 10^7
# exemplo: estimando para um problema com n = 758
# e complexidade n*logn

# 758 * 24.3 = 10^4 < 18.420 < 10^5
# se tiver até 10^4*raiz(10) => 10^4

# sqrt(10^5 * 10^4) = 10^4 * sqrt(10) = 31.600
# ordem de grandeza = 10, 10^2, 10^3, 10^4, ...
# 7 + 6 + 8 = 7 + 7 + 7
# 12 * 3 =  6 * 6
# a * b = g * g
# a*b = g^2
# g = raiz(a*b)

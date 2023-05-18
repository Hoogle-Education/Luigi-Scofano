# Matrizes

Array 2D, Vetor de vetor.

```py
v = [ [1, 2, 3],
      [4, 5, 6],
      [7, 8, 9] ]

v[1][1]
```

```py
1 2 3
3 4 5
5 6 7
```

```py
l = int(input())
c = int(input())
matriz = []

for _ in range(l):
  vetor = list(map(int, input().split()))
  matriz.append(vetor)
```

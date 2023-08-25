- Tamanho a ser digitado pelo usuario
- Vetor a ser digitado pelo usuario
- numero para buscar
  - se eu encontrar quero a posicao
  - senao quero exibir -1

## Busca sequencial sem funcao

```java
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
int[] vetor = new int[n];

for(int i = 0; i < n; i++) {
  vetor[i] = sc.nextInt();
}

int busca = sc.nextInt();
boolean ok = false;

for(int i = 0; i < n; i++) {
  if(vetor[i] == busca) {
    System.out.println(i);
    ok = true;
    break;
  }
}

if(!ok) {
  System.out.println("-1");
}

```

## Busca sequencial

```java
public static int buscaSequencial(int[] vetor, int alvo) {
  for(int i = 0; i < vetor.length; i++) {
    if(vetor[i] == busca)
      return i;
  }

  return -1;
}

public static int[] entraVetor(Scanner sc, int n) {
  int n = sc.nextInt();
  int[] vetor = new int[n];

  for(int i = 0; i < n; i++) {
    vetor[i] = sc.nextInt();
  }

  return vetor;
}

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  int n = sc.nextInt();
  int[] vetor = entraVetor(sc, n);
  int busca = sc.nextInt();

  int busca = buscaSequencial(vetor, busca);
  System.out.println(busca);
}
```

nlog(n) + log(n) = 5nlog(n)
log(n) / n = %

pertence O(nlog) O(n^2)

## Busca binaria

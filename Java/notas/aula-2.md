# Memoria

## Vetores

```java
int a = 3;
int b = a; // copia de a

b = 5;

System.out.println(a); // 3
System.out.println(b); // 5
// a eh um tipo valor
```

> toda variavel primitica eh um tipo valor

```java
int[] vetor = {1, 2, 3, 4, 5};
int[] copia = vetor;

copia[2] = 10

System.out.println(vetor[2]); // 10
System.out.println(copia[2]); // 10
// vetor eh um tipo referencia
```

### Aplicacao

```java
void leVetor(int[] vetor) {
  // aqui dentro vc realmente ira mexer no vetor
  Scanner sc = new Scanner(System.in);

  for(int i = 0; i < vetor.length; i++) {
    vetor[i] = sc.nextInt();
  }
}

void main() {
  int[] numeros = new int[10];

  leVetor(numeros);
}
```

### Nao da

```java
void swap(int a, int b) {
  // nao da pra trocar fora desse escopo
  int temp = a;
  a = b;
  b = temp;
}
```

## Classes e memoria

```java
// ira gerar referencias
class User {
  public String name;
  public String email;
  public String password;
}

void criptograph(User user) {
  user.password = "#" + user.password + "#"
}

void main() {
  User u1 = new User();
  u1.name = "My name 1";
  u1.password = "1234";

  User u2 = u1;
  u2.name = "My name 2"

  criptograph(u2);

  System.out.println(u1.name); // My name 2
  System.out.println(u2.name); // My name 2
  System.out.println(u1.password); // #1234#
}
```

## Vetores Dinamico
